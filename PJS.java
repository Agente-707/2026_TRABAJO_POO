import java.util.Scanner;

public class PJS{
    // Atributos
    double hp;
    double atk;
    String name;
    boolean isAlive;
    double cash;
    
    // Constructor
    public PJS(double hp, double atk, String name, boolean isAlive, double cash){
        this.hp = hp;
        this.atk = atk;
        this.name = name;
        this.isAlive = isAlive;
        this.cash = cash;
    }

    // Getters
    double getHp()      {return hp;}
    double getAtk()     {return atk;}
    String getName()    {return name;}
    boolean getIsAlive(){return isAlive;}
    double getCash()    {return cash;}

    // Setters
    void setHp(double hp)           {this.hp = hp;}
    void setAtk(double atk)         {this.atk = atk;}        
    void setName(String name)       {this.name = name;}
    void setIsAlive(boolean isAlive){this.isAlive = isAlive;}
    void setCash(double cash)       {this.cash = cash;}

    // --- Métodos ---
    /* 
    public void damage(double cant) {
        this.hp -= cant;
        if (this.hp <= 0) {
            this.hp = 0;
            this.isAlive = false; 
        }

        System.out.println(this.name + " recibio " + cant);
        System.out.println("Vida restante: " + this.hp);
    }

    public void atack(PJS objetivo) {
        if (!this.isAlive) {
            System.out.println("Entidad derrotada.");
            return;
        }

        System.out.println(this.name + " ataca a " + objetivo.getName());
        objetivo.damage(this.atk);

    }
        */
    
        

}
