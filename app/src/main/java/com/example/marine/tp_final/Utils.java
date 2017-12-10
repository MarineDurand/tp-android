package com.example.marine.tp_final;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by marine on 09/12/17.
 */

public class Utils {

    public static final String GRAVATAR_PREFIX = "https://secure.gravatar.com/avatar/";

    public static final String md5(final String s) {
        final String MD5 = "MD5";
        if (s != null) {
            try {
                // Create MD5 Hash
                MessageDigest digest = java.security.MessageDigest.getInstance(MD5);
                digest.update(s.getBytes());
                byte messageDigest[] = digest.digest();

                // Create Hex String
                StringBuilder hexString = new StringBuilder();
                for (byte aMessageDigest : messageDigest) {
                    String h = Integer.toHexString(0xFF & aMessageDigest);
                    while (h.length() < 2)
                        h = "0" + h;
                    hexString.append(h);
                }
                return hexString.toString();

            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            return "";
        }
        return "";
    }
}