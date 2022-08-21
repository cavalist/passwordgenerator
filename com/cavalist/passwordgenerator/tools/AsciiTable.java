package com.cavalist.passwordgenerator.tools;

public class AsciiTable {
    public char[] getNumbers(){
        return getCharsAt(48, 58);
    }
    public char[] getUppers(){
        return getCharsAt(65, 91);
    }
    public char[] getLowers(){
        return getCharsAt(97, 123);
    }
    public char[] getSpecials(){
        char[] sp1 = getCharsAt(33, 48);
        char[] sp2 = getCharsAt(58, 65);
        char[] sp3 = getCharsAt(91, 97);
        char[] sp4 = getCharsAt(123, 127);

        ArrayConcatenater concatenater = new ArrayConcatenater();

        return concatenater.getConcatenated(sp1, sp2, sp3, sp4);
    }
    public char[] getAllChars(){
        return getCharsAt(33, 127);
    }

    private char[] getCharsAt(int start, int end){
        char[] chars = new char[end - start];
        int asciiIndex = start;
        for (int i = 0;i<chars.length;i++){
            chars[i] = (char)asciiIndex++;
        }
        return chars;
    }
}
