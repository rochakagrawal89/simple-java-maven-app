package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAppMain() {
        assertEquals("Hello World!", App.mainMessage());
    }
}
