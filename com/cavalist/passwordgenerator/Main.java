package com.cavalist.passwordgenerator;
import com.cavalist.passwordgenerator.passwordtypes.AllChars;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator passGen = new PasswordGenerator();
        passGen.setPasswordType(new AllChars());
        System.out.println(passGen.generate("비밀번호 생성 문자열"));

    }

}