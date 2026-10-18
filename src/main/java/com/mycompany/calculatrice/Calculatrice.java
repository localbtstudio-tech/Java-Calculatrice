
package com.mycompany.calculatrice;

import java.util.Scanner;

public class Calculatrice {

    public static int somme(int a, int b) {
        return a + b;
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b, int c) {
        int minimum = a;

        if (b < minimum) {
            minimum = b;
        }

        if (c < minimum) {
            minimum = c;
        }

        return minimum;
    }

    public static int pgcd(int a, int b) {
        
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    public static int min(int[] elements) {
        int minimum = elements[0];

        for (int i = 1; i<elements.length; i++) {
            if (elements[i] < minimum) {
                minimum = elements[i];
            }
        }

        return minimum;
    }
    
     public static int find(int[] elements, int value) {
        for (int i=0; i< elements.length; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
    public static int somme(int[] elements) {
        int s= 0;

        for (int i = 0; i < elements.length; i++) {
            s= s+ elements[i];
        }

        return s;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n===== CALCULATRICE =====");
            System.out.println("1. Addition");
            System.out.println("2. Maximum de deux entiers");
            System.out.println("3. Minimum de deux entiers");
            System.out.println("4. Minimum de trois entiers");
            System.out.println("5. PGCD");
            System.out.println("6. Minimum du tableau");
            System.out.println("7. Rechercher un entier");
            System.out.println("8. Somme du tableau");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            switch (choix) {

                case 1: {
                    System.out.print("Donner a : ");
                    int a = sc.nextInt();

                    System.out.print("Donner b : ");
                    int b = sc.nextInt();

                    System.out.println("Somme = " + somme(a, b));
                    break;
                }

                case 2: {
                    System.out.print("Donner a : ");
                    int a = sc.nextInt();

                    System.out.print("Donner b : ");
                    int b = sc.nextInt();

                    System.out.println("Maximum = " + max(a, b));
                    break;
                }

                case 3: {
                    System.out.print("Donner a : ");
                    int a = sc.nextInt();

                    System.out.print("Donner b : ");
                    int b = sc.nextInt();

                    System.out.println("Minimum = " + min(a, b));
                    break;
                }

                case 4: {
                    System.out.print("Donner a : ");
                    int a = sc.nextInt();

                    System.out.print("Donner b : ");
                    int b = sc.nextInt();

                    System.out.print("Donner c : ");
                    int c = sc.nextInt();

                    System.out.println("Minimum = " + min(a, b, c));
                    break;
                }

                case 5: {
                    System.out.print("Donner a : ");
                    int a = sc.nextInt();

                    System.out.print("Donner b : ");
                    int b = sc.nextInt();

                    System.out.println("PGCD = " + pgcd(a, b));
                    break;
                }

                
                
                case 6: {
                    System.out.print("taille du tableau : ");
                    int n = sc.nextInt();

                    if (n<= 0) {
                        System.out.println("taille invalide !");
                        break;
                    }

                    int[] tab = new int[n];

                    for (int i= 0; i < n; i++) {
                        System.out.print("tab[" +i+ "] = ");
                        tab[i] = sc.nextInt();
                    }

                    System.out.println("Minimum = " + min(tab));
                    break;
                }

                case 7: {
                    System.out.print("taille du tableau : ");
                    int n = sc.nextInt();

                    if (n <= 0) {
                        System.out.println("taille invalide !");
                        break;
                    }

                    int[] tab = new int[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("tab[" +i+ "] = ");
                        tab[i] = sc.nextInt();
                    }

                    System.out.print("valeur a rechercher : ");
                    int value = sc.nextInt();

                    int position =find(tab, value);

                    if (position == -1) {
                        System.out.println("valeur introuvable !");
                    } else {
                        System.out.println("position = " + position);
                    }

                    break;
                }

                case 8: {
                    System.out.print("taille du tableau : ");
                    int n = sc.nextInt();

                    if (n <= 0) {
                        System.out.println("taille invalide !");
                        break;
                    }

                    int[] tab = new int[n];

                    for (int i=0; i<n; i++) {
                        System.out.print("tab[" +i+ "] = ");
                        tab[i]= sc.nextInt();
                    }

                    System.out.println("Somme = " + somme(tab));
                    break;
                }

                
                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        sc.close();
    }
}
