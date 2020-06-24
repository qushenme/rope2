package com.tool.List.ListAndString;

import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ListAndStringDemo {

    private static List<Integer> list = new ArrayList<>();
    static {

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
    }

    // String 转List
    @Test
    public void test(){
        String str= "1,2,3,4,5,6,7";

        //List<String> stringList = Arrays.asList(str.split(","));

        List<Integer> stringList = Arrays.stream(str.split(",")).map(x->Integer.parseInt(x.trim())).collect(Collectors.toList());

        List<String> collect = Arrays.stream(str.split(",")).filter(x -> x.equals("1")).collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            System.out.println(collect.get(i));
        }
    }

    @Test
    public void test1(){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
        }
    }

   /* public static void main(String[] args) {
        String join = "点军区";
        Matcher m = Pattern.compile("((?:.*?)[区县市旗])?((?:.*?).*)").matcher(join);
        if (m.find()){
            String g1 = m.group(1);
            String g2 = m.group(2);
            System.out.println("g1："+g1+"；g2："+g2);
        }
    }*/

    public static void main(String[] args) {
        Date date = null;
        long time = date.getTime();
        System.out.println(time);
    }


}
