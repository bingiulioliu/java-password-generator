package org.lessons.java.security;
public class PasswordGenerator {
    public static void main(String[] args) {
        String nome = "Pinco";
        String cognome = "Pallo";
        String colorePrefe = "magenta";
        int giornoNascita = 12;
        int meseNascita = 5;
        int annoNascita = 1994;
        
        int sommaNascita = giornoNascita + meseNascita + annoNascita;

        System.out.println("La password è: " + nome + "-" + cognome + "-" + colorePrefe + "-" + sommaNascita);
    }
}
