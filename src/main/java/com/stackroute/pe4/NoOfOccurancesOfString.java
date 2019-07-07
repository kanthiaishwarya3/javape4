package com.stackroute.pe4;

public class NoOfOccurancesOfString
{
    public int countCharacterOccurence(String str,char character)
    {
        //character input is converted into string
        String replacechar=Character.toString(character);
        //the count is obtained by substracting the entire length and the length of the string replaced by ""
        int charcount = str.length() - str.replaceAll(replacechar, "").length();
        return charcount;
    }

}
