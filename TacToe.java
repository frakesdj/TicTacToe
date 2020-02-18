import java.util.Scanner;
import java.lang.Character;
public class TacToe {
    int[][] board;
    int player;
    int bot;
    int win;
    //Xs ARE 1
    //Os ARE 2
    //NOTHING CLEAR
    public TacToe(int p, int b)
    {
        board = new int[3][3];
        clearBoard();
        player = p;
        bot = b; 
    }
    
    public static void main(String[] args)
    {
        TacToe t = null;
        Scanner read = new Scanner(System.in);
        while(t == null)
        {
            System.out.println("Chose X or O by typing X or O. You can also type q to quit.");
            char d = read.next().charAt(0);
            d = Character.toLowerCase(d);
            if(d == 'x')
            {
                t = new TacToe(1, 2);
            }
            else if(d == 'o')
            {
                t = new TacToe(2, 1);
            }
            else if(d == 'q')
            {
                System.out.println("Quitting....");
                break;
            }
            else
            {
                System.out.println("Woops! That's not a X or an O\n");
            }
        }
        if(t != null)
        {
            t.drawToe();
        }
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
