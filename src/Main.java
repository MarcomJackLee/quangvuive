import model.bai3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ dãy số");
        String a = input.nextLine();
        bai3 tinhtoan = new bai3();
        tinhtoan.dayso(a);

    }
}