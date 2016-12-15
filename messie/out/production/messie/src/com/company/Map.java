package com.company;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zmeiling on 12/9/2016.
 */
public class Map<S, S1> {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "xiaohong");
        map.put("2", "xiaowang");
        map.put("3", "xiaoli");
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }
        }

    }

