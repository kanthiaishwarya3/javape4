package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultioccurancesTest {
    Multioccurances obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new  Multioccurances();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test
    public void givenAStringShouldReturnPatternMatchingRange() {
        //Act


        String result = obj.patternMatcher("She sells seashells","se");
        //Assert
        assertEquals("", "found at4-6\nfound at10–12",result);
    }
//    @Test
//    public void givenAStringShouldReturnPatternMatchingRange() {
//        //Act
//
//
//        String result = obj.patternMatcher("She sells seashells","se");
//        //Assert
//        assertEquals("", "found at4-6\nfound at10–12",result);
//    }


}