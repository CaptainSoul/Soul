package UI.common;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InventoryUI extends Application {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	       primaryStage.setTitle("Inventory");
	       GridPane grid = new GridPane();
	       grid.setHgap(10);
	       grid.setVgap(10);
	       grid.setPadding(new Insets(25, 25, 25, 25));

	       Text scenetitle = new Text("Inventory");
	       scenetitle.setFont(Font.font("tory", FontWeight.NORMAL, 20));                
	       grid.add(scenetitle, 0, 0, 2, 1);

	       //����Label���󣬷ŵ���0�У���1��
	       Label weapon = new Label("WEAPON");
	       grid.add(weapon, 0, 1);

	       //�����ı�����򣬷ŵ���1�У���1��
	       TextField userTextField = new TextField();
	       grid.add(userTextField, 1, 1);

	       Label armor = new Label("ARMOR");
	       grid.add(armor, 0, 2);

	       PasswordField pwBox = new PasswordField();
	       grid.setGridLinesVisible(true);
	       grid.add(pwBox, 1, 2);
	       
	       Button btn = new Button("close");
	       HBox hbBtn = new HBox(10);
	       hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	       hbBtn.getChildren().add(btn);//����ť�ؼ���Ϊ�ӽڵ�
	       grid.add(hbBtn, 1, 4);//��HBox pane�ŵ�grid�еĵ�1�У���4��
	       
	       final Text actiontarget=new Text();//����������ʾ��Ϣ���ı�
	       grid.add(actiontarget, 1, 6);

	       btn.setOnAction(new EventHandler<ActionEvent>() {//ע���¼�handler
	           @Override
	           public void handle(ActionEvent e) {
	               actiontarget.setFill(Color.CHOCOLATE);//��������ɫ��� firebrick red
	               actiontarget.setText("Sign in button pressed");
	           }
	        });
	       
		//һ����Label
		Label label1 = new Label();
		//һ�����ı�Ԫ�ص�Label
		Label label2 = new Label("Search");
		//һ�����ı���ͼ���Label
		//Image image = new Image(getClass().getResourceAsStream("labels.jpg"));
		//Label label3 = new Label("Search", new ImageView(image));
		//ʹ��Font��Ĺ��캯��������Font����
		label1.setFont(new Font("Arial", 30));
		//ʹ��Font���font��̬����
		label2.setFont(Font.font("Cambria", 32));
		label2.setRotate(270);
		label2.setTranslateY(50);
		Label label4 = new Label("A label that needs to be wrapped");
		label4.setWrapText(true);
		label1.setOnMouseEntered((MouseEvent e) -> {
		    label1.setScaleX(1.5);
		    label1.setScaleY(1.5);
		});

		label1.setOnMouseExited((MouseEvent e) -> {
		    label1.setScaleX(1);
		    label1.setScaleY(1);
		});
		grid.add(label1, 2, 2);
	      
	       Scene scene = new Scene(grid, 300, 500);
	       primaryStage.setScene(scene);
	       primaryStage.show();
	}

}
