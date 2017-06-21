package com.gihan;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SampleFunctionalTest {

    @Test
    public void shouldAddTwoNumbersTogether() throws Exception {
        int a = 2;
        int b = 3;
        assertThat(a + b, is(5));
    }
}
