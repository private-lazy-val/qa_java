package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlexTheLionTest {

    AlexTheLion alexLion;

    @Before
    public void testSetUp() throws Exception {
        Feline feline = new Feline();
        alexLion = new AlexTheLion(feline);
    }

    @Test
    public void testGetFriends() {
        List<String> alexFriendsList = alexLion.getFriends();
        Set<String> alexFriendsSet = new HashSet<>(alexFriendsList);
        Set<String> expectedAlexFriendsSet = Set.of("Марти", "Глория", "Мелман");
        Assert.assertEquals("The list of Alex's friends is incorrect", expectedAlexFriendsSet, alexFriendsSet);
    }

    @Test
    public void testGetPlaceOfLiving() {
        Assert.assertEquals("The place of Alex's living is incorrect", "Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() {
        Assert.assertEquals("Alex doesn't have kittens", 0, alexLion.getKittens());
    }
}