package Hw2;
import java.io.*;
import  java.util.*;


public class file1 {
    public static void file1(String[] args) {
        try{
            Scanner s=new Scanner(System.in);
            FileWriter fileWriter=new FileWriter("C:\\Users\\atana\\OneDrive\\Desktop\\Saklaso\\a.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String temp =s.nextLine();
            while(temp !="-1") {
                bufferedWriter.write(temp);
                temp =s.nextLine();
            }
            FileReader fileReader=new FileReader("C:\\Users\\atana\\OneDrive\\Desktop\\Saklaso\\a.txt");
            
        }catch (IOException ioe){
            System.out.println("b");
        }
    }


   // BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)






}
