/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUN
 */

/**
 * Thread ทำงานร่วม ในเวลาเดียวกัน
 * 
 */
public class ProceJoin implements Runnable{

    public static void main(String[] args){
        Thread t1 = new Thread(new ProceJoin(),"t1");
        Thread t2 = new Thread(new ProceJoin(),"t2");
        Thread t3 = new Thread(new ProceJoin(),"t3");
        
        t1.start();
        try {
            t1.join(3000);//เริ่มจาก start ไปแล้ว 3s Thread ถัดไปทำงานได้            
        } catch (InterruptedException ex) {            ex.printStackTrace();        }
        
        t2.start();        
        try {    t2.join(3000);       } catch (InterruptedException ex) {   ex.printStackTrace();     }
        
        t3.start();
        
        Tsleep(10000);
        System.out.println("\n=====================");   
        
        Thread t11 = new Thread(new ProceJoin(),"t11");
        Thread t22 = new Thread(new ProceJoin(),"t22");
        Thread t33 = new Thread(new ProceJoin(),"t33");
        
        t11.start();
        t22.start();
        t33.start();
        try {    t11.join();t22.join();t33.join();       } catch (InterruptedException ex) {   ex.printStackTrace();     }
        System.out.println("End Proecssor");                
    }
    
    @Override
    public void run() {
        System.out.println("Thread Start : "+Thread.currentThread().getName());
        Tsleep(5000);
        System.out.println("Thread End : "+Thread.currentThread().getName());
    }   
    public static void Tsleep(long l){        
        try {
            Thread.sleep(l);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }        
    }
}
