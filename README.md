# 🔐 Java Password Generator

Un'applicazione console scritta in Java che genera una password personalizzata basandosi sui dati anagrafici inseriti dall'utente e sulla somma numerica della sua data di nascita.

---

## 📋 Consegna e Requisiti del Progetto

- [x] **Nome Progetto**: `java-password-generator`
- [x] **Package**: `org.lessons.java.security`
- [x] **Classe Principale**: `PasswordGenerator` (o `PasswordGenerator2`) con metodo `main`
- [x] **Input Utente**: Richiesta di nome, cognome, colore preferito, giorno, mese e anno di nascita (numerici).
- [x] **Calcolo**: Somma aritmetica di `giorno + mese + anno`.
- [x] **Output**: Generazione e stampa della password nel formato:  
  `Nome-Cognome-ColorePreferito-SommaDataNascita`

---

## 💻 Codice Sorgente (`PasswordGenerator.java`)

```java
package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator2 {
    public static void main(String[] args) {
        // --- 1. DICHIARAZIONE VARIABILI ---
        String nome;
        String cognome;
        String colore;
        int giorno;
        int mese;
        int anno;

        // --- 2. INIZIALIZZAZIONE SCANNER PER INPUT DA TASTIERA ---
        Scanner in = new Scanner(System.in);

        // Raccolta dati testuali
        System.out.print("Inserisci il nome: ");
        nome = in.nextLine();

        System.out.print("Inserisci il cognome: ");
        cognome = in.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        colore = in.nextLine();
        
        // Raccolta dati numerici
        System.out.print("Inserisci il tuo giorno di nascita: ");
        giorno = in.nextInt();

        System.out.print("Inserisci il tuo mese di nascita: ");
        mese = in.nextInt();

        System.out.print("Inserisci il tuo anno di nascita: ");
        anno = in.nextInt();

        // --- 3. ELABORAZIONE E CALCOLO ---
        int sommaNascita = giorno + mese + anno;

        // --- 4. CONCATENAZIONE E STAMPA OUTPUT ---
        System.out.println("La password è: " + nome + "-" + cognome + "-" + colore + "-" + sommaNascita);

        // Chiusura dello Scanner
        in.close();
    }
}