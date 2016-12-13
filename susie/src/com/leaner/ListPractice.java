package com.leaner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by husiq on 12/8/2016.
 */
public class ListPractice {
    public static void main(String[] args) {
        // write your code here
        //list ordered duplicated
        //Set unordered unduplicated
        //Map key:value key:unduplicated value:duplicated

        /*-----List------*/
        List<String> newlist = new ArrayList<String>();
        /*---1---*/
        newlist.add("nihao");
        newlist.add("wohao");
        newlist.add("dajiahao");
        newlist.add("nihao");
        /*---2---*/
        newlist.add(1,"tahao");
        /*---3---*/
//        Iterator iterator = newlist.iterator();
//        for(;iterator.hasNext();){
//            System.out.println(iterator.next());
//        }
        /*---4---*/
        ListIterator listIterator = newlist.listIterator();
        for (;listIterator.hasNext();){
            Integer index = (Integer)listIterator.nextIndex();
            String str = (String)listIterator.next();
            if (str.equals("nihao")){
                System.out.println("found it");
//                If use the follow method, there will throw an exception at the next ListInterator.hasNext()
//                newlist.remove(index);
//                newlist.add(index,"nibuhao");
                listIterator.set("nibuhao");
            }
            System.out.print(index);
            System.out.println(":"+newlist.get(index));
        }


    }
}
