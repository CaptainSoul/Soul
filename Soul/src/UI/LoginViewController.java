package UI;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import archive.UserManagement;
import databaseMain.MainFrame;
import databaseService.UserService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginViewController extends ControlledStage implements Initializable {
	private UserManagement userManagement = UserManagement.getUserManagement();
	@FXML private TextField userNameField;
	@FXML private PasswordField passwordField;
	
	@FXML
	protected void handleSignInAction(ActionEvent event) {
		String userName = userNameField.getText();
		String password = passwordField.getText();
		if(userName.equals("") || password.equals("")) {
			JOptionPane.showMessageDialog(null, "Please enter your ID and password", "Soul Of Hero: HINT!!", JOptionPane.WARNING_MESSAGE);
		} else if(!userManagement.isDuplication(userName)) {
			JOptionPane.showMessageDialog(null, "There is no this ID in database", "Soul Of Hero: HINT!!", JOptionPane.WARNING_MESSAGE);
		} else if(userManagement.checkPassword(userName, password)) {
			JOptionPane.showMessageDialog(null, "Login success", "Soul Of Hero: HINT!!", JOptionPane.PLAIN_MESSAGE);
			UserService userService = new UserService();
			MainApp.user = userService.query(userName);
			MainApp.startView = true;
		} else if(!userManagement.checkPassword(userName, password)) {
			JOptionPane.showMessageDialog(null, "Please check your password", "Soul Of Hero: HINT!!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	@FXML
	protected void handleToSignUpAction(ActionEvent event) {
		MainApp.signUpView = true;
	}
	
	@FXML
	protected void handleNewDatabaseAction(ActionEvent event) {
		MainFrame.main(null);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	

}
