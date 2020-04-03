import java.lang.Character;
public class theBoard {
    int[][] board;
    theBoard up;
    //Xs ARE 1
    //Os ARE 2
    //NOTHING CLEAR
    public theBoard()
    {
        board = new int[3][3];
        clearBoard();
        up = null;
    }
    
    public int[][] getBoard()
    {
        return board;
    }

    public boolean checkWin(int x, int y, int piece)
    {
        if(board[0][y] == piece && board[1][y] == piece && board[2][y] == piece)
        {   
            return true;
        }
        if(board[x][0] == piece && board[x][1] == piece && board[x][2] == piece)
        {
            return true;
        }
        //check diagnols
        if(board[0][0] == piece && board[1][1] == piece && board[2][2] == piece)
        {
            return true;
        }
        if(board[0][2] == piece && board[1][1] == piece && board[2][0] == piece)
        {
            return true;
        }
        return false;
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
    {   System.out.println("\t   1    |   2   |   3   ");
        System.out.println("\t " +  getTop(board[0][0]) + "|" + getTop(board[1][0]) + "| " + getTop(board[2][0]));
        System.out.println("\t " +  getMid(board[0][0]) + "|" + getMid(board[1][0]) + "| " + getMid(board[2][0]));
        System.out.println("\t " +  getBot(board[0][0]) + "|" + getBot(board[1][0]) + "| " + getBot(board[2][0]));
        System.out.println("\t________|_______|________");
        System.out.println("\t    4   |   5   |   6   ");
        System.out.println("\t " +  getTop(board[0][1]) + "|" + getTop(board[1][1]) + "| " + getTop(board[2][1]));
        System.out.println("\t " +  getMid(board[0][1]) + "|" + getMid(board[1][1]) + "| " + getMid(board[2][1]));
        System.out.println("\t " +  getBot(board[0][1]) + "|" + getBot(board[1][1]) + "| " + getBot(board[2][1]));
        System.out.println("\t________|_______|________");
        System.out.println("\t    7   |   8   |   9  ");
        System.out.println("\t " +  getTop(board[0][2]) + "|" + getTop(board[1][2]) + "| " + getTop(board[2][2]));
        System.out.println("\t " +  getMid(board[0][2]) + "|" + getMid(board[1][2]) + "| " + getMid(board[2][2]));
        System.out.println("\t " +  getBot(board[0][2]) + "|" + getBot(board[1][2]) + "| " + getBot(board[2][2]));
    }


    // Returns shape to be printed by array.
    public int[] getCord(int block)
    {
        int[] meow = new int[2];
        switch (block) {
            case 1: meow[0] = 0;
                    meow[1] = 0;
                    break;
            
            case 2: meow[0] = 1;
                    meow[1] = 0;
                    break; 

            case 3: meow[0] = 2;
                    meow[1] = 0;
                    break;

            case 4: meow[0] = 0;
                    meow[1] = 1;
                    break;

            case 5: meow[0] = 1;
                    meow[1] = 1;
                    break;

            case 6: meow[0] = 2;
                    meow[1] = 1;
                    break;

            case 7: meow[0] = 0;
                    meow[1] = 2;
                    break;

            case 8: meow[0] = 1;
                    meow[1] = 2;
                    break;

            default: meow[0] = 2;
                     meow[1] = 2;
                     break;
        }
        return meow;
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
    public String getTop(int shape)
    {
        if(shape == 0)
        {
            return "       ";
        }
        if(shape == 1)
        {
            return "  \\ /  ";
        }
        else
        {
            return "   _   ";
        }

    }
    public String getMid(int shape)
    {
        if(shape == 0)
        {
            return "       ";
        }
        if(shape == 1)
        {
           return "   /   ";
        }
        else
        {
            return "  / \\  ";
        }
    }
    public String getBot(int shape)
    {
        if(shape == 0)
        {
            return "       ";
        }
        if(shape == 1)
        {
            return "  / \\  ";
        }
        else
        {
            return "  \\_/  ";
        }
    }
}
    
