package lesson19;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Labs {
    public static Scanner num = new Scanner(System.in);
    public static Random random = new Random();
    public static int n;
    public static int x;
    public static int y;
    public static int k;
    public static int result;
    public static int min = 10;
    public static int max = 99;

    public static void test2028() {
        n = masSize();
        int[] mas = new int[n];
        result2028(mas);
    }
    public static void result2028(int[] mas) {
        for (int i = 0; i < mas.length; i++)
            mas[i] = 0;
        int countAct = 0;
        min = 1;
        max = mas.length + 10;
        boolean flag = false;
        do {
            masRandom(mas, min, max);
            outputPrintf(mas);
            int k = 0;
            for (int i = 1; i <= mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    if (i == mas[j]) {
                        k++;
                        break;
                    }
                }
            }
            if (k == mas.length)
                flag = true;
            countAct++;
        } while (!flag);
        outputPrintf(mas);
        System.out.println(countAct +  " - циклов и победа");
    }

    public static void test2027() {
        n = inputOne();
        int[] mas = new int[n];
        min = 1;
        max = n + 10;
        masRandom(mas, min, max);
        outputPrintf(mas);
        System.out.println(result2027(mas));
    }
    public static boolean result2027(int[] mas) {
        int max = 0;
        boolean flag = false;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max)
                max = mas[i];
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < mas.length; i++)
            count[mas[i]]++;
        outputFromN1ToN2(0, count.length);
        outputPrintf(count);
        int k = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 1)
                k++;
        }
        if (k == count.length - 1)
            flag = true;
        return flag;
    }


    public static void test2026() {
        n = inputOne();
        int[] mas = new int[n];
        min = 1;
        max = 9;
        masRandom(mas, min, max);
        outputPrintf(mas);
        int[] arr = result2026(mas);
        outputPrintf(arr);
    }
    public static int[] result2026(int[] mas) {
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max)
                max = mas[i];
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < mas.length; i++)
            count[mas[i]]++;
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1)
                k++;
        }
        outputFromN1ToN2(0, max);
        outputPrintf(count);
        int[] arr = new int[k];
        k = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < count.length; j++) {
                if (mas[i] == j && count[j] == 1) {
                    arr[k] = i + 1;
                    k++;
                }
            }
        }
        return arr;
    }

    public static void test2025() {
        n = inputOne();
        int[] numbers = new int[n];
        min = 1;
        max = 99;
        masRandom(numbers, min, max);
        masInput(numbers);
        int[] arr = result2025(numbers);
        outputPrintf(arr);
    }
    public static int[] result2025(int[] mas){
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max)
                max = mas[i];
        }
        System.out.println(max);
        int[] count = new int[max];
        for (int i = 0; i < mas.length; i++)
            count[mas[i] - 1]++;
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1)
                k++;
        }
        int[] arr = new int[k];
        k = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                arr[k] = i + 1;
                k++;
            }
        }
        outputFromN1ToN2(1, max);
        outputPrintf(count);
        return arr;
    }

    public static void test2024() {
        n = inputOne();
        int[] numbers = new int[n];
        min = 0;
        max = 9;
        masRandom(numbers, min, max);
        masInput(numbers);
        int[] arr = result2024(numbers);
        masInput(arr);
    }
    public static int[] result2024(int[] mas){
        int count, k = 0;
        for (int i = 0; i < mas.length; i++) {
            count = 0;
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == mas[j])
                    count++;
            }
            if (count == 1)
                k++;
        }
        int[] arr = new int[k];
        k = 0;
        for (int i = 0; i < mas.length; i++) {
            count = 0;
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == mas[j])
                    count++;
            }
            if (count == 1) {
                arr[k] = mas[i];
                k++;
            }
        }
        return arr;
    }

    public static void test2023() {
        System.out.print("Введите количество таксистов: ");
        n = num.nextInt();
        System.out.print("Введите количество рабочих дней: ");
        k = num.nextInt();
        int[][] taxiDriver = new int[n][k];
        count2023(taxiDriver);
        outputMasTwo(taxiDriver);
        result2023(taxiDriver);
    }
    public static void result2023(int[][] taxiDriver) {
        int sum = 0;
        int[] countBenz = new int[taxiDriver.length];
        for (int i = 0; i < countBenz.length; i++) {
            for (int j = 0; j < taxiDriver[0].length; j++) {
                countBenz[i] += taxiDriver[i][j];
                sum += taxiDriver[i][j];
            }
        }
        System.out.println("Расход бензина за выбранный период каждого водителя: ");
        outputFromN1ToN2(1, taxiDriver.length);
        outputPrintf(countBenz);
        System.out.println("Всего за выбранный период расход бензина - " + sum + " литров");
    }
    public static void count2023(int[][] mas) {
        min = 8;
        max = 25;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++)
                mas[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
        }
    }


    public static void test2022() {
        System.out.print("Введите количество рейсов: ");
        n = num.nextInt();
        int[] flight = new int[n];
        for (int i = 0; i < flight.length; i++) {
            System.out.println("Введите количество количество пассажиров на " + (i + 1) + " рейсе: ");
            int a;
            do {
                a = num.nextInt();
                flight[i] += a;
            } while (a != 0);
        }
        outputFromN1ToN2(1, n);
        outputPrintf(flight);
    }

    public static void test2021() {
        int[][] socTaxi = new int[10][7];
        resultSocTaxi(socTaxi);
        outputMasTwo(socTaxi);
        result2021(socTaxi);
    }
    public static void result2021(int[][] socTaxi) {
        int[] countSum = new int[socTaxi.length];
        for (int i = 0; i < countSum.length; i++) {
            for (int j = 0; j < socTaxi[0].length; j++) {
                countSum[i] += socTaxi[i][j];
            }
        }
        System.out.println();
        outputFromN1ToN2(1, 10);
        outputPrintf(countSum);
    }
    public static void resultSocTaxi(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++)
                mas[i][j] = (int) (Math.random() * ((50 - 1) + 1) + 1);
        }
    }

    public static void test2020() {
        System.out.print("Введите количестов учащихся: ");
        n = num.nextInt();
        int[] voteCandidats = new int[n];
        vote2020(voteCandidats);
        result2020(voteCandidats);
    }
    public static void result2020(int[] voteCandidats) {
        int[] countVote = new int[12];
        for (int i = 0; i < voteCandidats.length; i++)
            countVote[voteCandidats[i] - 1]++;
        outputFromN1ToN2(1, 12);
        outputPrintf(countVote);
        int limit = (int) (Math.ceil(voteCandidats.length * 0.1));
        int topRaiting = 0, k = 0;
        for (int i: countVote) {
            if (i > topRaiting)
                topRaiting = i;
        }
        for (int i: countVote) {
            if (i == topRaiting)
                k++;
        }
        if (k == 1 && topRaiting >= limit) {
            for (int i = 0; i < countVote.length; i++) {
                if (countVote[i] == topRaiting)
                    System.out.println("Представителя школы в городской ученический комитет выбрали, выиграл кандидат: " + (i + 1));
            }
        }
        else if (k > 1 && topRaiting >= limit) {
            System.out.print("На выборах " + k + " кандидата(ов) набрали равное количество голосов и прошли во второй раунд голосования, кандидаты номер: ");
            for (int i = 0; i < countVote.length; i++) {
                if (countVote[i] == topRaiting)
                    System.out.print(i + 1 + " ");
            }
        }
        else
            System.out.println("Выборы не состоялись");
    }
    public static void vote2020(int[] voteCandidats) {
        for (int i = 0; i < voteCandidats.length; i++)
            voteCandidats[i] = (int) (Math.random() * voteCandidats.length + 1);
    }

    public static void test2019() {
        System.out.print("Введите количество учеников: ");
        n = num.nextInt();
        int[][] tickets = new int[n][10];
        for (int i = 0; i < tickets.length; i++) {
            for (int j = 0; j < tickets[0].length; j++)
                tickets[i][j] = (int) (Math.random() * ((1 - 0) + 1) + 0);
        }
        result2019(tickets);
    }
    public static void result2019(int[][] tickets) {
        int[] countTickets = new int[10];
        for (int i = 0; i < tickets.length; i++) {
            for (int j = 0; j < tickets[0].length; j++) {
                if (tickets[i][j] == 1)
                    countTickets[j]++;
            }
        }
        System.out.println("Посещаемость спектаклей: ");
        outputFromN1ToN2(1, 10);
        outputPrintf(countTickets);
        int maxTickets = 0;
        for (int i = 0; i < countTickets.length; i++) {
            if (countTickets[i] > maxTickets)
                maxTickets = countTickets[i];

        }
        int k = 0, d = 0;
        for (int i: countTickets) {
            if (i == maxTickets)
                k++;
            if (i < 100)
                d++;
        }
        int[] topTickets = new int[k];
        int[] badTickets = new int[d];
        boolean flag = true;
        if (d < 1)
            flag = false;
        k = 0;
        d = 0;
        for (int i = 0; i < countTickets.length; i++) {
            if (countTickets[i] == maxTickets) {
                topTickets[k] = i + 1;
                k++;
            }
            if (countTickets[i] < 100) {
                badTickets[d] = i + 1;
                d++;
            }
        }
        System.out.println("Самый(ые) популярный(ые) спекталь(и):");
        outputPrintf(topTickets);
        if (flag) {
            System.out.println("Спектакль(и) на который(ые) решили приобрести билеты менее 100 учеников:");
            outputPrintf(badTickets);
        }
    }

    public static void test2018() {
        System.out.print("Введите количество болельщиков: ");
        n = num.nextInt();
        int[][] favorits = new int[n][3];
        int hatePlayer = (int) (Math.random() * 21 + 1);
        System.out.println("hatePlayer = " + hatePlayer);
        for (int i = 0; i < favorits.length; i++) {
            for (int j = 0; j < favorits[0].length; j++) {
                favorits[i][j] = (int) (Math.random() * 21 + 1);
                while (favorits[i][j] == hatePlayer)
                    favorits[i][j] = (int) (Math.random() * 21 + 1);
            }
        }
        result2018(favorits);
    }
    public static void result2018(int[][] favorits) {
        int[] countFavorits = new int[21];
        for (int i = 0; i < favorits.length; i++) {
            for (int j = 0; j < favorits[0].length; j++)
                countFavorits[favorits[i][j] - 1]++;
        }
        int maxFavorit = 0;
        for (int i = 0; i < countFavorits.length; i++) {
            if (countFavorits[i] > maxFavorit)
                maxFavorit = countFavorits[i];
        }
        int k = 0, d = 0;
        for (int i = 0; i < countFavorits.length; i++) {
            if (countFavorits[i] == maxFavorit)
                k++;
            if (countFavorits[i] == 0)
                d++;
        }
        int[] topFavorits = new int[k];
        int[] hateFavorits = new int[d];
        k = 0;
        d = 0;
        for (int i = 0; i < countFavorits.length; i++) {
            if (countFavorits[i] == maxFavorit) {
                topFavorits[k] = i + 1;
                k++;
            }
            if (countFavorits[i] == 0) {
                hateFavorits[d] = i + 1;
                d++;
            }
        }
        System.out.println("Голоса за выбор лучшего игрока:");
        for (int i = 1; i < 22; i++)
            System.out.printf("%4d", i);
        System.out.println();
        outputPrintf(countFavorits);
        System.out.println("Любимый(ые) игрок(и):");
        outputPrintf(topFavorits);
        System.out.println("Ненавистный(ые) игрок(и):");
        outputPrintf(hateFavorits);
    }

    public static void test2017() {
        System.out.print("Введите количество студентов: ");
        n = num.nextInt();
        int[] month = new int[n];
        int[] gender = new int[n];
        min = 0;
        max = 1;
        masRandom(gender, min, max);
        min = 1;
        max = 12;
        masRandom(month, min, max);
        outputPrintf(month);
        outputPrintf(gender);
        result2017(month, gender);

        int[][] students = new int[n][2];
        min = 0;
        max = 1;
        for (int i = 0; i < students.length; i++) {
            students[i][0] = (int) (Math.random() * 12 + 1);
            students[i][1] = (int) (Math.random() * ((max - min) + 1) + min);
        }
//        outputMasTwo(students);
//        result20172(students);
    }
    public static void result2017(int[] month, int[] gender) {
        int[][] drCount = new int[12][2];
        for (int i = 0; i < drCount.length; i++) {
            for (int j = 0; j < month.length; j++) {
                if (gender[j] == 1 && i + 1 == month[j])
                    drCount[i][1]++;
                if (gender[j] == 0 && i + 1 == month[j])
                    drCount[i][0]++;
            }
        }
        String[] months = { "январе" , "феврале" , "марте ", "апреле" , "мае", "июне", "июле", "августе",  "сентябре", "октябре", "ноябре", "декабре" };
        for (int i = 0; i < drCount.length; i++)
            System.out.println("В " + months[i] + " др у " + drCount[i][1] + " парней и " + drCount[i][0] + " девушек");
        System.out.println();
        for (int i = 0; i < drCount.length; i++) {
            if (drCount[i][0] > drCount[i][1])
                System.out.println("В " + months[i] + " др у девушек больше, чем у парней");
        }
    }
    public static void result20172(int[][] students) {
        int[][] countDr = new int[12][2];
        String[] month = { "январе" , "феврале" , "марте ", "апреле" , "мае", "июне", "июле", "августе",  "сентябре", "октябре", "ноябре", "декабре" };
        for (int i = 0; i < countDr.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (i + 1 == students[j][0] && students[j][1] == 1)
                    countDr[i][1]++;
                if (i + 1 == students[j][0] && students[j][1] == 0)
                    countDr[i][0]++;
            }
        }
        for (int i = 0; i < countDr.length; i++)
            System.out.println("В " + month[i] + " у " + countDr[i][1] + " парня(ей) др и у " + countDr[i][0] + " девушки(ек)");
        System.out.println();
        for (int i = 0; i < countDr.length; i++) {
            for (int j = 0; j < countDr[0].length; j++) {
                if (countDr[i][0] > countDr[i][1])
                    System.out.println("В " + month[i] + " др у девушек больше, чем у парней");
            }
        }
    }

    public static void test2016() {
        n = 20;
        k = 10;
        int[][] students = new int[k][n];
        int[] questions = new int[n];
        int[] answers = new int[n];
        min = 1;
        max = 4;
        masRandom(answers, min, max);
        result2016(students, questions, answers);
    }
    public static void result2016(int[][] students, int[] questions, int[] answers) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[0].length; j++) {
                students[i][j] = (int) ((Math.random() * 4) + 1);
            }
        }
        for (int i = 0; i < questions.length; i++)
            questions[i] = i + 1;
        System.out.println("Правильные ответы на тесты: ");
        outputPrintf(questions);
        outputPrintf(answers);
        System.out.println();
        outputMasTwo2016(students);
        int[] countTrueAnswers = new int[answers.length];
        for (int i = 0; i < students.length; i++) {
            int countTrue = 0, countFalse = 0;
            for (int j = 0; j < students[0].length; j++) {
                if (answers[j] == students[i][j]) {
                    countTrue++;
                    countTrueAnswers[j]++;
                }
                else
                    countFalse++;
            }
            System.out.println("У " + (i + 1) + " студента " + countTrue + " правильных ответа(ов) и " + countFalse + " не правильных");
        }
        System.out.println();
        System.out.println("Список вопросов и количество правильных ответов на них: ");
        outputPrintf(questions);
        outputPrintf(countTrueAnswers);
    }
    public static void outputMasTwo2016 (int[][] mas) {
        for (int i = 0; i < mas.length; i++) {

            for (int j = 0; j < mas[0].length; j++)
                System.out.printf("%4d",mas[i][j]);
            System.out.println(" (" + (i + 1) + ")");
        }
        System.out.println();
    }

    public static void test2015() {
        System.out.print("Введите количество учеников: ");
        n = num.nextInt();
        int[] students = new int[n];
        min = 1;
        max = 5;
        masRandom(students, min, max);
        masInput(students);
        result2015(students);
    }
    public static void result2015(int[] students) {
        int[] countRait = new int[5];
        for (int i = 0; i < students.length; i++)
            countRait[students[i] - 1]++;
        for (int i = 0; i < countRait.length; i++) {
            switch (i) {
                case 0:
                    if (countRait[i] > 0) {
                        System.out.println(countRait[i] + " ученик(ов) получили оценку КОЛ!");
                        break;
                    }
                case 1:
                    if (countRait[i] > 0) {
                        System.out.println(countRait[i] + " ученик(ов) получили оценку " + (i + 1));
                        break;
                    }
                case 2:
                    if (countRait[i] > 0) {
                        System.out.println(countRait[i] + " ученик(ов) получили оценку " + (i + 1));
                        break;
                    }
                case 3:
                    if (countRait[i] > 0) {
                        System.out.println(countRait[i] + " ученик(ов) получили оценку " + (i + 1));
                        break;
                    }
                case 4:
                    if (countRait[i] > 0) {
                        System.out.println(countRait[i] + " ученик(ов) получили оценку " + (i + 1));
                        break;
                    }
            }
        }
    }

    public static void test2014() {
        System.out.print("Введите количество учеников: ");
        n = num.nextInt();
        int[] days = new int[n];
        int[] months = new int[n];
        int[] earths = new int[n];
        min = 1;
        max = 31;
        masRandom(days, min, max);
        min = 1;
        max = 12;
        masRandom(months, min, max);
        min = 1990;
        max = 2010;
        masRandom(earths, min, max);
        masInput(days);
        masInput(months);
        masInput(earths);
        result2014(days, months, earths);
    }
    public static void result2014(int[] days, int[] months, int[] earths) {
        int[] countMonths = new int[12];
        int maxDr = 0;
        for (int i = 0; i < months.length; i++)
            countMonths[months[i] - 1]++;
        for (int i = 0; i < countMonths.length; i++) {
            if (countMonths[i] > maxDr)
                maxDr = countMonths[i];
            switch (i) {
                case 0:
                    System.out.println("В январе " + countMonths[i] + " дней рождений");
                    break;
                case 1:
                    System.out.println("В феврале " + countMonths[i] + " дней рождений");
                    break;
                case 2:
                    System.out.println("В марте " + countMonths[i] + " дней рождений");
                    break;
                case 3:
                    System.out.println("В апреле " + countMonths[i] + " дней рождений");
                    break;
                case 4:
                    System.out.println("В мае " + countMonths[i] + " дней рождений");
                    break;
                case 5:
                    System.out.println("В июне " + countMonths[i] + " дней рождений");
                    break;
                case 6:
                    System.out.println("В июле " + countMonths[i] + " дней рождений");
                    break;
                case 7:
                    System.out.println("В августе " + countMonths[i] + " дней рождений");
                    break;
                case 8:
                    System.out.println("В сентябре " + countMonths[i] + " дней рождений");
                    break;
                case 9:
                    System.out.println("В октрябре " + countMonths[i] + " дней рождений");
                    break;
                case 10:
                    System.out.println("В ноябре " + countMonths[i] + " дней рождений");
                    break;
                case 11:
                    System.out.println("В декабра " + countMonths[i] + " дней рождений");
                    break;
            }
        }
        System.out.println("Больше всего дней рождения в этих месяцах: ");
        for (int i = 0; i < countMonths.length; i++) {
            if (countMonths[i] == maxDr)
                System.out.print((i + 1) + " ");
        }
        System.out.println();
        System.out.println("Нет ни одного др в этих месяцах: ");
        for (int i = 0; i < countMonths.length; i++) {
            if (countMonths[i] == 0)
                System.out.print((i + 1) + " ");
        }
    }

    public static void test2013() {
        int[] mas = new int[10];
        min = 1;
        max = 6;
        masRandom(mas, min, max);
        masInput(mas);
//      не понял что делать
    }

    public static void test2012() {
        int[] mas = new int[1000];
        min = 0;
        max = 9999;
        masRandom(mas, min, max);
        masInput(mas);
        int[] sum = new int[4];
        result2012(mas, sum);
    }
    public static void result2012(int[] mas, int[] sum) {
        for (int i = 0; i < sum.length; i++)
            sum[i] = 0;
        for (int i = 0; i < mas.length; i++) {
            sum[0] += mas[i] / 1000;
            sum[1] += (mas[i] / 100) % 10;
            sum[2] += (mas[i] / 10) % 10;
            sum[3] += mas[i] % 10;
        }
        masInput(sum);
    }

    public static void test2011() {
        int[] mas = new int[50];
        min = 0;
        max = 999;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[10];
        result2011(mas, count);
    }
    public static void result2011(int[] mas, int[] count) {
        int maxNumber = 0, minNumber = 10;
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++) {
            while (mas[i] > 0) {
                count[mas[i] % 10]++;
                mas[i] /= 10;
            }
        }
        for (int i: count) {
            if (i > maxNumber)
                maxNumber = i;
            if (i < minNumber && i != 0)
                minNumber = i;
        }
        outputFromN1ToN2(0, 9);
        masInput(count);
        System.out.println("Элементы, которые встречаются чаще всего: ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxNumber)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Элементы, которые встречаются реже всего: ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] == minNumber)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Элементы, которые ни разу не встречаются: ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0)
                System.out.print(i + " ");
        }
    }

    public static void test2010() {
        int[] mas = new int[5000];
        min = 100;
        max = 999;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[900];
        result2010(mas, count);
    }
    public static void result2010(int[] mas, int[] count) {
        int maxNumber = 0;
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++)
            count[mas[i] - 100]++;
        for (int i: count) {
            if (i > maxNumber)
                maxNumber = i;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxNumber)
                System.out.print((i + 100) + " ");
        }
        System.out.println();
        System.out.println(maxNumber + " раз(а)");
    }

    public static void test2009() {
        int[] mas = new int[200];
        min = 10;
        max = 99;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[90];
        result2009(mas, count);
    }
    public static void result2009(int[] mas, int[] count) {
        int maxNumber = 0;
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++)
            count[mas[i] - 10]++;
        for (int i: count) {
            if (i > maxNumber)
                maxNumber = i;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxNumber)
                System.out.print((i + 10) + " ");
        }
        System.out.println();
        System.out.println(maxNumber + " раз(а)");
    }

    public static void test2008() {
        int[] mas = new int[20];
        min = 15;
        max = 45;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[31];
        result2008(mas, count);
    }
    public static void result2008(int[] mas, int[] count) {
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++)
            count[mas[i] - 15]++;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0)
                System.out.print(i + 15 + " ");
        }
    }

    public static void test2007() {
        int[] mas = new int[100];
        min = 10;
        max = 99;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[90];
        result2007(mas, count);
    }
    public static void result2007(int[] mas, int[] count) {
        int maxNumber = 0, k = 0, j = 0;
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++)
            count[mas[i] - 10]++;
        for (int i: count) {
            if (i > maxNumber)
                maxNumber = i;
        }
        for (int i: count) {
            if (maxNumber == i)
                k++;
        }
        int[] countMax = new int[k];
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxNumber) {
                countMax[j] = i + 10;
                j++;
            }
        }
        masInput(countMax);
        System.out.print(maxNumber + " раз(а)");
    }

    public static void test2005() {
        int[] mas = new int[100];
        min = 0;
        max = 9;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[10];
        outputFromN1ToN2(0, 9);
        result2005(mas, count);
        masInput(count);
        System.out.println(Arrays.toString(result2005(mas, count)));
    }
    public static int[] result2005(int[] mas, int[] count) {
        int maxNumber = 0, k = 0;
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++)
            count[mas[i]]++;
        for (int i: count) {
            if (i > maxNumber)
                maxNumber = i;
        }
        for (int i: count) {
            if (i == maxNumber)
                k++;
        }
        int[] countMax = new int[k];
        int g = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxNumber) {
                countMax[g] = i;
                g++;
            }
        }
        return countMax;
    }


    public static void test2004() {
        int[] mas = new int[10];
        min = 0;
        max = 9;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[10];
        result2004(mas, count);
        masInput(count);
    }
    public static void result2004(int[] mas, int[] count) {
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++)
            count[mas[i]]++;
    }

    public static void test2003() {
        int[] mas = new int[2000];
        min = 0;
        max = 9999;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[4];
        result2003(mas, count);
        masInput(count);
    }
    public static void result2003(int[] mas, int[] count) {
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++) {
            int k = 0;
            while (mas[i] > 0) {
                mas[i] /= 10;
                k++;
            }
            switch (k) {
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                case 4:
                    count[3]++;
                    break;
            }
        }
    }

    public static void test2002() {
        n = masSize();
        int[] mas = new int[n];
        min = -9;
        max = 9;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[3];
        result2002(mas, count);
        masInput(count);
    }
    public static void result2002(int[] mas, int[] count) {
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0)
                count[0] += mas[i];
            if (mas[i] < 0)
                count[1] += mas[i];
            if (mas[i] == 0)
                count[2]++;
        }
    }

    public static void test2001 () {
        n = masSize();
        int[] mas = new int[n];
        min = -9;
        max = 9;
        masRandom(mas, min, max);
        masInput(mas);
        int[] count = new int[3];
        result2001(mas, count);
        masInput(count);
    }
    public static void result2001(int[] mas, int[] count) {
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0)
                count[0]++;
            if (mas[i] < 0)
                count[1]++;
            if (mas[i] == 0)
                count[2]++;
        }

    }

    public static void test1971() {
        n = masSize();
        int[] mas = new int[n];
        System.out.println(result1971(mas));
    }
    public static int result1971(int[] mas) {
        boolean flag = false;
        int k = 0;
        min = 1;
        System.out.print("Введите максимальное генерируемое число: ");
        max = num.nextInt();
        do {
            masRandom(mas, min, max);
            int count = 0;
            for (int i = 1; i <= mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    if (i == mas[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == mas.length)
                flag = true;
            masInput(mas);
            k++;
        } while (!flag);
        return k;
    }

    public static void test1970() {
        n = masSize();
        int[] mas = new int[n];
        masInputValues(mas, n);
        masInput(mas);
        System.out.println(result1970(mas));
    }
    public static boolean result1970(int[] mas) {
        boolean flag = false;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (i == mas[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count == mas.length)
            flag = true;
        return flag;
    }

    public static void test1969() {
        n = masSize();
        while (n % 2 == 1) {
            System.out.println("Введи четный размер массива!");
            n = masSize();
        }
        int[] mas = new int[n];
        System.out.println("Введите радиус окружности: ");
        x = num.nextInt();
        min = 0;
        max = 9;
        masRandom(mas, min, max);
        masInputKoord(mas);
        int[] arr = result1969(mas, x);
        masInputKoord(arr);
    }
    public static int[] result1969(int[] mas, int x) {
        int count = 0;
        for (int i = 0; i < mas.length; i += 2) {
            if ((x * x) == ((mas[i] * mas[i]) + (mas[i + 1] * mas[i + 1])))
                count++;
        }
        int[] arr = new int[count * 2];
        int k = 0;
        for (int i = 0; i < mas.length; i += 2) {
            if ((x * x) == ((mas[i] * mas[i]) + (mas[i + 1] * mas[i + 1]))) {
                arr[k] = mas[i];
                arr[k + 1] = mas[i + 1];
                k += 2;
            }
        }
        System.out.println(count + " точек на окружности:");
        return arr;
    }

    public static void test1967() {
        n = masSize();
        while (n % 2 == 1) {
            System.out.println("Введи четный размер массива!");
            n = masSize();
        }
        int[] mas = new int[n];
        min = 0;
        max = 9;
        masRandom(mas, min, max);
        masInputKoord(mas);
        System.out.println(Arrays.toString(result1967(mas)));
    }
    public static int[] result1967(int[] mas) {
        int[] arr = new int[2];
        int k = 0, max = 0;
        double maxR = 0;
        for (int i = 0; i < mas.length; i += 2) {
            maxR = (Math.sqrt((mas[i] * mas[i]) + (mas[i + 1] * mas[i + 1])));
            if (maxR > max) {
                max = (int) maxR;
                arr[k] = mas[i];
                arr[k + 1] = mas[i + 1];
            }
        }
        return arr;
    }

    public static void test1966() {
        n = masSize();
        int[] mas = new int[n];
        masInputValues(mas, n);
        masInput(mas);
        System.out.println(result1966(mas));
    }
    public static boolean result1966(int[] mas) {
        boolean flag = false;
        for(int i = 0; i < mas.length; i++) {
            int count = 0;
            for (int j = i + 1; j < mas.length; j++) {
                count++;
                if (mas[i] == mas[j] && mas[i] == count - 1) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void test1965() {
        n = masSize();
        int[] mas = new int[n];
        masInputValues(mas, n);
        masInput(mas);
        System.out.println(result1965(mas));
    }
    public static boolean result1965(int[] mas) {
        boolean flag = false;
        for (int i = 0; i < mas.length; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j1 = 0; j1 < i; j1++)
                sum1 += mas[j1];
            for (int j2 = i + 1; j2 < mas.length; j2++)
                sum2 += mas[j2];
            if (sum1 == sum2) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void test1964() {
        n = masSize();
        int[] mas = new int[n];
        min = 1;
        max = 9;
        masRandom(mas, min, max);
        masInput(mas);
        int[] arr = result1964(mas);
        masInput(arr);
    }
    public static int[] result1964(int[] mas) {
        int[] arr = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++)
                sum += mas[j];
            arr[i] = sum;
        }
        return arr;
    }

    public static void test1963() {
        n = masSize();
        int[] mas = new int[n];
        k = inputOne();
        masRandom(mas, min, max);
        masInput(mas);
        System.out.println(result1963(mas, k));
    }
    public static int result1963(int[] mas, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += mas[i];
        return sum;
    }

    public static void test1962() {
        n = masSize();
        int[] mas1 = new int[n];
        int[] mas2 = new int[n];
        masInputValues(mas1, n);
        masInputValues(mas2, n);
        masInput(mas1);
        masInput(mas2);
        int[] arr = result1962(mas1, mas2);
        masInput(arr);
    }
    public static int[] result1962(int[] mas1, int[] mas2) {
        int count = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == mas2[i])
                count++;
        }
        int[] arr = new int[count];
        int j = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == mas2[i]) {
                arr[j] = mas1[i];
                j++;
            }
        }
        return arr;
    }

    public static void test1961() {
        n = masSize();
        int[] mas = new int[n];
        masInputValues(mas, n);
        masInput(mas);
        int[] arr = result1961(mas);
        masInput(arr);
    }
    public static int[] result1961(int[] mas) {
        int count = mas.length;
        for (int i = 0; i < mas.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] == mas[j])
                    flag = true;
            }
            if (flag)
                count--;
        }
        System.out.println(count);
        int[] arr = new int[count];
        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (mas[i] == arr[j])
                    flag = true;
            }
            if (!flag) {
                arr[k] = mas[i];
                k++;
            }
        }
        return arr;
    }

    public static void test1960() {
        n = masSize();
        int[] mas1 = new int[n];
        x = masSize();
        int[] mas2 = new int[x];
        masInputValues(mas1, n);
        masInputValues(mas2, x);
        masInput(mas1);
        masInput(mas2);
        int[] arr = result1960(mas1, mas2);
        masInput(arr);
    }
    public static int[] result1960(int[] mas1, int[] mas2) {
        int count = 0;
        for (int i = 0; i < mas1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < mas2.length; j++) {
                if (mas1[i] == mas2[j])
                    flag = true;
            }
            if (flag == false)
                count++;
        }
        int[] arr = new int[count];
        int k = 0;
        for (int i = 0; i < mas1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < mas2.length; j++) {
                if (mas1[i] == mas2[j])
                    flag = true;
            }
            if (flag == false) {
                arr[k] = mas1[i];
                k++;
            }
        }
        return arr;
    }

    public static void test1959() {
        n = masSize();
        int[] mas1 = new int[n];
        x = masSize();
        int[] mas2 = new int[x];
        masInputValues(mas1, n);
        masInputValues(mas2, x);
        masInput(mas1);
        masInput(mas2);
        int[] arr = result1959(mas1, mas2);
        masInput(arr);
    }
    public static int[] result1959(int[] mas1, int[] mas2) {
        int count = 0;
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                if (mas1[i] == mas2[j])
                    count++;
            }
        }
        int[] arr = new int[count];
        int k = 0;
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                if (mas1[i] == mas2[j]) {
                    arr[k] = mas1[i];
                    k++;
                }
            }
        }
        return arr;
    }

    public static void test1958() {
        n = masSize();
        int[] mas1 = new int[n];
        x = masSize();
        int[] mas2 = new int[x];
        masInputValues(mas1, n);
        masInputValues(mas2, x);
        masInput(mas1);
        masInput(mas2);
        System.out.println(result1958(mas1, mas2));
    }
    public static int result1958(int[] mas1, int[] mas2) {
        int count = 0;
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                if (mas1[i] == mas2[j])
                    count++;
            }
        }
        return count;
    }

    public static void test1957() {
        n = masSize();
        int[] mas = new int[n];
        x = inputOne();
        masRandom(mas, min, max);
        masInput(mas);
        int[] arr = result1957(mas, x);
        masInput(arr);
    }
    public static int[] result1957(int[] mas, int x) {
        int count = 0;
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] < x)
                count++;
        }
        int[] arr = new int[count];
        int j = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < x) {
                arr[j] = mas[i];
                j++;
            }
        }
        return arr;
    }

    public static void test1956() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        int[] arr = result1956(mas);
        masInput(arr);
    }
    public static int[] result1956(int[] mas) {
        int count = 0;
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] % 2 == 0)
                count++;
        }
        int[] arr = new int[count];
        int k = 0;
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] % 2 == 0) {
                arr[k] = mas[i];
                k++;
            }
        }
        return arr;
    }

    public static void test1955() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        int[] arr = result1955(mas);
        masInput(arr);
    }
    public static int[] result1955(int[] mas) {
        int[] arr = new int[mas.length / 2];
        int j = 0;
        for (int i = 1; i < mas.length; i += 2) {
            arr[j] = mas[i];
            j++;
        }
        return arr;
    }

    public static void test1954() {
        n = masSize();
        int[] mas = new int[n];
        min = -3;
        max = 3;
        masRandom(mas, min, max);
        masInput(mas);
        int[] arr = result1954(mas);
        masInput(arr);
    }
    public static int[] result1954(int[] mas) {
        int[] arr = new int[mas.length];
        int count = 0;
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] > 0) {
                arr[count] = mas[i];
                count++;
            }
        }
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] == 0) {
                arr[count] = mas[i];
                count++;
            }
        }
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] < 0) {
                arr[count] = mas[i];
                count++;
            }
        }
        return arr;
    }

    public static void test1953() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        int[] arr = result1953(mas);
        masInput(arr);
    }
    public static int[] result1953(int[] mas) {
        int[] arr = new int[mas.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (mas[i] % 2 == 0) {
                arr[count] = mas[i];
                count++;
            }
        }
        for(int j = 0; j < arr.length; j++) {
            if(mas[j] % 2 != 0) {
                arr[count] = mas[j];
                count++;
            }
        }
        return arr;
    }

    public static void test1952() {
        n = masSize();
        int[] mas1 = new int[n];
        x = masSize();
        int[] mas2 = new int[x];
        min = 1;
        max = 5;
        masRandom(mas1, min, max);
        masRandom(mas2, min, max);
        masInput(mas1);
        masInput(mas2);
//        int[] arr = result1952(mas1, mas2);
        int[] arr = result1952replay(mas1, mas2);
        masInput(arr);
    }
    public static int[] result1952replay(int[] mas1, int[] mas2) {
        int[] arr = new int[mas1.length + mas1.length * mas2.length];
        int k = 0;
        for (int i = 0; i < mas1.length; i++) {
            arr[k] = mas1[i];
            k++;
            for (int j = 0; j < mas2.length; j++) {
                arr[k] = mas2[j];
                k++;
            }
        }
        return arr;
    }
    public static int[] result1952(int[] mas1, int[] mas2) {
        int[] arr = new int[mas1.length + mas1.length * mas2.length];
        int k = 0;
        for (int i = 0; i < mas1.length; i++) {
            arr[k] = mas1[i];
            k++;
            for (int j = 0; j < mas2.length; j++) {
                arr[k] = mas2[j];
                k++;
            }
        }
        return arr;
    }

    public static void test1951() {
        n = masSize();
        int[] mas1 = new int[n];
        int[] mas2 = new int[n];
        min = 1;
        max = 5;
        masRandom(mas1, min, max);
        masRandom(mas2, min, max);
        masInput(mas1);
        masInput(mas2);
//        int[] arr = result1951(mas1, mas2);
        int[] arr = result1951replay(mas1, mas2);
        masInput(arr);
    }
    public static int[] result1951replay(int[] mas1, int[] mas2) {
        int[] arr = new int[mas1.length + mas2.length];
        int j = 0;
        for (int i = 0; i < mas1.length; i++) {
            arr[k] = mas1[i];
            arr[k + 1] = mas2[i];
            k += 2;
        }
        return arr;
    }
    public static int[] result1951(int[] mas1, int[] mas2) {
        int j = 0;
        int[] arr = new int[mas1.length + mas2.length];
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = mas1[j];
            arr[i + 1] = mas2[j];
            j++;
        }
        return arr;
    }

    public static void test1950() {
        n = masSize();
        int[] mas1 = new int[n];
        int[] mas2 = new int[n];
        min = 1;
        max = 5;
        masRandom(mas1, min, max);
        masRandom(mas2, min, max);
        masInput(mas1);
        masInput(mas2);
        System.out.println(result1950(mas1, mas2));
    }
    public static int result1950(int[] mas1, int[] mas2) {
        int count = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == mas2[i])
                count++;
        }
        return count;
    }

    public static void test1949() {
        n = masSize();
        int[] mas1 = new int[n];
        x = masSize();
        int[] mas2 = new int[x];
        min = 1;
        max = 5;
        masInputValues(mas1, n);
        masInputValues(mas2, x);
//        masRandom(mas2, min, max);
        masInput(mas1);
        masInput(mas2);
        result1949(mas1, mas2);
    }
    public static void result1949(int[] mas1, int[] mas2) {
        int count = 0, countFlag = 0, j = 0;
        boolean flag = false;
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] == mas1[j]) {
                j++;
                count++;
                if (count == mas1.length) {
                    j = 0;
                    count = 0;
                    flag = true;
                    countFlag++;
                    }
            }
            else {
                count = 0;
                j = 0;
            }
        }
        if (flag == true)
            System.out.println("Первый массив является подмассивом второго массива " + countFlag + " раз(а)");
        else
            System.out.println("Нет");
    }

    public static void test1948() {
        n = masSize();
        int[] mas =  new int[n];
        int[] arr = new int[n];
        masInputValues(mas, n);
        masInputValues(arr, n);
        masInput(mas);
        masInput(arr);
        System.out.println(result1948(mas, arr));
    }
    public static boolean result1948(int[] mas, int[] arr) {
        for (int i = 0; i < mas.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (mas[i] == arr[j])
                    flag = true;
            }
            if (flag == false)
                return false;
        }
        return true;
    }

    public static void test1947() {
        n = masSize();
        int[] mas = new int[n];
        int[] arr = new int[n];
        masInputValues(mas, n);
        masInputValues(arr, n);
        masInput(mas);
        masInput(arr);
        result1947(mas, arr);
    }
    public static void result1947(int[] mas, int[] arr) {
        boolean flag = true;
        int i = 0;
        while (i < mas.length && flag) {
            flag = (mas[i] == arr[i]);
            i++;
        }
        System.out.println(flag);
    }

    public static void test1946() {
        n = masSize();
        int[] mas = new int[n];
        x = inputOne();
        masRandom(mas, min, max);
        masInput(mas);
        result1946replay(mas, x);
        masInput(mas);
    }
    public static void result1946replay(int[] mas, int x) {
        if (x < 0) {
            x *= -1;
            for(int j = 0; j < x; j++) {
                y = mas[0];
                for (int i = 1; i < mas.length; i++)
                    mas[i - 1] = mas[i];
                mas[mas.length - 1] = y;
            }
        }
        else  if (x > 0) {
            for (int j = 0; j < x; j++) {
                y = mas[mas.length - 1];
                for (int i = mas.length - 1; i > 0; i--)
                    mas[i] = mas[i - 1];
                mas[0] = y;
            }
        }
        else {
            System.out.println("x = 0, сдвиг не производится");
            return;
        }
    }
    public static void result1946(int[] mas, int x) {
        if (x < 0) {
            x *= -1;
            for (int i = 0; i < x; i++) {
                y = mas[0];
                for (int j = 1; j < mas.length; j++)
                    mas[j - 1] = mas[j];
                mas[mas.length - 1] = y;
            }
        }
        else if (x > 0) {
            for (int i = 0; i < x; i++) {
                y = mas[mas.length - 1];
                for (int j = mas.length - 1; j > 0 ; j--)
                    mas[j] = mas[j - 1];
                mas[0] = y;
            }
        }
        else
            return;
    }

    public static void test1945() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        result1945(mas);
        masInput(mas);
    }
    public static void result1945(int[] mas) {
        x = mas[mas.length - 1];
        for (int i = mas.length - 1; i > 0 ; i--)
            mas[i] = mas[i - 1];
        mas[0] = x;
    }

    public static void test1944() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        result1944(mas);
        masInput(mas);
    }
    public static void result1944(int[] mas) {
        x = mas[0];
        for (int i = 1; i < mas.length; i++)
            mas[i - 1] = mas[i];
        mas[mas.length - 1] = x;
    }

    public static void test1942() {
        n = masSize();
        int[] mas = new int[n];
        x = masSize();
        int[] arr = new int[x];
        masRandom(mas, min, max);
        masRandom(arr, min, max);
        masInput(mas);
        masInput(arr);
        sortMas(mas);
        sortMas(arr);
        int[] array = result1942replay(mas, arr);
        masInput(array);
        sortMas(array);
        masInput(array);
    }
    public static int[] result1942replay(int[] mas, int[] arr) {
        int[] array = new int[mas.length + arr.length];
        for (int i = 0; i < mas.length; i++)
            array[i] = mas[i];
        for (int i = mas.length; i < array.length; i++)
            array[i] = arr[i - mas.length];
        return array;
    }
    public static int[] result1942(int[] mas, int[] arr) {
        int[] array = new int[mas.length + arr.length];
        for (int i = 0; i < mas.length; i++)
            array[i] = mas[i];
        for (int i = mas.length; i < array.length; i++)
            array[i] = arr[i - mas.length];
        return array;
    }

    public static void test1941() {
        n = masSize();
        int[] mas = new int[n];
        int[] arr = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        System.out.println(Arrays.toString(result1941replay(mas)));
    }
    public static int[] result1941replay(int[] mas) {
        int[] arr = new int[mas.length];
        int count = 0;
        if (mas.length % 2 != 0) {
            count = 1;
            arr[mas.length / 2] = mas[mas.length / 2];
        }
        for (int i = 0; i < mas.length / 2; i++) {
            arr[i] = mas[mas.length / 2 + i + count];
            arr[mas.length / 2 + i + count] = mas[i];
        }
        return arr;
    }
    public static int[] result1941(int[] mas) {
        int[] arr = new int[mas.length];
        int count = 0;
        if (mas.length % 2 != 0) {
            count = 1;
            arr[mas.length / 2] = mas[mas.length / 2];
        }
        for (int i = 0; i < mas.length / 2; i++) {
            arr[i] = mas[(mas.length / 2) + i + count];
            arr[(mas.length / 2) + i + count] = mas[i];
        }
        return arr;
    }

    public static void test1940() {
        n = masSize();
        int[] mas = new int[n];
        int[] arr = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        System.out.println(Arrays.toString(result1940(mas)));
    }
    public static int[] result1940replay(int[] mas) {
        int[] arr = new int[mas.length];
        for(int i = 0; i < mas.length; i++) {
            arr[mas.length - i - 1] = mas[i];
        }
        return arr;
    }
    public static int[] result1940(int[] mas) {
        int[] arr = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            arr[i] = mas[mas.length - 1 - i];
        }
        return arr;
    }

    public static void test1939() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        System.out.println(Arrays.toString(result1939(mas)));
    }
    public static int[] result1939(int[] mas) {
        for (int i = 0; i < mas.length / 2; i++) {
            x = mas[i];
            mas[i] = mas[mas.length - 1 - i];
            mas[mas.length - 1 - i] = x;
        }
        return mas;
    }

    public static void test1938() {
        n = masSize();
        int[] mas = new int[n];
        min = 0;
        max = 10;
        masRandom(mas, min, max);
        masInput(mas);
        System.out.print(Arrays.toString(result1938replay(mas)));

    }
    public static int[] result1938replay(int[] mas) {
        int count = 0, max =0;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
                count = 1;
            }
            else if (max == mas[i])
                count++;
        }
        int[] arr = new int[count];
        int j = 0;
        for (int i = 0; i < mas.length; i++) {
            if (max == mas[i]) {
                arr[j] = i + 1;
                j++;
            }
        }
        return arr;
    }
    public static int[] result1938(int[] mas) {
        max = 0;
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
                count = 1;
            }
            else if (max == mas[i])
                count++;
        }
        int arrcount = 0;
        int[] arr = new int[count];
        for (int i = 0; i < mas.length; i++) {
            if (max == mas[i]) {
                arr[arrcount] = i + 1;
                arrcount++;
            }
        }
        return arr;
    }

    public static void test1937() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        System.out.println(result1937(mas));
    }
    public static int result1937(int[] mas) {
        max = 0;
        x = 0;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
                x = i + 1;
            }
        }
        return x;
    }

    public static void test1936() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        System.out.println(result1936(mas));
    }
    public static int result1936(int[] mas) {
        max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i])
                max = mas[i];
        }
        return max;
    }

    public static void test1935() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        System.out.println(result1935(mas));
    }
    public static boolean result1935(int[] mas) {
        int sr = 0, countPlus = 0, countMinus = 0;
        for (int i = 0; i < mas.length; i++)
            sr += mas[i];
        sr /= mas.length;
        for (int i: mas) {
            if (i < sr)
                countMinus++;
            if (i > sr)
                countPlus++;
        }
        System.out.println("Среднее арифметическое= " + sr);
        System.out.println("Меньше среднего - " + countMinus + " , больше среднего - " + countPlus);
        boolean flag;
        if (countMinus == countPlus)
            flag = true;
        else
            flag = false;
        return flag;
    }

    public static void test1934() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        System.out.println(result1934(mas));
    }
    public static int result1934(int[] mas) {
        int sum = 0, count = 0;
        for(int i = 0; i < mas.length; i++)
            sum += mas[i];
        sum /= mas.length;
        for (int i:mas) {
            if (sum < i)
                count++;
        }
        System.out.println("Среднее арифметческое= " + sum);
        return count;
    }

    public static void test1933() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min, max);
        masInput(mas);
        result = sumtest1933(mas);
        System.out.println(result);
    }
    public static int sumtest1933(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++)
            sum += mas[i];
        return sum;
    }

    public static void test1932() {
        n = masSize();
        int[] mas = new int[n];
        x = inputOne();
        y = inputTwo();
        masInputValues(mas, n);
        masInput(mas);
        System.out.println(if_found1932(mas, x, y));
    }
    public static boolean if_found1932(int[] mas, int x, int y) {
        boolean flag = true;
        min = Math.min(x, y);
        max = Math.max(x, y);
        int i = min;
        while (i < max && flag) {
            flag = (mas[i] < mas[i - 1]);
            i++;
        }
        return flag;
    }

    public static void test1931() {
        n = masSize();
        int[] mas = new int[n];
        k = cellMas();
        masInputValues(mas, n);
        masInput(mas);
        System.out.println(if_found1931(mas, k));
    }
    public static boolean if_found1931(int[] mas, int k) {
        boolean flag = true;
        int i = 1;
        while (i < k && flag) {
            flag = (mas[i] < mas[i - 1]);
            i++;
        }
        return flag;
    }

    public static void test1930() {
        n = masSize();
        int[] mas = new int[n];
        masRandom(mas, min , max);
        masInput(mas);
        System.out.println(if_found1930(mas));
    }
    public static boolean if_found1930(int[] mas) {
        boolean flag = true;
        int i = 1;
        while (i < mas.length && flag) {
            flag = (mas[i] > mas[i - 1]);
            i++;
        }
        return flag;
    }

    public static void test1929() {
        n = masSize();
        int[] mas = new int[n];
        x = inputOne();
        y = inputTwo();
        masRandom(mas, min , max);
        masInput(mas);
        System.out.println(if_found1929(mas, x, y));
    }
    public static int if_found1929(int[] mas, int x, int y) {
        int sum = 0;
        int min, max;
        min = Math.min(x, y);
        max = Math.max(x, y);
        for (int i = min - 1; i < max; i++)
            sum += mas[i];
        return sum;
    }

    public static void MoreArray() {
        int [][] mas = new int[5][3];
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d",mas[i][j]);
            }
        }
    }

    public static void test1928() {
        n = masSize();
        int[] mas = new int[n];
        k = cellMas();
        masRandom(mas, min , max);
        masInput(mas);
        System.out.println("Сумма значений от " + k + " элемента массива до " + n + " = " + if_found1928(mas, k));
    }
    public static int if_found1928(int[] mas, int k) {
        int sum = 0;
        for (int i = k - 1; i < mas.length; i++)
            sum += mas[i];
        return sum;
    }

    public static void test1927() {
        n = masSize();
        int[] mas = new int[n];
        k = cellMas();
        masRandom(mas, min , max);
        masInput(mas);
        System.out.println("Сумма значений от 1 элемента массива до " + k + " = " + if_found1927(mas, k));
    }
    public static int if_found1927(int[] mas,int k) {
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += mas[i];
        return sum;
    }

    public static void test1926 () {
        n = masSize();
        int[] mas = new int[n];
        x = inputOne();
        min = 1;
        max = 5;
        masRandom(mas, min, max);
        masInput(mas);
        System.out.println(if_found1926(mas, x));
    }
    public static boolean if_found1926 ( int[] mas, int x){
        boolean flag = false;
        int i = 0;
        while (i < mas.length && !flag) {
            int j = 0;
            while (j < i && !flag) {
                flag = (mas[j] * mas[i] == x);
                j++;
            }
            i++;
        }
        return flag;
    }

    public static void masInput(int[] mas) {
        for (int element: mas)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void masInputKoord(int[] mas) {
        for (int i = 0; i < mas.length; i += 2)
            System.out.print("[" + mas[i] + "," + mas[i + 1] + "]");
        System.out.println();
    }

    public static void masInputValues(int[] mas, int n) {
        System.out.println("Введите " + n + " элемента(ов) массива:");
        for (int i = 0; i < mas.length; i++)
            mas[i] = num.nextInt();
        System.out.println();
    }

    public static void masRandom(int[] mas, int min, int max) {
        for (int i = 0; i < mas.length; i++)
            mas[i] = (int) (Math.random() * ((max - min) + 1) + min);
        System.out.println();
    }

    public static void sortMas (int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            int minValue = mas[i];
            int minIndex = i;
            for(int j = i + 1; j < mas.length; j++) {
                if (mas[j] < minValue) {
                    minValue = mas[j];
                    minIndex = j;
                }
            }
            int  tmp = mas[i];
            mas[i] = minValue;
            mas[minIndex] = tmp;
        }
    }

    public static int masSize() {
        int n;
        System.out.print("Введите размер массива: ");
        n = num.nextInt();
        return n;
    }

    public static int inputOne() {
        int x;
        System.out.print("Введите число Х: ");
        x = num.nextInt();
        return x;
    }

    public static int inputTwo() {
        int y;
        System.out.print("Введите число Y: ");
        y = num.nextInt();
        return y;
    }

    public static int cellMas() {
        int k;
        System.out.print("Введите номер ячейки массива: ");
        k = num.nextInt();
        return k;

    }

    public static void anonceMas() {
        n = masSize();
        int[] mas = new int[n];
    }

    public static void outputFromN1ToN2(int n1, int n2) {
        for (int i = n1; i <= n2; i++)
            System.out.printf("%4d", i);
        System.out.println();
    }

    public static void outputPrintf(int[] mas) {
        for (int i = 0; i < mas.length; i++)
            System.out.printf("%4d", mas[i]);
        System.out.println();
    }

    public static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }

    public static void outputMasTwo (int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[0].length; j++)
                System.out.printf("%4d", mas[i][j]);
        }
        System.out.println();
    }

    public void random(int[][] mas, int min, int max) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                mas[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
        }
    }
}
