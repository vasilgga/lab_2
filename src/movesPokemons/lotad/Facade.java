package movesPokemons.lotad;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc){
        super(Type.NORMAL, 70, 100);
    }


    @Override
    protected void applySelfEffects(Pokemon p){
        if (p.getCondition() == Status.BURN | p.getCondition() == Status.PARALYZE | p.getCondition() == Status.POISON){
            super.applyOppDamage(p, 2 * power);
        }
    }

    @Override
    protected String describe () {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использовал " + pieces[pieces.length - 1];
    }
}
