import java.util.Scanner;

public class VowelOrConsonentCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to check that character is vowel or consonant --> ");
        char c = scanner.next().charAt(0);
        switch (c)
        {
            case 'a' :
                System.out.println("Entered character is vowel --> "+c);
                break;
            case 'A':
                System.out.println("Entered character is vowel --> "+c);
                break;
            case 'e' :
                System.out.println("Entered character is vowel --> "+c);
                break;
            case 'E':
                System.out.println("Entered character is vowel --> "+c);
                break;
            case 'i' :
                System.out.println("Entered character is vowel --> "+c);
                break;
            case 'I':
                System.out.println("Entered character is vowel --> "+c);
                break;
            case 'O' :
                System.out.println("Entered character is vowel --> "+c);
                break;
            case 'o':
                System.out.println("Entered character is vowel --> "+c);
                break;
            case 'u' :
                System.out.println("Entered character is vowel --> "+c);
                break;
            case 'U':
                System.out.println("Entered character is vowel --> "+c);
                break;
            default:
                System.out.println("Entered character is consonant --> "+c);



        }
    }
}
