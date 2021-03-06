package contacts;
import java.util.*;

public class Main
{
	private static ArrayList<Contact> alTest = new ArrayList<>();
	private static LinkedList<Contact> llTest = new LinkedList<>();
	private static HashMap<String, Contact> mapTest = new HashMap<>();
//	private static int[] insertT = new int[31];
//	private static int[] searchT = new int[31];
	private static List<Integer> insertT = new ArrayList<Integer>();
	private static List<Integer> searchT = new ArrayList<Integer>();
	
    public static void main(String[] args) {
    		manage();
    		doEverything();
    }
    
    private static void doEverything() {
	    int[] times = { 100, 500, 1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000,
	    		10000, 15000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000,
	    	200000,	300000,	400000,	500000,	600000,	700000,	800000, 900000, 1000000 };

	    for (int i = 0; i < times.length; i++) {
	    		llTest.clear();
	    		System.out.println("Contacts********** "+times[i]+"*********Contacts");
	    		makeContacts(times[i]);
	    }

    }
    
	private static void manage() {
		System.out.println("");
		System.out.println("***************************************************");
		System.out.println("new: New Contact");
		System.out.println("find: Find Contact");
		System.out.println("close: Close Password Manager");
		System.out.println("gen: Generate Contacts");
		System.out.println("run: Run Program");
		System.out.println("Enter Your Choice: ");
		choiceHandler();
	}
	
	private static void choiceHandler() {
		Scanner reader = new Scanner(System.in);
		String choice = reader.next();
		switch (choice) {
		case "new": newContact(reader);
				manage();
			break;
//		case "find": getContact(reader);
//				manage();
//			break;
		case "close": System.out.println("Bye!");
			break;
//		case "gen": makeContacts(reader);
//				manage();
//			break;
		case "run": doEverything();
				manage();
			break;
		default: System.out.println("Not a valid Choice");
				manage();
			break;
		}
	}
	
	private static void newContact(Scanner reader) {
		System.out.println("Enter First Name");
		String fName = reader.next();
		System.out.println("Enter Last Name");
		String lName = reader.next();
		System.out.println("Enter Email");
		String email = reader.next();
		System.out.println("Enter PhoneNumber");
		String phoneNum = reader.next();
		Contact contact = new Contact(fName, lName, email, phoneNum);
		// Uncomment/Comment to time method
		long startTime = System.nanoTime();
//		AL.insert(alTest, contact);
//		LL.insert(llTest, contact);
//		HashTable.insert(mapTest, contact);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
	
	private static void getContact(String first, String last) {
//		Scanner reader
//		System.out.println("Enter first name:");
//		String first = reader.next();
//		System.out.println("Enter last name:");
//		String last = reader.next();
		String fullName = first+" "+last;
		// Uncomment/Comment to time method
		long startTime = System.nanoTime();
//		AL.search(alTest, fullName);
		LL.search(llTest, fullName);
//		HashTable.search(mapTest, fullName);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Search Time: "+totalTime);
	}
	
	private static void makeContacts(int num) {
//		Scanner reader
//		System.out.println("How many new contacts?");
//		int num = reader.nextInt();
		Factory create = new Factory();
		for (int i = 0; i < num; i++) {
	        String fName = create.randName();
	        String lName = create.randName();
	        String email = create.randEmail(fName);
	        String phone = create.randPhone();
	        Contact contact = new Contact(fName, lName, phone, email);
	        if ((i+1) == num) {
	     // Uncomment/Comment to time method
		        long startTime = System.nanoTime();
//				AL.insert(alTest, contact);
				LL.insert(llTest, contact);
//				HashTable.insert(mapTest, contact);
				long endTime   = System.nanoTime();
				long totalTime = endTime - startTime;
				System.out.println("insert Time: "+totalTime);
				getContact(fName, lName);
	        } else {
//	        		AL.insert(alTest, contact);
	        		LL.insert(llTest, contact);
//	        		HashTable.insert(mapTest, contact);
	        }
		}
	}
}