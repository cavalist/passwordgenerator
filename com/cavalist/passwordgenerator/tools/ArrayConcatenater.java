package com.cavalist.passwordgenerator.tools;

public class ArrayConcatenater {
    public char[] getConcatenated(char[]... arrs) {
        int totalLength = 0;
        for (char[] arr : arrs)
            totalLength += arr.length;

        char[] resArr = new char[totalLength];
        int resArrIndex = 0;
        for (char[] arr : arrs)
            for (char ch : arr)
                resArr[resArrIndex++] = ch;

        return resArr;
    }
}
