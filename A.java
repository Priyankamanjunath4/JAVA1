import javax.lang.model.type.NullType;
import java.util.*;
class A {
    int a=10;
    String s;
    void disp() throws AirtmeticException e
    {
        System.out.println(a/10);
        throw new AirtmeticException e;
    }
    public static void main(String[] args) {
        try {
            disp()
        } catch (AirtmeticException e) {
            System.out.println(e);
        }
    }
}
