import java.util.Scanner;

public class Java {

    //Game Variables
    private char[][] board;
    private boolean end;
    private Scanner sc;

    //Pieces
    private char knight = 'k';
    private char queen = 'Q';
    private char king = 'K';
    private char pawn = 'p';
    private char bishop = 'b';
    private char rock = 'r';

    public Java() {
	end = false;
	sc = new Scanner();
	board = new char[][];
	setUp();
    }

    //runs the game
    public void gameLoop() {
	while(!end) {
	    toString();
	}
    }

    //sets up the board
    public void setUp() {
    }

    //prints the board
    public String toString() {
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
	    }
	}
    }

    public static void main(String[] args) {
	Chess game = new Chess();
	game.gameLoop();
    }
}
