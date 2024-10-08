public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int start;

    Fighter(String name, int damage, int health, int weight, int dodge, int start){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.start = start;
        if(dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else{
            this.dodge = 0;
        }
        this.dodge = dodge;
    }

    int hit (Fighter foe){
        System.out.println(this.name + " => " + foe.name + "'a " + this.damage + "Hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name +" gelen hasari blokladi!");
            System.out.println("-------------------");
            return foe.health;
        }
        if(foe.health - this.damage < 0 ){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber >= this.dodge;

    }
}
