public class Character {

    private int health;
    private int stamina;
    private static final int maxHealth = 100;
    private static final int maxStamina = 50;

    public Character() {

        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with 100 health and 50 stamina.");

    }
    public int getHealth(){
        return this.health;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void  swingSword(){

            
        if (this.stamina - 10 > 0){
            this.stamina = this.stamina - 10;
            System.out.println("Character swings sword. Stamina is now " + getStamina() +".");
        }else {
            
            System.out.println("Your character needs to cool down.");
        }

    }
    public void takeDamage(int damage){

        this.health = this.health - damage;
        if(this.health > 0){

            System.out.println("Character takes " + damage +" damage. Health is now " + getHealth() +".");
        }else{
            this.health = 0;
            System.out.println("Character takes " + damage +" damage. Health is now " + getHealth() +".");
            System.out.println("Character is dead.");
        }
    }

    public void rest(){

        this.health=maxHealth;
        this.stamina=maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");

    }

}
