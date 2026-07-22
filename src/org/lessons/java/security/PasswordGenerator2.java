package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator2 {
    public static void main(String[] args) {
        String nome;
        String cognome;
        String colore;
        int giorno;
        int mese;
        int anno;

        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        nome = in.next();

        System.out.print("Inserisci il cognome: ");
        cognome = in.next();

        System.out.print("Inserisci il tuo colore preferito: ");
        colore = in.next();
        
        System.out.print("Inserisci il tuo giorno di nascita: ");
        giorno = in.nextInt();

        System.out.print("Inserisci il tuo mese di nascita: ");
        mese = in.nextInt();

        System.out.print("Inserisci il tuo anno di nascita:  ");
        anno = in.nextInt();

        int sommaNascita = giorno + mese + anno;

        System.out.println("La password è: " + nome + "-" + cognome + "-" + colore + "-" + sommaNascita);

        in.close();
    }
}
