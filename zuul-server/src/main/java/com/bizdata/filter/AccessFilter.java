package com.bizdata.filter;

import com.bizdata.admin.AdminServiceFeign;
import com.bizdata.auth.AuthManager;
import com.bizdata.auth.impl.AdminTokenAuth;
import com.bizdata.auth.impl.AppTokenAuth;
import com.bizdata.properties.TokenProperties;
import com.bizdata.token.TokenServiceFeign;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 访问授权过滤器
 *
 * @author sdevil507
 */
public class AccessFilter extends ZuulFilter {

    @Autowired
    private TokenProperties tokenProperties;

    @Autowired
    private TokenServiceFeign tokenServiceFeign;

    @Autowired
    private AdminServiceFeign adminServiceFeign;

    @Override
    public Object run() {
        AuthManager authManager = new AuthManager(RequestContext.getCurrentContext(), tokenProperties.getIgnoreUrls());
        authManager
                .addAuthImpl(new AdminTokenAuth("admin", "/admin/**", tokenServiceFeign, adminServiceFeign))
                .addAuthImpl(new AppTokenAuth("app", "/app/**", tokenServiceFeign))
                .doAuth();
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public String filterType() {
        return "pre";
    }

}
