public class Boss extends PJS{

    private double maxHp;
    private double healing;
    private double bossExp;

    // Constructor
    public Boss(String name, double hp, double maxHp, double healing, double atk, double def, boolean isAlive, double cash, double bossExp){
        super(name, hp, atk, def, isAlive, cash);
        this.maxHp = maxHp;
        this.healing = healing;
        this.bossExp = bossExp;
    }

    // getters
    public double getMaxHp()    {return maxHp;}
    public double getHealing()  {return healing;}
    public double getBossExp()  {return bossExp;}

    // setters
    public void setMaxHp(double maxHp)      {this.maxHp = maxHp;}
    public void setHealing(double healing)  {this.healing = healing;}
    public void setBossExp(double bossExp)  {this.bossExp = bossExp;}





}
