package org.example.beginner.day5;

/**
 * 옷가게 할인 받기
 */
public class Ex1 {
    public static int solution1(int price) {
        if(price >= 100_000 && price < 300_000)
            price = (int) (price * 0.95);
        else if(price >= 300_000 && price < 500_000)
            price = (int) (price * 0.90);
        else if(price >= 500_000)
            price = (int) (price * 0.80);

        return price;
    }

    public static void main(String[] args) {
        System.out.println(solution1(150_000));
    }
}
