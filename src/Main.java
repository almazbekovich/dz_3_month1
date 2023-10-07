public class Main {
    public static void main(String[] args) {
        double[] numbers = {8, -2, -4, 2, 3, 6, -7, 1.5, 2.5, -3.5, 4.5, 5.5, -6.5, 7.5, 8.5};
        double plusSum = 0;
        boolean minusNum = false;
        int plusCount = 0;
        for (double num : numbers) {
            if (minusNum) {
                if (num > 0) {
                    plusSum = plusSum + num;
                    plusCount++;
                }
            } else if (num < 0) {
                minusNum = true;
            }
        }
        if (plusCount == 0) {
            System.out.println("Нет положительных чисел после первого отрицательного.");
        } else {
            double average = plusSum / plusCount;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        }
    }
}
