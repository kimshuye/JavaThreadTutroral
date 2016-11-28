
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUN
 */
public class Processor implements Runnable{
    private int value=0;
    
    public static void main(String[] args){
        Processor p1 = new Processor();
        Thread t1 = new Thread(p1,"A");
        Thread t2 = new Thread(p1,"B");
        Thread t3 = new Thread(p1,"C");
        
        t1.start();
        t2.start();
        t3.start();
        
    }

    @Override
    public void run() {
        increment();
    }
    
    public  void increment(){
        for(int i=1;i<=3;i++){
            value++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("value : "+value+" Thread Name : "+Thread.currentThread().getName());
        }
    }
    
}
