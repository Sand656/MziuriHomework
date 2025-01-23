package Hw20;

import java.util.Scanner;

public class Davaleba {
    public static void file1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            String s=scanner.nextLine();
            int count=0;
            for(int i=0; i<s.length(); i++){
                if((int)s.charAt(i)>=(int)'0' &&  (int)s.charAt(i)<=(int)'9'){
                    count++;
                }
            }
            System.out.println("count");
        }else if(choice==2){
            String s=scanner.nextLine();
            int count=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='!' || s.charAt(i)=='?') count++;
            }
            System.out.println(count);
        }else if(choice==3){
            String s=scanner.nextLine();
            boolean b=true;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i)!=s.charAt(s.length()-1-i)) b=false;
            }
            if(b) System.out.println("It is a palindrome");
            else System.out.println("It isnt a palindrome");
        }else if(choice==4){
            String s1=scanner.nextLine();
            String s2=scanner.nextLine();
            int b=0;
            for(int i=0; i<s1.length(); i++){
                for(int j=0; j<s1.length()-i; j++){
                    if(s1.substring(j,i).equals(s2)){
                        System.out.println("It is a substring");
                        b=1;
                    }
                }
            }
            if(b==0) System.out.println("It isnt a substring");
        }else if(choice==5){
            String s=scanner.nextLine();
            if(s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='o' || s.charAt(s.length()-1)=='i' || s.charAt(s.length()-1)=='e' || s.charAt(s.length()-1)=='u' ){
                System.out.println("It ends with a vowel");
            }else System.out.println("It doesnt end with a vowel");
        }else if(choice==6){
            String s=scanner.nextLine();
            String initial="";
            for(int i=0; i<s.length()-1; i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    initial=initial+s.charAt(i);
                    i++;
                }else{
                    initial=initial+s.charAt(i);
                }
            }
            System.out.println(initial);
        }else if(choice==7){
            String s=scanner.nextLine();
            String output="";
            output=output+s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1);
            System.out.println(output);
        }
    }
}
