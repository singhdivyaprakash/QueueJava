/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 *
 * @author dps
 */
public class LinkedListImpOfQueue implements QueueInterface {
    LinkedList<Object> lis=new LinkedList<>();
    @Override
    public void enqueue(Object o) {
        lis.addLast(o);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object dequeue() {
        if(lis.size()==0){
            throw new EmptyStackException();
        }
        return lis.removeFirst();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object peek() {
        if(lis.size()==0){
            throw new EmptyStackException();
        }
        return lis.getFirst();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return lis.size();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printQueue() {
        for(Object a:lis){
            System.out.println((int)a);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
