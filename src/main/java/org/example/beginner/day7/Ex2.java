package org.example.beginner.day7;

/**
 * 각도기
 */
public class Ex2 {
    public static int solution1(int angle) {
        if(angle > 0 && angle < 90)
            return 1;
        else if(angle == 90)
            return 2;
        else if(angle > 90 && angle < 180)
            return 3;
        else
            return 4;
    }

    public static int solution2(int angle) {    // simple version
        if(angle < 90)
            return 1;
        else if(angle == 90)
            return 2;
        else if(angle < 180)
            return 3;
        else
            return 4;
    }

    public static void main(String[] args) {
        System.out.println(solution1(91));
    }
}
