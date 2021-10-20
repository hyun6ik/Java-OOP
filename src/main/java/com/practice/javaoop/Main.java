package com.practice.javaoop;

import com.practice.javaoop.logic.BubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
