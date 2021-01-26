package com.songjing.oasys.util;

import java.io.*;

/**
 * @author songjing
 * @version 1.0
 * @date 2021/1/26 14:47
 */
public class ImageUtil {

    public static String imgToByte(File image)  {
        Reader reader;
        String imageStr=null;
        try {
            reader=new FileReader(image);
            char[] flush=new char[1024];
            int len=-1;
            while ((reader.read(flush))!=-1){
                imageStr=new String(flush,0,len);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageStr;
    }


    public static File byteToImg(String imgByte){
        File image = null;
        Writer writer;
        try {
            writer=new FileWriter(image);
            char[] chars = imgByte.toCharArray();
            writer.write(chars,0, chars.length);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
