package com.dev.tictactoe.factory;

import com.dev.tictactoe.model.Game;
import com.dev.tictactoe.model.PlayerType;
import com.dev.tictactoe.model.Symbols;
import com.dev.tictactoe.player.IPlayer;
import com.dev.tictactoe.strategy.ConventionalWinnerSelectionStrategy;

public class GameFactory {
    public static Game launch(int boardDimentions, PlayerType player1Type, PlayerType player2Type) {
        IPlayer player1 = PlayerFactory.createPlayer(player1Type, Symbols.X);
        IPlayer player2 = PlayerFactory.createPlayer(player2Type, Symbols.O);
        Game game = new Game(boardDimentions, player1, player2, new ConventionalWinnerSelectionStrategy());
        return game;

    }
}
