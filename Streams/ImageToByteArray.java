package filehandling;

import java.io.*;
import java.util.Arrays;

public class ImageToByteArray {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.jpg");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            fis.close();

            byte[] imageBytes = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream("output.jpg");

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            fos.close();
            System.out.println("Image converted to byte array and written back successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
