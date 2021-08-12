package com.example.dndrandomcharacter.Races;

public class Elf extends Race{
    public Elf(){
        super.name="Elf";
        super.subRaces = new String[]{"High","Wood","Dark"};
        super.bonusName = new String[2];
        super.bonusAmount = new int[2];
        generateSubRace();
    }
    public void generateBonus(){
        super.bonusName[0] = "DEX";
        super.bonusAmount[0] = 2;
        if(super.subRace.equals("High")){
            super.bonusName[1] = "INT";
            super.bonusAmount[1] = 1;

        }else if(super.subRace.equals("Wood")){
            super.bonusName[1] = "WIS";
            super.bonusAmount[1] = 1;
        }else{
            super.bonusName[1] = "CHA";
            super.bonusAmount[1] = 1;
        }
    }
}
