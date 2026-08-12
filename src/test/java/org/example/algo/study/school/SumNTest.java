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
}