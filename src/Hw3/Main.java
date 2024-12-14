package Hw3;
import java.io.*;
import  java.util.*;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int choice=0;
        H3 h3=new H3();
        H3.N2();
        H3.N2();
    }
}
class H3{
    static void N1(){
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\atana\\OneDrive\\Desktop\\abc.txt");
            int byteContent;
            for (int i = 0; i < 10; i++) {
                byteContent = fileInputStream.read();
                System.out.print((char)byteContent+",");
            }
        }catch(IOException a){
            System.out.print("a");
        }
    }
    static void N2(){
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\atana\\OneDrive\\Desktop\\abc.txt");
            FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\atana\\OneDrive\\Desktop\\abcd.txt");
            int byteContent;
            int[] arr =new int[10];
            for (int i = 0; i < 10; i++) {
                byteContent = fileInputStream.read();
                arr[i]=(int)((char)byteContent);
            }
            int sum=0;
            for(int i=0; i<10; i++){
                sum=sum+arr[i];
            }
            fileOutputStream.write(sum);
            fileOutputStream.close();
            fileInputStream.close();
        }catch(IOException a){
            System.out.print("a");
        }
    }

    static void N3(){
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\atana\\OneDrive\\Desktop\\abc.txt");
            FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\atana\\OneDrive\\Desktop\\abcd.txt");
            int byteContent;
            char[] arr =new char[10];
            for (int i = 0; i < 10; i++) {
                byteContent = fileInputStream.read();
                arr[i]=((char)byteContent);
            }
            for(int i=0; i<10; i++){
                fileOutputStream.write(arr[i]);
            }
            fileOutputStream.close();
            fileInputStream.close();
        }catch(IOException a){
            System.out.print("a");
        }
    }
    static void N4(){
        try {
            int[] arr={1,4,3,5,7,7};
            FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\atana\\OneDrive\\Desktop\\abcd.txt");
            fileOutputStream.write(arr.length);
            for(int i=0; i<arr.length; i++){
                fileOutputStream.write(arr[i]);
            }
            fileOutputStream.close();
        }catch(IOException a){
            System.out.print("a");
        }
    }
    static void N5(){
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\atana\\OneDrive\\Desktop\\abc.txt");
            int byteContent;
            int n=10;
            int[] arr =new int[n];
            for (int i = 0; i < n; i++) {
                byteContent = fileInputStream.read();
                arr[i]=((int)(char)byteContent);
            }
            int positive=0;
            int negative=0;
            int zero=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>0) positive++;
                else if(arr[i]<0) negative++;
                else zero++;
            }
            fileInputStream.close();
        }catch(IOException a){
            System.out.print("a");
        }
    }
    static void N6(){
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\atana\\OneDrive\\Desktop\\abc.txt");
            int byteContent;
            int n=10;
            int[] arr =new int[n];
            for (int i = 0; i < n; i++) {
                byteContent = fileInputStream.read();
                arr[i]=((int)(char)byteContent);
            }
            int positive=0;
            int negative=0;
            int zero=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>0) positive++;
                else if(arr[i]<0) negative++;
                else zero++;
            }
            fileInputStream.close();
            File file=new File("C:\\Users\\atana\\OneDrive\\Desktop\\abc.txt");
            System.out.println("exists:" +file.exists());
            System.out.println("path:" +file.getAbsoluteFile());
            System.out.println("isFile:" +file.isFile());
            System.out.println("length:" +file.length());
        }catch(IOException a){
            System.out.print("a");
        }
    }
}
