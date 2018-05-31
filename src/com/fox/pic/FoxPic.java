package com.fox.pic;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.ImageIO;

import com.fox.model.PicModel;
import com.fox.res.FoxColor;
import com.fox.util.PictureUtil;
import com.fox.util.RandomUtil;
import com.fox.util.StringUtil;

/**
 * 快速生成图片
 * User:贾恒飞
 * Create in 2018年5月31日 from Eclipse
 */
public class FoxPic {
	
	//默认属性
	private static Font font = new Font("楷体", Font.BOLD, 32);
	private static int width = 80;
	private static int height = 80;
	private static Color fontColors = FoxColor.white;
	
	/**
	 * 生成图片
	 * @param path 生成图片的路径
	 * @return 图片保存全路径
	 */
	public static String create(String path){
		BufferedImage buffer = PictureUtil.createImage(
				String.valueOf(RandomUtil.Char.getRandomChar()), 
				font, 
				width, 
				height, 
				RandomUtil.ColorFit.randomSomeColor(), 
				fontColors);
		String file = StringUtil.getUUID(true)+".jpg";
		try {
			ImageIO.write(buffer,"JPG", new File(path+"/"+file));
			return path+"/"+file; 
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException图片保存失败!");
			return null;
		}
	}
	
	/**
	 * 创建图片
	 * @param path 生成图片的路径
	 * @param buffer 流
	 * @return 图片保存全路径
	 */
	public static String create(String path,BufferedImage buffer) {
		String file = StringUtil.getUUID(true)+".jpg";
		try {
			ImageIO.write(buffer,"JPG", new File(path+"/"+file));
			return path+"/"+file; 
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException图片保存失败!");
			return null;
		}
	}
	
	/**
	 * 创建图片
	 * @param str 生成图片所需要的字符串
	 * @param path 生成图片的路径
	 * @return 图片保存全路径
	 */
	public static String create(String str,String path) {
		BufferedImage buffer = PictureUtil.createImage(
				str != null ? str.substring(0, 1) : String.valueOf(RandomUtil.Char.getRandomChar()), 
				font, 
				width, 
				height, 
				RandomUtil.ColorFit.randomSomeColor(), 
				fontColors);
		String file = StringUtil.getUUID(true)+".jpg";
		try {
			ImageIO.write(buffer,"JPG", new File(path+"/"+file));
			return path+"/"+file; 
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException图片保存失败!");
			return null;
		}
	}
	
	/**
	 * 创建图片
	 * @param str 生成图片所需要的字符串
	 * @param bg 背景色
	 * @param fontColor 文字颜色
	 * @param path 生成图片的路径
	 * @return 图片保存全路径
	 */
	public static String create(String str,Color bg,Color fontColor,String path) {
		BufferedImage buffer = PictureUtil.createImage(
				str != null ? str.substring(0, 1) : String.valueOf(RandomUtil.Char.getRandomChar()), 
				font, 
				width, 
				height, 
				bg, 
				fontColor);
		String file = StringUtil.getUUID(true)+".jpg";
		try {
			ImageIO.write(buffer,"JPG", new File(path+"/"+file));
			return path+"/"+file; 
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException图片保存失败!");
			return null;
		}
	}
	
	/**
	 * 生成图片
	 * @param str 生成图片的字符串
	 * @param width 生成图片的宽度
	 * @param height 生成图片的高度
	 * @param path 生成图片保存的路径
	 * @return 图片保存全路径
	 */
	public static String create(String str,int width,int height,String path) {
		BufferedImage buffer = PictureUtil.createImage(
				str != null ? str.substring(0, 1) : String.valueOf(RandomUtil.Char.getRandomChar()), 
				font, 
				width, 
				height, 
				RandomUtil.ColorFit.randomSomeColor(), 
				fontColors);
		String file = StringUtil.getUUID(true)+".jpg";
		try {
			ImageIO.write(buffer,"JPG", new File(path+"/"+file));
			return path+"/"+file; 
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException图片保存失败!");
			return null;
		}
	}
	
	/**
	 * 创建图片
	 * @param model 属性模型
	 * @return 图片保存全路径
	 */
	public static String create(PicModel model) {
		BufferedImage buffer = PictureUtil.createImage(
				model.getStr() != null ? model.getStr().substring(0, 1) : String.valueOf(RandomUtil.Char.getRandomChar()), 
				model.getFont(), 
				model.getwidth(), 
				model.getHeight(), 
				model.getBg(), 
				model.getFontColor());
		String file = StringUtil.getUUID(true)+".jpg";
		try {
			ImageIO.write(buffer,"JPG", new File(model.getPath()+"/"+file));
			return model.getPath()+"/"+file; 
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException图片保存失败!");
			return null;
		}
	}
	
	/**
	 * 创建图片
	 * @param model 属性模型
	 * @param format 类型
	 * @return 图片保存全路径
	 */
	public static String create(PicModel model,ForMat format) {
		String matD = "JPG";
		String mat = "jpg";
		switch (format) {
		case JPG:
			matD = "JPG";
			mat = "jpg";
			break;
		case PNG:
			matD = "PNG";
			mat = "png";
			break;
		case BMP:
			matD = "BMP";
			mat = "bmp";
			break;
		case GIF:
			matD = "GIF";
			mat = "gif";
			break;
		default:
			matD = "JPG";
			mat = "jpg";
			break;
		}
		BufferedImage buffer = PictureUtil.createImage(
				model.getStr() != null ? model.getStr().substring(0, 1) : String.valueOf(RandomUtil.Char.getRandomChar()), 
				model.getFont(), 
				model.getwidth(), 
				model.getHeight(), 
				model.getBg(), 
				model.getFontColor());
		String file = StringUtil.getUUID(true)+"."+mat;
		try {
			ImageIO.write(buffer,matD, new File(model.getPath()+"/"+file));
			return model.getPath()+"/"+file; 
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException图片保存失败!");
			return null;
		}
	}
	
	/**
	 * 图片样式
	 * User:贾恒飞
	 * Create in 2018年5月31日 from Eclipse
	 */
	public enum ForMat{
		JPG,
		PNG,
		BMP,
		GIF
	}
	
	/**
	 * 清除设置,恢复默认属性
	 */
	public static void clear() {
		font = new Font("楷体", Font.BOLD, 32);
		width = 80;
		height = 80;
		fontColors = FoxColor.white;
	}

	/**
	 * 设置获取默认属性
	 */
	public static Font getFont() {
		return font;
	}

	public static void setFont(Font font) {
		FoxPic.font = font;
	}

	public static int getWidth() {
		return width;
	}

	public static void setWidth(int width) {
		FoxPic.width = width;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		FoxPic.height = height;
	}

	public static Color getFontColors() {
		return fontColors;
	}

	public static void setFontColors(Color fontColors) {
		FoxPic.fontColors = fontColors;
	}
	
}
