public class Boss extends PJS implements Combate{

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


    // Habilidades del jefe

    public void healthBar(){
        System.out.println("Jefe: " + this.name + " |  vida: " + this.hp + "/" + this.maxHp);
    }

    public void heal(){
        if(this.hp <= (this.maxHp/2)){

            for(int i=0;i<3;i++){ // Su vida sana tres veces seguidas
                this.hp += this.healing;

                if(this.hp > this.maxHp){
                    this.hp = this.maxHp;
                    System.out.println("El jefe termino de curarse");
                }else{
                    healthBar();
                } 
            }
        }
    }

    public void explosion(Player objetivo, double radio){ // => Ataque en area (faltaria implementar las coordenadas del jugador y del jefe para calcular la distancia)
        double radio1 = 5.0, radio2 = 10.0, radio3 = 15.0;
        boolean cerca = false, medio = false, lejos = false;

        if(radio <= radio1) cerca = true;
        else if(radio>radio1 && radio<=radio2) medio = true;
        else if(radio>radio2 && radio<=radio3) lejos = true;
        else return;

        if(cerca){
            objetivo.hp -= 100.0;
            System.out.println(objetivo.name + " recibio 100.0 de daño.");
            System.out.println("Vida actual: " + objetivo.hp + " | " + objetivo.getMaxHp());
        }else if(medio){
            objetivo.hp -= 50.0;
            System.out.println(objetivo.name + " recibistes 50.0 de daño.");
            System.out.println("Vida actual: " + objetivo.hp + " | " + objetivo.getMaxHp());
        }else if(lejos){
            objetivo.hp -= 25.0;
            System.out.println(objetivo.name + " recibio 25.0 de daño.");
            System.out.println("Vida actual: " + objetivo.hp + " | " + objetivo.getMaxHp());
        }
    }

    @Override     //Resta la vida(hp) con el daño recibido, si hp <= 0 entonces muere el objetivo
    public void damage(double cant) {
        this.hp -= cant;
        if (this.hp <= 0) {
            this.hp = 0;
            this.isAlive = false; 
        }

        System.out.println(this.name + " recibio " + cant + " de daño.");
        System.out.println("Vida restante: " + this.hp);
    }


}
