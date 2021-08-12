package com.example.dndrandomcharacter.Races;

public class Halfling extends Race {

    public Halfling (){
        super.name = "Halfling";
        super.subRaces =new String[] {"Lightfoot","Stout"};
        super.bonusName = new String[2];
        super.bonusAmount = new int[2];
        generateSubRace();

    }
    public void generateBonus(){
        super.bonusName[0] = "DEX";
        super.bonusAmount[0] = 2;
        if(super.subRace.equals("Lightfoot")){
            super.bonusName[1] = "CHA";
            super.bonusAmount[1] = 1;

        }else{
            super.bonusName[1] = "CON";
            super.bonusAmount[1] = 1;
        }
    }
}
