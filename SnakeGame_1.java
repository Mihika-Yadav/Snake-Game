package com.snakeGame;

import javax.swing.*; 

public class SnakeGame_1 {
    public static void main(String[] args) throws Exception {
        int boardWidth =600;
        int boardHeight = 600;

        JFrame frame= new JFrame("Snake Game");
        SnakeBoard snake_board=new SnakeBoard(boardWidth,boardHeight);
        frame.add(snake_board);

        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        snake_board.requestFocus();






    }
}
