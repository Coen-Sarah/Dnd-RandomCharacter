package com.example.dndrandomcharacter;

import com.example.dndrandomcharacter.Stat.Die;

public class Alignment {
    String[] goodEvil = {"Good", "Neutral","Evil" };
    String[] orderChaos = {"Lawful","Neutral","Chaotic"};
    String alignment;

    public Alignment(){
        generateAlignment();
    }

    public void generateAlignment(){
        Die dice = new Die(3);
        int goodEvilNum = dice.roll()-1;
        int orderChaosNum = dice.roll()-1;
        alignment = orderChaos[orderChaosNum] + " " + goodEvil[goodEvilNum];
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
