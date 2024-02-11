package org.example.training.day17;

/**
 * 문자열이 몇 번 등장하는지 세기
 */
public class Ex2 {
    public static int solution1(String myString, String pat) {
        int answer = 0;

        if(myString.contains(pat)) {
            for(int i = 0; i < myString.length(); i++) {
                answer += myString.indexOf(pat, i) == i ? 1 : 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1("banana", "ana"));
    }
}
