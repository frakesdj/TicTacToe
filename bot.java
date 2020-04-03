public class bot {
    theBoard dup;
    theBoard cop;
    int player;
    int other;
    int count;
    public bot(theBoard d, int p, int gameCount)
    {
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 3; y++)
            {
                dup.board[x][y] = d.board[x][y];
                cop.board[x][y] = d.board[x][y];
            }
        }
        player = p;
        if(player == 1)
        {
            other = 2;
        }
        else
        {
            other = 1;
        }
        count = gameCount;
    }

    public int[] turn()
    {
        int[] cord = new int[2];
        cord[0] = -1;
        cord[1] = -1;
        boolean valid;
        boolean win;
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 3; y++)
            {
                if (valid == dup.setBoard(x, y, player))
                {
                    count++;
                    if(dup.checkWin(x, y, player))
                    {
                        cord[0] = x;
                        cord[1] = y;
                        return cord;
                    }
                    else
                    {
                    }
                    count--;
                }
            }

        }
        return cord;
    }
    public boolean botRecurse(theBoard bod)
    {
        theBoard holder = bod;
        for(int j = 0; j < 2; j++)
        {
            for(int t = 0; t < 2; t++)
            {
                if(bod.setBoard(j, t, player))
                {
                    
            }
        }
    }
    public boolean check(theBoard bod)
    {
        for
    }
    public void reset()
    {
        for(int x; x < 2; x++)
        {
            for(int j; j < 2; j++)
            {
                dup.board[x][j] = cop.board[x][j];
            }
        }
    }


}
