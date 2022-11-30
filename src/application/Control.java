package application;



import java.awt.Event;
import java.awt.event.MouseEvent;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Control {
	@FXML
	private TextField t3;
	@FXML
	private TextField t1;
	@FXML
	private TextField t2;
	@FXML
	private TextField t4;
@FXML
private Label message;

  int totalChance=5;
  int point=0;
  
@FXML
	public void guess(ActionEvent event) {
		// TODO Auto-generated method stub

	 String  a=t1.getText();
	  
	  String c="Corect answer";
	  String r="Wrong answer";
	int  number=Integer.parseInt(a);
Random rand=new Random();
int myRandNumber=rand.nextInt(1,5);

if (number==myRandNumber) {
	

	t2.setText(c);
	point++;
	message.setText("");
	

	}
else if (number<myRandNumber) 
	
{
	t2.setText(r);
	message.setText(number+" is less than actual");
}
else if (number>myRandNumber) 
	
{
	t2.setText(r);
	message.setText(number+" is greater than actual");
}

totalChance--;
t4.setText(""+totalChance);
t3.setText(""+point);
if (totalChance==0) {
	t4.setText("no more chances");
	message.setText("click 'Submit' to exit!!");
	

	 
}

if (totalChance==-1) {
	
	 javafx.application.Platform.exit();

	 
}

	}


	  
	  
	  
  }
 



