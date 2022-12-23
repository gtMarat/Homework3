import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1 ");
        byte apple = 100;
        System.out.println("Значение переменной аpple с типом byte равно " + apple);
        short box = 32000;
        System.out.println("Значение переменной box с типом short равно " + box);
        int cap = 2000000000;
        System.out.println("Значение переменной cap с типом int равно " + cap);
        long duck = -5000000L;
        System.out.println("Значение переменной duck с типом long равно " + duck);
        float egg = 6.8F;
        System.out.println("Значение переменной egg с типом float равно " + egg);
        double fox = 9.5623654;
        System.out.println("Значение переменной fox с типом double равно " + fox);
    }

    public static void task2() {
        System.out.println("Задача 2 ");
        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3 ");
        byte Ludmilla = 23;
        System.out.println("У Людмилы Повловны " + Ludmilla + " ученика");
        byte Anna = 27;
        System.out.println("У Анны Серегеевны " + Anna + " учеников");
        byte Ekaterina = 30;
        System.out.println("У Екатерины Андреевны " + Ekaterina + " учеников");
        short Sheets = 480;
        System.out.println("Закупили " + Sheets + " листов на три класса");
        short allStudent = (short) (Ludmilla + Anna + Ekaterina);
        System.out.println("Количесвто учеников во всех трех классах равна " + allStudent);
        int calculatedSheets =(Sheets / allStudent);
        System.out.println("На каждого ученика рассчитано " + calculatedSheets + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4 ");
        byte bottles = 16;
        byte minutes = 2;
        System.out.println("Машина изготавливает " + bottles + " штук бутылок за " + minutes + " минуты");
        int bottlesOneMinute =(bottles / minutes);
        System.out.println("Получается за 1 минуту машина изготавливает " + bottlesOneMinute + " штук бутылок");
        int bottles20Minute = (bottlesOneMinute * 20);
        System.out.println("За 20 минут машина изготавливает " + bottles20Minute + " штук бутылок");
        int bottlesOneHours = (bottles20Minute * 3);
        int bottles24Hours = (bottlesOneHours * 24);
        System.out.println("За сутки машина изготавлиает " + bottles24Hours + " штук бутылок");
        int bottlesThreeDay = (bottles24Hours * 3);
        System.out.println("За 3 дня машина изготавливает " + bottlesThreeDay + " штук бутылок");
        int bottlesOneMouth = (bottles24Hours * 30);
        System.out.println("За месяц машина произвела " + bottlesOneMouth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5 ");
        byte CansOfPaint = 120;
        System.out.println("Всего нужно " + CansOfPaint + " банок краски на ремонт школы");
        byte whitePaint = 2;
        byte brownPaint = 4;
        System.out.println("На каждый класс уходит по " + whitePaint + " шт банок краски белого цвета и по " + brownPaint + " шт банок коричневого цвета");
        int classRoom =(whitePaint + brownPaint);
        int totalClassRoom =(CansOfPaint / classRoom);
        System.out.println("Всего классов " + totalClassRoom);
        byte totalWhitePaint = (byte) (totalClassRoom * whitePaint);
        System.out.println("Всего белой краски нужно " + totalWhitePaint);
        byte totalBrownPaint = (byte) (totalClassRoom * brownPaint);
        System.out.println("Всего коричневой краски нужно " + totalBrownPaint);
        System.out.println("В школе, где " + totalClassRoom + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски ");
    }

    public static void task6() {
        System.out.println("Задача 6 ");
        byte oneBananasGram = 80;
        short fiveBananasGram = (short) (oneBananasGram * 5);
        byte Milk100Ml = 105;
        short Milk200Ml = (short) (Milk100Ml * 2);
        byte iceCream = 100;
        short twoIceCream = (short) (iceCream * 2);
        byte rawEggs = 70;
        short fourRawEggs = (short) (rawEggs * 4);
        short breakfast = (short) (fiveBananasGram + Milk200Ml + twoIceCream + fourRawEggs);
        System.out.println("Всего съедает один спортсмен за завтрак " + breakfast + " грамм");
        double oneKg = 1000;
        double breakfastKg =(breakfast / oneKg);
        System.out.println("Всего съедает один спортсмен за завтрак " + breakfastKg + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7 ");
        short loseWeight = 7000;
        System.out.println("Нужно похудеть на " + loseWeight + " грамм");
        short OnTheDayToResetFrom = 250;
        short PerDayResetTo = 500;
        int Days250Gram =(loseWeight / OnTheDayToResetFrom);
        System.out.println(Days250Gram + " дней уходит на похудение, если спортсмен будет терять каждый день по " + OnTheDayToResetFrom + " грамм ");
        int Days500Gram = (loseWeight / PerDayResetTo);
        System.out.println(Days500Gram + " дней уходит на похудение, если спортсмен будет терять каждый день по " + PerDayResetTo + " грамм");
        int OnAverage = (int) (loseWeight) / ((OnTheDayToResetFrom + PerDayResetTo) / 2);
        System.out.println("В среднем понадобится " + OnAverage + " деней , чтобы добится результата");
    }

    public static void task8() {
        System.out.println("Задача 8 ");
        int Maria = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int Maria10=(int)(Maria*1.1);
        System.out.println("Получает Мария после повышения на 10% к зп " + Maria10 + " рублей");
        int Denis10= (int)(Denis*1.1);
        System.out.println("Получает Денис после повышения на 10% к зп " + Denis10 + " рублей");
        int Kristina10 = (int)(Kristina*1.1);
        System.out.println("Получает Кристина после повышения на 10% к зп " + Kristina10 + " рублей");
        int MariaYear=(Maria*12);
        System.out.println("Годовая зп Марии до повышения зп "+ MariaYear+ " рублей");
        int MariaYearUp=(Maria10*12);
        System.out.println("Годовая зп Марии после повышения зп " + MariaYearUp+" рублей");
        int MariaDifference = (MariaYearUp-MariaYear);
        System.out.println("Мария теперь получает "+ MariaYearUp+ " рубля. Годовой доход вырос на "+ MariaDifference+" рублей");
        int DenisYear=(Denis*12);
        int DenisYearUp=(Denis10*12);
        int DenisDifference=(DenisYearUp-DenisYear);
        System.out.println("Денис теперь получает "+ DenisYearUp + " рублей. Годовой доход вырос на "+ DenisDifference+" рублей");
        int KristinaYear=(Kristina*12);
        int KristinaYearUp=(Kristina10*12);
        int KristinaDifference=(KristinaYearUp-KristinaYear);
        System.out.println("Кристина теперь получает "+ KristinaYearUp + " рублей. Годовой доход вырос на "+ KristinaDifference+" рубля");
    }
}
