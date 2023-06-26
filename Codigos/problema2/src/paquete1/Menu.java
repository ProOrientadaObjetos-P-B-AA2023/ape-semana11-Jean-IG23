package paquete1;

abstract public class Menu {
    public String nombrePlato;
    public double valoraMenu;
    public double valorInicial;

    public Menu(String nombrePlato, double valoraMenu, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valoraMenu = valoraMenu;
        this.valorInicial = valorInicial;
    }

    public String getNombrePlato() {
       return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getValoraMenu() {
        return valoraMenu;
    }

    public void setValoraMenu(double valoraMenu) {
        this.valoraMenu = valoraMenu;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public abstract void Interfaz();
}

 class MenuCarta extends Menu {
    public double valorGuarnicion;
    public double valorBebida;
    public double valorServicio;

    public MenuCarta(String nombrePlato, double valoraMenu, double valorInicial, double valorGuarnicion, double valorBebida, double valorServicio) {
        super(nombrePlato, valoraMenu, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public void setValorGuarnicion(double valorGuarnicion) {
        this.valorGuarnicion = valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getValorServicio() {
        return valorServicio;
    }

    public void setValorServicio(double valorServicio) {
        this.valorServicio = valorServicio;
    }

    public void Interfaz() {
        System.out.println("\tValor de porción de guarnicion: " + getValorGuarnicion());
        System.out.println("\tValor Bebida: " + getValorBebida());
        System.out.println("\tValor del servicio: " + getValorServicio());
    }
}

class MenuDia extends Menu {
    public double valorPostre;
    public double valorBebida;

    public MenuDia(String nombrePlato, double valoraMenu, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valoraMenu, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void Interfaz() {
        System.out.println("\tValor del Postre: " + getValorPostre());
        System.out.println("\tValor de Bebida: " + getValorBebida());
    }
}

 class MenuEconomico extends Menu{
    public double descuento;

    public MenuEconomico(String nombrePlato, double valoraMenu, double valorInicial, double descuento) {
        super(nombrePlato, valoraMenu, valorInicial);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void Interfaz() {
        System.out.println("\tValor descuento: " + getDescuento());
    }
}

 class MenuNinos extends Menu {
    public double porcionHelado;
    public double porcionPastel;

    public MenuNinos(String nombrePlato, double valoraMenu, double valorInicial, double porcionHelado, double porcionPastel) {
        super(nombrePlato, valoraMenu, valorInicial);
        this.porcionHelado = porcionHelado;
        this.porcionPastel = porcionPastel;
    }

    public double getPorcionHelado() {
        return porcionHelado;
    }

    public void setPorcionHelado(double porcionHelado) {
        this.porcionHelado = porcionHelado;
    }

    public double getPorcionPastel() {
        return porcionPastel;
    }

    public void setPorcionPastel(double porcionPastel) {
        this.porcionPastel = porcionPastel;
    }

    public void Interfaz() {
        System.out.println("\tValor de porción de Helado: " + getPorcionHelado());
        System.out.println("\tValor de porción de pastel: " + getPorcionPastel());
    }
}


