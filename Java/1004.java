import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int A,B,PROD;
        Scanner s = new Scanner (System.in);
        A = s.nextInt();
        B = s.nextInt();
        
        PROD = (A * B);
        System.out.println("PROD = "+ PROD);
 
    }
 
}
