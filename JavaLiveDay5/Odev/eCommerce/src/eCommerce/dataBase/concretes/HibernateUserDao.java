package eCommerce.dataBase.concretes;

import java.util.List;

import eCommerce.dataBase.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	private List<User> users;


	@Override
	public void register(User user) {
		System.out.println("Ba�ar�yla Kay�t Olundu"+" "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hesap G�ncellendi"+" "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void deleteAccount(User user) {
		System.out.println("Hesap Silindi"+" "+user.getId());
		
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giri� yap�ld�"+" "+user.getId());
		
	}

	@Override
	public void LogOut(User user) {
		System.out.println("Sistemden ��k�� Yap�ld�"+user.getId());
		
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
