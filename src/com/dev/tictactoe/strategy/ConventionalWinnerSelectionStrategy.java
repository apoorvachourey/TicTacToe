package com.dev.tictactoe.strategy;

import com.dev.tictactoe.model.Board;

public class ConventionalWinnerSelectionStrategy implements IWinnerSelectionStrategy{
    @Override
    public int getWinner(Board b) {
        for(int i=0; i<b.getDimentions(); i++) {
            int rowSum = b.getRowSum(i);
            int colSum = b.getColSum(i);
            if(rowSum == b.getDimentions() || colSum == b.getDimentions()) {
                return 1;
            }
            else if(rowSum == 0 || colSum == 0) {
                return 0;
            }
        }
        return -1;
    }
}
