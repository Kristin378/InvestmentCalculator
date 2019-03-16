package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvestmentCalculator extends Application {
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberofYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tffutureValue = new TextField();
	//EventHandler<ActionEvent> tfFutureValue = (EventHandler<ActionEvent>) new TextField();
	Button btCalculate = new Button("Calculate");

	@Override
	public void start(Stage primaryStage) {
		
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label ("Investment Amount: "), 0, 0);
		gridPane.add(tfInvestmentAmount, 1, 0);
		gridPane.add(new Label ("Number of Years: "), 0, 1);
		gridPane.add(tfNumberofYears, 1, 1);
		gridPane.add(new Label ("Annual Interest Rate: "), 0, 2);
		gridPane.add(tfAnnualInterestRate, 1, 2);
		gridPane.add(new Label ("Future Value: "), 0, 3);
		gridPane.add(tffutureValue, 1, 3);
		//gridPane.add(tfFutureValue, 1, 3);
		gridPane.add(btCalculate, 1, 4);
		
		gridPane.setAlignment(Pos.CENTER);
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberofYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		//((Labeled) tfFutureValue).setAlignment(Pos.BOTTOM_RIGHT);
		//((TextInputControl) tfFutureValue).setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		
		
		//btCalculate.setOnAction(tfFutureValue);
		
		btCalculate.setOnAction(e -> calculateFutureValue());
		
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("Investment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	private void calculateFutureValue() {
		double loanAmt = Double.parseDouble(tfInvestmentAmount.getText());
		int years = Integer.parseInt(tfNumberofYears.getText());
		double interestRate = Double.parseDouble(tfAnnualInterestRate.getText());
		
		double loan = 1 + interestRate;
		int exp = years*12;
		
		double futureValue =loanAmt* (Math.pow(loan, exp));
		
		
		
		String s = futureValue + " ";
		tffutureValue.setText(s);
	
	}
	//EventHandler<ActionEvent> tfFutureValue = (EventHandler<ActionEvent>) new TextField();
	//tfFutureValue = calculateFutureValue(String investmentAmount2, int year2, String interest2);
		 
		
		
	
		
		/*double interest = Double.parseDouble(interest2);
		int year = Integer.parseInt(year); 
		double investmentAmount = Double.parseDouble(investmentAmount2);
		
		(investmentAmount, year, interest);
		
		futureValue = investmentAmount * ()*/
		
		
		
		
		
		//futureValue = investmentAmount * (1 + monthlyInterestRate)years*2
	

	public static void main(String[] args) {
		launch(args);
	}
}
