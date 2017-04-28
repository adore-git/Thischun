package edu.nf.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5Utils {
    /*
    * 简单的md5加密
    * */
    public static String getDigestMD5(String email) {
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            md.update(email.getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            return null;
        }
    }
}
