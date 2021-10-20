package com.practice.javaoop.logic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    void sort() {
        //given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        //when
        final List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));
        //then
        assertThat(actual).isEqualTo(List.of(1, 2, 3, 4, 5));
    }
}