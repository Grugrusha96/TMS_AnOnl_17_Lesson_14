public class Main {
    public static void main(String[] args) {
        T3 t3 = new T3();
        t3.setName("Поток T3");
        t3.start();
        try {
            try {
                t3.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


        T2 t2 = new T2();
       Thread thread2 = new Thread(t2);
       thread2.setName("Поток Т2");
       thread2.start();


        T1 t1 = new T1();
        Thread thread1 = new Thread(t1);
        thread1.setName("Поток Т1");
        thread1.start();

    }
    static void calculator() {
        int i;
        for (i = 0; i < 100; i++) ;
        System.out.println(Thread.currentThread().getName() + ": " + i);
    }
}