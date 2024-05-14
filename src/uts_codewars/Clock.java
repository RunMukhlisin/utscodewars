/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_codewars;

/**
 *
 * @author user
 */
public class Clock {

    public static int Past(int h, int m, int s) {
        int hoursInMilliseconds = h * 60 * 60 * 1000;
        int minutesInMilliseconds = m * 60 * 1000;
        int secondsInMilliseconds = s * 1000;

        int totalMilliseconds = hoursInMilliseconds
                + minutesInMilliseconds + secondsInMilliseconds;

        return totalMilliseconds;
    }

    public static void main(String[] args) {
        int h = 0;
        int m = 1;
        int s = 1;

        int milliseconds = Past(h, m, s);
        System.out.println("Result: " + milliseconds);
    }
}
