package org.example.training.day6;

/**
 * 수 조작하기 1
 */
public class Ex2 {
    public static int solution1(int n, String control) {
        for(char c : control.toCharArray()) {
            switch(c) {
                case 'w': n += 1; break;
                case 's': n -= 1; break;
                case 'd': n += 10; break;
                case 'a': n -= 10; break;
                default: break;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(solution1(0, "wsdawsdassw"));
    }
}
