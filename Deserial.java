import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class stu implements Serializable
{
    int id;
    String name;
    stu(int a , String b)
    {
        this.id=a;
        this.name=b;
    }
}
public class Deserial {
    public static void main(String[] args) 
    {
        try {
            FileInputStream fi = new FileInputStream("9.txt");
            ObjectInputStream bi = new ObjectInputStream(fi);
            stu s = (stu) bi.readObject();
            System.out.println(s.id+" "+s.name);
        }
        catch (Exception e) {
           System.out.println("haiiiii");
        }
    }
}
