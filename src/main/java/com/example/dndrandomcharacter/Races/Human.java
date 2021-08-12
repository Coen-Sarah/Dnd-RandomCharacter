package com.example.dndrandomcharacter.Races;

public class Human extends Race{
    public Human(){
        super.name = "Human";
        super.bonusName = new String[2];
        super.bonusAmount = new int[2];
        super.bonusName[0] = "ALL";
        super.bonusAmount[0] = 1;
    }
}
