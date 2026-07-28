package org.example.algo.study.caterpillar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MissingNumbersTest {

    @Test
    void testGetMissingNumber() {
        int [] a = {1, 2, 3, 5, 2, 2};
        MissingNumbers missingNumbers = new MissingNumbers();

        assertThat(missingNumbers.getMissingNumber(a)).isEqualTo(0);
    }
}