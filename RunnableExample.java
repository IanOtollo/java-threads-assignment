public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread created by implementing Runnable interface");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableExample());
        t.start();
    }
}
