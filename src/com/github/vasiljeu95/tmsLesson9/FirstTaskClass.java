package com.github.vasiljeu95.tmsLesson9;

public class FirstTaskClass {
    public static void main(String[] args) {
        String text = "textattext";
        String letter = "t";
        char t = 't';

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == t) {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");
        System.out.println(text.indexOf(letter));
        System.out.println(text.substring(1, text.length()));

        int num = text.indexOf(letter);
        int i = 0;

//        System.out.println(text.length());
//        System.out.println(text.length() - (num + 1));

        while (num != -1 ) {
            System.out.print((num + i) + " ");
            text = text.substring(num + 1);
            //i = num + 1;
            num = text.indexOf(letter);
        }
    }
}
