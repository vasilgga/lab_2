package pokemons;

import movesPokemons.ludicolo.MegaDrain;
import ru.ifmo.se.pokemon.Type;

public class Ludicolo extends Lombre{
    public Ludicolo(String name, int level){
        super(name, level);
        super.setType(Type.GHOST, Type.GRASS);
        super.setStats(80, 70, 70, 90, 100, 70);


        MegaDrain mgd = new MegaDrain(40, 100);

        addMove(mgd);
    }
}
