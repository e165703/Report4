package jp.ac.uryukyu.ie.e165703;

/**
 * Created by e165703 on 2016/11/27.
 */
public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }
    public boolean isDead() {
        return dead;
    }
    public String getName(){
        return name;
    }
    public int getHitPoint(){
        return hitPoint;
    }
    public void attack(LivingThing opponent){
        if(dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}
