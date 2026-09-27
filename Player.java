public class Player extends PJS {
    // Atributos
    double exp;
    int lvl;
    double def;

    // Constructor
    public Player(String name, double hp, double atk, double def, double exp, int lvl, boolean isAlive, double cash){  
        super(hp, atk, name, isAlive, cash); 
        this.exp = exp;
        this.lvl = lvl;
        this.def = def;
    }
    
    // getters
    double getHp()  {return hp;}
    double getAtk() {return atk;}
    double getExp() {return exp;}
    int    getLvl() {return lvl;}    
    double getDef() {return def;}

    // setters
    void setHp(double hp)   {this.hp = hp;}
    void setAtk(double atk) {this.atk = atk;}
    void setExp(double exp) {this.exp = exp;}
    void setLvl(int lvl)    {this.lvl = lvl;}
    void getDef(double def) {this.def = def;}

    // --- Métodos ---
    public void damage(double cant) {
        this.hp -= cant;
        if (this.hp <= 0) {
            this.hp = 0;
            this.isAlive = false; 
        }

        System.out.println("Recibistes " + cant + " de daño.");
        System.out.println("Vida restante: " + this.hp);
    }

    public void atack(Enemy objetivo) {
        if (!this.isAlive) {
            System.out.println("Entidad derrotada.");
            return;
        }

        System.out.println(this.name + " lanza un ataque a " + objetivo.getName());
        objetivo.damage(this.atk);

    }
    

    


}
