import java.util.Scanner;
import java.lang.Character;
public class TacToe {
    //Xs ARE 1
    //Os ARE 2
    //NOTHING CLEAR
    theBoard board;
    boolean numPlayers;
    int player;
    public TacToe()
    {
        board = new theBoard();
        numPlayers = false;
        player = 0;
    }
    
    public static void main(String[] args)
    {
        TacToe t = new TacToe();
        t.gameStart();
    }
    public void gameStart()
    {
        board.clearBoard();
        Scanner read = new Scanner(System.in);
        char f = 'w';
        numPlayers = false;
        /*while(true)
        {
            System.out.println("Type 1 or 2 for number of players. Use q to quit");
            f = read.next().charAt(0);
            if(f == '1')
            {
                numPlayers = true;
                break;
            }
            else if(f == '2')
            {
                numPlayers = false;
                break;
            }
            else if(f == 'q')
            {
                System.out.println("Goodbye...");
                break;
            }
            else
            {
                System.out.println("Woops! thats not 1 or 2.\n");
            }

        
        }
        */
        if(f != 'q')
        {
            gameChoose();
        }
    }
    public void gameChoose()
    {
        char d = 'w';
        Scanner read = new Scanner(System.in);
        while(true)
        {
            /*if(numPlayers == true)
            {
                System.out.println("\nChose X or O by typing X or O. You can also type q to quit.");
            }
            else
            {*/
            System.out.println("\nPlayer 1 chose X or O by typing X or O. You can also type q to quit.");
            //}
            d = read.next().charAt(0);
            d = Character.toLowerCase(d);
            if(d == 'x')
            {
                player = 1;
                break;
            }
            else if(d == 'o')
            {
                player = 2;
                break;
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
        if(d != 'q')
        {
            playing();
        }
    }
    public void playing()
    {
        board.drawToe();
        Scanner read = new Scanner(System.in);
        int move = 0;
        boolean valid;
        int gameCount = 0;
        boolean win = false;
        int[] woof = new int[2];
        woof[0] = -1;
        woof[1] = 0;
        int playerHolder = player;
        while(gameCount != 9 && win == false)
        {
            move = 0;
            boolean meow = false;
            while(!meow)
            {
                if(playerHolder == 1 && (numPlayers == false || player == 1))
                {
                    System.out.println("\nIts X's turn. Enter your move.");//X takes turn
                }
                else if(playerHolder == 2 && (numPlayers == false || player == 2))
                {
                    System.out.println("\nIts O's turn. Enter your move.");//O takes turn
                }
   
                move = read.nextInt();
                if(move <= 9 && move >=0)//Checks if game is over
                {
                    woof = new int[2];
                    woof = board.getCord(move);
                    meow = board.setBoard(woof[0], woof[1], playerHolder);
                }
                if(move < 0 || move > 9 || meow == false)//Checks to see if move is valid.
                {
                    System.out.println("Invalid move.");
                }
            }
            board.drawToe();//Draws Board
            win = board.checkWin(woof[0], woof[1], player);//Checks for win.
            if(win == false)
            {
                if(playerHolder == 1)
                {
                    playerHolder = 2;
                }
                else
                {
                    playerHolder = 1;
                }
            }
            gameCount++;
        }
        if(gameCount == 9 && win == false)
        {
            System.out.println("CATS!");
        }
        else
        {
            if(playerHolder == 1)
            {
                System.out.println("Congrats! X's WIN!!!!");
            }
            else
            {
                System.out.println("Congrats! O's WIN!!!!");
            }
        }
    }

}
