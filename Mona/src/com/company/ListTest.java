package com.company;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //在list中添加元素，nihao,wohao,dajiahao,nihao
        list.add("nihao");
        list.add("wohao");
        list.add("dajiahao");
        list.add("nihao");
        //在list的第二个位置添加元素，tahao
        list.add(1, "tahao");
        //用Iterator迭代器遍历打印list中元素
        Iterator TT = list.iterator();
        while (TT.hasNext()) {
            Object str = TT.next();
            System.out.println(str);
        }
        //在打印时，将list中的nihao，修改为nibuhao
        ListIterator<String> SS = list.listIterator();
        int i = 0;
        while (SS.hasNext()) {
            i = i++;
            if (SS.next().equals("nihao")) {
                SS.set("nibuhao");
                String Snd = list.get(i);
                System.out.println(Snd);

            }

        }

    }

}


