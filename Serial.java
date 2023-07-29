import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
class Serial {
   public static void main(String[] args) 
   {
    try {
    stu ob = new stu(3,"sat");
    FileOutputStream fp = new FileOutputStream("9, txt");
    ObjectOutputStream b = new ObjectOutputStream(fp);
    b.writeObject(ob);
    b.flush();
    b.close();
    System.out.println("success");
   } 
   catch(Exception e)
   {
        System.out.println("ex any");
   }
   }
}
