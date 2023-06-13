package codigopostal;

import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Este programa identifica la región geográfica de acuerdo con el código
 * postal.
 *
 */

public class CodigoPostal {
    public void Postal(){
        Scanner stdIn = new Scanner(System.in);
        String cp; //c.p. introducido por el usuario
        System.out.print("Introduzca código postal: ");
        cp = stdIn.nextLine();
        switch (cp.charAt(0)) {
            case '0':
                System.out.println(cp + " esta en polanco.");
                break;
            case '2':
                System.out.println(cp + " está en Lerma.");
                break;
            case '3':
                System.out.println(cp + " está en Toluca.");
                break;
            case '4':
                System.out.println(cp + " está en tultepec.");
                break;
            case '5':
                System.out.println(cp + " está en San Mateo.");
                break;
            case '6':
                System.out.println(
                        cp + " está en el Cuajimalpa.");
                break;
            case '7':
                System.out.println(cp + " está en la navidad.");
                break;
            case '8':
                System.out.println(cp + " está en veracruz.");
                break;
            case '9':
                System.out.println(cp + " está en el Cholula.");
                break;
            default:
                System.out.println(cp + " es un código postal inválido.");
        
        } // fin del switch
    } // fin del main
 // fin de la clase CodigoPostal
public static void main(String[] args) {
CodigoPostal codigo = new CodigoPostal();
codigo.Postal();
}
}
