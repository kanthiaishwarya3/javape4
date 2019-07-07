package com.stackroute.pe4;

import java.util.*;
public class StringSort {

    public String[] alphabeticalOrder(String paragraph){
        if(paragraph==null)
        {
            return null;
        }
        String [] required= paragraph.split("[\\s,]+"); //sorts the given input alphabetically
        Arrays.sort(required);

        return required;
    }
}

