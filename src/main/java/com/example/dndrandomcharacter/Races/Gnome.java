package com.example.dndrandomcharacter.Races;

public class Gnome extends Race{

    public Gnome(){
        super.name = "Gnome";
        super.subRaces = new String[] {"Forest Gnome","Rock Gnome"};
        super.bonusName = new String[2];
        super.bonusAmount = new int[2];
        generateSubRace();

    }
    public void generateBonus(){
        super.bonusName[0] = "INT";
        super.bonusAmount[0] = 2;
        if(super.subRace.equals("Forest Gnome")){
            super.bonusName[1] = "DEX";
            super.bonusAmount[1] = 1;

        }else{
            super.bonusName[1] = "CON";
            super.bonusAmount[1] = 1;
        }
    }
}
