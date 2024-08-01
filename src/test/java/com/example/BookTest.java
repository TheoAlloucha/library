package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Year;

public class BookTest {

    @Test
    public void testGetAge() {
        Book book = new Book("Sample Title", "Sample Author", 2000);
        int expectedAge = Year.now().getValue() - 2000;
        Assert.assertEquals(book.getAge(), expectedAge);
    }
}
