package movesPokemons.tornadus;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
    public AerialAce(double pow, double acc){
        super(Type.FLYING, pow, acc);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p, Pokemon d){
        return true;
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
