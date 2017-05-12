package com.bizdata.controller.user.vo.in;

import com.bizdata.controller.user.vo.in.valid.field.*;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 用户更新操作入参VO
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
public class InUpdateVO {

    /**
     * id
     */
    @NotBlank(message = "用户ID不可以为空!", groups = {ValidFieldID.class})
    private String id;

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不可以为空", groups = {ValidFieldUsername.class})
    private String username;

    /**
     * 真实姓名
     */
    @NotBlank(message = "真实姓名不可为空!", groups = {ValidFieldRealName.class})
    private String realName;

    /**
     * 密码
     */
    @NotBlank(message = "密码不可以为空", groups = {ValidFieldPassword.class})
    private String password;

    /**
     * 邮箱
     */
    @Email(message = "email格式不合法", groups = {ValidFieldEmail.class})
    private String email;

    /**
     * 是否可用
     */
    private boolean available;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}