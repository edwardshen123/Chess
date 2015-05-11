import java.util.Scanner;

public class Java {

    //Game Variables
    private String[][] board;
    private boolean end;
    private Scanner sc;

    private String block = "*";

    public Java() {
	end = false;
	sc = new Scanner();
	board = new char[8][8];
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
	board[0][0] = rook;
	board[0][1] = knight;
	board[0][2] = bishop;
	board[0][3] = queen;
	board[0][4] = king;
	board[0][5] = bishop;
	board[0][6] = knight;
	board[0][7] = rook;
	for (int i = 0; i < 8; i++) {
	    board[1][i] = pawn;
	}
    }

    //prints the board
    public String toString() {
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s += board[i][j];
	    }
	    s += "\n";
	}
	return s;
    }

    public static void main(String[] args) {
	Chess game = new Chess();
	game.gameLoop();
    }
}
