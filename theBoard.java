import java.lang.Character;
public class theBoard {
    int[][] board;
    //Xs ARE 1
    //Os ARE 2
    //NOTHING CLEAR
    public theBoard(int p, int b)
    {
        board = new int[3][3];
        clearBoard();
    }
    
    public int[][] getBoard()
    {
        return board;
    }

    public boolean checkWin(int x, int y, int piece)
    {
        if(x + 1 < 3)
        {

        }
        if(x - 1 >= 0)
        {
            
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    public boolean setBoard(int x, int y, int piece)
    {
        if(board[x][y] != 0)
        {
            return false;
        }
        else
        {
            board[x][y] = piece;
            return true;
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

    /* Draws board.
     * Uses getShape to know what shape to print;
     */
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