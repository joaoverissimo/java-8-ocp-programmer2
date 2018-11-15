package com.verissimo.aula011_generics.enthuware;


interface Player<E> {
    void play(E e);
}

interface GamePlayer<E extends Game> extends Player<E> {
}

interface MusicPlayer<E extends Instrument> extends Player {
}

class Game {
}

class Cricket extends Game {
}

class Instrument {
}

class Guitar extends Instrument {
}

public class GenericsEx1308 {

    class Batsman implements GamePlayer<Cricket> {
        public void play(Game o) {
        }

        @Override
        public void play(Cricket cricket) {

        }
    }
}
