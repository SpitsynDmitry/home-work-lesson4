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



    }
}