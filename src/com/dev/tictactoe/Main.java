package com.dev.tictactoe;

import com.dev.tictactoe.factory.GameFactory;
import com.dev.tictactoe.model.Game;
import com.dev.tictactoe.model.PlayerType;

public class Main {

    public static void main(String[] args) {
        Game ticTacToe = GameFactory.launch(3, PlayerType.human, PlayerType.human);
        ticTacToe.run();
    }
}
