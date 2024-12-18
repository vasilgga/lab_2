package movesPokemons.phantump;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ConfuseRay extends StatusMove {
    public ConfuseRay(double pow, double acc){
        super(Type.GHOST, pow, acc);
    }


    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использовал " + pieces[pieces.length - 1];
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.5 ){
            Effect.confuse(p);
        }
    }
}
