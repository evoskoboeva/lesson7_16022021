package com.companyCat;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        shortTask1();
        shortTask2();
        shortTask3();
        shortTask4();
        shortTask5();
        shortTask6();

    }

    private static void shortTask6() {
        //69. Дана строка, содержащая латинские буквы и круглые скобки. Если скобки расставлены правильно
        // (т. е. каждой открывающей соответствует одна закрывающая), то вывести число 0.
        // В противном случае вывести или номер позиции,
        // в которой расположена первая ошибочная закрывающая скобка, или, если закрывающих скобок не хватает,
        // число −1.
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку строчные лат буквы и круглые скобки");
        String abc = scanner.nextLine();
        String symbol;
        int count1=0,count2=0;
        for (int i = 0; i < abc.length(); i++) {
            symbol= abc.substring(i,i+1);
            if (symbol.equals("(")) {
                count1++;
            }
            if (symbol.equals(")")) {
                count2++;
            }
            if (count2>count1){
                System.out.println(i);
                return;
            }

        }
        System.out.println((count1 == count2? 0:-1));
    }

    private static void shortTask5() {
        //68. Дана строка, содержащая цифры и строчные латинские буквы. Если буквы в строке упорядочены по алфавиту,
        // то вывести 0; в противном случае вывести номер первого символа строки, нарушающего алфавитный порядок.

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку цифры+строчные лат буквы по алфавиту");
        String abc123 = scanner.nextLine();
        char [] symbol = new char[abc123.length()];
        symbol[0] = abc123.charAt(0);
        for (int i = 1; i < abc123.length(); i++) {
            symbol[i]= abc123.charAt(i) ;
            System.out.println(symbol[i]+" - "+(int)symbol[i]  +" - "+(int)symbol[i-1]);
            if ((int) symbol[i]< (int) symbol[i-1]) {
                System.out.println(symbol[i-1]);
                return;
            }
        }
        System.out.println("0");
    }


    private static void shortTask4() {
        //58. Дана строка, содержащая полное имя файла, т. е. имя диска, список каталогов (путь),
        // собственно имя и расширение. Выделить из этой строки имя файла (без расширения).
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите путь к файлу");
        String nameFileFull = scanner.nextLine();
        int indexStart = nameFileFull.lastIndexOf("\\");
        int indexEnd = nameFileFull.lastIndexOf(".");
        String nameFile = nameFileFull.substring((indexStart+1),(indexEnd));
        System.out.println(nameFile);

    }

    private static void shortTask3() {
        //Дано целое положительное число. Вывести символы, изображающие цифры этого числа (в порядке слева направо).


        Random random = new Random();
        int N = random.nextInt(100000);
        System.out.println(N);

        String stringN = Integer.toString(N);
        for (int i = 0; i < stringN.length(); i++) {
            char letter = stringN.charAt(i);
            System.out.println(letter + " - "+(int)letter);
        }

    }

    private static void shortTask2() {
        // Дано целое число N (32 ≤ N ≤ 126). Вывести символ с кодом, равным N.
        Random random = new Random();
        final int minN = 32;
        final int maxN = 126;
        Scanner scanner = new Scanner(System.in);
        int next;
        do {
            final int N = random.nextInt(maxN - minN + 1)+minN;
            System.out.println("код = " + N + " 'это символ - " + (char) N);
            System.out.println("генерим дальше? 1 - да, 0 - нет");
            next = scanner.nextInt();
        } while (next == 1);
    }

    private static void shortTask1() {
        //Дан символ C. Вывести его код (т. е. номер в кодовой таблице).
        final char letter = 'C';
        System.out.println((int)letter);


    }
}
