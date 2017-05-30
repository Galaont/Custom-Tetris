package Tetris1;

import static Tetris1.Media.PlaySound;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Tetris1 extends JFrame {

    JLabel statusbar;

    public Tetris1() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        board.start();
        board.setBackground(Color.darkGray);
        setSize(board.BoardWidth*20 , board.BoardHeight*20);
        setTitle("Tetris Souls");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        board.setOpaque(true);
        
        
   }

   public JLabel getStatusBar() {
       return statusbar;
   }

    public static void main(String[] args) {
        File musac = new File ("Tetris_Metal_Version_.WAV");
        PlaySound(musac);
        Tetris1 game = new Tetris1();
        game.setLocationRelativeTo(null);
        game.setVisible(true);

    } 
}