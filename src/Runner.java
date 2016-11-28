
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
public class Runner {
    
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<=10;i++){            
                    try {
                        System.out.println("Hello "+i);
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }        
        });        
        t1.start();
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){                
                    try {
                        System.out.println("T2 :");
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }                
            }        
        });
        t2.start();
        
    }
}

class MyThread2 implements Runnable{
    
    @Override
    public void run(){
        for(int i=0;i<=10;i++){            
            try {
                System.out.println("Hello "+i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}

class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){            
            try {
                System.out.println("Hello "+i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread1.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
}