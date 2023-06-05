package model;

public class bai3 {
    public void DtCv(int a,int b){
        int dt = a * b;
        int cv = (a+b)*2;
        System.out.println("Diện tích là : " + dt + " Chu vi là: "+ cv);
    }
    public void Cvtamgiac(int a,int b,int c){
        int p = a + b + c;
        System.out.println("Chu vi Tam Giác Là");
    }
    public void dayso (String a){
            String st1 = String.valueOf(a.charAt(0));
            String st2 = String.valueOf(a.charAt(a.length()-2));
            int total = Integer.parseInt(st1)+Integer.parseInt(st2);
            System.out.println("so thu 1: " + Integer.parseInt(st1) + "so ke cuoi: " + Integer.parseInt(st2) + "" +
                    " Tong la: " + total );
        }
}
