package com.company.task10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextArea outputText;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton buttonSum;
    private JButton buttonDiv;
    private JButton buttonMult;
    private JButton buttonDif;
    private JButton buttonC;
    private JPanel rootPanel;
    private JButton buttonResult;
    private JButton buttonPoint;

    private char symbolNow = 0;
    private double first = -1;
    private double second = -1;

    public Calculator() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);                                     // ctrl+o
        setSize(300,300);
        setContentPane(rootPanel);
        setVisible(true);
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append("0");
            }
        });
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.append(".");
            }
        });
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.setText("");
                first = -1;
                second = -1;
            }
        });
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String output = outputText.getText();
                output = returnSymbol('+',output,first);
                outputText.setText(output);
            }
        });
        buttonDif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (outputText.getText().length()==0)
                    outputText.append("-");
                else {
                    String output = outputText.getText();
                    output = returnSymbol('-', output, first);
                    outputText.setText(output);
                }
            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String output = outputText.getText();
                output = returnSymbol('/',output,first);
                outputText.setText(output);
            }
        });
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String output = outputText.getText();
                output = returnSymbol('*',output,first);
                outputText.setText(output);
            }
        });
        buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((outputText.getText().length()!=0)&&(second==-1)) {
                    getSecond(outputText.getText());
                    outputText.append("\n" + operation(first, second, symbolNow));
                }
            }
        });
    }
    private double operation(double firstNumber, double secondNumber, char symbol){
        double operation = 0;
        if (symbol == '+')
            operation = firstNumber + secondNumber;
        else if (symbol == '-')
            operation = firstNumber - secondNumber;
        else if (symbol == '/')
            operation = firstNumber / secondNumber;
        else if (symbol == '*')
            operation = firstNumber * secondNumber;
        return operation;
    }
    private void getSecond(String output){
        if (second==-1) {
            char[] secondNumber = new char[100];
            output.getChars(output.lastIndexOf(symbolNow) + 2, output.length(), secondNumber, 0);
            String str = "";
            for (Character c : secondNumber)
                str += c.toString();
            second = Double.parseDouble(str.trim());
        }
    }
    private String returnSymbol(char symbol, String output, double number){
        String returnSym = output;
        if (output.length()!=0){
            if (number!=-1) {
                returnSym = returnSym.replace('+',symbol);
                returnSym = returnSym.replace('/',symbol);
                returnSym = returnSym.replace('*',symbol);
                if (!returnSym.startsWith("-"))
                    returnSym = returnSym.replace('-',symbol);
                else
                {
                    String returnSym2 = returnSym.substring(1);
                    returnSym2 = returnSym2.replace('-',symbol);
                    returnSym = "-" +returnSym2;
                }
            }
            else {
                first = Double.parseDouble(output);
                returnSym = returnSym + "\n" + symbol + "\n";
            }
            symbolNow = symbol;
        }
        return returnSym;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
}