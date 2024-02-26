package org.example.beginner.day8;

/**
 * 외계행성의 나이
 */
public class Ex2 {
    public static String solution1(int age) {
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};

        StringBuilder sb = new StringBuilder();

        String ageStr = String.valueOf(age);
        for(char c : ageStr.toCharArray()) {
            sb.append(arr[Integer.parseInt("" + c)]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1(23));
    }
}
