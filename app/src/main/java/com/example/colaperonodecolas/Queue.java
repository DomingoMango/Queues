package com.example.colaperonodecolas;

import android.util.Log;

public class Queue {
    private QueueNode first;
    private QueueNode last;
    public Queue(){
        first = null;
        last = null;
    }
    public void add (int data){
        QueueNode node = new QueueNode(data);
        if (node==null){
            Log.i("log","Queue over flow");
        }else{
            if(first==null){
                first=node;
            }else{
                node.setNext(last);
            }
            last=node;
        }
    }
    public void print(){
        String result="";
        QueueNode aux= last;
        while(aux.getNext()!= null){
            result += last+"->";
            aux= aux.getNext();
        }
        Log.i("log",result);
    }
}
