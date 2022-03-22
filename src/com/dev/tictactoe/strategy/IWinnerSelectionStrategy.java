package com.dev.tictactoe.strategy;

import com.dev.tictactoe.model.Board;

public interface IWinnerSelectionStrategy {
    int getWinner(Board board);
}
