package com.string.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author pengweiwei
 * @Date 2021/6/3 23:12
 */
public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        List<String> tmp = new ArrayList<>();
        for (List<String> list : paths) {
            tmp.add(list.get(0));
        }
        for (List<String> list : paths) {
            if (!tmp.contains(list.get(1))) {
                return list.get(1);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("B", "C"),
                Arrays.asList("D", "B"),
                Arrays.asList("C", "A"));
        System.out.println(destCity(paths));
    }
}
