package org.example.algo.study.caterpillar;

import org.example.algo.study.ArrayTools;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSubsequenceTest {

    @Test
    void testGetLongestConsecutiveSubsequenceElementsCount() {
        int [] a = {1, 2, 3, 5, 2, 2};
        LongestConsecutiveSubsequence longestConsecutiveSubsequence = new LongestConsecutiveSubsequence();

        assertThat(longestConsecutiveSubsequence.getLongestConsecutiveSubsequenceElementsCount(a)).isEqualTo(3);
    }
}