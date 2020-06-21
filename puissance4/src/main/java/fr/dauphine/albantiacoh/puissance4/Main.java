package fr.dauphine.albantiacoh.puissance4;

import fr.dauphine.albantiacoh.puissance4.model.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class Main extends Application
{
    public static void main( String[] args )
    {
        System.out.println( "Puissance 4" );
        System.out.println("Display Graphic interface");
        Game game = new Game(5,6,4);
        launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage.setTitle("Puissance 4");
		BorderPane pane = new BorderPane();
		Scene scene= new Scene(pane,400,400);
		stage.setScene(scene);
		stage.show();
	}
}
