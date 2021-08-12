package com.example.dndrandomcharacter.Races;

public class Tiefling extends Race{
    public Tiefling(){
        super.name = "Tiefling";
        super.bonusName = new String[]{"CHA","INT"};
        super.bonusAmount = new int[]{2,1};
    }
}
