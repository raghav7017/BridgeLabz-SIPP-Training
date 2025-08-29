package filehandling;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("John");
            dos.writeDouble(8.5);
            dos.writeInt(102);
            dos.writeUTF("Emma");
            dos.writeDouble(9.0);
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"))) {
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
