package pokemons;

import movesPokemons.lotad.Blizzard;
import movesPokemons.lotad.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lotad extends Pokemon {
    public Lotad(String name, int level){

        super(name, level);
        super.setType(Type.WATER, Type.GRASS);
        super.setStats(40, 30, 30, 40, 50, 30);


        Blizzard blzr = new Blizzard(110, 70);
        Facade fcd = new Facade(70, 100);


        addMove(blzr);
//        addMove(fcd);
    }



}
