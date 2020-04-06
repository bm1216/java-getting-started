package com.pokemon;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BaseTest {

    @Test
    public void returnCorrectAlways() {
        String x = "hello";
        assertThat(x, is("hello"));
    }
}