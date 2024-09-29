package Assignment_2;
import java.util.Scanner;

class Program6 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");//It splits the sentence into words using the split(" ") method, which divides the string at each space.
        System.out.println("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
/*
Enter a sentence: Hello World
Reversed sentence: 
World Hello 
*/
