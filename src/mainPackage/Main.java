package mainPackage;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {


    public static void main(String[] args) {
        Battle b = new Battle();


        Tornadus torn = new Tornadus("Пашок", 1);
        Phantump phantump = new Phantump("Артем", 1);
        Trevenant trevenant = new Trevenant("Илья", 1);
        Ludicolo ludicolo = new Ludicolo("Диман", 1);
        Lotad lotad = new Lotad("Давид", 1);
        Lombre lombre = new Lombre("Тимурчик", 1);

//        b.addAlly(phantump);
//        b.addAlly(ludicolo);
        b.addAlly(lotad);

        b.addFoe(torn);
//        b.addFoe(trevenant);
//        b.addFoe(lombre);

        b.go();



    }

}
