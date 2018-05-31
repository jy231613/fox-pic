package com.fox.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

import javax.imageio.ImageIO;

/**
 * 图片生成工具类,[自由度高]
 * User:贾恒飞
 * Create in 2018年5月21日 from Eclipse
 */
public class PictureUtil {
		 // 默认格式
		 private static final String FORMAT_NAME = "JPG";
		 // 默认 宽度
		 private static final int WIDTH = 80;
		 // 默认 高度
		 private static final int HEIGHT =80;
		       
		  /**
		   * 创建图片
		   * @param content 内容
		   * @param font  字体
		   * @param width 宽
		   * @param height 高
		   * @return
		   */
		 public static BufferedImage createImage(String content,Font font,Integer width,Integer height){  
		        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);   
		        Graphics2D g2 = (Graphics2D)bi.getGraphics();//画布
		        g2.setBackground(Color.BLACK);//设置画布背景
		        g2.clearRect(0, 0, width, height);//设置画布大小
		        g2.setPaint(Color.WHITE);//设置画笔颜色
		        g2.setFont(font);//设置字体属性
		        
		        FontRenderContext context = g2.getFontRenderContext();   
		        Rectangle2D bounds = font.getStringBounds(content, context); 
		        double x = (width - bounds.getWidth()) / 2;   
		        double y = (height - bounds.getHeight()) / 2;   
		        double ascent = -bounds.getY();   
		        double baseY = y + ascent;   
		        
		        g2.drawString(content, (int)x, (int)baseY);   
		        
		        return bi;
		 }
		 
		 /**
		  * 创建图片
		  * @param content 文字
		  * @param font 字体
		  * @param width 宽度
		  * @param height 高度
		  * @param colorbg 背景色
		  * @param colorpaint 文字颜色
		  * @return BufferedImage
		  */
		 public static BufferedImage createImage(String content,Font font,Integer width,Integer height,Color colorbg,Color colorpaint){  
		        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);   
		        Graphics2D g2 = (Graphics2D)bi.getGraphics();//画布
		        g2.setBackground(colorbg);//设置画布背景
		        g2.clearRect(0, 0, width, height);//设置画布大小
		        g2.setPaint(colorpaint);//设置画笔颜色
		        g2.setFont(font);//设置字体属性
		        FontRenderContext context = g2.getFontRenderContext();   
		        Rectangle2D bounds = font.getStringBounds(content, context); 
		        double x = (width - bounds.getWidth()) / 2;   
		        double y = (height - bounds.getHeight()) / 2;   
		        double ascent = -bounds.getY();   
		        double baseY = y + ascent;   
		        g2.drawString(content, (int)x, (int)baseY);   
		        return bi;
		 }
		 
		 /**
		  * 获取 图片 
		  * @param content 内容
		  * @param font  字体
		  * @param width 宽
		  * @param height 高
		  * @return
		  */
		 public static BufferedImage getImage(String content,Font font,Integer width,Integer height){
			width=width==null?WIDTH:width;
			height=height==null?HEIGHT:height;
			if(null==font)
				font = new Font("宋体", Font.BOLD, 22);   
			 return createImage(content, font, width, height);
		 }
		 
		 /**
		  * 获取图片--默认字体属性
		  * @param content 内容
		  * @param width 宽
		  * @param height 高
		  * @return
		  */
		 public static BufferedImage getImage(String content,Integer width,Integer height){
			 return getImage(content, null,width, height);
		 }
		 
		 /**
		  * 获取图片--默认属性
		  * @param content 内容
		  * @return
		  */
		 public static BufferedImage getImage(String content){
			 return getImage(content, null, null);
		 }
		 
		 /**
		  *  获取图片
		  * @param content 内容
		  * @param font 字体
		  * @param width 宽
		  * @param height 高
		  * @param destPath 输出路径
		  * @throws IOException 
		  */
		 public static void getImage(String content,Font font ,Integer width,Integer height,String destPath) throws IOException{
		     mkdirs(destPath);
		     String file = UUID.randomUUID().toString()+".jpg";
			 ImageIO.write(getImage(content,font,width,height),FORMAT_NAME, new File(destPath+"/"+file));  
		 }
		
		 /**
		  * 获取图片
		  * @param content 内容
		  * @param font 字体
		  * @param width 宽
		  * @param height 高
		  * @param output 输出流
		  * @throws IOException
		  */
		 public static void getImage(String content,Font font,Integer width,Integer height, OutputStream output) throws IOException{
			 ImageIO.write(getImage(content,font,width,height), FORMAT_NAME, output);  
		 }
		 
		 /**
		  * 获取图片
		  * @param content 内容
		  * @param width 宽
		  * @param height 高
		  * @param destPath 输出路径
		  * @throws IOException
		  */
		 public static void getImage(String content,Integer width,Integer height,String destPath) throws IOException{
			getImage(content, null, width, height, destPath);
		 }

		 /**
		  * 创建 目录
		  * @param destPath
		  */
		public static void mkdirs(String destPath) {
		      File file =new File(destPath);   
		      //当文件夹不存在时，mkdirs会自动创建多层目录，区别于mkdir．(mkdir如果父目录不存在则会抛出异常)
		      if (!file.exists() && !file.isDirectory()) {
		          file.mkdirs();
		      }
		  }
}
