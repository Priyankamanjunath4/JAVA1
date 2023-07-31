class th implements Runnable{
    public void run()
    {
        System.out.println("haii");
    }
}
class main2{
    public static void main(String[] args) {
        Runnable r = new th();
        Thread t = new Thread( r, "hai");
        t.start();
    }
}