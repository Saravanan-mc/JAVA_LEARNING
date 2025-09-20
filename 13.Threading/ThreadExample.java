


class exp1 extends Thread{
    public void run(){
        System.out.println("one"+exp1.currentThread().threadId());
        System.out.println("two"+exp1.currentThread().threadId());
        System.out.println("three"+exp1.currentThread().threadId());
    }    
}


public class ThreadExample {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            exp1 ob = new exp1();
            ob.start();
        }

        System.out.println();
        System.out.println();
        
        for(int i=0;i<5;i++){
            exp1 ob2 = new exp1();
            ob2.run();
        }
    }
}
