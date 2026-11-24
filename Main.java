import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Escribe el nombre de tu personaje");
        name = sc.nextLine();
        
        //String name, double hp, double maxhp, double atk, double def, double exp, int lvl, boolean isAlive, double cash
        Player player = new Player(name,200.0, 200.0,10.0, 0.0, 0.0, 1, true, 0.0);
        Enemy enemigo = new Enemy("Royer", 250.0, 15.0, 20.5, 15.0,1, true, 30.0);

        
        player.atack(enemigo);
        enemigo.atack(player);

        player.stats();

        System.out.println(player.hp);
        System.out.println(enemigo.hp);

        Boss boss = new Boss("Dire", 500.0, 500.0, 20.0, 50.0, 20.0, true, 500.0, 100.0);
        boss.explosion(player, 6.0);

        player.atack(boss);
        player.atack(boss);
        player.atack(boss);

        boss.heal(); // no se cura aun porque su vida no esta por la mitad

        System.out.println(boss.getHp());

        NPC npc = new NPC("Rodrigo", 100.0, 0.0, 0.0, true, 100.0);

        npc.interactuar(player, sc);

    }
}
