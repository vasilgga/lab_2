package pokemons;

import movesPokemons.lombre.HydroPump;

public class Lombre extends Lotad{

    public Lombre(String name, int level) {
        super(name, level);
        super.setStats(60, 50, 50, 60, 70, 50);


        HydroPump hdrp = new HydroPump(110, 80);

        addMove(hdrp);
    }
}
