import java.util.Scanner;

/**
Escribe un programa que pida una cadena al usuario y que revise si esta es un palindromo o no y terminar.

Un palindromo significa que los caracteres de la cadena son los mismos al leer hacia adelante o hace atras.
Debes ignorar los espacios, los acentos, puntuaciones y mayusculas y minusculas.

Ejemplos de palindromos:
Amor a Roma
Bob
Somos o no somos
Acaso hubo buhos aca.
Ana, la tacana catalana
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star

El programa debe imprimir true si es un palindromo y false si no lo es.
*/
public class Palindrome {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        boolean flag = false;
        String s = inp.nextLine();
        //s.replace(" ","" );
        String s2 = "";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)) == 'a') {
                s1 = s.replace("á", "a");
                s2 = s2 + s1;
            }
            if ((s.charAt(i)) == 'A') {
                s1 = s.replace("A", "a");
                s2 = s2 + s1;
            }
            if ((s.charAt(i)) == 'B') {
                s1 = s.replace("B", "b");
                s2 = s2 + s1;
            }
            if ((s.charAt(i)) == 'S') {
                s1 = s.replace("S", "s");
                s2 = s2 + s1;
            }
            if ((s.charAt(i)) == 'ú') {
                s1 = s.replace("u", "u");
                s2 = s2 + s1;
            }
            if ((s.charAt(i)) == 'I') {
                s1 = s.replace("I", "i");
                s2 = s2 + s1;
            }
            if ((s.charAt(i)) == '.') {
                s1 += s.replace(".", "");
                s2 = s2 + s1;
            }
            if ((s.charAt(i)) == ',') {
                s1 += s.replace(",", "");
                s2 = s2 + s1;
            }
            
       }
        
        String reverse = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            reverse += s2.charAt(i);
        }
        if (s2.equals(reverse)) {
            flag = true;
        }
        System.out.println(flag);

    }

}
