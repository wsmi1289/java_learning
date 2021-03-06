package contacts;

import java.util.*;

class AL
{
    /**
     * insert at a specific index so the arraylist keep sorted, using binary search to find the index
     * @param al - The arraylist to be used
     * @param item - The new Contact to be added
     */
    static void insert(ArrayList<Contact> al, Contact item)
    {
        int index = binarySearch(al, item.fullName);
        // check the index from binarySearch.
        // if it's negative, no same Contact exists, item can be added
        // else, a Contact with the same name exists, need to check whether the same person or change name
        if (index < 0) {
            al.add(-index - 1, item); // -(low+1) returned from binarySearch, while low is needed
        }
        else {
            System.out.println("Sorry, the contact " + item.fullName + " has already been in the list: ");
            al.get(index);
//            .displayContact();
        }
    }

    /**
     * Search a requested name in an arraylist of contacts, using binarySearch
     * @param al - The arraylist to be used
     * @param request - The requested name to be searched
     */
    static void search(ArrayList<Contact> al, String request)
    {
        int index = binarySearch(al, request);
        // if index is negative, requested name is not found
        if (index < 0)
            System.out.println("Sorry, the contact " + request + " is not in the list.");
        else {
//            System.out.println("The contact " + request + " is shown below: ");
            al.get(index);
//            .displayContact();
        }
    }

    /**
     * binary search a requested name in an arraylist of contacts
     * @param al - The arraylist to be used
     * @param request - The requested name to be searched
     * @return the index if found, a negative int if not found
     */
    static int binarySearch(ArrayList<Contact> al, String request)
    {
        int low = 0, high = al.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (al.get(mid).fullName.compareTo(request) < 0)
                low = mid + 1; // increase low if request larger than mid
            else if (al.get(mid).fullName.compareTo(request) > 0)
                high = mid - 1; // lower high if request smaller than mid
            else
                return mid; // Found
        }
        // Not found, low can be used for insertion, -(low+1) is to avoid problem of index 0
        return - (low + 1);
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