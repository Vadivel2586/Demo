package com.mytask;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ImagesToPdf {
    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("D:\\Document\\Land_House\\landdocument\\output.pdf"));
            document.open();

            // List of image file paths
            List<String> imagePaths = List.of(
                    "D:\\Document\\Land_House\\landdocument\\1.jpg",
                    "D:\\Document\\Land_House\\landdocument\\2.jpg",
                    "D:\\Document\\Land_House\\landdocument\\3.jpg",
                    "D:\\Document\\Land_House\\landdocument\\4.jpg",
                    "D:\\Document\\Land_House\\landdocument\\5.jpg",
                    "D:\\Document\\Land_House\\landdocument\\6.jpg",
                    "D:\\Document\\Land_House\\landdocument\\7.jpg",
                    "D:\\Document\\Land_House\\landdocument\\8.jpg",
                    "D:\\Document\\Land_House\\landdocument\\9.jpg",
                    "D:\\Document\\Land_House\\landdocument\\10.jpg",
                    "D:\\Document\\Land_House\\landdocument\\11.jpg",
                    "D:\\Document\\Land_House\\landdocument\\12.jpg",
                    "D:\\Document\\Land_House\\landdocument\\13.jpg",
                    "D:\\Document\\Land_House\\landdocument\\14.jpg",
                    "D:\\Document\\Land_House\\landdocument\\15.jpg",
                    "D:\\Document\\Land_House\\landdocument\\16.jpg",
                    "D:\\Document\\Land_House\\landdocument\\17.jpg",
                    "D:\\Document\\Land_House\\landdocument\\18.jpg",
                    "D:\\Document\\Land_House\\landdocument\\19.jpg");

            for (String imagePath : imagePaths) {
                Image img = Image.getInstance(Files.readAllBytes(Paths.get(imagePath)));
                // Reduce image quality by compressing it
                img.setCompressionLevel(9); // 0 to 9, where 9 is the highest compression
                img.scaleToFit(document.getPageSize().getWidth(), document.getPageSize().getHeight());
                document.add(img);
            }

            document.close();
            System.out.println("PDF created successfully!");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

