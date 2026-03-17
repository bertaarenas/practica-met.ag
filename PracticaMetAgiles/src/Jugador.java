import java.util.Random;
public class Jugador {
    Random rand = new Random();

    String nombre;
    int vida;
    int mana;
    int ataque;

    public Jugador(String nombre, int vida, int mana, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.mana = mana;
        this.ataque = ataque;
    }

    public void atacar(Jugador enemigo) {
        if (rand.nextInt(100) < 20) {
            System.out.println(nombre + " ha fallado el ataque.");
        }
        else {
            enemigo.vida -= ataque;
            System.out.println(nombre + " hace " + ataque + " de daño.");
        }
    }

    public void usarMagia(Jugador enemigo) {
        if (mana >= 10) {
            enemigo.vida -= 15;
            mana -= 10;
            System.out.println(nombre + " usa la magia y hace 15 de daño.");
        }
        else {
            System.out.println(nombre + " no tiene suficiente mana.");
        }
    }

    public void curarse() {
        if (mana >= 8) {
            vida += 10;
            mana -= 8;
            System.out.println(nombre + " tiene +10 de vida.");
        }
        else {
            System.out.println(nombre + " no tiene suficiente mana.");
        }
    }

    public void recuperarMana() {
        mana += 5;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void mostrarEstado() {
        System.out.println(nombre + " | Vida: " + vida + " | Mana: " + mana);
    }
}