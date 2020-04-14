package com.pokemon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="glbl_card")
public class GlobalCard {
    @Id
    @Column(name="pokedex_id")
    private Integer pokedex_Id;

    @Column(name="type")
    private String type;

    @Column(name="hp")
    private String hp;

    @Column(name="attack")
    private String attack;

    @Column(name="defense")
    private String defense;

    @Column(name="speed")
    private String speed;

    @Column(name="price")
    private String price;

    public Integer getPokedex_Id() {
        return pokedex_Id;
    }

    public void setPokedex_Id(Integer pokedex_Id) {
        this.pokedex_Id = pokedex_Id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
