package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new RegularExpression();
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
    public void givenAStringShouldReturnTruebyValidatingPatternMatch() {
        //Act
        String result = obj.patternMatcher("This is Harry");
        //Assert
        assertEquals("","true",result);
    }
    @Test
    public void givenAStringShouldReturnFalseByValidatingPatternMatch()
    {
        //Act
        String result = obj.patternMatcher("This is Henry");
        //Assert
        assertEquals("","false",result);
    }
    @Test
    public void givenAStringShouldReturnNothingbyValidatingPatternMatch()
    {
        //Act


        String result = obj.patternMatcher("This is hari");
        //Assert
        assertEquals("","true",result);
    }


}
