package com.dev.tictactoe.player;

import com.dev.tictactoe.model.Board;
import com.dev.tictactoe.model.Symbols;

import java.util.Scanner;

public class HumanPlayer extends IPlayer{
    public HumanPlayer(Symbols x) {
        super(x);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void makeMove(Board b) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        b.grid[i][j] = this.symbol == Symbols.X ? 1 : 0;
    }
}
