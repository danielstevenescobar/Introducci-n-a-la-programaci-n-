package ejercicio.ejemplo_open_bootcamp;

public class Main {

    public static void main(String[] args) {
        var estacion = "VERANO";

        switch (estacion) {
            case "VERANO":
                System.out.println("es verano");
            break;
                case "INVIERNO":
                System.out.println("es invierno");
            default:
                System.out.println(estacion);
        }
    }
}