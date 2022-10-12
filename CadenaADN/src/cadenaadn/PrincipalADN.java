package cadenaadn;
import java.util.Scanner;

public class PrincipalADN {
    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese una secuencia de ADN: ");
        String adnString=in.nextLine().toUpperCase();
        System.out.println("Cadena de ADN: "+ adnString);
        adnDoubleStrand adnD = new adnDoubleStrand();
        System.out.println("One by one");

        for(int i=0; i<adnString.length(); i++){
            System.out.println(adnString.charAt(i));
            adnD.inserAtTail(adnString.charAt(i));
        }
        System.out.println("");
    
    } 
}
