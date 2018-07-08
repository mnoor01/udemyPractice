package com.company.mvc;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumber= new JTextField(10);
    private JLabel additionLabel= new JLabel("+");
    private JTextField secondNumber= new JTextField(10);
    private JButton calculateButton= new JButton("calculate");
    private JTextField calcSolution= new JTextField(10);




    CalculatorView(){
        JPanel calcPanel= new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);


    }
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public JLabel getAdditionLabel() {
        return additionLabel;
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }

    public JTextField getCalcSolution() {
        return calcSolution;
    }
    public void setFirstNumber(JTextField firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setAdditionLabel(JLabel additionLabel) {
        this.additionLabel = additionLabel;
    }

    public void setSecondNumber(JTextField secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setCalculateButton(JButton calculateButton) {
        this.calculateButton = calculateButton;
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }
    void addCalculationListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }

}
