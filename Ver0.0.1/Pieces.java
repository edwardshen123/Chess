public class Pieces {

    //Indicates which player the piece belongs to
    private int player;

    //The Name of the Chess Piece
    private String pieceName;

    //Symbol on Chess Board
    private String icon;

    //Position on Chess Board
    private int x;
    private int y;

    public Chess(int player, String pieceName, int x, int y){
	this.player = player;
	this.pieceName = pieceName;
	this.x = x;
	this.y = y;
	switch (pieceName) {
	case "Knight":
	    icon = "N";
	    break;
	case "Queen":
	    icon = "Q";
	    break;
	case "King":
	    icon = "K";
	    break;
	case "Pawn":
	    icon = "P";
	    break;
	case "Bishop":
	    icon = "B";
	    break;
	case "Rook":
	    icon = "R";
	    break;
	}
    }
    
    public int getPlayer() {
	return player;
    }

    public String getPieceName() {
	return pieceName;
    }

    public String toString() {
	return icon;
    }
}
