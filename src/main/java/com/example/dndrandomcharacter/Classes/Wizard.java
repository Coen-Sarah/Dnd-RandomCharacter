package com.example.dndrandomcharacter.Classes;

public class Wizard extends PlayerClass {
    public Wizard(){
        super.name = "Wizard";
        super.subClasses = new String[]{"Abjuration","Conjuration",
                                        "Divination","Enchantment",
                                        "Evocation","Illusion",
                                        "Necromancy","Transmutation"};
    }
}
