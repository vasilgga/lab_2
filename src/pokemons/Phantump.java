package pokemons;

import movesPokemons.phantump.ConfuseRay;
import movesPokemons.phantump.RockSlide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Phantump extends Pokemon {
    public Phantump(String name, int level){
        super(name, level);
        super.setType(Type.GHOST, Type.GRASS);
        super.setStats(43, 70, 48, 50, 60, 38);

        ConfuseRay cnfsry = new ConfuseRay(0, 100);
        RockSlide rcksld = new RockSlide(75, 95);
        addMove(cnfsry);
        addMove(rcksld);



    }



}
