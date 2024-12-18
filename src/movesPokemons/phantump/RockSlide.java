package movesPokemons.phantump;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {

    public RockSlide(double pow, double acc){
        super(Type.ROCK, pow, acc);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использовал " + pieces[pieces.length - 1];
    }


    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Math.random() < 0.3){
            Effect.flinch(p);
        }

    }
}
