public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("  Задача 1");
byte apple = 4;
        System.out.println("Значение переменной apple с типом byte равно " + apple);
int peach = 9;
        System.out.println("Значение переменной peach с типом int равно " + peach);
short pear = 15;
        System.out.println("Значение переменной pear с типом short равно " + pear);
long berries = 365L;
        System.out.println("Значение переменной berries с типом long равно " + berries);
        float workingHours = 10;
        System.out.println("Значение переменной workingHours с типом float равно " + workingHours);
        double jam = 15.4;
        System.out.println("Значение переменной jam с типом double равно " + jam);

        //Задача 2
        System.out.println("  Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987_678_965_549L;
            System.out.println(b);
            byte c = 2;
            System.out.println(c);
        int d = 786;
            System.out.println(d);
        boolean fall = true;
            System.out.println(!fall);
        short e = 569;
            System.out.println(e);
        short f = -159;
            System.out.println(f);
        int g = 27897;
            System.out.println(g);
        char i = 67;
            System.out.println((int) i);

        //Задача 3
        System.out.println("  Задача 3");
        byte ludmilaPav = 23;
        short annaSerg = 27;
        int ekatAnd = 30;
        int result = ludmilaPav + annaSerg + ekatAnd;
        System.out.println(ludmilaPav + "+" + annaSerg + "+" + ekatAnd + "=" + result + " - Всего учеников");
                short totalNumPaper = 480;
                int studentPaper = totalNumPaper / result;
        System.out.println(totalNumPaper + "/" + result + "=" + studentPaper);
        System.out.println("На каждого ученика рассчитано по " + studentPaper + " листов бумаги." );

        //Задача 4
        System.out.println("  Задача 4");
        byte efficiency = 16;
        efficiency /=2;
        System.out.println("16/2=" + efficiency + " - Производительность машины за 1 минуту");
        int efficiency20 = efficiency * 20;
        System.out.println("8*20=" + efficiency20);
        System.out.println("За 20 минут машина произвела бутылок " + efficiency20 + " штук");
        int dayMinute = 60*24;
        System.out.println("60*24=" + dayMinute + " - Количество минут в 1 сутках");
        int effencyDay = efficiency * dayMinute;
        System.out.println("8*1440=" + effencyDay);
        System.out.println("За сутки машина произвела бутылок " + effencyDay + " штук");
               int threeDaysEffency = effencyDay * 3;
                System.out.println("11520*3=" + threeDaysEffency);
        System.out.println("За 3 дня машина произвела бутылок " + threeDaysEffency + " штук");
        int monthDay = 30;
        long monthEffency = effencyDay * monthDay;
        System.out.println("11520*30=" + monthEffency);
        System.out.println("За месяц машина произвела бутылок " + monthEffency + " штук");

        //Задача 5
        System.out.println("  Задача 5");
        byte whiteOneClass = 2;
        byte brownOneClass = 4;
        int oneClass = whiteOneClass + brownOneClass;
        System.out.println("2+4=" + oneClass + " -Банок краски на 1 класс");
        int totalPaint = 120;
        int totalClasses = totalPaint / oneClass;
        System.out.println("120/6=" + totalClasses + " -Всего классов в школе");
        int totalPaintWhite = totalClasses * whiteOneClass;
        int totalPaintBrown = totalClasses * brownOneClass;
        System.out.println("20*2=" + totalPaintWhite + " -Всего банок белой краски");
        System.out.println("20*4=" + totalPaintBrown + " -Всего банок коричневой краски");
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalPaintWhite + " банок белой краски и " + totalPaintBrown + " банок коричневой краски.");

            //Задача 6
            System.out.println("  Задача 6");
            byte banana = 5;
            int bananaWeight1 = 80;
            int bananaWeight5 = banana * bananaWeight1;
        System.out.println("5*80=" + bananaWeight5 + " грамм - Вес 5 бананов");
            int milk = 200;
            milk /= 100;
            int milkWeight1 = 105;
            int milkWeight2 = milk * milkWeight1;
        System.out.println("105*2=" + milkWeight2 + " грамм - Вес 200 мл молока");
           byte iceCream = 2;
            int iceCreamWeight1 = 100;
            int iceCreamWeight2 = iceCream * iceCreamWeight1;
        System.out.println("2*100=" + iceCreamWeight2 + " грамм - Вес 2 брикетов мороженого");
            byte egg = 4;
            int eggWeight = 70;
        int eggWeight4 = egg * eggWeight;
            System.out.println("4*70=" + eggWeight4 + " грамм - Вес 4 яиц");
            int weightBreakfastGr = bananaWeight5 + milkWeight2 + iceCreamWeight2 + eggWeight4;
        System.out.println("400+210+200+280=" + weightBreakfastGr + " грамм - Вес спортивного завтрака в граммах");
        int weightBreakfastKg = weightBreakfastGr / 1000;
        System.out.println(weightBreakfastKg + " кг и 90 гр - Вес спортивного завтрака в килограммах.");

  //Задача 7
System.out.println("  Задача 7");
int weightLossTotal = 7;
 weightLossTotal *= 1000;
 int weightLossDay1 = 250;
 int dayNum1 = weightLossTotal / weightLossDay1;
        System.out.println("7000/250=" + dayNum1 + " - дней потребуется, если терять по 250 грамм в день");
        int weightLossDay2 = 500;
        int dayNum2 = weightLossTotal / weightLossDay2;
        System.out.println("7000/500=" + dayNum2 + " - дней потребуется, если терять по 500 грамм в день");
        int averageDayNum = (dayNum1 + dayNum2) / 2; //остаток от деления// int averageDayNum = (dayNum2 % dayNum1) / 2 + dayNum2;
        System.out.println("(14+28)/2=" + averageDayNum + " - дней в среднем для достижения результата");

       //Задача 8
        System.out.println("  Задача 8");
        int monthIncomeMasha = 67760;
        int monthIncomeDenis = 83690;
        int monthIncomeChristina = 76230;
          int monthIncomeBoostMasha = monthIncomeMasha + monthIncomeMasha * 10 / 100;
          int monthIncomeBoostDenis = monthIncomeDenis + monthIncomeDenis * 10 / 100;
          int monthIncomeBoostChristina = monthIncomeChristina + monthIncomeChristina * 10 / 100;
        int annualIncomeNowMasha = monthIncomeMasha * 12;
        int annualIncomeNowDenis = monthIncomeDenis * 12;
        int annualIncomeNowChristina = monthIncomeChristina * 12;
         int annualIncomeBoostMasha = monthIncomeBoostMasha * 12;
         int annualIncomeBoostDenis = monthIncomeBoostDenis * 12;
         int annualIncomeBoostChristina = monthIncomeBoostChristina * 12;
         int differenceAnnualIncomeMasha = annualIncomeBoostMasha % annualIncomeNowMasha;
        int differenceAnnualIncomeDenis = annualIncomeBoostDenis % annualIncomeNowDenis;
        int differenceAnnualIncomeChristina = annualIncomeBoostChristina % annualIncomeNowChristina;
        System.out.println("Маша теперь будет получать " + monthIncomeBoostMasha + " рублей. Годовой доход вырос на " + differenceAnnualIncomeMasha + " рублей.");
        System.out.println("Денис теперь будет получать " + monthIncomeBoostDenis + " рублей. Годовой доход вырос на " + differenceAnnualIncomeDenis + " рублей.");
        System.out.println("Кристина теперь будет получать " + monthIncomeBoostChristina + " рублей. Годовой доход вырос на " + differenceAnnualIncomeChristina + " рублей.");




    }
}