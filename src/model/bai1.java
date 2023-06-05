package model;

import java.lang.*;
import java.io.*;
import java.util.*;

public class bai1 {
    int a;
    int b;

    public void sosanh(int a, int b) {
        if (a == b) {
            System.out.println("Đây là hình Vuông");
        } else if (a != b) {
            System.out.println("Đây không phải hình vuông");
        }
    }

    public void giatrilonnhat(int a, int b) {
        if (a > b) {
            System.out.println("a là số lớn nhất: " + a);
        } else if (a < b) {
            System.out.println("b là số lớn nhất: " + b);
        } else if (a == b) {
            System.out.println("hai số bằng nhau");
        }
    }

    public String discount(int a) {
        if (a >= 1000) {
            double total = a * 100 * 0.9;
            System.out.println("Tổng tiền của bạn là sau khi được giảm 10% : " + total);
        } else {
            double total = a * 100;
            System.out.println("Tổng tiền của bạn là : " + total);
        }
        return "";
    }

    public String bonus(int salary, int year) {
        if (year > 5) {
            double bonus = salary + (salary * 5 / 100);
            System.out.println("Chúc mừng bạn đã được nhận lương bao gồm 5% thưởng: " + bonus);
        } else if (year < 5) {
            double bonus = salary;
            System.out.println("Bạn chưa đủ 5 năm cống hiến, cố lên nhé : " + bonus);
        }
        return "";
    }

    public String xeploai(int diem) {
        if (diem > 80) {
            System.out.println("Bạn xếp hạng A");
        } else if (diem < 25) {
            System.out.println("Bạn xếp hạng F");
        } else if (diem > 25 & diem <= 45) {
            System.out.println("Bạn xếp hạng E");
        } else if (diem > 45 & diem <= 50) {
            System.out.println("Bạn xếp hạng D");
        } else if (diem > 50 & diem <= 60) {
            System.out.println("Bạn xếp hạng C");
        } else if (diem > 60 & diem <= 80) {
            System.out.println("Bạn xếp hạng B");
        }
        return "";
    }

    public String oldest(int people1, int people2, int people3) {
        if (people1 > people2 & people1 > people3) {
            if (people2 > people3) {
                System.out.println("Người lớn tuổi nhất là: " + people1 + "Người nhỏ tuổi nhất là :" + people3);
            } else if (people3 > people2) {
                System.out.println("Người lớn tuổi nhất là: " + people1 + "Người nhỏ tuổi nhất là :" + people2);
            } else {
                System.out.println("Người lớn tuổi nhất là: " + people1 + " 2 Người nhỏ tuổi nhất là :" + people3);
            }
        } else if (people2 > people1 & people2 > people3) {
            if (people1 > people3) {
                System.out.println("Người lớn tuổi nhất là: " + people2 + "Người nhỏ tuổi nhất là :" + people3);
            } else if (people3 > people1) {
                System.out.println("Người lớn tuổi nhất là: " + people2 + "Người nhỏ tuổi nhất là :" + people1);
            } else {
                System.out.println("Người lớn tuổi nhất là: " + people2 + " 2 Người nhỏ tuổi nhất là :" + people3);
            }
        } else if (people3 > people1 & people3 > people2) {
            if (people2 > people1) {
                System.out.println("Người lớn tuổi nhất là: " + people3 + "Người nhỏ tuổi nhất là :" + people1);
            } else if (people1 > people2) {
                System.out.println("Người lớn tuổi nhất là: " + people3 + "Người nhỏ tuổi nhất là :" + people2);
            } else {
                System.out.println("Người lớn tuổi nhất là: " + people3 + " 2 Người nhỏ tuổi nhất là :" + people2);
            }
        } else if (people1 == people2 & people1 > people3) {
            System.out.println("Người lớn tuổi nhất là :" + people1 + " Người nhỏ tưởi nhất là: " + people3);
        } else if (people2 == people3 & people2 > people1) {
            System.out.println("Người lớn tuổi nhất là :" + people2 + " Người nhỏ tuổi nhất là " + people1);
        } else if (people1 == people3 & people1 > people2) {
            System.out.println("Người lớn tuổi nhất là :" + people1 + " Người nhỏ tuổi nhất là " + people2);
        }
        return null;
    }

    public void chuyenso(int a) {
        if (a < 0) {
            a = -a;
            System.out.println("Giá trí của a là :" + a);
        } else {
            System.out.println("Giá trí của a là :" + a);
        }
    }

    public void Cyear(int year) {
        if (year == 2000 || year == 1900 || year == 2100) {
            if (year % 400 != 0) {
                System.out.println(" Không phải năm nhuận " + year);
            } else {
                System.out.println("Đây là năm nhuận " + year);
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("Đây là năm nhuận" + year);
            } else {
                System.out.println("Đây không phải là năm nhuận " + year);
            }
        }

    }

    public String chuyendoidayso(int chuoi) {
        switch (chuoi) {
            case 1:
                System.out.println("bạn đã chọn số 1");

                break;
            case 2:
                System.out.println("bạn chọn số 2");
            default:
                System.out.println("bạn chưa chọn gì cả");
        }
        return null;
    }
}

