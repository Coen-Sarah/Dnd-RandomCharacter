package com.example.dndrandomcharacter.Races;

public class Dwarf extends Race{
    public Dwarf(){
        super.name="Dwarf";
        super.subRaces = new String[]{"Hill","Mountain"};
        super.bonusName = new String[2];
        super.bonusAmount = new int[2];
        generateSubRace();
    }
    public void generateBonus(){
        super.bonusName[0] = "CON";
        super.bonusAmount[0] = 2;
        if(super.subRace.equals("Hill")){
            super.bonusName[1] = "WIS";
            super.bonusAmount[1] = 1;

        }else{
            super.bonusName[1] = "STR";
            super.bonusAmount[1] = 2;
        }
    }
}
