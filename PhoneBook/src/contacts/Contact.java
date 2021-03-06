package contacts;

class Contact
{
    // variable for the contact class
    private String fname;
    private String lname;
    private String pnumber;
    private String email;
    String fullName; // add a full name for search

    // constructor
    Contact(String fname, String lname, String pnumber, String email) {
        this.fname = fname;
        this.lname = lname;
        this.pnumber = pnumber;
        this.email = email;
        this.fullName = fname + " " + lname;

//        System.out.println("Contact " + fullName + " created!");
    }

    // display contact information
    void displayContact() {
        System.out.println("First name:" + fname);
        System.out.println("Last name:" + lname);
        System.out.println("Phone number:" + pnumber);
        System.out.println("Email:" + email);
    }
}