public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            summ = summ + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");
    }
    public static void task2 (){
        System.out.println(  " Задача 2");
        int[] arr = generateRandomArray();
        int max = 200_000;
        int min = 100_000;
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (arr[i] > max);
        }
        System.out.println("Максимальная сумма трат за день составила " + generateRandomArray() + " рублей");
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (arr[i]<min);
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }

    public static void task3 () {
        System.out.println(  " Задача 3");
        int [] arr = generateRandomArray();
        double all = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            all = all + arr[i];
        }
        double avarage = (all/ generateRandomArray().length);
        System.out.println(" средняя сумма трат за месяц " + avarage + " рублей " );

    }
    public static void task4 () {
        System.out.println( " Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i < reverseFullName.length && i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}