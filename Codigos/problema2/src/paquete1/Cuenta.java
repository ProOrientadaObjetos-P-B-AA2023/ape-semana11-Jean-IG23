package paquete1;

import java.util.ArrayList;

public class Cuenta {
    public String nombreCliente;
    public ArrayList<Menu> menus;
    public double valorTotal;
    public double subTotal;
    public double Iva;

    public Cuenta(String nombreCliente, double Iva) {
        this.nombreCliente = nombreCliente;
        this.Iva = Iva;
        this.menus = new ArrayList<>();
        this.subTotal = 0.0;
        this.valorTotal = 0.0;
    }

    public void Total() {
        valorTotal = subTotal + (subTotal * (Iva /100));
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<paquete1.Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<paquete1.Menu> menus) {
        this.menus = menus;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double iva) {
        Iva = iva;
    }

    public void ArrayMenu(paquete1.Menu menu) {
        menus.add(menu);
        subTotal = subTotal + menu.getValoraMenu();
        Total();
    }


    public void Factura() {
        System.out.println("--------------------------------------");
        System.out.println("****************FACTURA***************");
        System.out.println("Cliente: " + nombreCliente);
        for (Menu menu : menus) {
            System.out.println(" ");
            System.out.println(menu.getClass().getSimpleName() + ":");
            System.out.println("\tPlato: " + menu.getNombrePlato());
            System.out.println("\tValor inicial: " + menu.getValorInicial());
            menu.Interfaz();
            System.out.println("\tValor del menú: " + menu.getValoraMenu());
        }
        System.out.println("Subtotal: " + subTotal);
        System.out.println("IVA: " + Iva);
        System.out.println("Total a pagar: " + valorTotal);
    }
}
