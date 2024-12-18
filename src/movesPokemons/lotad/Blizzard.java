package movesPokemons.lotad;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class Blizzard extends SpecialMove {
    public Blizzard(double pow, double acc) {
        super(Type.ICE, 110, 70);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }
        return "использовал" + pieces[pieces.length - 1];
    }




    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.freeze(p);
    }

}
