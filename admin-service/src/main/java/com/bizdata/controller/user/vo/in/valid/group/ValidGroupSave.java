package com.bizdata.controller.user.vo.in.valid.group;

import com.bizdata.controller.user.vo.in.valid.field.ValidFieldEmail;
import com.bizdata.controller.user.vo.in.valid.field.ValidFieldPassword;
import com.bizdata.controller.user.vo.in.valid.field.ValidFieldRealName;
import com.bizdata.controller.user.vo.in.valid.field.ValidFieldUsername;

import javax.validation.GroupSequence;

/**
 * 用户新增校验组
 * <p>
 * Created by sdevil507 on 2017/4/10.
 */
@GroupSequence({ValidFieldUsername.class, ValidFieldRealName.class, ValidFieldPassword.class, ValidFieldEmail.class})
public interface ValidGroupSave {
}
