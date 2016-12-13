package com.company;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<String> list= new ArrayList<>();
            list.add("nihao");
            list.add("wohao");
            list.add("dajiahao");
            //list.add("nihao");
            list.set(1,"tahao");


            for(int i=0;i<list.size();i++){
               if(list.get(i)=="nihao"){
                    list.set(i ,"nibuhao");
                }
                    System.out.println(list.get(i));
               }
            }


            }





