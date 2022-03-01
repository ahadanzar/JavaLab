class Demo{
    public synchronized void display(int n) {
        for(int i=n; i<=100; i+=2){
            System.out.println(i + " ");
                //Thread.sleep(400);
        }
    }
}

class X extends Thread{
    Demo obj;
    X(Demo obj){
        this.obj = obj;
    }
    public void run() {
        obj.display(2);
    }
}

class Y extends Thread {
    Demo obj;
    Y(Demo obj){
        this.obj = obj;
    }
    public void run() {
        obj.display(1);
    }
}

public class sync{
    public static void main(String args[]) {
        Demo obj = new Demo();
        X objX = new X(obj);
        Y objY = new Y(obj);
        objX.start();
        objY.start();
    }
}
