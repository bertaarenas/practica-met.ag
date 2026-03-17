import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jugador j1 = new Guerrero("Jugador 1");
        Jugador j2 = new Mago("Jugador 2");

        while (j1.estaVivo() && j2.estaVivo()) {

            // jugador 1
            System.out.println("Turno de " + j1.nombre);
            j1.mostrarEstado();
            j2.mostrarEstado();

            System.out.println("1. Atacar");
            System.out.println("2. Magia");
            System.out.println("3. Curarse");

            int opcion = sc.nextInt();

            if (opcion == 1) {
                j1.atacar(j2);
            }
            else if (opcion == 2) {
                j1.usarMagia(j2);
            }
            else if (opcion == 3) {
                j1.curarse();
            }

            j1.recuperarMana();

            if (!j2.estaVivo()) {
                break;
            }

            // jugador 2
            System.out.println("Turno de " + j2.nombre);
            j2.mostrarEstado();
            j1.mostrarEstado();

            System.out.println("1. Atacar");
            System.out.println("2. Magia");
            System.out.println("3. Curarse");

            opcion = sc.nextInt();

            if (opcion == 1) {
                j2.atacar(j1);
            }
            else if (opcion == 2) {
                j2.usarMagia(j1);
            }
            else if (opcion == 3) {
                j2.curarse();
            }

            j2.recuperarMana();
        }

        if (j1.estaVivo()) {
            System.out.println("Gana " + j1.nombre);
        } else {
            System.out.println("Gana " + j2.nombre);
        }

        sc.close();
    }
}