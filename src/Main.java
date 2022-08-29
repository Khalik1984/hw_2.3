public class Main {
    public static void main(String[] args) {
        // Задача 1
        int horses = 121;
        byte frog = 2;
        short boll = 20;
        long appleBox = 120;
        float totalWeight = 2.1445f;
        double appleWeight = 5.7;
        System.out.println(horses);
        System.out.println(frog);
        System.out.println(boll);
        System.out.println(appleBox);
        System.out.println(totalWeight);
        System.out.println(appleWeight);

        // Задача 2
        byte elefants = 67;
        System.out.println(elefants);
        short lakeDepth = -159;
        System.out.println(lakeDepth);
        int camelCase = 569;
        System.out.println(camelCase);
        long allMinutes = 987678965549L;
        System.out.println(allMinutes);
        float totalWeight1 = 2.768f;
        System.out.println(totalWeight1);
        double totalNUmberStars = 27.12d;
        System.out.println(totalNUmberStars);
        char signOrganization = 27897;
        System.out.println(signOrganization);
        boolean isAlive = false;
        System.out.println(false);

        // Задача 3
        short classLudPav = 23;
        System.out.println(classLudPav);
        short classAnnSer = 27;
        System.out.println(classAnnSer);
        short classEktAndr = 30;
        System.out.println(classEktAndr);
        int totalLearners = classLudPav + classAnnSer + classEktAndr;
        System.out.println(totalLearners);
        int totalSheets = 480;
        System.out.println(totalSheets);
        int numberSheetsOfLearner = totalSheets / totalLearners;
        System.out.println("На каждого ученика рассчитано" + numberSheetsOfLearner + "листов бумаги");

        //Задача 4
        int amountBottlesPerMinute = 8;
        System.out.println(amountBottlesPerMinute);
        System.out.println("За 20 минут машина произвела бутылок" + (amountBottlesPerMinute * 20) + "штук");
        System.out.println("За сутки машина произвела бутылок" + (amountBottlesPerMinute * 60 * 24) + "штук");
        System.out.println("За 3 дня машина произвела бутылок" + (amountBottlesPerMinute * 60 * 24 * 3) + "штук");
        System.out.println("За 1 месяц машина произвела бутылок" + (amountBottlesPerMinute * 60 * 24 * 30) + "штук");

        // Задача 5
        int totalOfCans = 120;
        System.out.println(totalOfCans);
        int consumptionPerClass = 6;
        System.out.println(consumptionPerClass);
        int totalNumClass = totalOfCans / consumptionPerClass;
        System.out.println("В школе, где" + totalNumClass + "классов, нужно" + (totalNumClass * 2) + "банок белой краски и" + (totalNumClass * 4 ) + "банок коричневой краски");

        // Задача 6
        int bananaWeight = 80;
        float milkWeight = (float) (105 / 100);
        int icecreamWeight = 100;
        int eggsWeight = 70;
        float breakfastWeight = (bananaWeight * 5 + milkWeight * 200 + icecreamWeight * 2 + eggsWeight * 4) / 1000;
        System.out.println("Вес завтрака спортсмена - " + breakfastWeight + " кг.");

        // Задача 7
        double outWeight = 7000;
        double firstTerm = outWeight / 250;
        System.out.println(firstTerm);
        double secondTerm = outWeight / 500;
        System.out.println(secondTerm);
        double averageTerm = (firstTerm + secondTerm) / 2;
        System.out.println(averageTerm);




        // Задача 8
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        float zpMashaNew = zpMasha * 1.1f;
        float zpDenisNew = zpDenis * 1.1f;
        float zpKristinaNew = zpKristina * 1.1f;
        int year = 12;
        double differenceZpMasha = (zpMashaNew - zpMasha) * year;
        double differenceZpDenis = (zpDenisNew - zpDenis) * year;
        double differenceZpKristina = (zpKristinaNew - zpKristina) * year;
        System.out.println("Маша получает" +zpMashaNew+ "рублей. Годовой доход вырос на" + differenceZpMasha);
        System.out.println("Денис получает" +zpDenisNew+ "рублей. Годовой доход вырос на" + differenceZpDenis);
        System.out.println("Кристина получает" +zpKristinaNew+ "рублей. Годовой доход вырос на" + differenceZpKristina);
    }
}