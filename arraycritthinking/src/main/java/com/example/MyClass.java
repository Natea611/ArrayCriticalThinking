package com.example;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Dictionary;

public class MyClass {

    public static void main(String args[])
    {
        Dictionary<String, String> d = new Hashtable<String, String>();

        d.put("2. Keyboard", "2. Something used to type on a computer");
        d.put("1. Mouse", "1. Something used to select items or click on a computer");
        d.put("3. Monitor", "3. Something used to display what is happening on the computer.");

        String[] Data = {"Name", "Rating", "Online Play", "How many players"};
        String[] Diablo3 = {"Diablo 3", "M", "Yes", "1 - 4"};

        Enumeration<String> key = d.keys();
        while(key.hasMoreElements())
        {
            System.out.println(key.nextElement());
        }

        Enumeration<String> element = d.elements();
        while(element.hasMoreElements())
        {
            System.out.println(element.nextElement());
        }

        System.out.println();

        for (int i = 0; i < Data.length; i ++)
        {
            System.out.print(Data[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < Data.length; i ++)
        {
            System.out.print(Diablo3[i] + "\t");
        }

    }

}
