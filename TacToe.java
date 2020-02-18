import java.util.Scanner;

public class TacToe {
    int[][] board;
    boolean character;
    //Xs ARE 1
    //Os ARE 2
    //NOTHING CLEAR
    public TacToe(boolean c)
    {
        board = new int[3][3];
        clearBoard();
        character = c;
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Chose X or O by typing X or O");
        

        TacToe t = new TacToe(true);
        t.drawToe();
    }

    //Clears board.
    public void clearBoard()
    {
        for(int x = 0; x < 3; x++)
        {
            for(int j = 0; j < 3; j++)
            {
                board[j][x] = 0;
            }
        }

    }

    // Draws board.
    public void drawToe()
    {
        System.out.println("   |     |   ");
        System.out.println(" " + getShape(board[0][0]) + " |  " + getShape(board[0][1]) + "  | " + getShape(board[0][2]));
        System.out.println("___|_____|___");
        System.out.println("   |     |   ");
        System.out.println(" " + getShape(board[1][0]) + " |  " + getShape(board[1][1]) + "  | " + getShape(board[1][2]));
        System.out.println("___|_____|___");
        System.out.println("   |     |   ");
        System.out.println(" " + getShape(board[2][0]) + " |  " + getShape(board[2][1]) + "  | " + getShape(board[2][2]));
        System.out.println("   |     |   ");
    }

    // Returns shape to be printed by array.
    public String getShape(int shape)
    {
        if(shape == 0)
        {
            return " ";
        }
        else if(shape == 1)
        {
            return "X";
        }
        else
        {
            return "O";
        }
    }
}
