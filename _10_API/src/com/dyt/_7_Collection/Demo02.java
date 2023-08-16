package com.dyt._7_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("小明");
        c.add("小李");
        c.add("小芳");
        c.add("小蓝");
        c.add("小丁");
        c.add("小陈");
        System.out.println(c);

        Iterator<String> it = c.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}