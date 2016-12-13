package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String s1 = "a b c";
        String[] array1 = s1.split(" ");

        for (String array : array1) {
            System.out.println(array);
        }

        List<String> list1 = Arrays.asList(array1);
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        System.out.println(list2);
        list2.addAll(list1);
        System.out.println(list2);
        list2.add(2, "2");
        System.out.println(list2);

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("Tom", "Password1");
        map1.put("Kate", "Password2");
        System.out.println(map1.keySet());
        System.out.println(map1.entrySet());

        Iterator i = map1.entrySet().iterator();
        while(i.hasNext()) {
            Map.Entry temp = (Map.Entry)i.next();
            System.out.print(temp.getKey() + ": ");
            System.out.println(temp.getValue());
        }

    }
}
