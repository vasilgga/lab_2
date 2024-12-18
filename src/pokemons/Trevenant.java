package pokemons;

import movesPokemons.trevenant.XScissor;
import ru.ifmo.se.pokemon.*;


public class Trevenant extends Phantump {
    public Trevenant(String name, int level){
        super(name, level);

        super.setStats(85, 110, 76, 65, 82, 56);

        XScissor xcsr = new XScissor(80, 100);

        addMove(xcsr);
    }
}
