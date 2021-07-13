package passwordManager;
import java.util.*;

public class Manager {

	public static void main(String[] args) {
		manage();
	}

//	****************************************************************************
//	Prints Users options, called to continue program loop
//	*********************
	private static void manage() {
		System.out.println("");
		System.out.println("***************************************************");
		System.out.println("new: New Password");
		System.out.println("find: Find Password");
		System.out.println("close: Close Password Manager");
		System.out.println("gen: Generate Named Passwords");
		System.out.println("more: Generate Unnamed Passwords, Unsearchable");
		System.out.println("Enter Your Choice: ");
		choiceHandler();
	}

//	****************************************************************************
//	Handles method calls depending on user input
//	*********************
	private static void choiceHandler() {
		Scanner reader = new Scanner(System.in);
		String choice = reader.next();
		switch (choice) {
		case "new": newPassword(reader);
			manage();
			break;
		case "find": getPassword(reader);
			manage();
			break;
		case "close": closeManager();
			break;
		case "gen": long start = System.nanoTime();
				makePasswords();
				long end = System.nanoTime();
				long dur = (end - start); // /1000000
				System.out.println("Insert time for named:" + dur);
				manage();
			break;
		case "more": morePasswords();
			manage();
			break;
		default: System.out.println("Not a valid Choice");
			manage();
			break;
		}
	}

//	****************************************************************************
//	Passes User input to password class
//	*********************
	private static void newPassword(Scanner reader) {
		password pass = new password();
		System.out.println("Enter Website/Name");
		String name = reader.next();
		System.out.println("Enter Username");
		String user = reader.next();
		System.out.println("Enter Password");
		String newPass = reader.next();
		pass.setAll(newPass, name, user);
	}
	
//	****************************************************************************
//	Comment/Uncomment lines to use different Data Structures
//	*********************
	private static void getPassword(Scanner reader) {
		System.out.println("Enter Website");
		String website = reader.next();
		password finder = new password();
		long start = System.nanoTime();
		finder.findPassList(website);
//		finder.findPassHash(website);
//		finder.findPassArray(website);
		long end = System.nanoTime();
		long dur = (end - start); // /1000000
		System.out.println("Find time:" + dur);
	}

//	****************************************************************************
//	Ends program loop by not calling manage() method
//	*********************
	private static void closeManager() {
		System.out.println("Bye!");
	}
	
	private static void makePasswords() {
//		ArrayList<String> websites = new ArrayList<>();
		String[] websiteNames = {
				"bofa",
				"discover",
				"ESC",
				"gmail",
				"amazon",
				"moodle",
				"github",
				"heroku",
				"facebook",
				"instagram",
				"etrade",
				"evernote",
				"chase",
				"netflix",
				"hbo",
				"twc",
				"linkedin",
				"twitter",
				"snapchat",
				"venmo",
				"stackoverflow",
				"wegmans",
				"schwab",
				"reddit",
				"comcast"
//				Add More please
		};
		String[] userNames = {
				"blob@sdf.com",
				"willbur",
				"lkjom@ljnj.com",
				"heyman@gmail.com",
				"kwsmit124",
				"user2",
				"user3",
				"user4",
				"user5",
				"instaUser6",
				"ETradeUser",
				"EvernoteUser",
				"ChaseUser",
				"NetflixUser",
				"HBOUser",
				"TWCUser",
				"LinkedInUser",
				"TwitterUser",
				"SnapchatUser",
				"VenmoUser",
				"SOFUser",
				"WegmansUser",
				"SchwabUser",
				"RedditUser",
				"ComcastUser"
//				Add More please
		};
		for(int i = 0; i<websiteNames.length; i++) {
			String name = websiteNames[i];
			String user = userNames[i];
			randPassGenerator(name, user);	
		};
//		manage();
	}
	
	private static void randPassGenerator(String website, String user) {
		password passObject = new password();
		String pass = UUID.randomUUID().toString().replaceAll("-", "");
		passObject.setAll(pass, website, user);
	}
	
	private static void morePasswords() {
		password passObj = new password();
		System.out.println("How many new entries?");
		Scanner reader = new Scanner(System.in);
		int amnt = reader.nextInt();
		long start = System.nanoTime();
		for(int i = 0; i<amnt; i++) {
			String pass = UUID.randomUUID().toString().replaceAll("-", "");
			String website = UUID.randomUUID().toString().replaceAll("-", "");
			String user = UUID.randomUUID().toString().replaceAll("-", "");
			passObj.setAll(pass, website, user);
		}
		long end = System.nanoTime();
		long dur = (end - start); // /1000000
		System.out.println("Insertion time for " + amnt + " passwords: " + dur);
//		manage();
	}
}
