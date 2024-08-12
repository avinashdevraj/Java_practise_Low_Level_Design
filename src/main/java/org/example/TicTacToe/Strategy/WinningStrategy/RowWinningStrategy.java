package org.example.TicTacToe.Strategy.WinningStrategy;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;
import org.example.TicTacToe.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{
    private final Map<Integer, HashMap<Character,Integer>> rowmap=new HashMap<>();
    @Override
    public boolean checkWin(Board board, Move move) {
        int row=move.getCell().getRow();
        Character ch=move.getPlayer().getSymbol().getaChar();

        if(!rowmap.containsKey(row)){
            rowmap.put(row,new HashMap<>());
        }
        if(!rowmap.get(row).containsKey(ch)){
            rowmap.get(row).put(ch,0);
        }
        rowmap.get(row).put(ch,rowmap.get(row).get(ch)+1);

        if(rowmap.get(row).get(ch)==board.getSize()){
            return true;
        }
        return false;
    }
}
