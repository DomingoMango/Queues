package com.example.colaperonodecolas;

import android.util.Log;
import android.widget.Toast;

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
                last.setNext(node);
            }
            last=node;
        }
    }
    public void print(){
        String result="";
        QueueNode aux= first;
        while(aux.getNext()!= null){
            result += aux+"->";
            aux= aux.getNext();
        }
        Log.i("log",result);
    }
    public int remove()
    {
        if(first==null){
            return -1;
        }else{
            QueueNode kiwi = first;
            first = first.getNext();
            if(first==null){
                last=null;
            }
            return kiwi.getData();
        }
    }
    public QueueNode getFirst() {
        return first;
    }

    public QueueNode getLast() {
        return last;
    }
}
