public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int age = 19;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + ", то поздравляю он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то увы и ах, нужно подождать Вы не совершеннолетний");
        }
    }

    public static void task2() {
        int tempWeather = 0;
        if (tempWeather < 5) {
            System.out.println("The outside " + tempWeather + " degrees "
                    + "Take a cap");
        } else {
            System.out.println("The outside " + tempWeather +
                    " degrees " + " You can go without cap");
        }
    }

    public static void task3() {
        int speedCar = 70;
        if (speedCar > 60) {
            System.out.println("Если скорость " + speedCar + " км/ч "
                    + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedCar + " км/ч "
                    + " то  можно ездить спокойно");
        }
    }
}