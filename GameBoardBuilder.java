package joshs.tictactoe;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameBoardBuilder 
{
    private Label gameResult;
    
    private Button topLeft, topCenter, topRight, middleLeft, middleCenter, 
    middleRight, bottomLeft, bottomCenter, bottomRight, reset, exit;
    
    private Image xImage, oImage, blankImage ;
    private ImageView[] xImageArray, oImageArray, blankImageArray;
    
    private String[][] gameBoard = new String[3][3];
    
    private Stage resultStage;
    private Scene resultScene, gameScene;
    
    private int count = 0;
    private Stage gameStage;
    
    static boolean isDone;

    public GameBoardBuilder()
    {
       
        blankImageArray = new ImageView[9];
        
        xImageArray = new ImageView[9];
        oImageArray = new ImageView[9];
    
        gameResult = new Label();
        
        gameStage = new Stage();
        
        xImage = new Image("file:C:\\Users\\joshs\\Documents\\NetBeansProjects\\TicTacToe\\src\\images\\xMove.jpg");
        oImage = new Image("file:C:\\Users\\joshs\\Documents\\NetBeansProjects\\TicTacToe\\src\\images\\circleMove.jpg");
        blankImage = new Image("file:C:\\Users\\joshs\\Documents\\NetBeansProjects\\TicTacToe\\src\\images\\blankSpace.jpg");
        
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard.length; j++)
            {
                gameBoard[i][j] = " ";
            }
        }
        
        for(int i = 0; i < blankImageArray.length; i++)
        {
            blankImageArray[i] = new ImageView(blankImage);
            blankImageArray[i].setFitWidth(50);
            blankImageArray[i].setFitHeight(50);
        }

        
        for(int i = 0; i <xImageArray.length; i++)
        {
            xImageArray[i] = new ImageView(xImage);
            xImageArray[i].setFitWidth(50);
            xImageArray[i].setFitHeight(50);
        }
        
        for(int i = 0; i < oImageArray.length; i++)
        {
            oImageArray[i] = new ImageView(oImage);
            oImageArray[i].setFitWidth(50);
            oImageArray[i].setFitHeight(50);
        }
          
        topLeft = new Button();   
        topCenter = new Button();
        topRight = new Button();
        middleLeft = new Button();
        middleCenter = new Button();
        middleRight = new Button();
        bottomLeft = new Button();
        bottomCenter = new Button();
        bottomRight = new Button();
        
        topLeft.setOnAction(new TopLeftButtonHandler());
        topCenter.setOnAction(new TopCenterButtonHandler());
        topRight.setOnAction(new TopRightButtonHandler());
        middleLeft.setOnAction(new MiddleLeftButtonHandler());
        middleCenter.setOnAction(new MiddleCenterButtonHandler());
        middleRight.setOnAction(new MiddleRightButtonHandler());
        bottomLeft.setOnAction(new BottomLeftButtonHandler());
        bottomCenter.setOnAction(new BottomCenterButtonHandler());
        bottomRight.setOnAction(new BottomRightButtonHandler());
        
        topLeft.setGraphic(blankImageArray[0]);
        topCenter.setGraphic(blankImageArray[1]);
        topRight.setGraphic(blankImageArray[2]);
        middleLeft.setGraphic(blankImageArray[3]);
        middleCenter.setGraphic(blankImageArray[4]);
        middleRight.setGraphic(blankImageArray[5]);
        bottomLeft.setGraphic(blankImageArray[6]);
        bottomCenter.setGraphic(blankImageArray[7]);
        bottomRight.setGraphic(blankImageArray[8]);
        
        HBox topRow = new HBox(5, topLeft, topCenter, topRight);
        HBox middleRow = new HBox(5, middleLeft, middleCenter, middleRight);
        HBox bottomRow = new HBox(5, bottomLeft, bottomCenter, bottomRight);
        
        
        BorderPane boardLayout = new BorderPane();
        boardLayout.setTop(topRow);
        boardLayout.setCenter(middleRow);
        boardLayout.setBottom(bottomRow);
        
        gameScene = new Scene(boardLayout);
        gameStage.setScene(gameScene);
        gameStage.setTitle("Tic Tac Toe");
        gameStage.show(); 
    }
    
    private class TopLeftButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {     
            if(count % 2 == 0)
            {
               topLeft.setGraphic(xImageArray[0]);
               gameBoard[0][0] = "x";
               topLeft.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
            else
            {
               topLeft.setGraphic(oImageArray[0]);
               gameBoard[0][0] = "o";
               topLeft.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
        }
    }
    private class TopCenterButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            if(count % 2 == 0)
            {
               topCenter.setGraphic(xImageArray[1]);
               gameBoard[0][1] = "x";
               topCenter.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
            else
            {
               topCenter.setGraphic(oImageArray[1]);
               gameBoard[0][1] = "o";
               topCenter.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
        }
    }
    private class TopRightButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            if(count % 2 == 0)
            {
               topRight.setGraphic(xImageArray[2]);
               gameBoard[0][2] = "x";
               topRight.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
            else
            {
               topRight.setGraphic(oImageArray[2]);
               gameBoard[0][2] = "o";
               topRight.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
        }
    }
    private class MiddleLeftButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            if(count % 2 == 0)
            {
               middleLeft.setGraphic(xImageArray[3]);
               gameBoard[1][0] = "x";
               middleLeft.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
            else
            {
               middleLeft.setGraphic(oImageArray[3]);
               gameBoard[1][0] = "o";
               middleLeft.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
        }
    }
    private class MiddleCenterButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            if(count % 2 == 0)
            {
               middleCenter.setGraphic(xImageArray[4]);
               gameBoard[1][1] = "x";
               middleCenter.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
            else
            {
               middleCenter.setGraphic(oImageArray[4]);
               gameBoard[1][1] = "o";
               middleCenter.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
        }
    }
    private class MiddleRightButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            if(count % 2 == 0)
            {
               middleRight.setGraphic(xImageArray[5]);
               gameBoard[1][2] = "x";
               middleRight.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
            else
            {
               middleRight.setGraphic(oImageArray[5]);
               gameBoard[1][2] = "o";
               middleRight.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
        }
    }
    private class BottomLeftButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            if(count % 2 == 0)
            {
               bottomLeft.setGraphic(xImageArray[6]);
               gameBoard[2][0] = "x";
               bottomLeft.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
            else
            {
               bottomLeft.setGraphic(oImageArray[6]);
               gameBoard[2][0] = "o";
               bottomLeft.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
        }
    }
    private class BottomCenterButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            
    
            if(count % 2 == 0)
            {
               bottomCenter.setGraphic(xImageArray[7]);
               gameBoard[2][1] = "x";
               bottomCenter.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
            else
            {
               bottomCenter.setGraphic(oImageArray[7]);
               gameBoard[2][1] = "o";
               bottomCenter.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
        }
    }
    private class BottomRightButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            
            if(count % 2 == 0)
            {
               bottomRight.setGraphic(xImageArray[8]);
               gameBoard[2][2] = "x";
               bottomRight.setOnMouseClicked(e -> handleMouseClick());
               count++;
            }
            else
            {
               bottomRight.setGraphic(oImageArray[8]);
               gameBoard[2][2] = "o";
               bottomRight.setOnMouseClicked(e -> handleMouseClick());
              
               count++;
            }
        }
    }
    
    //Resets game board in event of new game.
    private class ResetButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            resultStage.close();
            for(int i = 0; i < gameBoard.length; i++)
            {
                for(int j = 0; j < gameBoard.length; j++)
                {
                    gameBoard[i][j] = " ";
                }
            }
            
            topLeft.setGraphic(blankImageArray[0]);
            topCenter.setGraphic(blankImageArray[1]);
            topRight.setGraphic(blankImageArray[2]);
            middleLeft.setGraphic(blankImageArray[3]);
            middleCenter.setGraphic(blankImageArray[4]);
            middleRight.setGraphic(blankImageArray[5]);
            bottomLeft.setGraphic(blankImageArray[6]);
            bottomCenter.setGraphic(blankImageArray[7]);
            bottomRight.setGraphic(blankImageArray[8]);
            
            HBox topRow = new HBox(5, topLeft, topCenter, topRight);
            HBox middleRow = new HBox(5, middleLeft, middleCenter, middleRight);
            HBox bottomRow = new HBox(5, bottomLeft, bottomCenter, bottomRight);
        
            BorderPane boardLayout = new BorderPane();
            boardLayout.setTop(topRow);
            boardLayout.setCenter(middleRow);
            boardLayout.setBottom(bottomRow);
        
            gameStage.close();
            Scene gameScene = new Scene(boardLayout);
            gameStage.setScene(gameScene);
            gameStage.setTitle("Tic Tac Toe");
            gameStage.show(); 
        }
    }
    
    private class ExitButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            gameStage.close();
            resultStage.close();
        }
    }
    
    //Determines winner, displays result, gives user option to reset board.
    private void handleMouseClick()
    {
        isDone = false;
        
        reset = new Button();
        exit = new Button();
        
        reset.setOnAction(new ResetButtonHandler());
        exit.setOnAction(new ExitButtonHandler());
        
        reset.setText("New Game");
        exit.setText("Exit");
        
        VBox resultBox = new VBox(5, gameResult, reset, exit);
        resultBox.setPadding(new Insets(5));
        resultBox.setAlignment(Pos.CENTER);
        resultStage = new Stage();
        resultScene = new Scene(resultBox);
        
        if(Functions.checkXwinner(gameBoard) == false && Functions.checkOwinner(gameBoard) == true)
        {
            isDone = true;
            count = 0;
            gameResult.setText("O wins!");
            resultStage.setScene(resultScene);
            resultStage.show();
        }
        else if(Functions.checkXwinner(gameBoard) == true && Functions.checkOwinner(gameBoard) == false)
        {
            isDone = true;
            count = 0;
            gameResult.setText("X wins!");
            resultStage.setScene(resultScene);
            resultStage.show();   
        }
        else if(Functions.checkXwinner(gameBoard) == false && Functions.checkOwinner(gameBoard) == false && count == 9)
        {
            isDone = true;
            count = 0;
            gameResult.setText("Draw!");
            resultStage.setScene(resultScene);
            resultStage.show();
        }
    }    
}
