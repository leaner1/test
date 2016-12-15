package com.leaner;

import java.util.*;

/**
 * Created by husiq on 12/8/2016.
 */
public class MapPractice {
    public static void main(String[] args){
        Map<Integer,String> newMap = new HashMap<Integer,String>();
        newMap.put(1,"xiaohong");
        newMap.put(2,"xiaowang");
        newMap.put(3,"xiaoli");
        Set<Integer> keySet = newMap.keySet();
        for(Iterator iterator = keySet.iterator(); iterator.hasNext();){
            Integer key = (Integer)iterator.next();
            System.out.println(key + ":" + newMap.get(key));
        }

    }
}
