package xyz.ysy520.oo;

public class TestThreadState {
    public static void main(String[] args) {
        StateThread thread1 = new StateThread();
        thread1.start();
        StateThread thread2 = new StateThread();
        thread2.start();
    }
}
//使用继承方式实现多线程
class StateThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + ":" + i);
            try {
                Thread.sleep(2000);//调用线程的sleep()方法；
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}