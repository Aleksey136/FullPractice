package com.company.java11to12;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class CrossZero extends JFrame {
    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonHumans;
    private JButton buttonBot;
    private JTextArea additionText;
    private JTextArea outputText;

    private boolean flag = false;
    private boolean gameWithHuman = true;
    private boolean flagBeginGame = false;
    private boolean flagEndGame = false;
    private boolean flagButton1 = false;
    private boolean flagButton2 = false;
    private boolean flagButton3 = false;
    private boolean flagButton4 = false;
    private boolean flagButton5 = false;
    private boolean flagButton6 = false;
    private boolean flagButton7 = false;
    private boolean flagButton8 = false;
    private boolean flagButton9 = false;

    private int[][] arrayCrossZero = new int[3][3];
    private int motion = 1;


    public CrossZero(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);                                     // ctrl+o
        setSize(500,500);
        setContentPane(rootPanel);
        setVisible(true);
        rootPanel.addComponentListener(new ComponentAdapter() {
        });
        buttonHumans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!flag){
                    flag = true;
                    additionText.append("\nЗапущена игра для 2 человек.");
                    outputText.append("Игра запущена.\n");
                    gameWithHuman(motion,0,0);
                }
            }
        });
        buttonBot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!flag){
                    flag = true;
                    gameWithHuman = false;
                    additionText.append("\nЗапущена игра с ИИ.");
                    outputText.append("Игра запущена.\n");
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton1)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%4==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [1,1].\n");
                            gameWithHuman(motion, 0,0);
                            button1.setText("o");
                        } else {
                            outputText.append("Ход в [1,1].\n");
                            gameWithHuman(motion, 0,0);
                            button1.setText("x");
                        }
                        flagButton1 = true;
                    }else if (flag){

                    }
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton2)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%4==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [2,1].\n");
                            gameWithHuman(motion, 1,0);
                            button2.setText("o");
                        } else {
                            outputText.append("Ход в [2,1].\n");
                            gameWithHuman(motion, 1,0);
                            button2.setText("x");
                        }
                        flagButton2 = true;
                    }else if (flag){

                    }
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton3)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%4==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [3,1].\n");
                            gameWithHuman(motion, 2,0);
                            button3.setText("o");
                        } else {
                            outputText.append("Ход в [3,1].\n");
                            gameWithHuman(motion, 2,0);
                            button3.setText("x");
                        }
                        flagButton3 = true;
                    }else if (flag){

                    }
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton4)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%4==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [1,2].\n");
                            gameWithHuman(motion, 0,1);
                            button4.setText("o");
                        } else {
                            outputText.append("Ход в [1,2].\n");
                            gameWithHuman(motion, 0,1);
                            button4.setText("x");
                        }
                        flagButton4 = true;
                    }else if (flag){

                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton5)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%4==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [2,2].\n");
                            gameWithHuman(motion, 1,1);
                            button5.setText("o");
                        } else {
                            outputText.append("Ход в [2,2].\n");
                            gameWithHuman(motion, 1,1);
                            button5.setText("x");
                        }
                        flagButton5 = true;
                    }else if (flag){

                    }
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton6)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%4==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [3,2].\n");
                            gameWithHuman(motion, 2,1);
                            button6.setText("o");
                        } else {
                            outputText.append("Ход в [3,2].\n");
                            gameWithHuman(motion, 2,1);
                            button6.setText("x");
                        }
                        flagButton6 = true;
                    }else if (flag){

                    }
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton7)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%4==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [1,3].\n");
                            gameWithHuman(motion, 0,2);
                            button7.setText("o");
                        } else {
                            outputText.append("Ход в [1,3].\n");
                            gameWithHuman(motion, 0,2);
                            button7.setText("x");
                        }
                        flagButton7 = true;
                    }else if (flag){

                    }
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton8)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%4==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [2,3].\n");
                            gameWithHuman(motion, 1,2);
                            button8.setText("o");
                        } else {
                            outputText.append("Ход в [2,3].\n");
                            gameWithHuman(motion, 1,2);
                            button8.setText("x");
                        }
                        flagButton8 = true;
                    }else if (flag){

                    }
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton9)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%4==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [3,3].\n");
                            gameWithHuman(motion, 2,2);
                            button9.setText("o");
                        } else {
                            outputText.append("Ход в [3,3].\n");
                            gameWithHuman(motion, 2,2);
                            button9.setText("x");
                        }
                        flagButton9 = true;
                    }else if (flag){

                    }
                }
            }
        });
    }

    public void gameWithHuman(int motionInput, int place1, int place2){
        if ((flagBeginGame)&&(!flagEndGame)) {
            if (motionInput % 2 == 1) {
                arrayCrossZero[place1][place2]=1;
                checkCrossZero(motion,arrayCrossZero);
                if (!flagEndGame) {
                    outputText.append("Очередь 2 игрока.\n");
                    motion++;
                }
            } else {
                arrayCrossZero[place1][place2]=2;
                checkCrossZero(motion,arrayCrossZero);
                if (!flagEndGame) {
                    outputText.append("Очередь 1 игрока.\n");
                    motion++;
                }
            }
        }
        else if (!flagEndGame) {
            flagBeginGame = true;
            outputText.append("Очистка экрана каждые 4 хода.\n" + "Очередь 1 игрока.\n");
        }
    }

    public void checkCrossZero(int motionInput, int [][] array) {
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][2] != 0) {
                flagEndGame = true;
            }
            if (array[0][i] == array[1][i] && array[1][i] == array[2][i] && array[2][i] != 0) {
                flagEndGame = true;
            }
        }
        if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] != 0) {
            flagEndGame = true;
        } else if (array[2][0] == array[1][1] && array[1][1] == array[0][2] && array[0][2] != 0) {
            flagEndGame = true;
        }
        if ((gameWithHuman)&&(flagEndGame)) {
            int win = 0;
            if (motionInput % 2 == 0)
                win = 2;
            else
                win = 1;
            outputText.append("Выиграл " + win + " игрок.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { new CrossZero(); }
        });
    }
}
