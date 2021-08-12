package com.example.dndrandomcharacter;

import com.example.dndrandomcharacter.Classes.*;
import com.example.dndrandomcharacter.Races.*;
import com.example.dndrandomcharacter.Stat.Die;
import com.example.dndrandomcharacter.Stat.StatBlock;

public class PlayerCharacter {
    Race playerRace;
    PlayerClass playerClass;
    Alignment playerAlignment = new Alignment();
    StatBlock stats = new StatBlock();

    public PlayerCharacter(){

    }
    public void generateCharacter(){
        generateRace();
        generateClass();
        playerAlignment.generateAlignment();
        stats.generateStats();
    }

    public void generateClass(){
            Die dice = new Die(PlayerClass.totalClasses);
            int randomClass = dice.roll();
            switch (randomClass){
                case 1: playerClass = new Barbarian();
                    break;
                case 2: playerClass = new Bard();
                    break;
                case 3: playerClass = new Cleric();
                    break;
                case 4: playerClass = new Druid();
                    break;
                case 5: playerClass = new Fighter();
                    break;
                case 6: playerClass = new Monk();
                    break;
                case 7: playerClass = new Paladin();
                    break;
                case 8: playerClass = new Ranger();
                    break;
                case 9: playerClass = new Rogue();
                    break;
                case 10: playerClass = new Sorcerer();
                    break;
                case 11: playerClass = new Warlock();
                    break;
                case 12: playerClass = new Wizard();
                    break;

            }
        }

    public void generateRace() {
        Die dice = new Die(Race.totalRaces);
        int randomClass = dice.roll();
        switch (randomClass) {
            case 1:
                playerRace = new Dragonborn();
                break;
            case 2:
                playerRace = new Dwarf();
                break;
            case 3:
                playerRace = new Elf();
                break;
            case 4:
                playerRace = new Gnome();
                break;
            case 5:
                playerRace = new HalfElf();
                break;
            case 6:
                playerRace = new Halfling();
                break;
            case 7:
                playerRace = new HalfOrc();
                break;
            case 8:
                playerRace = new Human();
                break;
            case 9:
                playerRace = new Tiefling();
                break;
        }
    }

}


