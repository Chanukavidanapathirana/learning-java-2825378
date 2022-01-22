import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        
        
        while(isOneRepeat){
        System.out.println("Playing same song again");
        System.out.println("Would you like to take this song off of repeat?If so, answer yes");
        String userInput=input.next();
            if(userInput.equal("yes")){
                isOneRepeat=false;
            }
        }
        System.out.println("playing next song")
    }
}
