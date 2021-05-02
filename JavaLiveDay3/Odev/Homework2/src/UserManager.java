
public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý Sisteme Eklendi : " + user.getUserNumber());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void signIn(User user) {
		System.out.println(user.getMail() + " " + user.getPassword() + " : " + "Sisteme Giriþ Yapýldý");
	}

	public void signOut(User user) {
		System.out.println(user.getMail() + " " + user.getPassword() + " : " + "Sistemden Çýkýþ Yapýldý");
	}

}
