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

    @Test
    void testBits() {
        int a = 13;
        String binary = Integer.toBinaryString(a);
        // applying bit operator "NOT"
        String binaryReverted = Integer.toBinaryString(~a);

        System.out.println(binary);
        System.out.println(binaryReverted);

        // applying bit operator "AND"
        System.out.println(13 & 15);
        System.out.println();
        System.out.println(277 + " " + Integer.toBinaryString(277));
        System.out.println(432 + " " + Integer.toBinaryString(432));
        System.out.println("277 & 432 = " + (277 & 432));
        System.out.println("277 | 432 = " + (277 | 432));
        System.out.println("277 ^ 432 = " + (277 ^ 432) + " (XOR)");
        System.out.println("277 << 3 = " + (277 << 3) + " " + Integer.toBinaryString(277 << 3) + " (moving bits to the left)");
        System.out.println("35 >> 2 = " + (35 >> 2) + " " + Integer.toBinaryString(35 >> 2) + " (moving bits to the right)");
    }
}