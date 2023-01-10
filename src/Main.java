public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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

    public static void task4() {
        int age = 19;
        boolean youShotGtKindergarten = age > 2 && age < 6;
        if (youShotGtKindergarten) {
            System.out.println("Если возраст человека равен " + age
                    + " то ему нужно ходить в детский сад ");
        }
        boolean youShotGtSchool = age > 7 && age < 18;
        if (youShotGtSchool) {
            System.out.println("Если возраст человека равен " + age
                    + " то ему нужно ходить в школу ");
        }
        boolean youShotGtUniversity = age > 18 && age < 24;
        if (youShotGtUniversity) {
            System.out.println("Если возраст человека равен " + age
                    + " то ему нужно ходить в университет ");
        }
        boolean youShotGtWork = age > 24;
        if (youShotGtWork) {
            System.out.println("Если возраст человека равен " + age
                    + " то ему нужно ходить на работу ");
        }
    }

    public static void task5() {
        int age = 7;
        boolean youCantGoToAttraction = age < 5;
        if (youCantGoToAttraction) {
            System.out.println("Если возраст человека равен " + age
                    + " то ему нельзя кататься на атракционе ");
        }
        boolean youCanGoToAttractionWithOldMan = age > 5 && age < 14;
        if (youCanGoToAttractionWithOldMan) {
            System.out.println("Если возраст человека равен " + age
                    + " можно кататься на аттракционе в сопровождении ");
        }
        boolean youCanGoToAttraction = age > 14;
        if (youCanGoToAttraction) {
            System.out.println("Если возраст человека равен " + age
                    + " можно кататься на аттракционе без сопровождения взрослого ");
        }
    }

    public static void task6() {
        int totalCapacity = 102;
        int totalSeatCapacity = 60;
        int totalStandCapacity = totalCapacity - totalSeatCapacity;
        int usedCapacity = 61;
        int usedStandCapacity = 63;
        boolean SeatCapacity = totalSeatCapacity - usedCapacity <= 60
                && totalSeatCapacity - usedCapacity > 0;
        if (SeatCapacity) {
            System.out.println("Вы можете занять сидячее место");
        } else {
            boolean StandCapacity = totalStandCapacity - usedStandCapacity <= 62
                    && totalStandCapacity - usedStandCapacity > 0;
            if (StandCapacity) {
                System.out.println(" Вы можете занять стоячее место ");
            } else {
                System.out.println(" В Вагоне нет мест ");
            }
        }
    }

    public static void task7() {
        int one = 1014155;
        int two = 6501;
        int three = 125;
        boolean firstWay = one > two && one > three;
        if (firstWay) {
            System.out.println("Первое число больше");
        } else {
            boolean firstWay2 = two > one && two > three;
            if (firstWay2) {
                System.out.println("Второе число больше");
            } else {
                boolean firstWay3 = three > one && three > two;
                if (firstWay3) {
                    System.out.println("Третье число больше");
                }
            }
        }
    }
}