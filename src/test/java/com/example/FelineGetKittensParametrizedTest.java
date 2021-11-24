package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittensParametrizedTest {

    Feline feline;

    private final int kittensNum;

    public FelineGetKittensParametrizedTest(int kittensNum) {
        this.kittensNum = kittensNum;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensNum() {
        return new Object[][] {
                { 1 },
                { 2 },
                { 666 },
        };
    }

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testGetKittens() {
        Assert.assertEquals("Returned number of kittens doesn't coincide with the passed number of kittens", kittensNum, feline.getKittens(kittensNum));
    }
}
