package com.papansarkar.api.poi;

/**
 * Created by PAPAN on 3/3/2017.
 */
import java.io.*;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class ReadDocFile
{
    public static void main(String[] args)
    {
        File file = null;
        WordExtractor extractor = null;
        try
        {

            file = new File("d:\\sample.doc");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String[] fileData = extractor.getParagraphText();
            for (int i = 0; i < fileData.length; i++)
            {
                if (fileData[i] != null)
                    System.out.println(fileData[i]);
            }
        }
        catch (Exception exep)
        {
            exep.printStackTrace();
        }
    }
}


