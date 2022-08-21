package com.cavalist.passwordgenerator.passwordtypes;

import com.cavalist.passwordgenerator.tools.AsciiTable;

public class AllChars implements PasswordType {
    @Override
    public char[] getPasswordChars() {
        AsciiTable asc = new AsciiTable();
        return asc.getAllChars();
    }


}
