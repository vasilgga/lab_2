package movesPokemons.ludicolo;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class MegaDrain extends SpecialMove {
    public MegaDrain(double pow, double acc){
        super(Type.GRASS, 40, 100);
    }

    @Override
    protected String describe () {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использовал " + pieces[pieces.length - 1];

    }
}
