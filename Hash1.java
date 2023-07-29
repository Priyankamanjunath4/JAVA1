import java.io.*;
import java.util.*;
 
class Hash {
    public static void main(String args[])
    {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        Hashtable<Integer, String> ht2= new Hashtable<Integer, String>();
        ht1.put(1, "Geeks");
        ht1.put(2, "For");
        ht1.put(3, "Geeks");
 
        ht2.put(1, "Geeks");
        ht2.put(2, "For");
        ht2.put(3, "Geeks");
         
          // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}