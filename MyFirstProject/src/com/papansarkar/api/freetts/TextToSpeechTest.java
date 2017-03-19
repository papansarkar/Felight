package com.papansarkar.api.freetts;

import java.io.*;
import java.util.Scanner;

/**
 * Created by PAPAN on 3/3/2017.
 */
public class TextToSpeechTest {
    public static String str() throws FileNotFoundException {
        String content = new Scanner(new File("D:\\others\\speech.txt")).useDelimiter("\\Z").next();
        return content;
    }
    public static void main(String[]args)
    {
        TextToSpeech obj = new TextToSpeech();
        try {
            obj.doSpeak(str(),"kevin16");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            obj.doSpeak("Please re-check the file needs to be read","kevin16");
        }
    }
}
