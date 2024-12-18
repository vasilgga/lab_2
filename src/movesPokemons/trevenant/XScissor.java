package movesPokemons.trevenant;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class XScissor extends PhysicalMove {
    public XScissor(double pow, double acc){
        super(Type.BUG, pow, acc);
    }


    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использовал " + pieces[pieces.length - 1];
    }


}
