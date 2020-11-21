package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  _______          _                            \n" +
                " |__   __|        | |                           \n" +
                "    | | ___     __| | ___     __ _ _ __  _ __   \n" +
                "    | |/ _ \\   / _` |/ _ \\   / _` | '_ \\| '_ \\  \n" +
                "    | | (_) | | (_| | (_) | | (_| | |_) | |_) | \n" +
                "    |_|\\___/   \\__,_|\\___/   \\__,_| .__/| .__/  \n" +
                "                                  | |   | |     \n" +
                "                                  |_|   |_|     ");
        int tasky = 0;
        int a = 1;
        int b = 1;
        String[] Arr = new String[10];
        while (a == 1) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Ahoj vítej v ToDoApp zde si můžeš napsat 10 poznámek zatím jich máš:");
            System.out.println("# " + (tasky) + "/10");
            System.out.println("-----------------------------------------------------");
            System.out.println("1) Práce s úkoly");
            System.out.println("2) Odejít z applikace");
            a = Integer.parseInt(sc.nextLine());
            if (a == 1) {
                System.out.println("-----------------------------------------------------");
                System.out.println("Zde si vyber číslo podle toho co chceš dělat");
                System.out.println("-----------------------------------------------------");

                while (b != 6) {
                    System.out.println("1) Vytvořit nový text");
                    System.out.println("2) Upravit text");
                    System.out.println("3) Smazat úkol");
                    System.out.println("4) Ukázat kolik mám úkolů");
                    System.out.println("5) Zobrazit úkoly");
                    System.out.println("6) Znovu načíst výběr");
                    b = Integer.parseInt(sc.nextLine());
                    if(b == 1) {
                        if (tasky >= 10) {
                            System.out.println("Můžeš mít max 10 úkolů");
                        } else {
                            System.out.println("> ");
                            String str = sc.nextLine();
                            Arr[tasky] = str;
                            tasky++;
                        }
                    }
                    if (b == 2) {
                        for (int i = 0; i < tasky; i++) {
                            System.out.println("#" + i + " - " + Arr[i]);
                        }
                        System.out.println("> ");
                        int c = sc.nextInt();
                        sc.nextLine();
                        if (c < tasky){
                            System.out.println("Změnit task: " + Arr[c]);
                            System.out.println("> ");
                            String newtask = sc.nextLine();
                            Arr[c] = newtask;
                        }
                    }
                    if (b == 3) {
                        for (int i = 0; i < tasky; i++) {
                            System.out.println("#" + i + " - " + Arr[i]);
                        }
                        System.out.println("> ");
                        int c = sc.nextInt();
                        sc.nextLine();
                        if(c < tasky){
                            System.out.println("Vymazaný task: " + Arr[c]);
                            for (int i = c; i < tasky - 1; i++) {
                                Arr[i] = Arr[i + 1];
                                tasky--;
                            }
                        }
                    }
                    if(b == 4){
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Máš napsáno " + (tasky) + "/10 úkolů");
                        System.out.println("-----------------------------------------------------");
                    }
                    else if (b == 5) {
                        for (int i = 0; i < tasky; i++) {
                            System.out.println("#" + (i + 1) + " - " + Arr[i]);
                            System.out.println("-----------------------------------------------------");
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}