public class Main {
    public static void main(String[] args) {
        // 3адание 1
        byte cat = 1;
        short mouse = 10;
        int dog = 8;
        long elephant =110L;
        double sugarWeight =4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog < 10;
        char bar = 36;
        System.out.println (bar);

        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println ("Общий вес боксеров " + weightOfAllBoxers);
        System.out.println ("Разница в весе боксеров " + weightDifference);

        // Задание 3
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggsWeight = 70;
        int weightOffAllBananas = bananaWeight * 5;
        int weightOffAllMilk = milkWeight * 2;
        int weightOffAllIceCream = iceCreamWeight * 2;
        int weightOffAllEggs = eggsWeight * 4;
        int weightOffAllProducts = weightOffAllBananas + weightOffAllMilk + weightOffAllIceCream + weightOffAllEggs;
        System.out.println ("Общий вес продуктов в граммах " + weightOffAllProducts);
        double weightOffAllProductsInKg = weightOffAllProducts * 0.001;
        System.out.println ("Общий вес продуктов в кг " + weightOffAllProductsInKg);

        // Задание 4
        int targetWeight = 7;
        double dailyWeightLossesGram1 = 250;
        double dailyWeightLossesKg1 = dailyWeightLossesGram1 * 0.001;
        double dailyWeightLossesGram2 = 500;
        double dailyWeightLossesKg2 = dailyWeightLossesGram2 / 1000;
        double daysQuantity1 = targetWeight / dailyWeightLossesKg1;
        double daysQuantity2 = targetWeight / dailyWeightLossesKg2;
        System.out.println ("Количество дней при потере 250 грамм " + daysQuantity1 + " дней");
        System.out.println ("Количество дней при потере 500 грамм " + daysQuantity2 + " дней");
        double averageDays = (daysQuantity1 + daysQuantity2) / 2;
        System.out.println ("Среднее количество дней " + averageDays + " дня");

        // Задание 5
        int mashaSalary  = 67760;
        int denisSalary  = 83690;
        int kristinaSalary = 76230;
        int annualMashaSalary = mashaSalary * 12;
        int annualDenisSalary = denisSalary * 12;
        int annualKristinaSalary = kristinaSalary * 12;
        double mashaSalaryIncreases = mashaSalary * 1.1;
        double denisSalaryIncreases = denisSalary * 1.1;
        double kristinaSalaryIncreases = kristinaSalary * 1.1;
        System.out.println ("Маша теперь получает  " + mashaSalaryIncreases + " руб");
        System.out.println ("Денис теперь получает " + denisSalaryIncreases + " руб");
        System.out.println ("Кристина теперь получает " + kristinaSalaryIncreases + " руб");
        double annualMashaSalaryIncreases = mashaSalaryIncreases * 12;
        double annualDenisSalaryIncreases = denisSalaryIncreases * 12;
        double annualKristinaSalaryIncreases= kristinaSalaryIncreases * 12;
        double mashaSalaryDifference = annualMashaSalaryIncreases - annualMashaSalary;
        double denisSalaryDifference = annualDenisSalaryIncreases - annualDenisSalary;
        double kristinaSalaryDifference = annualKristinaSalaryIncreases - annualKristinaSalary;
        System.out.println (" Годовой доход Маши вырос на " + mashaSalaryDifference + " руб");
        System.out.println (" Годовой доход Дениса вырос на " + denisSalaryDifference + " руб");
        System.out.println (" Годовой доход Кристины вырос на " + kristinaSalaryDifference + " руб");










    }
}