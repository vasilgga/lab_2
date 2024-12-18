package movesPokemons.lombre;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump(double pow, double acc){
        super(Type.WATER, 110, 80);
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
