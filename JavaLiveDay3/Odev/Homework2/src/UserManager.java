
public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� Sisteme Eklendi : " + user.getUserNumber());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void signIn(User user) {
		System.out.println(user.getMail() + " " + user.getPassword() + " : " + "Sisteme Giri� Yap�ld�");
	}

	public void signOut(User user) {
		System.out.println(user.getMail() + " " + user.getPassword() + " : " + "Sistemden ��k�� Yap�ld�");
	}

}
