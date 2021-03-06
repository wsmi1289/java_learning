package contacts;

import java.util.HashMap;

class HashTable
{
    /**
     * add a new Contact to the contact hashmap
     * @param hashMap - the contact hashmap
     * @param item - the new Contact to be added
     */
    static void insert(HashMap<String, Contact> hashMap, Contact item)
    {
        // if the same name exists, display the contact, need to check whether the same person or change name
        // else, add the new contact
        if (hashMap.containsKey(item.fullName)) {
            System.out.println("Sorry, the contact " + item.fullName + " has already been in the list: ");
            hashMap.get(item.fullName).displayContact();
        } else {
            hashMap.put(item.fullName, item);
        }
    }

    /**
     * Search a requested name in a hashmap of contacts
     * @param hashMap - the contact hashmap
     * @param request - the requested name to be searched
     */
    static void search(HashMap<String, Contact> hashMap, String request)
    {
        if (hashMap.containsKey(request)) {
//            System.out.println("The contact " + request + " is shown below: ");
            hashMap.get(request);
//            .displayContact();
        } else {
            System.out.println("Sorry, the contact " + request + " is not in the list.");
        }
    }

    /**
     * print names of all contacts
     * @param map - the hashmap of contacts
     */
    static void printAllNames(HashMap<String, Contact> map)
    {
        System.out.println(map.keySet().toString());
        System.out.print("\n");
    }
}
