package movesPokemons.tornadus;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BrutalSwing extends PhysicalMove {

    public BrutalSwing(double pow, double acc){
        super(Type.DARK, pow, acc);



    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использовал " + pieces[pieces.length - 1];
    }
}
