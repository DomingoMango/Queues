package com.example.colaperonodecolas;

import android.util.Log;
import android.widget.Toast;

public class Queue {
    private QueueNode first;
    private QueueNode last;
    private int i=0;
    public Queue(){
        first = null;
        last = null;
    }
    public void add (int data){

        QueueNode node = new QueueNode(data);
        QueueNode aux= first;


        if (node==null){
            Log.i("log","Queue over flow");
        }else{
            if(first==null){
                first=node;
            }else{
                while(aux.getNext()!= null){
                    i++;

                    if(i==8 || aux.getData()==node.getData()){
                        Log.i("pan","Limit reached or repeated identifier");
                        break;
                    }
                    aux= aux.getNext();
                }
                last.setNext(node);
            }
            last=node;
        }


    }
    public String print(){
        String result="";
        QueueNode aux= first;
        while(aux.getNext()!= null){
            result += aux.getData()+"->";
            aux= aux.getNext();
        }
        Log.i("pan",result);
        return result;
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
