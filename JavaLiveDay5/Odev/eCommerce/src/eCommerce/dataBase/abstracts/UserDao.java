package eCommerce.dataBase.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void update(User user);
	void deleteAccount(User user);
	void logIn(User user);
	void LogOut(User user);
	User get(int id);
	List<User> getAll();
}
