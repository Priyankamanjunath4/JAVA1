class hai
{
    int a=100;
    synchronized void sub(int n)
    {
        System.out.println("Subtract");
        if(this.a<n)
        {
            System.out.println("not possible add something");
        try 
        {
            wait();
        } catch (Exception e) 
        {
            System.out.println("hai");
        }
    }
            this.a-=n;
            this.a=this.a-n;
            System.out.println("sub finished");
}
            synchronized void add(int m)
            {
                System.out.println("adding");
                this.a=this.a+m;
                notify();
            }
        }
 

class main3 {
    public static void main(String[] args) {
        hai h = new hai();
        new Thread()
        {
            public void run()
            {
                h.sub(200);
            }
        }.start();
            new Thread()
            {
                public void run()
                {
                    h.add(200);
                }
            }.start();
            
        }
    }

