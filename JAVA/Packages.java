/*A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)*/

import java.util.Scanner;

public class Packages {

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter name");

        String Username = myobj.nextLine();
        System.out.println("Username is " + Username);
    }
    
}

//To import a whole package, end the sentence with an asterisk sign (*). - ex - import java.util.*;