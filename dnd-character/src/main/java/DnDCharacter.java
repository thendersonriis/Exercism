import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class DnDCharacter {
    private Random random = new Random();
    private int strength = 0;
    private int dexterity = 0;
    private int constitution = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int charisma = 0;
    private int hitPoints = 0;

    /*Calculate ability points based on rolling 4 dice and taking the top 3 and adding*/
    int ability() {
        int answer = 0;
        ArrayList<Integer> randList = new ArrayList<Integer>();
        for (int x = 0; x < 4; x++){
            randList.add(random.nextInt((6-1) + 1) + 1);
        }
        Collections.sort(randList);
        for (int x = 0; x < 3; x++){
            answer += randList.get(x);
        }
        return answer;
    }
    /*Subtract 10 from input divide by 2 and round down*/
    int modifier(int input) {
        return Math.floorDiv((input -10), 2);
    }

    int getStrength() {
        if (strength == 0){
            strength = ability();
        }
        return strength;
    }

    int getDexterity() {
        if (dexterity == 0){
            dexterity = ability();
        }
        return dexterity;
    }

    int getConstitution() {
        if (constitution == 0){
            constitution = ability();
        }
        return constitution;
    }

    int getIntelligence() {
        if (intelligence == 0){
            intelligence = ability();
        }
        return intelligence;
    }

    int getWisdom() {
        if (wisdom == 0){
            wisdom = ability();
        }
        return wisdom;
    }

    int getCharisma() {
        if (charisma == 0){
            charisma = ability();
        }
        return charisma;
    }

    /*Hitpoints equal 10 plus constitution modifier*/
    int getHitpoints() {
        if (hitPoints== 0){
            hitPoints= 10 + modifier(constitution);
        }
        return hitPoints;
    }

}
