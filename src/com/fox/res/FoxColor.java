package com.fox.res;

import java.awt.Color;

/**
 * 提供默认颜色类
 * User:贾恒飞
 * Create in 2018年5月31日 from Eclipse
 */
public class FoxColor {
	//Base基础色
	public static Color black = new Color(0,0,0);
	public static Color white = new Color(255,255,255);
	public static Color red = new Color(255,0,0);
	public static Color blue = new Color(30,144,255);
	public static Color purple = new Color(160,32,240);
	public static Color green = new Color(0,255,0);
	public static Color yellow = new Color(255,255,0);
	public static Color pick = new Color(255,0,255);
	
	/**
	 * 砖红
	 */
	public static Color brickRed = new Color(156,102,31);
	
	/**
	 * 镉红
	 */
	//public static Color cadmiumRed = new Color(277,23,13);
	
	/**
	 * 珊瑚色
	 */
	public static Color coralline = new Color(255,127,80);
	
	/**
	 * 印度红
	 */
	public static Color indianRed = new Color(176,23,31);
	
	/**
	 * 粉红
	 */
	public static Color pickRed = new Color(255,192,203);
	
	/**
	 * 橘红
	 */
	public static Color orangeRed = new Color(255,69,0);
	
	/**
	 * 金色
	 */
	public static Color golden = new Color(255,215,0);
	
	/**
	 * 橙色
	 */
	public static Color orange = new Color(255,97,0);
	
	/**
	 * 棕色
	 */
	public static Color brown = new Color(128,42,42);
	
	/**
	 * 玉色
	 */
	public static Color turquoise = new Color(0,199,140);
	
	/**
	 * 紫罗蓝色
	 */
	public static Color violet = new Color(138,43,226);
	
	/**
	 * 靛青色
	 */
	public static Color indigo = new Color(8,46,84);
	
	/**
	 * 森林绿色
	 */
	public static Color forest = new Color(34,139,34);
	
	/**
	 * 孔雀蓝
	 */
	public static Color peacock = new Color(51,161,201);
	
	/**
	 * 根据colorSet值获取颜色--基础色
	 * @param colorSet 值 
	 * @return Color
	 */
	public static Color getBaseColor(int colorSet) {
		Color color = null;
		switch (colorSet) {
		case 0:
			color = FoxColor.black;
			break;
		case 1:
			color = FoxColor.white;
			break;
		case 2:
			color = FoxColor.red;
			break;
		case 3:
			color = FoxColor.blue;
			break;
		case 4:
			color = FoxColor.purple;
			break;
		case 5:
			color = FoxColor.green;
			break;
		case 6:
			color = FoxColor.yellow;
			break;
		case 7:
			color = FoxColor.pick;
			break;
		case 8:
			color = FoxColor.turquoise;
			break;
		case 9:
			color = FoxColor.orange;
			break;
		default:
			color = FoxColor.white;
			break;
		}
		return color;
	}
	
	/**
	 * 根据colorSet值获取颜色
	 * @param colorSet
	 * @return Color
	 */
	public static Color getSomeColor(int colorSet) {
		Color color = null;
		switch (colorSet) {
		case 0:
			color = FoxColor.brickRed;
			break;
		case 1:
			color = FoxColor.indianRed;
			break;
		case 2:
			color = FoxColor.brown;
			break;
		case 3:
			color = FoxColor.blue;
			break;
		case 4:
			color = FoxColor.purple;
			break;
		case 5:
			color = FoxColor.forest;
			break;
		case 6:
			color = FoxColor.orangeRed;
			break;
		case 7:
			color = FoxColor.peacock;
			break;
		case 8:
			color = FoxColor.indigo;
			break;
		case 9:
			color = FoxColor.violet;
			break;
		default:
			color = FoxColor.golden;
			break;
		}
		return color;
	}
}
