package org.example.TicTacToe.Strategy.WinningStrategy;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy{
    //2-diaoganls
    private final HashMap<Character,Integer> d1=new HashMap<>();
    private final HashMap<Character,Integer> d2=new HashMap<>();

    @Override
    public boolean checkWin(Board board, Move move) {
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        Character ch=move.getPlayer().getSymbol().getaChar();

        if(row==col){
            d1.put(ch,d1.getOrDefault(ch,0)+1);
        }
        if(row+col==board.getSize() -1){
            d2.put(ch,d2.getOrDefault(ch,0)+1);

        }
        if(row==col && d1.get(ch)==board.getSize()){
            return true;
        }
        if(row+col== board.getSize()-1 && d2.get(ch)==board.getSize()){
            return true;
        }
        return false;
    }
}
