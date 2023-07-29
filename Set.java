import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet <String> s = new HashSet<String>();
        s.add("apple");
        s.add("ten");
        if(s.contains("apple"))
        {
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
    }
}
