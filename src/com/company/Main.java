package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s="qwrtpsdfghjklzxcvbnm";
        String word=scan.nextLine();
        String s1="";
        String s2="";
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (word.charAt(i) == s.charAt(j)) {
                        s1 += word.charAt(i);
                        break;
                    }
                }
            }
        for(int i=word.length()-1;i>=0;i--){
            for (int j=0;j<s.length();j++){
                if (word.charAt(i)==s.charAt(j)){
                    s2+=word.charAt(i);
                    break;
                }
            }
        }
        if (s1.equals(s2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
