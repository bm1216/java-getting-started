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
    private int hp;

    @Column(name="attack")
    private int attack;

    @Column(name="defence")
    private int defence;

    @Column(name="speed")
    private int speed;

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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
