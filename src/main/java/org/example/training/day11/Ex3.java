package org.example.training.day11;

/**
 * 글자 지우기
 */
public class Ex3 {
    public static String solution1(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            boolean same = false;
            for (int index : indices) {
                if(i == index) {
                    same = true;
                    break;
                }
            }

            if(!same) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String solution2(String my_string, int[] indices) {   // StringBuilder를 이용한 풀이
        StringBuilder sb = new StringBuilder(my_string);
        for (int index : indices) {
            sb.setCharAt(index, ' ');
        }
        return sb.toString().replaceAll(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(solution2("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
}
