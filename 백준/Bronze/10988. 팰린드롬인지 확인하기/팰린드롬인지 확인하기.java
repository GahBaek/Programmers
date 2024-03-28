import java.util.*;

public class Main {
    public static void main(String[] args) {
    Stack<Character> stack = new Stack<>();
    boolean palindrome = true;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    for(char i : str.toCharArray()){
        stack.push(i);
    }
    for(char i : str.toCharArray()){
        if(i != stack.pop()){
            palindrome = false;
        }
    }
    if(palindrome)
        System.out.println("1");
    else
        System.out.println("0");
    }
}