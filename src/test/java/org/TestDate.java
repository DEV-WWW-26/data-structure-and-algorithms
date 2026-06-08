package org;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestDate {

    @Test
    void testDate() {
        LocalDate date = LocalDate.now();

        String s = date + "_filename.txt";

        System.out.println(s);
    }
}
