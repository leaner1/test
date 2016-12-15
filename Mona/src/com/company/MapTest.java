package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "xiaohong");
        map.put("2", "xiaowang");
        map.put("3", "xiaoli");
        Set key = map.keySet();
        if (key != null) {
            Iterator CC = key.iterator();
            while (CC.hasNext()) {
                Object keyV = CC.next();
                String value = map.get(keyV);
                System.out.print(keyV + ",");
                System.out.print(value);
                System.out.println();
            }
        }
    }
}
////22222