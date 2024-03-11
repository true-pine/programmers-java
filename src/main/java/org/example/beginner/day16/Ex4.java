package org.example.beginner.day16;

/**
 * 배열의 유사도
 */
public class Ex4 {
    public static int solution1(String[] s1, String[] s2) {
        int count = 0;

        for(String str1 : s1) {
            for(String str2 : s2) {
                if(str1.equals(str2))
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new String[]{"a","b","c"}, new String[]{"com", "b", "d", "p", "c"}));
    }
}
