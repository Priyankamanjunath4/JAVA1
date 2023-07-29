import java.util.*;
public class list1 {
    public static void main(String[] args) {
         List <Integer> l = new ArrayList<Integer>();
    Scanner s = new Scanner(System.in);
    for(int i = 1 ;i<=5;i++)
    {
        l.add(s.nextInt());
    }
    l.add(5,35);
    Collections.sort(l);
    System.out.println(l);
    }
   
}

