package com.cavalist.passwordgenerator.passwordtypes;

import com.cavalist.passwordgenerator.tools.ArrayConcatenater;
import com.cavalist.passwordgenerator.tools.AsciiTable;

public class LowerNumber implements PasswordType {
    @Override
    public char[] getPasswordChars() {
        AsciiTable asc = new AsciiTable();
        char[] lowers = asc.getLowers();
        char[] numbers = asc.getNumbers();

        ArrayConcatenater concatenater = new ArrayConcatenater();
        return concatenater.getConcatenated(lowers, numbers);
    }


}
