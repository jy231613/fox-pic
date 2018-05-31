package com.fox.util;

import com.fox.res.FoxColor;

/**
 * 随机工具类
 * User:贾恒飞
 * Create in 2018年5月21日 from Eclipse
 */
public class RandomUtil {
	
	/**
	 * 随机数工具类
	 * User:贾恒飞
	 * Create in 2018年5月29日 from Eclipse
	 */
	public static class Number{
		/**
		 * 产生一个十以内的随机数
		 * @return int
		 */
		public static int randomNumber() {
			return (int) (Math.random()*10);
		}
		
		/**
		 * 产生一个0.0-1.0之间的随机数(n位长)
		 * @return double
		 */
		public static double randomNumberDouble() {
			return Math.random();
		}
	}
	
	/**
	 * 随机颜色
	 * User:贾恒飞
	 * Create in 2018年5月29日 from Eclipse
	 */
	public static class ColorFit{
		/**
		 * 获取一个随机的基础色
		 * @return
		 */
		public static java.awt.Color randomBaseColor() {
			return FoxColor.getBaseColor(RandomUtil.Number.randomNumber());
		}
		
		/**
		 * 获取一个随机色
		 * @return
		 */
		public static java.awt.Color randomSomeColor() {
			return FoxColor.getSomeColor(RandomUtil.Number.randomNumber());
		}
	}

	/**
	 * 随机字符
	 * User:贾恒飞
	 * Create in 2018年5月29日 from Eclipse
	 */
	public static class Char{
		/**
		 * 产生一个随机的汉字
		 * @return
		 */
		public static char getRandomChar() {
	        return (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
	    }
	}
	
}
