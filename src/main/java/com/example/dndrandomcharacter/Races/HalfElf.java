package com.example.dndrandomcharacter.Races;

public class HalfElf extends Race{
    public HalfElf(){
        super.name = "Half-Elf";
        super.bonusName = new String[]{"CHA","ANY","ANY"};
        super.bonusAmount = new int[]{2,1,1};
    }
}
