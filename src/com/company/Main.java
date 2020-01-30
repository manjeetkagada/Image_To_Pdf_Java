package com.company;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.OutputStreamCounter;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.net.MalformedURLException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws NullPointerException, FileNotFoundException, DocumentException, MalformedURLException, IOException {
        //Scanner in=new Scanner(System.in);
        String[] arr = {"D:\\java project\\Project\\Desktop\\sample1.jpg", "D:\\java project\\Project\\Desktop\\sample2.jpg", "D:\\java project\\Project\\Desktop\\sample3.jpg", "D:\\java project\\Project\\Desktop\\sample4.jpg", "D:\\java project\\Project\\Desktop\\sample5.jpg", "D:\\java project\\Project\\Desktop\\sample6.jpg", "D:\\java project\\Project\\Desktop\\sample7.jpg", "D:\\java project\\Project\\Desktop\\sample8.jpg", "D:\\java project\\Project\\Desktop\\sample9.jpg", "D:\\java project\\Project\\Desktop\\sample10.jpg"};
        Image img = Image.getInstance(arr[0]);
        Document document = new Document(img);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("demo.pdf"));
        writer.open();
        document.open();
        for (String image : arr) {
            img = Image.getInstance(image);


            document.setPageSize(img);
            document.newPage();
            img.setAbsolutePosition(0, 0);
            document.add(img);
        }
        writer.close();
        document.close();


    }

}


