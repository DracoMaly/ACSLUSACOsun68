
public class Minesweeper {
	public static void main(String[] args) {
		Hendow h = Hendow.getInstance();
		Board b = Board.getInstance();
		Board.setupBoard(10, 10, 10);
		System.out.println(b);
	}
}
