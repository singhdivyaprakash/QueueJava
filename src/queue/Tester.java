/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author dps
 */
public class Tester {
    public static void main(String args[]){
        ArrayImpOfQueue queue=new ArrayImpOfQueue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.size());
       // queue.enqueue(5);
       // queue.enqueue(6);
        queue.dequeue();
        System.out.println(queue.size());
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.size());
        queue.printQueue();
        
    }
}