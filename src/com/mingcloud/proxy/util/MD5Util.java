package com.mingcloud.proxy.util;

import java.security.MessageDigest;

/**
 * @author Bxf
 * @desc 数据加密解密工具类
 * @date 2017年8月9日 09:03:07
 * */
public class MD5Util {

    /**
     * @title MD5Encryption
     * @desc MD5加码 生成32位md5码
     * */
    public static String MD5Encryption(String passwod){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = passwod.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();

    }
}
