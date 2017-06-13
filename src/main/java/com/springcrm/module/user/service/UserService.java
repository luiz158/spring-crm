package com.springcrm.module.user.service;

import com.springcrm.module.user.model.User;
import com.springcrm.module.user.model.VerificationToken;

public interface UserService {
  //  User register(User user);

    User findByUsername(String username);

	User findUserAndRolesByUserId(long userId);

	void createVerificationTokenForUser(User user, String token);

	VerificationToken getVerificationToken(String token);

	void saveRegisteredUser(User user);

	User registerNewUserAccount(User user);
	
	User findUserByEmail(String email);
}
