package org.example.algo.study.streams;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StreamTest {

    @Test
    void testStreamMax() {
        Stream<Integer> stream = Stream.of(1, 5, 2, 3, 6, 3, 4);
        Optional<Integer> max = stream.max(Integer::compareTo);

        assertThat(max).isPresent()
                .contains(6);
    }
}
