import java.util.Scanner;
import java.util.Random;

public class NPC extends PJS {
    
    // Constructor
    public NPC(String name, double hp, double atk, double def, boolean isAlive, double cash){
        super(name, hp, atk, def, isAlive, cash);
    }

    public void interactuar(Player player, Scanner sc){
        int opc;
        System.out.println(this.name + ": Hola " + player.getName() + ", mi nombre es " + this.name + ". ¿En qué te puedo ayudar?");
        System.out.println("1. Comprarle algo");
        System.out.println("2. Intercambiar con el/ella");
        System.out.println("3. Despedirse");

        opc = sc.nextInt();
        

        switch(opc){
            case 1:
                Random rand = new Random();
                int itemIndex = rand.nextInt(4);  

                if(itemIndex == 0){
                    System.out.println(this.name + ": Lo siento, no tengo nada para venderte en este momento.");
                }else if(itemIndex == 1){
                    venderConsumible(player, sc);
                }else if(itemIndex == 2){
                    //venderArma(player);
                }else if(itemIndex == 3){
                    //verderArmadura(player);
                }

                break;
            case 2:
                // =>  Se usara el inventario del jugador
            break;

            default:
                System.out.println(this.name + ": ¡Hasta luego, " + player.getName() + "!");
        }

        
    }


    public Consumible venderConsumible(Player player, Scanner sc){
        Consumible item = null;
        int opc;

        System.out.println(this.name + ": Tengo un paneton. ¿Quieres comprarlo por 20 soles?");
        System.out.println("1. Aceptar");
        System.out.println("2. Rechazar");
        
        opc = sc.nextInt();

        if(opc == 1){
            item = new Consumible("Paneton", "Curación special" , 100.0);
            if(player.getCash() >= 20){
                player.setCash(player.getCash() - 20);
                this.cash += 20;

                System.out.println(player.getName() + " ha comprado un " + item.getNombre() + " por 20 soles.");
                
                return item;
            }else{
                System.out.println(player.getName() + " no tiene suficiente dinero para comprar " + item.getNombre() + ".");
                item = null;

                return item;
            }
        }else{
            System.out.println(this.name + ": Está bien, tal vez en otra ocasión.");
        }

        return null;    
    }

    /* 
    public Arma venderArma(Player player){
        Arma item = null;
    }
    */

    /* 
    public Armadura venderArmadura(Player player){
        Armadura item = null; // necesitamos item armadura 
    }
    */ 
    


}
