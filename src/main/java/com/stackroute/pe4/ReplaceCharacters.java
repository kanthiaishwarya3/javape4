package com.stackroute.pe4;


public class ReplaceCharacters {
    public String replaceTheGivenCharacter(String str) {
        String result = "";
        String finalresult = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.contains("d")) {
                result = str.replaceAll("d", "f");
                if (str.contains("l")) {
                    finalresult = result.replaceAll("l", "t");
                }
                return finalresult;
            }


            if (str.contains("l"))
            {
                result = str.replaceAll("l", "t");
                if (str.contains("d")) {
                    finalresult = result.replaceAll("d", "f");
                }
                return finalresult;
            }



        }

        return finalresult;
    }
}
