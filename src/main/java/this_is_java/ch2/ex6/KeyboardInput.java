package this_is_java.ch2.ex6;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
