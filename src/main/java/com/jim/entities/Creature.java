package com.jim.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@AllArgsConstructor
@Setter
@Getter
public class Creature {

    private String creatureName;
    private KlasaKaraktera klasa;
    private int level;
    private char size;
    private int speed;
    private Race race;
    private Alignment alignment;
    private Deity deity;
    private  int age;
    private char gender;
    private double sizeInFeet;
    private double weightInPounds;
    private String eyes;
    private String hair;
    private String skin;

    private List<CreatureAbility> abilities;
    private AC armorClass;
    private int HP;
    private List<Skill> skills;
    private double moneyInGold;
}
