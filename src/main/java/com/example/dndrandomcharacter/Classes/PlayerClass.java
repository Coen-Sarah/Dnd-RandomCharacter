package com.example.dndrandomcharacter.Classes;

import com.example.dndrandomcharacter.Stat.Die;

public class PlayerClass {
    String name;
    String[] subClasses;
    String subclass;
    public static int totalClasses = 12;

    void generateSubClass(){
        int numSubclasses = subClasses.length;
        Die dice = new Die(numSubclasses);
        int randSubClass = dice.roll();
        subclass = subClasses[randSubClass];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubClasses() {
        return subClasses;
    }

    public void setSubClasses(String[] subClasses) {
        this.subClasses = subClasses;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }
}
