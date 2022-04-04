package fr.dauphine.albantiacoh.puissance4.view;

import fr.dauphine.albantiacoh.puissance4.model.Game;
import fr.dauphine.albantiacoh.puissance4.model.Mark;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import fr.dauphine.albantiacoh.puissance4.model.Player;
import fr.dauphine.albantiacoh.puissance4.controller.ViewController;;

public class Main extends Application
{
	private Stage window;
	private Scene introScene,gameScene;
	private Game game;
	private ViewController viewController = new ViewController();
    public static void main( String[] args )
    {
        launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage.setTitle("Puissance 4");
		
		window = stage;
		
		// Set the initial scene
		BorderPane mainPane = new BorderPane();
	    FlowPane optionPane = new FlowPane();
	    HBox startPane = new HBox();
	    optionPane.setPadding(new Insets(10));
	    optionPane.setVgap(10);
	    optionPane.setHgap(10);
	    
	    
     
	    // Designing the tile with canvas 
	    Canvas canvas = new Canvas( 500, 200 );
	    //mainPane.getChildren().add( canvas );
	    
	   
	    // Setting the title with the correct style
	    GraphicsContext gc = canvas.getGraphicsContext2D();
	    gc.setFill( Color.BLUE );
	    gc.setStroke( Color.WHITE );
	    gc.setLineWidth(2);
	    Font theFont = Font.font( "Arial black", FontWeight.BOLD, 48 );
	    gc.setFont( theFont );
	    gc.fillText( "Puissance 4", 60, 50 );
	    gc.strokeText( "Puissance 4", 60, 50 );
	    
	    // First player options 
	    ComboBox<Player> comboBoxP1 = new ComboBox<Player>();
	    comboBoxP1.getItems().addAll(new Player("Human"),new Player("Minimax"),new Player("MonteCarlo"));
	    optionPane.getChildren().add(new Label("First Player:"));
	    optionPane.getChildren().add(comboBoxP1);
	    
	    // Second player options 
	    ComboBox<Player> comboBoxP2 = new ComboBox<Player>();
	    comboBoxP2.getItems().addAll(new Player("Human"),new Player("Minimax"),new Player("MonteCarlo"));
	    optionPane.getChildren().add(new Label("Second Player:"));
	    optionPane.getChildren().add(comboBoxP2);
	    
	    // Start Button 
	    Button start = new Button("Start the game");
	    Label humanRule = new Label("A human player got to click on the columns to drop a piece");
	    startPane.getChildren().addAll(start, humanRule);
	    int p1=0;
	    int p2=1;
	    
	    // Event handler for the click on the start button
	    start.setOnAction(e -> {
	    	Game game = new Game(6, 7, 4, p1, p2);
	    	game.start(); // Intitalize an empty board 
	        window.setScene(gameScene); // Define below 
	    });
	    
	    startPane.setAlignment(Pos.CENTER);
	    startPane.setSpacing(10);
	    startPane.setPadding(new Insets(35, 32, 35, 32));
	    
	   
	    mainPane.setTop(canvas);
	    mainPane.setCenter(optionPane);
	    mainPane.setBottom(startPane);
	    introScene = new Scene( mainPane, 500,500);
	    
	    
	    //---------Defining the game Scene with a board 
	    GridPane board = new GridPane();
    	board.setStyle("-fx-background-color: #000b3d");
    	// Add base circles on the grid
    	for(int col=0;col<7;col++) {
    		for(int row=0;row<6;row++)
    		{
    			Circle circle = new Circle();
    			circle.setCenterX(100.0f);
    			circle.setCenterY(100.0f);
    			circle.setRadius(50.0f);
    			circle.setStyle("-fx-background-color: #000b2a; -fx-border-width: 1; -fx-border-color: #022759 ");
    			board.add(circle, col, row);
    		}
    	}  
    	// Add the event handler on the columns
    	board.setOnMouseClicked(e -> {
    		if (e.getX()>=0 && e.getX()<=100) 
    		{
    			System.out.println("col 1");
    			// TODO : Add simplification - Add a counter of action and player 1 is the one 
    			// with nb_action % 2 == 1 
				// Verify that a piece is droppable is yes, Drop a piece in col 1 
    			game.play_col(0); 
    			game.proceed();
    		}
    		else if (e.getX()>100 && e.getX()<=200)
    		{
    			System.out.println("col 2");
				// Verify that a piece is droppable is yes, Drop a piece in col 1 
    			game.play_col(1); 
    			game.proceed();
    		}
    		else if (e.getX()>200 && e.getX()<=300)
    		{
    			System.out.println("col 3");
				// Verify that a piece is droppable is yes, Drop a piece in col 1 
    			game.play_col(2); 
    			game.proceed();
    		}
    		else if (e.getX()>300 && e.getX()<=400)
    		{
    			System.out.println("col 4");
				// Verify that a piece is droppable is yes, Drop a piece in col 1 
    			game.play_col(3); 
    			game.proceed();
    		}
    		else if (e.getX()>400 && e.getX()<=500)
    		{
    			System.out.println("col 5");
    			int player_piece = game.get_player();
				// Verify that a piece is droppable is yes, Drop a piece in col 1 
    			game.play_col(4); 
    			game.proceed();
    		}
    		else if (e.getX()>500 && e.getX()<=600)
    		{
    			System.out.println("col 6");
				// Verify that a piece is droppable is yes, Drop a piece in col 1 
    			game.play_col(5); 
    			game.proceed();
    		}
    		else if (e.getX()>600 && e.getX()<=700)
    		{
				// Verify that a piece is droppable is yes, Drop a piece in col 1 
    			game.play_col(6); 
    			game.proceed();
    		}
    		else
    		{
    			System.out.println("Out of zone");
    		}
    	}
    	); 	
	    gameScene = new Scene(board, 700,600);
	    
	    // Launch the game
	    stage.setScene( introScene );
	    stage.show();
		
	}
	
	
	private void createGameScene() {
		
	}
	
	private void drop_piece(Player player,int col)
	{
		
		//switch 
	}
}
