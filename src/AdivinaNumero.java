import java.util.Scanner;

public class AdivinaNumero {

        private Scanner entrada = new Scanner(System.in);
        Boolean juegoActivo = true;

        public void jugar(){

            String nombreJugador = obtenerNombreJugador();

            while (juegoActivo) {
                int intentos = 1;
                int numeroAleatorio = obtenerNumeroAleatorio(1, 100);
                int numeroUsuario = obtenerNumeroJugador(nombreJugador);
                do {
                    mensaje(numeroUsuario, numeroAleatorio);
                    intentos++;
                    numeroUsuario = obtenerNumeroJugador(nombreJugador);;
                } while (numeroUsuario < numeroAleatorio);
                System.out.printf("Encontraste el numero en %d intentos.", intentos);

                juegoActivo = false;
            }
        }

        private int obtenerNumeroAleatorio(int min, int max){
            return min + (int) (Math.random() * ((max - min) + 1));
        }
        private String obtenerNombreJugador(){
            System.out.println("escribe tu nombre:");
            String nombre = entrada.nextLine();
            return nombre;
        }

        private int obtenerNumeroJugador(String nombre){
            System.out.printf("%s escribe un numero entre 1 y 100: ", nombre);
            int numero = entrada.nextInt();
            return numero;
        }

        private void mensaje(int numeroIngresado, int numeroGenerado){

                if (numeroIngresado < numeroGenerado) {
                    System.out.println("el numero que introduciste es menor");
                } else if (numeroIngresado > numeroGenerado) {
                    System.out.println("el numero que introduciste es mayor");
                }


        }
}
