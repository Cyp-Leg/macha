package userinterface;

import facade.UserLoginFacade;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import businessLogic.User;

public class UserIndex extends Application{ //After logging in, the user is redirected to this interface where his main informations are displayed
	
	
	private String nick;
	private String lastname;
	private String firstname;
	private String dateOfBirth;
	
	public UserIndex(User u)
	{
		this.nick = u.getNickname();
		this.lastname = u.getUserlastname();
		this.firstname = u.getUserfirstname();
		this.dateOfBirth = u.getUserdateofbirth();
	}
	
	public UserIndex()
	{
		
	}
	
	public static void main(String[] args) {
        System.out.println( "Main method inside Thread : " +  Thread.currentThread().getName());
        launch(args);
    }
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("My account");
		GridPane grid = new GridPane();
		//grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10, 10, 10, 10));
		Text scenetitle = new Text("My account");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("Welcome, " + this.nick);
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		Button btn = new Button("Sign in");
		Button btn2 = new Button("New Account");
		HBox hbBtn = new HBox(10);
		HBox hbBtn2 = new HBox(10);
		//hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		hbBtn2.getChildren().add(btn2);
		grid.add(hbBtn, 1, 4);
		grid.add(hbBtn2, 1, 5);
		final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
               // ulf.login(userTextField.getText(), pwBox.getText());
                actiontarget.setText("Sign in button pressed");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("New Account button pressed");
            }
        });
        
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
        primaryStage.show();
		
	}
}
