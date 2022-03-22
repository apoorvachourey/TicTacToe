package com.dev.tictactoe.factory;

import com.dev.tictactoe.model.PlayerType;
import com.dev.tictactoe.model.Symbols;
import com.dev.tictactoe.player.ComputerPlayer;
import com.dev.tictactoe.player.HumanPlayer;
import com.dev.tictactoe.player.IPlayer;

public class PlayerFactory {
    public static IPlayer createPlayer(PlayerType type, Symbols x) {
        switch (type) {
            case human:
                return  new HumanPlayer(x);
            case computer:
                return new ComputerPlayer(x);
            default:
                return null;
        }
    }
}
