public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }








    public static void task5() {

        int salaryOfMasha = 67760;
        int salaryOfDenis = 83690;
        int salaryOfChristina = 76230;

        int incSalaryOfMasha = salaryOfMasha + salaryOfMasha / 10;
        int incSalaryOfDenis = salaryOfDenis + salaryOfDenis / 10;
        int incSalaryOfChristina = salaryOfChristina + salaryOfChristina / 10;


        int percent = 10;
        double multiplier = percent/ (100*0.1);

        int annualIncomeOfMasha = salaryOfMasha * 12;
        int annualIncomeOfDenis = salaryOfDenis * 12;
        int annualIncomeOfChristina = salaryOfChristina * 12;

        int newAnnualIncomeOfMasha = incSalaryOfMasha * 12;
        int newAnnualIncomeOfDenis = incSalaryOfDenis * 12;
        int newAnnualIncomeOfChristina = incSalaryOfChristina * 12;

        int difOfAnnualIncomeOfMasha = newAnnualIncomeOfMasha % annualIncomeOfMasha;
        int difOfAnnualIncomeOfDenis = newAnnualIncomeOfDenis % annualIncomeOfDenis;
        int difOfAnnualIncomeOfChristina = newAnnualIncomeOfChristina % annualIncomeOfChristina;
        System.out.println("Маша теперь получает " + incSalaryOfMasha + " рублей. Годовой доход вырос на " + difOfAnnualIncomeOfMasha + " рубля");
        System.out.println("Денис теперь получает " + incSalaryOfDenis + " рублей. Годовой доход вырос на " + difOfAnnualIncomeOfDenis + " рублей");
        System.out.println("Кристина теперь получает " + incSalaryOfChristina + " рубля. Годовой доход вырос на " + difOfAnnualIncomeOfChristina + " рублей");

        }





