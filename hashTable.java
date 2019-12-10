package com.company;

import java.util.Hashtable;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Hashtable<String, Integer> tableInputs = new Hashtable<String, Integer>();

        /*or like this
        Hashtable<String, Integer> hashTable = new Hashtable<Integer, String>();
        tableInputs.put(1, "John Johnson");*/

        tableInputs.put("My Table", new Integer(234));
        tableInputs.put("Your Table", new Integer(4));
        tableInputs.put("Tom Table", new Integer(123));
        tableInputs.put("Not Table", new Integer(555));
        tableInputs.put("DELETED Table", new Integer(777));


        if (tableInputs.containsValue(555)) { // is there 555 value?
            System.out.println("Somewhere it was found!");
        }
        Set letsSee = tableInputs.entrySet();
        System.out.println("Entry sets: " + tableInputs.entrySet());
    }
}
# hashtable
