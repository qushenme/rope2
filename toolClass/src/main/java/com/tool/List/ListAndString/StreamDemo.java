package com.tool.List.ListAndString;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

    private List<String> item = Arrays.asList("apple","apple","orange","banana","pear","orange");
    private Map<String, Long> finalMap = new LinkedHashMap<>();

    @Test  //分组
    public void groupingBy(){
        Map<String, List<String>> collect = item.stream().collect(Collectors.groupingBy(
                Function.identity()
        ));
        System.out.println(collect);
        //{banana=[banana], orange=[orange, orange], apple=[apple, apple], pear=[pear]}
    }

    @Test  //分组计数
    public void countGroupingBy(){
        Map<String, Long> collect = item.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));
        System.out.println(collect);
        //{banana=1, orange=2, apple=2, pear=1}
    }

    @Test //分组，计数，排序
    public void groupingBySorted(){
        Map<String, Long> collect = item.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));
        collect.entrySet().stream().
                sorted(Map.Entry.<String,Long>comparingByValue().reversed()).
                forEachOrdered(e->finalMap.put(e.getKey(),e.getValue()));
        System.out.println(finalMap);
        //{orange=2, apple=2, banana=1, pear=1}
    }
}
