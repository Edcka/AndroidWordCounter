package com.example.androidwordcounter;

import org.junit.*;

public class testCounter {
    Counter counterUnit = new Counter();

    @Test
    public void TestingCount() {

        int output = counterUnit.countWords("Testo testas nesibaigiantis testas");
        Assert.assertEquals(4,output);

    }
}
