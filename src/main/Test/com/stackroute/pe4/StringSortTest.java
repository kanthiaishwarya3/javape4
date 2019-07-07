package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortTest {
    StringSort obj = new StringSort();
    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new StringSort();
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
    public void givenAStringReturnsSortedWords() {
        String []expected="This,class,demo,is,java".split("[\\s,]+");
        String []actual=obj.alphabeticalOrder("This is java demo class");
        assertArrayEquals(expected,actual);
    }
    @Test
    public void givenAStringReturnsSortedWordsInParagraphNull() {

        String []actual=obj.alphabeticalOrder(null);
        assertNull(actual);
    }

    @Test
    public void givenAStringReturnsSortedWordsInParagraphNotNull() {

        String []actual=obj.alphabeticalOrder("This is java demo class");
        assertNotNull(actual);
    }

    @Test
    public void givenAStringReturnsSortedWordsIParagraph() {
        String []expected="ab cd ef ".split("[\\s,]+");
        String []actual=obj.alphabeticalOrder("ef ab cd");
        assertArrayEquals(expected,actual);
    }
}
