package passwordManager;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;


public class password extends Manager {

	private static ArrayList<password> passwordArray = new ArrayList<password>();
	private static Hashtable<Integer ,password> passwordHash = new Hashtable<>();
	private static LinkedList<password> passwordList = new LinkedList<password>();
	private String name;
	private String user;
	private String pass;

//	****************************************************************************
//		Uncomment lines to use different data structures
//	*********************
	public void setAll(String pass, String web, String user) {
		this.setPassword(pass);
		this.setName(web);
		this.setUser(user);
//		storePasswordHash(this);
//		storePasswordArray(this);
		storePasswordList(this);
	}
	
//	****************************************************************************
//		LINKED LIST
//	*********************
	public void findPassList(String name) {
		int count = 0;
		do {
			password pass = passwordList.get(count);
			if ( pass.getName().equals(name) ) {
				System.out.println("name: " + pass.getName());
				System.out.println("Username: " + pass.getUser());
				System.out.println("Password: " + pass.getPassword());
			}
			count++;
		} while (count<passwordList.size());
	}
	
	private static void storePasswordList(password self) {
		passwordList.add(self);
		System.out.println("Stored");
	}

//****************************************************************************
// HASH TABLE
//*********************
	public void findPassHash(String name) {
		int key = name.hashCode();
		password pass = passwordHash.get(key);
		System.out.println("name: " + pass.getName());
		System.out.println("Username: " + pass.getUser());
		System.out.println("Password: " + pass.getPassword());
	}
	
	private static void storePasswordHash(password self) {
		int key = self.name.hashCode();
		passwordHash.put(key, self);
		System.out.println("Stored");
	}

//****************************************************************************
// ARRAY
//*********************
	public void findPassArray(String self) {
		for(password pass: passwordArray) {
			if(pass.getName().equals(self)) {
				System.out.println("name: " + pass.getName());
				System.out.println("Username: " + pass.getUser());
				System.out.println("Password: " + pass.getPassword());
			}
		}
	}
	
	private static void storePasswordArray(password self) {
		passwordArray.add(self);
		System.out.println("Stored");
	}
//****************************************************************************
// Getter Setter Methods
//*********************
	private void setPassword(String pass) {
		this.pass = pass;
	}
	private void setName(String website) {
		this.name = website;
	}
	private void setUser(String user) {
		this.user = user;
	}
	private String getPassword() {
		return pass;
	}
	private String getUser() {
		return user;
	}
	private String getName() {
		return name;
	}
}
