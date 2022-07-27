import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de propinas\n");
        System.out.println("Cantidad a pagar:");
        double cantiadad = entrada.nextDouble();
        System.out.println("Ingresa el % de la propina");
        int porcentaje = entrada.nextInt();

        if (porcentaje < 15){
            System.out.println("El servicio no fue muy bueno");
        } else {
            System.out.println("El servicio fue bueno");
        }
        double total = (cantiadad * porcentaje) / 100;
        System.out.printf("El total es: %.2f", total);
        DecimalFormat df = new DecimalFormat("$.00");

//        System.out.println("El total es:" + df.format(total));

    }
}
