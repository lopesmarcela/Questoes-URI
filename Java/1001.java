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
 
        int A = 0;
        int B = 0;
        int X = 0;
        
        Scanner s = new Scanner (System.in);
        A = s.nextInt();
        B = s.nextInt();
        X = (A + B);
        System.out.println("X = "+X);
 
    }
 
}
