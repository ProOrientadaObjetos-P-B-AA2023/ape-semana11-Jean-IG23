package paquete2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutor {
    public List<Personaje> personajes;
    public Scanner scanner;

    public Ejecutor() {
        personajes = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciarJuego() {
        boolean salir = false;

        while (!salir) {
            System.out.println("---- Menú ----");
            System.out.println("1. Crear personaje");
            System.out.println("2. Ver características de cada personaje");
            System.out.println("3. Iniciar una batalla");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearPersonaje();
                    break;
                case 2:
                    verCaracteristicas();
                    break;
                case 3:
                    iniciarBatalla();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        }
        System.out.println("¡Gracias por jugar!");
    }

    public void crearPersonaje() {
        System.out.println("---- Crear personaje ----");
        System.out.println("Seleccione el tipo de personaje:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.print("Ingrese el número de opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del personaje: ");
        String nombre = scanner.nextLine();

        Personaje personaje;
        switch (opcion) {
            case 1:
                personaje = new Guerrero(nombre, 0);
                break;
            case 2:
                personaje = new Mago(nombre, 0);
                break;
            case 3:
                personaje = new Arquero(nombre, 0);
                break;
            default:
                System.out.println("Opción inválida. No se creó ningún personaje.");
                return;
        }

        personajes.add(personaje);
        System.out.println("Personaje creado exitosamente.");
    }

    public void verCaracteristicas() {
        System.out.println("---- Características de los personajes ----");
        if (personajes.isEmpty()) {
            System.out.println("No hay personajes creados.");
            return;
        }

        for (Personaje personaje : personajes) {
            System.out.println(personaje.toString());
        }
    }

    public void iniciarBatalla() {
        System.out.println("---- Iniciar batalla ----");
        if (personajes.size() < 2) {
            System.out.println("No hay suficientes personajes para iniciar una batalla.");
            return;
        }

        System.out.println("Seleccione el personaje atacante:");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
        }
        System.out.print("Ingrese el número de opción: ");
        int opcionAtacante = scanner.nextInt();
        scanner.nextLine();
        opcionAtacante--;

        System.out.println("Seleccione el personaje defensor:");
        for (int i = 0; i < personajes.size(); i++) {
            if (i != opcionAtacante) {
                System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
            }
        }
        System.out.print("Ingrese el número de opción: ");
        int opcionDefensor = scanner.nextInt();
        scanner.nextLine();
        opcionDefensor--;

        Personaje atacante = personajes.get(opcionAtacante);
        Personaje defensor = personajes.get(opcionDefensor);

        boolean batallaTerminada = false;
        while (!batallaTerminada) {
            System.out.println("---- Turno de " + atacante.getNombre() + " ----");
            System.out.println("1. Atacar");
            System.out.println("2. Defenderse");
            System.out.print("Ingrese una opción: ");
            int opcionTurno = scanner.nextInt();
            scanner.nextLine();

            switch (opcionTurno) {
                case 1:
                    atacante.atacar();
                    break;
                case 2:
                    atacante.defender();
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    continue;
            }

            System.out.println(atacante.getNombre() + ": Vida restante = " + atacante.getVida());
            System.out.println(defensor.getNombre() + ": Vida restante = " + defensor.getVida());

            if (atacante.getVida() <= 0 || defensor.getVida() <= 0) {
                batallaTerminada = true;
            } else {
                Personaje temp = atacante;
                atacante = defensor;
                defensor = temp;
            }
        }

        System.out.println("Batalla finalizada.");
    }

    public static void main(String[] args) {
        Ejecutor ejecutor = new Ejecutor();
        ejecutor.iniciarJuego();
    }
}