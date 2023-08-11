package lab4p1_jeffrimidence;

import java.util.Scanner;

/**
 *
 * @author sabdi
 */
public class Lab4P1_JeffriMidence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner arroz = new Scanner(System.in);
        boolean Sal = true;
        while (Sal) {//inicio del while
            System.out.println("\nBIENVENIDO AL SISTEMA DE LAB ");
            System.out.println("1- Cadena Fantasma ");
            System.out.println("2- Contador ");
            System.out.println("3- Palabra mas larga ");
            System.out.println("4- Salir del programa ");
            System.out.print("Ingrese una opcion : ");
            int op = arroz.nextInt();

            switch (op) {//inicio del switch
                case 1:
                    System.out.print("Ingrese una palabra:");
                    String texto = arroz.nextLine();
                    texto = arroz.nextLine();
                    System.out.println(texto);
                    for (int i = 0; i <= texto.length() - 1; i++) {//inicio del for
                        char caracter = texto.charAt(i);

                        if (caracter == 'A' || caracter == 'a' || caracter == 'E' || caracter == 'e' || caracter == 'i' || caracter == 'I' || caracter == 'O' || caracter == 'o' || caracter == 'u' || caracter == 'U') {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        //System.out.print("-> VOCAL");

                    }//Fin del for

                    break;
                case 2:
                    System.out.print("Ingrese cadena: ");
                    String cadena1 = arroz.nextLine();

                    System.out.print("Ingrese c especial: ");
                    char c = arroz.next().charAt(0);
                    arroz.nextLine();

                    int voca = 0;
                    int le = 0;
                    int digi = 0;
                    for (int i = 0; i < cadena1.length(); i++) {
                        char vocal = cadena1.charAt(i);
                        if (vocal == 'a' || vocal == 'A' || vocal == 'e' || vocal == 'E' || vocal == 'i' || vocal == 'I' || vocal == 'o' || vocal == 'O' || vocal == 'u' || vocal == 'U') {
                            voca = voca + 1;
                        } else if (vocal == c || Character.toUpperCase(vocal) == Character.toUpperCase(c)) {
                            le = le + 1;
                        } else if (Character.isDigit(vocal)) {
                            digi = digi + 1;
                        }
                    }
                    System.out.println("");
                    System.out.print("Cantidad de vocales:" + voca + "\n");
                    System.out.print("Cantidad de dígitos:" + digi + "\n");
                    System.out.println("Cantidad de '" + c + "':" + le + "\n");
                    break;
                case 3:
                    String caden_ma = "";
                    String caden_nue = "";
                    System.out.print("Ingrese cadena:");
                    String cadena2 = arroz.nextLine();
                    for (int i = 0; i < cadena2.length(); i++) {
                        char C = cadena2.charAt(i);
                        if (C != ' ') {
                            caden_nue += C;
                        } else {
                            if (caden_nue.length() > caden_nue.length()) {
                                caden_nue = caden_nue;
                            }
                            caden_nue = "";
                        }
                        if (caden_nue.length() > caden_ma.length()) {
                            caden_ma = caden_nue;
                        }
                    }
                    System.out.println("Palabra larga: " + caden_ma.toUpperCase());
                    System.out.println("con " + caden_ma.length() + " caracteres");
                    break;
                case 4:
                    System.out.println("Muchas gracias por utiliazar el programa");
                    Sal = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida por favor");
            }//fin del switch
        }//fin del while
    }//fin del main    
}//fin de la clase
