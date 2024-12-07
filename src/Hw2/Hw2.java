package Hw2;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.FileOutputStream;

public class Hw2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s=new Scanner(System.in);
        //N1
        int choice=2;
        if(choice==1) {
            int n = s.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                int k = s.nextInt();
                array[i] = k;
            }

            try {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum = sum + array[i];
                }
                System.out.println("Sum: " + sum);
            } catch (Exception ArrayIndexOutOfBoundsException) {
                System.out.println("Index was out of bounds");
            }
        }else if(choice==2){
            int n=s.nextInt();
            int m=s.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[m];
            for (int i = 0; i < n; i++) {
                int k = s.nextInt();
                arr1[i] = k;
            }
            for (int i = 0; i < m; i++) {
                int k = s.nextInt();
                arr2[i] = k;
            }
            try{
                for(int i=0; i<n; i++){
                    for(int j=0; j<m; j++){
                        int l=arr1[n]/arr2[m];
                    }
                }
            }catch(Exception DivisionByZeroException){
                System.out.println("divided by 0");
            }
        }else if(choice==3){
            int n=s.nextInt();
            int[] arr1=new int[n];
            for (int i = 0; i < n; i++) {
                int k = s.nextInt();
                arr1[i] = k;
            }
            try{
                FileOutputStream fout = new FileOutputStream("File.txt");
                for(int i=0; i<n; i++){
                    fout.write(arr1[i]);
                }
            } catch (IOException e) {

            }


        }else if(choice==4){
            
        }

    }
    class User{
        String name;
        String surname;
        String privateNumber;
        String birthDate;
        String username;
        String password;
        Scanner s=new Scanner(System.in);
        User(){
            try {
                System.out.println("Input your name");
                String name = new String(s.nextLine());
                if (name.length() < 2)
                    throw new MyException("Name should include more than 2 characters");
                this.name=name;
                System.out.println("Input your surname");
                String surname=new String(s.nextLine());
                if( surname.length()<3){
                    throw new MyException("Surname should include 3 or more characters");
                }
                System.out.println("Input your private number");
                String privateNumber=new String(s.nextLine());
                if(privateNumber.length()!=11){
                    throw new MyException("private number has to be 11 digits long");
                }else{
                    for(int i=0; i<11; i++){
                        if(!Character.isDigit(privateNumber.charAt(i))) throw new MyException("Private number can only contain numbers");
                    }
                }
                this.privateNumber=privateNumber;
                System.out.println("Input your birth date dd/mm/yyyy");
                String birthDate=new String(s.nextLine());
                if(birthDate.length()!=10 || birthDate.charAt(2)!='/' || birthDate.charAt(4)!='/'){
                    throw new MyException("Wrong birthday syntax");
                }else{
                    if(Integer.valueOf(birthDate.substring(0,2))>31 || Integer.valueOf(birthDate.substring(0,2))<=0){
                        throw new MyException("Day cant be > 31");
                    }else if(Integer.valueOf(birthDate.substring(3,5))>12 || Integer.valueOf(birthDate.substring(3,5))<=0){
                        throw new MyException(("Month cant be >12"));
                    }else if(Integer.valueOf(birthDate.substring(6,10))>2024 || Integer.valueOf(birthDate.substring(6,8))<=1900){
                        throw new MyException("Birth year has to be between 1900 and 2024");
                    }
                    this.birthDate=birthDate;
                }
                System.out.println("Input your username");
                String username =new String(s.nextLine());
                if(username.length()<4) throw new MyException("Username include 4 or more letters");
                this.username= this.username;
                System.out.println("And finally your password:");
                String password=new String(s.nextLine());
                if(password.length()<8 || password.length()>15) throw new MyException("password can contain 8-15 letters");
            }catch(MyException  e){
                System.out.println("");
            }
        }
    }
}
class MyException extends Exception{
    MyException(String a){
        super(a);
    }
}
