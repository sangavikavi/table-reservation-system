package com.albeisoft.hotelbooking.services;

import com.albeisoft.hotelbooking.models.AuthUser;
import com.albeisoft.hotelbooking.models.UserRole;

import java.util.List;

public interface UserService {
    AuthUser saveUser (AuthUser user);
    UserRole saveUserRole (UserRole userRole);
    void addUserRoleToUser(String userName, String userRoleName);
    AuthUser getUser(String UserName);
    List<AuthUser> getUsers();
}
