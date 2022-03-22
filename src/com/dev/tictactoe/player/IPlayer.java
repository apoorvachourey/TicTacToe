package com.dev.tictactoe.player;

import com.dev.tictactoe.model.Board;
import com.dev.tictactoe.model.Symbols;

public abstract  class IPlayer {
    public abstract void makeMove(Board b);
    public Symbols symbol;

    public IPlayer(Symbols x) {
        this.symbol = x;
    }
}
