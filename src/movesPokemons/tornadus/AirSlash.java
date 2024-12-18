package movesPokemons.tornadus;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Effect;
public class AirSlash extends SpecialMove {
    public AirSlash(double pow, double acc){
        super(Type.FLYING, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if(Math.random() < 0.3){
            Effect.flinch(p);
            System.out.println("Use effect");
        }
    }


    @Override
    protected String describe () {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использовал " + pieces[pieces.length - 1];

    }




}
