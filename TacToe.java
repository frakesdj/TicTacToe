import java.util.Scanner;
import java.lang.Character;
public class TacToe {
    //Xs ARE 1
    //Os ARE 2
    //NOTHING CLEAR
    theBoard board;
    public TacToe(int p, int b)
    {
        board = new theBoard();
    }
    
    public static void main(String[] args)
    {
        TacToe t = new TacToe(1, 2);
        t.gameStart();
    }
    public void gameStart()
    {
        board.clearBoard();
        Scanner read = new Scanner(System.in);
        char d = 'q';
        while(true)
        {
            System.out.println("Chose X or O by typing X or O. You can also type q to quit.");
            d = read.next().charAt(0);
            d = Character.toLowerCase(d);
            if(d == 'x')
            {
                break;
            }
            else if(d == 'o')
            {
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
           board.drawToe();
           board.setBoard( 1, 1, 2);
           System.out.println("\n\n");
           board.drawToe();
           System.out.println("\n\n");
           board.setBoard( 0, 0, 1);
           board.setBoard( 0, 1, 1);
           board.setBoard( 0, 2, 1);
           if(board.checkWin(0, 2, 1))
           {
               System.out.println("Won \n");
           }
           board.drawToe();
        }
    }

}
