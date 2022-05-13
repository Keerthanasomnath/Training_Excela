package com.training.removal;
import java.util.*;
public class RemovingDuplicate {

    public static void main(String args[]){

        String[] fruits = {"apple","orange","apple","pineapple","orange","banana"};

    Set<String> set  = new TreeSet<String>();

    Collections.addAll(set,fruits);

       System.out.println(set);
    }
}
