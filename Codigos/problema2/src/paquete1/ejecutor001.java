package paquete1;


public class ejecutor001 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("René Elizalde", 10.0);

        MenuNinos menu1 = new MenuNinos("Niños 01", 4.50,2.00,1.00, 1.50);
        MenuNinos menu2 = new MenuNinos("Niños 02", 5.50, 3.00,1.00, 1.50);
        MenuEconomico menue = new MenuEconomico("Econo 001", 3.00,4.00, 25.00);
        MenuDia menuD = new MenuDia("Dia 001", 7.00,5.00,1.00, 1.00);
        MenuCarta menuC= new MenuCarta("Carta 001", 10.10,6.0,1.5,2.0, 10.00);

        cuenta.ArrayMenu(menu1);
        cuenta.ArrayMenu(menu2);
        cuenta.ArrayMenu(menue);
        cuenta.ArrayMenu(menuD);
        cuenta.ArrayMenu(menuC);

        cuenta.Factura();
    }
}