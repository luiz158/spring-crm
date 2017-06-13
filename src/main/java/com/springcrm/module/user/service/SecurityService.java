package com.springcrm.module.user.service;

import java.util.List;

import com.springcrm.module.user.model.Role;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
