package com.stackroute.pe4;

import java.util.regex.Pattern;

public class RegularExpression {
    public String patternMatcher(String str)
    {
        //srt.matches the given pattern with the string
        if(str.matches("(?i).*Harry.*"))
        {
            return "true";
        }else
        {
            return "false";
        }
    }
}

