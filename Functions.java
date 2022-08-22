
package joshs.tictactoe;

//Check for win conditions.
public class Functions 
{
    public static boolean checkXwinner(String arr[][])
    {
        
        for(int i = 0; i < 3; i++)
        {

            if(arr[i][0].equals("x") && arr[i][1].equals("x") && arr[i][2].equals("x"))
            {
                return true;
            }
        }
        for(int j = 0; j < 3; j++)
        {
            if(arr[0][j].equals("x") && arr[1][j].equals("x") && arr[2][j].equals("x"))
            {
                return true;
            }
        }
        if(arr[0][0].equals("x") && arr[1][1].equals("x") && arr[2][2].equals("x"))
        {
            return true;
        }
        if(arr[0][2].equals("x") && arr[1][1].equals("x") && arr[2][0].equals("x"))
        {
            return true;
        }
        return false;
    }
    
    public static boolean checkOwinner(String arr[][])
    {
        
        for(int i = 0; i < 3; i++)
        {

            if(arr[i][0].equals("o") && arr[i][1].equals("o") && arr[i][2].equals("o"))
            {
                return true;
            }
        }
        for(int j = 0; j < 3; j++)
        {
            if(arr[0][j].equals("o") && arr[1][j].equals("o") && arr[2][j].equals("o"))
            {
                return true;
            }
        }
        if(arr[0][0].equals("o") && arr[1][1].equals("o") && arr[2][2].equals("o"))
        {
            return true;
        }
        if(arr[0][2].equals("o") && arr[1][1].equals("o") && arr[2][0].equals("o"))
        {
            return true;
        }
        return false;
    }
    
    public static boolean checkBoardStatus(String arr[][])
    {
        for(int i = 0; i < 3; i++)
        {

            if(arr[i][0].equals(" ") && arr[i][1].equals(" ") && arr[i][2].equals(" "))
            {
                return true;
            }
        }
        for(int j = 0; j < 3; j++)
        {
            if(arr[0][j].equals(" ") && arr[1][j].equals(" ") && arr[2][j].equals(" "))
            {
                return true;
            }
        }
        return true;
    }
            
        
}
