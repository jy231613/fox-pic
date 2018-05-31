package com.fox.util;

import java.util.UUID;

import com.fox.inter.VerifyStr;

/**
 * 字符串相关工具类
 * User:贾恒飞
 * Create in 2018年5月21日 from Eclipse
 */
public class StringUtil {
	private VerifyStr vStr;

    /**
     * 生成一个uuid
     * @return uuid
     */
    public static String uuid(){
        return getUUID(true);
    }

    /**
     * 获得指定数目的UUID
     * @param number int 需要获得的UUID数量
     * @return String[] UUID数组
     */
    public static String[] getUUID(int number,boolean isdel){
        if(number < 1){
            return null;
        }
        String[] retArray = new String[number];
        for(int i=0;i<number;i++){
            retArray[i] = getUUID(isdel);
        }
        return retArray;
    }

    /**
     * 获得一个UUID
     * @return String UUID
     */
    public static String getUUID(boolean isdel){
        String uuid = UUID.randomUUID().toString();
        return isdel ? uuid.replaceAll("-", "") : uuid;
    }

    /**
     * 判断字符串是否为空
     * @param str 字符串
     * @return true or false
     */
    public static boolean isNotEmpty(String str) {
        if (str!=null) {
            if (!str.isEmpty() && !str.trim().equals("")) {
                return true;
            }
        }
        return false;
    }
    /**
     * 判断字符串是否为空
     * @param str 字符串
     * @return boolean
     */
    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(str.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * 获取正确的字符串
     * @param vStr 字符修正方案
     * @param str 字符源
     * @return 修正后的字符
     */
    public static String gainString(VerifyStr vStr,String str){
        return vStr.verifyString(str);
    }

    /**
     * 转换十以内的数字为汉字数字
     * @param number 0-10
     */
    public static String gainNumber(int number){
        String numberStr = "";
        switch (number){
            case 0:
                numberStr = "零";
                break;
            case 1:
                numberStr = "一";
                break;
            case 2:
                numberStr = "二";
                break;
            case 3:
                numberStr = "三";
                break;
            case 4:
                numberStr = "四";
                break;
            case 5:
                numberStr = "五";
                break;
            case 6:
                numberStr = "六";
                break;
            case 7:
                numberStr = "七";
                break;
            case 8:
                numberStr = "八";
                break;
            case 9:
                numberStr = "九";
                break;
            case 10:
                numberStr = "十";
                break;
        }
        return numberStr;
    }

}
