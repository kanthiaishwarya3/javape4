package com.stackroute.pe4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoOfOccurancesOfStringTest {
    NoOfOccurancesOfString obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new NoOfOccurancesOfString();
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
    public void givenAStringShouldReturnCharacterCountOfa() {
        //Act


        int result = obj.countCharacterOccurence("This is java and java",'a');
        //Assert
        assertEquals("",5,result);
    }
    @Test
    public void givenAStringShouldReturnCharacterCountOfj() {
        //Act


        int result = obj.countCharacterOccurence("This is java and java",'j');
        //Assert
        assertEquals("",2,result);
    }
    @Test
    public void givenAStringShouldNotReturnCharacterCountIfTheCharacterIsNotThere() {
        //Act


        int result = obj.countCharacterOccurence("This is java and java",'f');
        //Assert
        assertEquals("",0,result);
    }


}
