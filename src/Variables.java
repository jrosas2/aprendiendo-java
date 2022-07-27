public class Variables {
    public static void main(String[] args) {
        int pizzas = 6;
        int personas = 3;
        int pizzasPorPersonas = pizzas / personas;

        System.out.printf("Si hay %d pizzas y %d personas, a cada una le tocan %d pizzas\n", pizzas, personas, pizzasPorPersonas);

        String auto = "Ferrari";
        double velocidad = 90.3;
        System.out.printf("El auto %s se desplazan a %f km/h\n", auto, velocidad);

        int precioLeche = 14;
        double precioJamon = 35.6;
        int precioHuevo = 23;

        double total = precioLeche + precioJamon + precioHuevo;
        int precioRedondeado = (int) total;

        System.out.printf("el precio del huevo es %d, el precio del jamon es %f, el precio del huevo es %d y todo cuesta %f", precioLeche, precioJamon, precioHuevo, precioRedondeado);
    }
}
