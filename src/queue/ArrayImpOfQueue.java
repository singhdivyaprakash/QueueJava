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
public class ArrayImpOfQueue implements QueueInterface{
    int[] arr;
    int start=0;
    int end=0;
    public ArrayImpOfQueue(int size){
        this.arr=new int[size];
    }
    @Override
    public void enqueue(Object o) {
        int ele=(int)o;
        int size=size();
        if(size==arr.length-1){
            int[] arr2=new int[2*arr.length];
            System.arraycopy(arr,start,arr2,0,size-start);
            System.arraycopy(arr,0,arr2,size-start,end);
            arr=arr2;
            start=0;
            end=size;
        }
        arr[end]=ele;
        if(end==arr.length-1){
          
                end=0;
            
        }
        else{
            end++;
        }
            
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    

    @Override
    public Object dequeue() {
        int ret=(int) arr[start++];
        arr[start-1]=0;
        return ret;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object peek() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return arr[start];
    }

    @Override
    public int size() {
        if(end>=start){
            return end-start;
        }
        else{
            return (arr.length-start+end);
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printQueue() {
        if(end>start){
            for(int i=start;i<end;i++){
                System.out.println(arr[i]);
            }
        }
        else{
            for(int i=start;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            for(int i=0;i<end;i++){
                System.out.println(arr[i]);
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
