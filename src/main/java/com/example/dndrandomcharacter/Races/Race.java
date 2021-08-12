package com.example.dndrandomcharacter.Races;

import com.example.dndrandomcharacter.Stat.Die;

public class Race {

    String name;
    String subRace = "";
    String[] subRaces;
    String[] bonusName;
    int[] bonusAmount;
    public static int totalRaces = 9;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubRace() {
        return subRace;
    }

    public void setSubRace(String subRaces) {
        this.subRace = subRace;
    }

    public void generateSubRace(){
        Die dTwo = new Die(2);
        int num = dTwo.roll();
        subRace = subRaces[num-1];
        generateBonus();
    }
    public void generateBonus(){};

    public String[] getBonusName() {
        return bonusName;
    }

    public void setBonusName(String[] bonusName) {
        this.bonusName = bonusName;
    }

    public int[] getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(int[] bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
}
