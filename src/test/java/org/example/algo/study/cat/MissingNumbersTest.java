package org.example.algo.study.cat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MissingNumbersTest {

    @Test
    void testGetMissingNumber() {
        int[] a = {1, 2, 3, 5, 2, 2};
        MissingNumbers missingNumbers = new MissingNumbers();

        assertThat(missingNumbers.getMissingNumber(a)).isEqualTo(4);
    }

    @Test
    void testDivision() {
        int a = 10 % 3;

        assertThat(a).isEqualTo(1);
    }

    @Test
    void tedtEquals() {
        int a = 1;
        int b = 2;
        boolean b1 = false;
        boolean b2 = true;
        boolean res = b1 & b2;

        assertThat(res).isTrue();
    }
}