package com.example.dndrandomcharacter.Races;

public class Dragonborn extends Race {
    public Dragonborn (){
        super.name = "Dragonborn";
        super.bonusName = new String[]{"STR","CHA"};
        super.bonusAmount = new int[]{2,1};
    }
}
