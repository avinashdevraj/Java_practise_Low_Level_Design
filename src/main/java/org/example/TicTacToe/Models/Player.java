package org.example.TicTacToe.Models;

import java.util.Scanner;

public class Player {
    private Symbol symbol;
    private String name;
    private PlayerType playerType;
    private static Scanner sc=new Scanner(System.in);
    public Player(Symbol symbol, String name, PlayerType playerType) {
        this.symbol = symbol;
        this.name = name;
        this.playerType = playerType;
    }
    public Move makeMove(Board board){
        //Take input of row & col number wher user want to mke a move.
        System.out.println("Please enter the Row number where you want to move");
        int row=sc.nextInt();

        System.out.println("Please enter the Col number where you want to move");
        int col=sc.nextInt();


        return new Move(this,new Cell(row,col));
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
