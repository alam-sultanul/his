package com.bz.demo.controller;

import com.bz.demo.controller.role.RoleController;
import com.bz.demo.controller.signUp.SignUpController;
import org.springframework.stereotype.Component;

@Component
public class WebLinkFactory {

    private static final String PATH_VAR_ID = "{id}";

    public String getDashboardUrl() {
        return "/dashboard";
    }

    public String rolePrivilege(Long roleId) {
        return RoleController.ROUTE_PRIVILEGE + "?roleId=" + roleId;
    }

    public String editRoleUrl(Long roleId) {
        return RoleController.ROUTE_EDIT.replace(PATH_VAR_ID, String.valueOf(roleId));
    }
    public String editUserProfileUrl(Long userId) {
        return SignUpController.ROUTE_PROFILE_VIEW.replace(PATH_VAR_ID, String.valueOf(userId));
    }
}
