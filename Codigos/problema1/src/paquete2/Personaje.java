package paquete2;

import java.util.Random;

public abstract class Personaje {
    public String nombre;
    public int vida;
    public int nivel;
    public int experiencia;

    public Personaje(String nombre, int vida, int nivel, int experiencia) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public abstract void atacar();

    public abstract void defender();

    public abstract void ganarBatalla();

    public abstract void perderBatalla();

    public void recibirDanio(int danio) {
        vida -= danio;
    }
}

class Guerrero extends Personaje {
    public Guerrero(String nombre, int nivel) {
        super(nombre, 100 + (nivel - 1) * 10, nivel, 0);
    }

    public void atacar() {
        int danio = 30;
    }

    public void defender() {
        Random rand = new Random();
        int reduccionDanio = rand.nextInt(16);
    }

    public void ganarBatalla() {
        experiencia += 25 + (nivel - 1) * 50;
        if (experiencia >= 100) {
            subirNivel();
            experiencia -= 100;
        }
    }

    public void perderBatalla() {
        experiencia = Math.max(0, experiencia - 13);
    }

    public void subirNivel() {
        nivel++;
        vida += 10;
    }
}

class Arquero extends Personaje {
    public Arquero(String nombre, int nivel) {
        super(nombre, 100 + (nivel - 1) * 10, nivel, 0);
    }

    public void atacar() {
        int danio = 20;
    }

    public void defender() {
        Random rand = new Random();
        int reduccionDanio = rand.nextInt(16);
        // ...
    }

    public void ganarBatalla() {
        experiencia += 20 + (nivel - 1) * 50;
        if (experiencia >= 100) {
            subirNivel();
            experiencia -= 100;
        }
    }

    public void perderBatalla() {
        experiencia = Math.max(0, experiencia - 14);
    }

    private void subirNivel() {
        nivel++;
        vida += 10;
    }
}

class Mago extends Personaje {
    public Mago(String nombre, int nivel) {
        super(nombre, 100 + (nivel - 1) * 7, nivel, 0);
    }

    public void atacar() {
        int danio = 27;
    }

    public void defender() {
        Random rand = new Random();
        int reduccionDanio = rand.nextInt(16);
    }

    public void ganarBatalla() {
        experiencia += 23 + (nivel - 1) * 50;
        if (experiencia >= 100) {
            subirNivel();
            experiencia -= 100;
        }
    }

    public void perderBatalla() {
        experiencia = Math.max(0, experiencia - 20);
    }

    private void subirNivel() {
        nivel++;
        vida += 7;
    }
}