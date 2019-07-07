package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Multioccurances
{
    public String patternMatcher(String matcher,String pattern)
    {
        //takes the matcher and pattern as input and finds the index of the pattern in the given matcher string
        //considers pattern and matcher functions
        Pattern p = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);

        StringBuffer buffer=new StringBuffer();

        Matcher m = p.matcher(matcher);

        while (m.find()) {
            buffer.append("found at").append(m.start()).append("-").append(m.end()).append("\n");
        }
        return  buffer.toString().trim();

    }
}
