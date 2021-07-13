package contacts;
import java.util.*;

class LL
{
    /**
     * add a new Contact to the end of linkedlist
     * @param ll - the linkedlist to be used
     * @param item - the new Contact to be added
     */
    static void insert(LinkedList<Contact> ll, Contact item)
    {
        Optional<Contact> contactOptional = bruteForceSearch(ll, item.fullName);
        // if the same name exists, display the contact, need to check whether the same person or change name
        // else, add the new contact
        if(contactOptional.isPresent()) {
            System.out.println("Sorry, the contact " + item.fullName + " has already been in the list: ");
            contactOptional.get();
//            .displayContact();
        } else {
            ll.add(item);
        }
    }

    /**
     * Search a requested name in a linkedlist of contacts, using bruteForceSearch
     * @param ll - the linkedlist to be used
     * @param request - the requested name to be searched
     */
    static void search(LinkedList<Contact> ll, String request)
    {
        Optional<Contact> contactOptional = bruteForceSearch(ll, request);
        // if contactOptional has value, the contact with the requested name exists
        if(contactOptional.isPresent()) {
//            System.out.println("The contact " + request + " is shown below: ");
//            scontactOptional.get();
//            .displayContact();
        } else
            System.out.println("Sorry, the contact " + request + " is not in the list.");
    }

    /**
     * brute force search for a requested name in the contact linkedlist
     * @param ll - the linkedlist to be used
     * @param request - the requested name to be searched
     * @return Optional with either Contact (found) or empty (not found)
     */
    static Optional<Contact> bruteForceSearch(LinkedList<Contact> ll, String request)
    {
        // if found, return an Optional of the contact
        for (Contact c: ll) {
            if(c.fullName.compareTo(request) == 0)
                return Optional.of(c);
        }
        return Optional.empty(); // not found, return an empty Optional
    }

    /**
     * print names of all contacts
     * @param list - a list of contacts
     */
    static void printAllNames(List<Contact> list)
    {
        for (Contact c : list)
            System.out.println(c.fullName);
        System.out.print("\n");
    }

}
