package com.cavalist.passwordgenerator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.cavalist.passwordgenerator.passwordtypes.PasswordType;
import com.cavalist.passwordgenerator.tools.ByteDecoder;

public class PasswordGenerator {
    private PasswordType passwordType;

    public String generate(String input) {
        byte[] hash = getHash(input);
        return hashToPassword(hash);
    }

    private byte[] getHash(String input) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(input.getBytes());

            byte[] digest = messageDigest.digest();

            return digest;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String hashToPassword(byte[] hash) {
        StringBuffer sb = new StringBuffer();
        ByteDecoder decoder = new ByteDecoder(passwordType);

        for (byte b : hash) {
            sb.append(decoder.decode(b));
        }

        return sb.toString();
    }

    public void setPasswordType(PasswordType passwordType) {
        this.passwordType = passwordType;
    }

}
