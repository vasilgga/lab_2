package pokemons;

import movesPokemons.tornadus.AerialAce;
import movesPokemons.tornadus.AirSlash;
import movesPokemons.tornadus.BrutalSwing;
import movesPokemons.tornadus.Extrasensory;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tornadus extends Pokemon {
    public Tornadus(String name, int level){
        super (name, level);
        super.setType(Type.FLYING);
        super.setStats(79, 115, 70, 125, 80, 111);

        Extrasensory extr = new Extrasensory(80, 100);
        BrutalSwing brtw = new BrutalSwing(60, 100);
        AerialAce arlc = new AerialAce(60, 999999);
        AirSlash aislh = new AirSlash(75, 95);


        addMove(extr);
        addMove(brtw);
        addMove(arlc);
        addMove(aislh);

    }
}
