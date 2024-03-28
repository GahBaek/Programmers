import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int total = sc.nextInt();
    sc.nextLine();
    int typeN = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i< typeN; i++){
        int price = sc.nextInt();
        int num = sc.nextInt();
        sum += price * num;
    }
    if(total == sum)
        System.out.println("Yes");
    else
        System.out.println("No");
    }
}