package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	void register(User user);
	void update(User user);
	void deleteAccount(User user);
	void logIn(User user);
	void LogOut(User user);

}
