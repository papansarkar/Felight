package com.papansarkar.assignment;

/**
 * Created by PAPAN on 3/3/2017.
 */
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;

public class ColorImageToGrayScale {

    BufferedImage  image;
    int width;
    int height;

    public  ColorImageToGrayScale() {

        try {
            File input = new File("D:\\back.png");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            for(int i=0; i<height; i++){

                for(int j=0; j<width; j++){

                    Color c = new Color(image.getRGB(j, i));
                    int red = (int)(c.getRed() * 0.299);
                    int green = (int)(c.getGreen() * 0.587);
                    int blue = (int)(c.getBlue() *0.114);
                    Color newColor = new Color(red+green+blue,

                            red+green+blue,red+green+blue);

                    image.setRGB(j,i,newColor.getRGB());
                }
            }

            File ouptut = new File("D:\\grayscale.png");
            ImageIO.write(image, "png", ouptut);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static public void main(String args[]) throws Exception
    {
       new ColorImageToGrayScale();
    }
}