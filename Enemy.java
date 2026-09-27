public class Enemy extends PJS{
    // Atributos
    double exp;
    int lvl;

    // Constructor
    public Enemy(String name, double hp, double atk, double exp, int lvl, boolean isAlive, double cash){  
        super(hp, atk, name, isAlive, cash); 
        this.exp = exp;
        this.lvl = lvl;
    }

    // getters
    double getHp()  {return hp;}
    double getAtk() {return atk;}
    double getExp() {return exp;}
    int    getLvl() {return lvl;}    

    // setters
    void setHp(double hp)   {this.hp = hp;}
    void setAtk(double atk) {this.atk = atk;}
    void setExp(double exp) {this.exp = exp;}
    void setLvl(int lvl)    {this.lvl = lvl;}

    // --- Métodos ---
    public void damage(double cant) {
        this.hp -= cant;
        if (this.hp <= 0) {
            this.hp = 0;
            this.isAlive = false; 
        }

        System.out.println(this.name + " recibio " + cant + " de daño.");
        System.out.println("Vida restante: " + this.hp);
    }

    public void atack(Player objetivo) {
        if (!objetivo.isAlive) {
            System.out.println("Jugador derrotado.");
            return;
        }

        System.out.println(this.name + " lanza un ataque a " + objetivo.getName());
        objetivo.damage(this.atk);

    }

}
