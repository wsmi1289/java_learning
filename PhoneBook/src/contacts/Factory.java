package contacts;
import java.util.Random;

class Factory {
	 
    String randName() {
    		Random rand = new Random();
    		int len = rand.nextInt(10) + 3;
    		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    		StringBuilder sb = new StringBuilder(len);
    		Random random = new Random();
    		for (int i = 0; i < len; i++) {
    		    char c = chars[random.nextInt(chars.length)];
    		    sb.append(c);
    		}
    		String name = sb.toString();
		return name;
    }
    
    String randPhone() {
    		Random rand = new Random();
    		int area, prefix, lineNum;
    		area = rand.nextInt(999);
    		prefix = rand.nextInt(999);
    		lineNum = rand.nextInt(9999);
    		String pNum = "("+area +") "+prefix+"-"+lineNum;
    		return pNum;
    }
    
    String randEmail(String user) {
    		Random rand = new Random();
    		int i = rand.nextInt(4);
    		String domain = randName();
    		String [] tlds = {"com", "org", "edu", "net", "gov"};
    		String tld = tlds[i];
    		String email = user+"@"+domain+"."+tld;
    		return email;
    }

}
