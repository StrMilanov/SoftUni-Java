package SoftUniJavaAdvanced.Ex_06.P06_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int badgesAmount;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        this.badgesAmount = 0;
        this.pokemonList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadgesAmount() {
        return badgesAmount;
    }

    public void setBadgesAmount(int badgesAmount) {
        this.badgesAmount = badgesAmount;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }


    @Override
    public String toString() {
        return name + " " + badgesAmount + " " + pokemonList.size();
    }


}
