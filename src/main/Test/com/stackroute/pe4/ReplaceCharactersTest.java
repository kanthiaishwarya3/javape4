package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {
    ReplaceCharacters obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new ReplaceCharacters();
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
    public void givenAStringShouldReplaceCharacterd() {
        //Act


        String result = obj.replaceTheGivenCharacter("This is a java demo");
        //Assert
        assertEquals("","This is a java femo",result);
    }
    @Test
    public void givenAStringShouldReplaceCharacterl() {
        //Act


        String result = obj.replaceTheGivenCharacter("This is a java class");
        //Assert
        assertEquals("","This is a java ctass",result);
    }
    @Test
    public void givenAStringShouldReplaceCharacterscAndd() {
        //Act


        String result = obj.replaceTheGivenCharacter("This is a java demo class");
        //Assert
        assertEquals("","This is a java femo ctass",result);
    }
    @Test
    public void givenAStringShouldWithoutCharactercAndDShouldDispalyError() {
        //Act


        String result = obj.replaceTheGivenCharacter("This is java practice exercise four");
        //Assert
        assertEquals("Nothing is there to replace","",result);
    }
    @Test
    public void givenAStringShouldReplaceMultipleCharacterscAndd() {
        //Act


        String result = obj.replaceTheGivenCharacter("This is a java demo class on lesson 1");
        //Assert
        assertEquals("","This is a java femo ctass on tesson 1",result);
    }

}
