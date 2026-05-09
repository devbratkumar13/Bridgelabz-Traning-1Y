package LambdaExpression;

public class Demo {
    public static void main(String[] args) {
        Runnable r1=()-> {
            System.out.println("this is my first Thread");

        };
        Thread t1=new Thread(r1);
        t1.start();

        Runnable r2=()->{
            System.out.println("this my second Thread");

        };
       Thread t2=new Thread(r2);
       t2.start();

        System.out.println("--------------------------------------------------------------------");

        Runnable r3=()->{
            for(int i=1; i<10; i++){
                System.out.println("This is my third thread");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Thread t3= new Thread(r3);
        t3.start();

        Runnable r4 = ()-> {
            for (int i = 10; i < 20; i++) {
                System.out.println(i);
            }

        };
        Thread t4 = new Thread(r4);
                    t4.start();


    }

}
