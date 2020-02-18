public class TacToe {
    int[][] board;
    boolean character;
    
    public TacToe(boolean c)
    {
        board = new int[3][3];
        clearBoard();
        character = c;
    }
    
    public static void main(String[] args)
    {
        TacToe t = new TacToe(true);
        t.drawToe();
    }
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
