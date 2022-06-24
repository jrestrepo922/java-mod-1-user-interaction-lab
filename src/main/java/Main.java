import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        System.out.println("Please enter you age");
        try( Scanner scanner = new Scanner(System.in)){
            int input = scanner.nextInt();
            if(input < 18){
                if(input < 10){
                   System.out.println("Hello kid"); 
                } else {
                    System.out.println("Hello teenager");
                }
            } else if(input == 18){
                System.out.println("Hello new adult");
            } else if(input > 18){
                System.out.println("Hello aged fellow");
            }
        } catch(Exception e){
            System.out.println("Something when wrong");
        }
       
    }
}
