/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUN
 */
public class ProceInterrupt implements Runnable{

    public static void main(String[] args){
        Thread t1 = new Thread(new ProceInterrupt(),"t1");
        t1.start();
        Tsleep(5000);
        t1.interrupt();
        Tsleep(5000);
        t1.stop();
    }
    
    @Override
    public void run() {
        while(true){
            Tsleep(1000);
            System.out.println("Hello "+Thread.currentThread().getName());
        }
        
        
    }
    
    public static void Tsleep(long l){        
        try {
            Thread.sleep(l);
        } catch (InterruptedException ex) {
            System.out.println("Interrupt Action");
        }        
    }
    
}
