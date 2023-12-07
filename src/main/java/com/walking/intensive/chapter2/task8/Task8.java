package com.walking.intensive.chapter2.task8;

import java.util.Scanner;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.print("Вероятность найти счастливый билетик:" + getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        double quantity = 0;
        for (int i = 0; i <= 27; ++i) {
            quantity += Math.pow(getQuantityHappyTicket(i), 2);
        }
        return quantity / 1000000 ;
    }

    static int getQuantityHappyTicket(int validation) {
        int check = 0, sum = 0;
        for (int i = 0; i <= 999; ++i) {
            sum = i / 100 + (i / 10 % 10) + i % 10;
            if (sum == validation) {
                ++check;
            }
        }
        return check;
    }
}