package com.cavalist.passwordgenerator.tools;

import com.cavalist.passwordgenerator.passwordtypes.PasswordType;

public class ByteDecoder {
    private char[] decodeTable;

    public ByteDecoder(PasswordType passwordType) {
        decodeTable = passwordType.getPasswordChars();
    }

    public char decode(byte b) {
        // b는 8비트이고, 맨앞이 1인 것을 음수로 인식함.
        // 음수 -128~127 대신 0~255로 나타내고 싶은 것.
        // 00000000 0000000 00000000 11111111 = 0xff
        // 이걸 비트연산 (&) 해주면,
        // 더이상 8비트가 아니라 32비트가 되고,
        // 8번째 비트는 부호 비트가 아니라
        // 숫자를 나타내는 비트가 된다.
        // 부호 비트는 이제 32번째 비트가 담당한다.
        int index = (b & 0xff) % decodeTable.length;
        return decodeTable[index];
    }

}
