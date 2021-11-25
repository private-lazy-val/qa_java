package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline felineSpy = Mockito.spy(feline);
        felineSpy.eatMeat();
        Mockito.verify(felineSpy).getFood("Хищник");
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("cat.getFamily returns something different rather than 'Кошачьи'", "Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Assert.assertEquals("cat.getKittens methods doesn't return 1", 1, feline.getKittens());
    }
}