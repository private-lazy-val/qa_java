package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionManeParametrizedTest {

    @Mock
    Feline feline;

    Lion lion;

    private final String sex;
    private final boolean hasMane;

    public LionManeParametrizedTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][] {
                { "Самец", true },
                { "Самка", false },
        };
    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        lion = new Lion(sex, feline);
    }

    @Test
    public void testDoesHaveMane() {
        Assert.assertEquals("Female lion happened to have mane, or male lion does not have one.", hasMane, lion.doesHaveMane());
    }
}

