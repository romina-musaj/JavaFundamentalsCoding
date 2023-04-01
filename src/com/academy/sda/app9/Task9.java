package com.academy.sda.app9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos gjeresine e vales: ");
        int gjeresia = scanner.nextInt();
        System.out.println("Vendos lartesine e vales: ");
        int lartesia = scanner.nextInt();
        for(int i = 1; i <= lartesia; i++){
            System.out.println(ndertoRreshtin(i, gjeresia, lartesia));
        }
    }

    public static  String ndertoRreshtin(int nrRreshti, int gjeresia, int lartesia){
        String rreshti = "";
        int count = nrRreshti;
        boolean flag = true;
        for(int j = 1; j <= gjeresia; j ++){

            if(j == count){
                rreshti += "*";

                if(flag){
                    count += 2*lartesia - 1 - 2*(nrRreshti - 1);
                }
                else {
                    count += 2 * nrRreshti - 1;
                }
                flag = !flag;
            }
            else {
                rreshti += " ";
            }

        }
        return rreshti;
    }
}
