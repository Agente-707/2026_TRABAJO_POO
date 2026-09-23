public class Prota extends PJS {
    
    double hp;
    double atk;
    double exp;
    int lvl;
    double def;

    public Prota(String name, double hp, double atk, double exp,int lvl,boolean state ,double def){  
        super(name, state); 
        this.hp = hp;
        this.atk = atk;
        this.exp = exp;
        this.lvl = lvl;
        this.def = def;
    }
    
    double getHp() { return hp;}
    double getAtk() { return atk;}
    double getExp() {return exp;}
    int getLvl() {return lvl;}    
    double getDef() {return def;}
}
