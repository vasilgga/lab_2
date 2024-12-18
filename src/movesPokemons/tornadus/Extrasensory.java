package movesPokemons.tornadus;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Effect;
public class Extrasensory extends SpecialMove {
    public Extrasensory(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if(Math.random() < 0.1){
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
