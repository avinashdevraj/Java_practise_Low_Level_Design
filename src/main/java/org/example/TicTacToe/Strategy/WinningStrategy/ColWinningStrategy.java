package org.example.TicTacToe.Strategy.WinningStrategy;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy{
    private final Map<Integer, HashMap<Character,Integer>> colmap=new HashMap<>();
    @Override
    public boolean checkWin(Board board, Move move) {
        int col=move.getCell().getCol();
        Character ch=move.getPlayer().getSymbol().getaChar();
        if(!colmap.containsKey(col)){
            colmap.put(col,new HashMap<>());
        }
        if(!colmap.get(col).containsKey(ch)){
            colmap.get(col).put(ch,0);
        }
        colmap.get(col).put(ch,colmap.get(col).get(ch)+1);

        if(colmap.get(col).get(ch)==board.getSize()){
            return true;
        }
        return false;
    }
}
