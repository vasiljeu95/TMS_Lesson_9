package com.github.vasiljeu95.tmsLesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson9Main {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = str1;
        String result = str1.replaceAll("t", "o");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(result);

        int[] array = new int [3];
        //array = {1, 2, 3};
//----------------------------------------------------------------
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = new StringBuilder("initial");
        stringBuilder.append(1);
        System.out.println(stringBuilder);

        for (int i = 0; i < 10; i++) {
            stringBuilder.append("a");
        }

        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer = new StringBuffer("initial");

        String str = "cafe with \"Cafe name\" \n this is new line with \\";
        System.out.println(str);

        Pattern pattern = Pattern.compile("cafe", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
