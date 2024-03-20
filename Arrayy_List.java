package com.example.oops;

import java.util.ArrayList;
import java.util.List;

public class Arrayy_List {
    //ArrayList comes under Collections Framework..--------
    //implements interface as list
    //sequential collection of objects
    //they store only objects can't store primitive-DT(int,float,char etc)
    public static void main(String[] args) {
        List<String>nameList=new ArrayList();//Object created
        nameList.add("Indra");//placed at Index-0
        nameList.add("Rudra");//indd-1
        nameList.add("Shiva");//ind-2
        nameList.add("Tony");//ind-3
        nameList.add(4,"Mangal");
        nameList.get(1);
        nameList.indexOf(nameList);
        nameList.contains("Tony");
        //to print all name we use....using for each loop
        for (String name:nameList){
            System.out.println(name);
        }
    }
}