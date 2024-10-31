
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VAN DU
 */
public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot ky tu: ");

        if (scanner.hasNext()) {
            System.out.println("Ky tu nhap vao la chuoi.");
        } else {
            System.out.println("Ky tu nhap vao khong phai la chuoi.");
        }

        scanner.close();
    }

    
}
