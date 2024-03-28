import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    scan.nextLine();
    String str[] = new String [num];
    for(int i=0; i<num; i++){
        str[i] = scan.nextLine();
    }

    for(int i = 0; i < num; i++) {
        if (str[i].length() > 1) {
            String answer = "" + str[i].charAt(0) + str[i].charAt(str[i].length() - 1);
            System.out.println(answer);
        }
        else{
            String answer = ""+ str[i] + str[i];
            System.out.println(answer);
        }
    }
    }
}