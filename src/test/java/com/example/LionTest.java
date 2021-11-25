package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    Lion lion;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void testGetKittens() {
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testGetFood() throws Exception {
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void testExceptionThrownWhenLionSexIsOther() throws Exception {
        try {
            Lion lion = new Lion("Другое", feline);
        } catch (Exception e) {
            String errorMessage = "Используйте допустимые значения пола животного - самей или самка";
            Assert.assertEquals("Unexpected error message", errorMessage, e.getMessage());
        }
    }
}