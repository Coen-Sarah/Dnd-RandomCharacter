package com.example.dndrandomcharacter.Races;

public class HalfOrc extends Race{
    public HalfOrc(){
        super.name = "Half-Orc";
        super.bonusName = new String[]{"STR","CON"};
        super.bonusAmount = new int[]{2,1};
    }
}
