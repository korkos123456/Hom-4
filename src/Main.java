public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void task3() {
        int bananas = 5;
        int banansWeight = 80;

        int milk = 200/100;
        int milkWeinght = 105;

        int iceCream = 2;
        int iceWeight = 100;

        int egg =4;
        int eggWeing = 70;

        int total = (bananas * banansWeight) + (milk * milkWeinght) + (iceCream * iceWeight) + (egg * eggWeing);

        int gramsIkg = 1000;

        double totalKgs = total/(gramsIkg * 0.1);
        System.out.println(total);

    }
    public static void main(String[] args) { task 4();
        task4(); {

             int weight = 7;
             int gramsInKg = 1000;
             int weightInGrams = weight * gramsInKg;

             int minGramsPerDay = 250;
             int maxGramsPerDay = 500;

             int minDays = weightInGrams / maxGramsPerDay;
             int maxDays = weightInGrams/ minGramsPerDay;

             double avgDays = (minDays+ maxDays) / (2* 1.0);

             System.out.println("Min:" + minDays);
            System.out.println("Man:" + maxDays);
            System.out.println("Avg:" + avgDays);



            public static void main(String[] args) { task5(); }
                public static void task5 {
               int percent = 10;
               double multiplier = percent/ (100*0.1);

               int mashaSalary = 67_760;
               int denisSalary = 83_690;
               int kristinaSalary = 76_230;

               int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multiplier));
               int denisNewSalary = (int) (denisSalary + (denisSalary * multiplier));
                int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * multiplier));

                int mashaDifference = (mashaNewSalary - mashaSalary);
                int denisDifference = (denisNewSalary - denisSalary);
                int kristinaDifference = (kristinaNewSalary - kristinaSalary);

                System.out.println("Маша тепрь получает " + mashaNewSalary + "рублей. Годовой доход вырос " + mashaDifference + "рублей");
                System.out.println("Денис тепрь получает " + denisNewSalary + "рублей. Годовой доход вырос " + denisDifference+ "рублей");
                System.out.println("Кристана тепрь получает " + kristinaNewSalary + "рублей. Годовой доход вырос " + kristinaDifference + "рублей");
            }


        }

    }



}