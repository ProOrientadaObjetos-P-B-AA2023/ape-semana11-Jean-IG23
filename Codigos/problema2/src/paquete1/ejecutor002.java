package paquete1;

import java.util.ArrayList;

public class ejecutor002 {
    public static void main(String[] args) {

        String[][] datos001 = {
                {"Niños 01","4.50", "2.00", "1", "1.5"},
                {"Niños 02","5.50", "3.00", "1", "1.5"},
                {"Niños 03","4.50", "2.00", "2", "1.5"},
        };

        String[][] datos002 = {
                {"Econo 001","3.00", "4", "25"},
                {"Econo 002","3.00", "4", "15"},
                {"Econo 003","3.00", "4", "35"}
        };

        String[][] datos003 = {
                {"Dia 001","7.00", "5", "1", "1"},
                {"Dia 002","7.00", "6", "2", "2"},
                {"Dia 003","7.00", "5.5", "3", "1"},
        };

        String[][] datos004 = {
                {"Carta 001","10.10", "6", "1.5", "2", "10"},
                {"Carta 002","10.10", "7", "1.7", "2.1", "5"},
                {"Carta 003","10.10", "8", "1.9", "2.2", "5"},
                {"Carta 004","10.10", "9", "2.5", "2.9", "5"},
        };


        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día,
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado,
        agregar al ArrayList lista*/
        // Inicio de solución
        for (String[] d1 : datos001) {
            String nombrePlato = d1[0];
            double valorMenu = Double.parseDouble(d1[1]);
            double valorInicial = Double.parseDouble(d1[2]);
            double porcionPastel = Double.parseDouble(d1[3]);
            double porcionHelado = Double.parseDouble(d1[4]);

            MenuNinos menuNinos = new MenuNinos(nombrePlato, valorMenu, valorInicial, porcionPastel, porcionHelado);
            lista.add(menuNinos);
        }

        for (String[] d1 : datos002) {
            String nombrePlato = d1[0];
            double valorMenu = Double.parseDouble(d1[1]);
            double valorInicial = Double.parseDouble(d1[2]);
            double descuento = Double.parseDouble(d1[3]);

            MenuEconomico menuEconomico = new MenuEconomico(nombrePlato, valorMenu, valorInicial, descuento);
            lista.add(menuEconomico);
        }

        for (String[] d1 : datos003) {
            String nombrePlato = d1[0];
            double valorMenu = Double.parseDouble(d1[1]);
            double valorInicial = Double.parseDouble(d1[2]);
            double valorBebida = Double.parseDouble(d1[3]);
            double valorPostre = Double.parseDouble(d1[4]);

            MenuDia menuDia = new MenuDia(nombrePlato, valorMenu, valorInicial, valorBebida, valorPostre);
            lista.add(menuDia);
        }

        for (String[] d1 : datos004) {
            String nombrePlato = d1[0];
            double valorMenu = Double.parseDouble(d1[1]);
            double valorInicial = Double.parseDouble(d1[2]);
            double valorGuarnicion = Double.parseDouble(d1[3]);
            double valorBebida = Double.parseDouble(d1[4]);
            double valorServicio = Double.parseDouble(d1[5]);

            MenuCarta menuCarta = new MenuCarta(nombrePlato, valorMenu, valorInicial, valorGuarnicion, valorBebida, valorServicio);
            lista.add(menuCarta);
        }
        // Fin de solución

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", 10);

        for (Menu menu : lista) {
            miCuenta.ArrayMenu(menu);
        }
        miCuenta.Factura();
    }
}

