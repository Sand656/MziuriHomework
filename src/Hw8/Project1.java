package Hw8;
import java.util.Random;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args){

    }
}
class guessingGame{
    int randomNumber;
    Random rand=new Random();
    boolean menu(){
        System.out.println("Welcome to the guessing game");
        System.out.println("You can choose 3 difficulties by typing a number from 1-3");
        System.out.println("Easy - guess a number between 1 and 10");
        System.out.println("Medium - guess a number between 1 and 50");
        System.out.println("Hard- guess a number between 1 and 100");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
               randomNumber=rand.nextInt(10);
                break;
            case 2:
                randomNumber=rand.nextInt(50);
                break;
            case 3:
                randomNumber=rand.nextInt(100);
                break;
            default:
                System.out.println("Wrong choice");
                return false;

        }
        Utility u=new Utility(randomNumber);
        boolean k=false;
        System.out.println("How many tries do you think it will take?");
        int guesses=scanner.nextInt();
        for(int i=0; i<guesses; i++){
            int guess=scanner.nextInt();
            if(!u.higherOrLower(guess).equals("Correct!")){
                System.out.println(u.higherOrLower(guess));
            }else{
                System.out.println(u.higherOrLower(guess));
                k=true;
                break;

            }
        }
        if(!k){
            System.out.println("Youre out of attempts, would you like to try again? Y/N");
        }else{
            System.out.println("Would you like to play again?");
        }
        String choice2=scanner.nextLine();
        switch(choice2){
            case "Y":
                return false;
            case "N":
                return true;
            default:
                return false;
        }


    }
}
class Utility{
    int random;
    Utility(int r){
        this.random =r;
    }
    String higherOrLower(int b){
        if(b > random) return "Lower";
        if(b < random) return "Higher";
        if(b == random) return "Correct!";
        return "somehow its not equal higher or lower";
    }

}
