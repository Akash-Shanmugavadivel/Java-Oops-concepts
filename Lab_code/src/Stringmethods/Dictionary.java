package Stringmethods;
import java.util.Scanner;

public class Dictionary {

    static String[][] dictionary = {
            {"Java", "Pure object-oriented programming language by James Gosling"},
            {"C++", "Object-oriented programming language by Bjarne Stroustrup"},
            {"Python", "High-level programming language with dynamic semantics"},
            {"JavaScript", "Scripting language for web development"},
            {"Ruby", "Dynamic, open source programming language with a focus on simplicity"},
            {"C", "General-purpose programming language developed by Dennis Ritchie"},
            {"Swift", "Programming language developed by Apple for iOS and macOS applications"},
            {"Kotlin", "Statically typed programming language for modern multi-platform applications"},
            {"Go", "Programming language designed for system programming by Google"},
            {"Rust", "Systems programming language focused on safety, speed, and concurrency"}
    };

    public static void main(String[] args) {
        System.out.println(2022503041);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the programming language name:");
        String input = sc.nextLine();

        String definition = getDefinition(input);

        if (definition != null) {
            System.out.println("Definition: " + definition);
        } else {
            System.out.println("Programming language not found in the dictionary.");
        }
    }


    public static String getDefinition(String plName) {
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i][0].equalsIgnoreCase(plName)) {
                return dictionary[i][1];
            }
        }
        return null;
    }
}
