package a.b.c;

public class NotRepChar{
    public static void main(String[] args) {
        String input = "stress";
        find(input);
    }

    public static void find(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.print(c + " ");
            }
        }
    }
}

