package org.example.training.day4;

/**
 * 조건 문자열
 */
public class Ex4 {
    public static int solution(String ineq, String eq, int n, int m) {
        switch(ineq + eq) {
            case ">=":
                return n >= m ? 1 : 0;
            case "<=":
                return n <= m ? 1 : 0;
            case ">!":
                return n > m ? 1 : 0;
            case "<!":
                return n < m ? 1 : 0;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
    }
}
