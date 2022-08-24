package joshs.tictactoe;

import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application 
{
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage stage)
    {       
        GameBoardBuilder buildBoard = new GameBoardBuilder();
        buildBoard.setBoardBlank();
        buildBoard.setXimageArray();
        buildBoard.setOimageArray();
        buildBoard.setButtonHandlers();
        buildBoard.setButtonEmptyGraphics();
        buildBoard.setHbox();
        buildBoard.setBoardLayout();
        buildBoard.showBoard(); 
    }
}

    
            
         
    
    
