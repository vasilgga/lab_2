package movesPokemons.phantump;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove {
    public Rest(double pow, double acc){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использовал " + pieces[pieces.length - 1];
    }


    @Override
    protected void applyOppEffects(Pokemon p){
    }
}
