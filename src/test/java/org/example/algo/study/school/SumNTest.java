package org.example.algo.study.school;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SumNTest {

    @Test
    void test_sum_when_positive() {
        SumN sumN = new SumN();

        assertThat(sumN.sum(5)).isEqualTo(15);
    }

    @Test
    void test_sum_when_negative() {
        SumN sumN = new SumN();

        assertThat(sumN.sum(-5)).isEqualTo(-14);
    }

    @Test
    void testMath() {
        int a = 583;
        int k = a / 10;
        int c = (a / 10) % 10;
        int b = a % 10;

        System.out.println("Заданное число: " + a);
        System.out.println("количество 10: " + k);
        System.out.println("остаток деления на 10 от количество 10: " + c);
        System.out.println("остаток деления на 10 : " + b);
    }
}