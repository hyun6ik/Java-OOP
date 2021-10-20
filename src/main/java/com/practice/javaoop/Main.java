package com.practice.javaoop;

import com.practice.javaoop.logic.BubbleSort;
import com.practice.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
