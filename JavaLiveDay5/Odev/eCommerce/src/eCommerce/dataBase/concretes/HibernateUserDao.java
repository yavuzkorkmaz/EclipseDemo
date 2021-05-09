package eCommerce.dataBase.concretes;

import java.util.List;

import eCommerce.dataBase.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	private List<User> users;


	@Override
	public void register(User user) {
		System.out.println("Baþarýyla Kayýt Olundu"+" "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hesap Güncellendi"+" "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void deleteAccount(User user) {
		System.out.println("Hesap Silindi"+" "+user.getId());
		
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giriþ yapýldý"+" "+user.getId());
		
	}

	@Override
	public void LogOut(User user) {
		System.out.println("Sistemden çýkýþ Yapýldý"+user.getId());
		
	}

	@Override
	public User get(int id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

}
