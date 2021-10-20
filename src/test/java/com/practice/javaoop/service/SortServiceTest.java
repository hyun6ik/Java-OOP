package com.practice.javaoop.service;

import com.practice.javaoop.logic.JavaSort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sortService = new SortService(new JavaSort<String>());

    @Test
    void sort() {
        //given
        final List<String> list = List.of("3", "2", "1");
        //when
        final List<String> result = sortService.doSort(list);
        //then
        assertThat(result).isEqualTo(List.of("1", "2", "3"));

    }
}