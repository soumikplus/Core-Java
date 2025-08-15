package java_fundamentals;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MultiLineInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        System.out.println("Enter Text : ");

        String line;
        while(true){
            line = sc.nextLine();
            if(line.isEmpty() || line.equalsIgnoreCase("exit")){
                break;
            }
            lines.add(line);
        }
        System.out.println("\nYour Input :");
        for(String text : lines){
            System.out.println(text);
        }


    }
}
