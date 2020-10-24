package com.company.task11to12;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.Random;

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

    private boolean desperateSituation = false;
    private int motionBot = -1;
    private int motionBotWin = -1;

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
                    gameWithBot(motion,0,0);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton1)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%5==0)
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
                        if (motion%5==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [1,1].\n");
                            gameWithBot(motion, 0,0);
                            button1.setText("o");
                        } else {
                            outputText.append("Ход ИИ в [1,1].\n");
                            gameWithBot(motion,0,0);
                            button1.setText("x");
                        }
                        flagButton1 = true;
                    }
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton2)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%5==0)
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
                        if (motion%5==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [2,1].\n");
                            gameWithBot(motion, 1,0);
                            button2.setText("o");
                        } else {
                            outputText.append("Ход ИИ в [2,1].\n");
                            gameWithBot(motion,1,0);
                            button2.setText("x");
                        }
                        flagButton2 = true;
                    }
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton3)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%5==0)
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
                        if (motion%5==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [3,1].\n");
                            gameWithBot(motion, 2,0);
                            button3.setText("o");
                        } else {
                            outputText.append("Ход ИИ в [3,1].\n");
                            gameWithBot(motion,2,0);
                            button3.setText("x");
                        }
                        flagButton3 = true;
                    }
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton4)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%5==0)
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
                        if (motion%5==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [1,2].\n");
                            gameWithBot(motion, 0,1);
                            button4.setText("o");
                        } else {
                            outputText.append("Ход ИИ в [1,2].\n");
                            gameWithBot(motion,0,1);
                            button4.setText("x");
                        }
                        flagButton4 = true;
                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton5)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%5==0)
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
                        if (motion%5==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [2,2].\n");
                            gameWithBot(motion, 1,1);
                            button5.setText("o");
                        } else {
                            outputText.append("Ход ИИ в [2,2].\n");
                            gameWithBot(motion,1,1);
                            button5.setText("x");
                        }
                        flagButton5 = true;
                    }
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton6)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%5==0)
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
                        if (motion%5==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [3,2].\n");
                            gameWithBot(motion, 2,1);
                            button6.setText("o");
                        } else {
                            outputText.append("Ход ИИ в [1,1].\n");
                            gameWithBot(motion,2,1);
                            button6.setText("x");
                        }
                        flagButton6 = true;
                    }
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton7)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%5==0)
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
                        if (motion%5==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [1,3].\n");
                            gameWithBot(motion, 0,2);
                            button7.setText("o");
                        } else {
                            outputText.append("Ход ИИ в [1,3].\n");
                            gameWithBot(motion,0,2);
                            button7.setText("x");
                        }
                        flagButton7 = true;
                    }
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton8)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%5==0)
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
                        if (motion%5==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [2,3].\n");
                            gameWithBot(motion, 1,2);
                            button8.setText("o");
                        } else {
                            outputText.append("Ход ИИ в [2,3].\n");
                            gameWithBot(motion,1,2);
                            button8.setText("x");
                        }
                        flagButton8 = true;
                    }
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!flagButton9)&&(!flagEndGame)) {
                    if ((flag) && (gameWithHuman)) {
                        if (motion%5==0)
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
                        if (motion%5==0)
                            outputText.setText("");
                        if (motion % 2 == 1) {
                            outputText.append("Ход в [3,3].\n");
                            gameWithBot(motion, 2,2);
                            button9.setText("o");
                        } else {
                            outputText.append("Ход ИИ в [3,3].\n");
                            gameWithBot(motion,2,2);
                            button9.setText("x");
                        }
                        flagButton9 = true;
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
            outputText.append("Очистка экрана каждые 5 ходов.\n" + "Очередь 1 игрока.\n");
        }
    }

    public void gameWithBot(int motionInput, int place1, int place2){
        if ((flagBeginGame)&&(!flagEndGame)) {
            if (motionInput % 2 == 1) {
                arrayCrossZero[place1][place2]=1;
                checkCrossZero(motion,arrayCrossZero);
                if (!flagEndGame) {
                    outputText.append("Очередь ИИ.\n");
                    motion++;
                    checkField(arrayCrossZero);
                }
            } else {
                arrayCrossZero[place1][place2]=2;
                checkCrossZero(motion,arrayCrossZero);
                if (!flagEndGame) {
                    outputText.append("Очередь человека.\n");
                    motion++;
                }
            }
        }
        else if (!flagEndGame) {
            flagBeginGame = true;
            outputText.append("Очистка экрана каждые 5 ходов.\n" + "Очередь человека.\n");
        }
    }

    public void checkField(int[][] array){
        int[] arrayOne = new int[3];
        if (!desperateSituation) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    arrayOne[i] = array[i][j];
                }
                checkLine(arrayOne, j);
                checkBotWin(arrayOne,motionBot);
            }
        }
        if (!desperateSituation) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    arrayOne[i] = array[j][i];
                }
                checkColumn(arrayOne, j);
                checkBotWin(arrayOne,motionBot);
            }
        }
        if (!desperateSituation) {
            for (int i = 0; i < 3; i++)
                arrayOne[i] = array[i][i];
            if ((arrayOne[0] == arrayOne[2]) && (arrayOne[1] == 0)&&(arrayOne[0]!=0)) {
                motionBot = 4;
                desperateSituation = true;
            } else if ((arrayOne[1] == arrayOne[2]) && (arrayOne[0] == 0)&&(arrayOne[1]!=0)) {
                motionBot = 0;
                desperateSituation = true;
            } else if ((arrayOne[0] == arrayOne[1]) && (arrayOne[2] == 0)&&(arrayOne[0]!=0)) {
                motionBot = 8;
                desperateSituation = true;
            }
            checkBotWin(arrayOne,motionBot);
        }
        if (!desperateSituation) {
            for (int i = 0; i < 3; i++)
                arrayOne[i] = array[2-i][i];
            if ((arrayOne[0] == arrayOne[2]) && (arrayOne[1] == 0)&&(arrayOne[0]!=0)) {
                motionBot = 4;
                desperateSituation = true;
            } else if ((arrayOne[1] == arrayOne[2]) && (arrayOne[0] == 0)&&(arrayOne[1]!=0)) {
                motionBot = 2;
                desperateSituation = true;
            } else if ((arrayOne[0] == arrayOne[1]) && (arrayOne[2] == 0)&&(arrayOne[0]!=0)) {
                motionBot = 6;
                desperateSituation = true;
            }
            checkBotWin(arrayOne,motionBot);
        }
        if (desperateSituation){
            if (motionBotWin!=-1)
                motionBot=motionBotWin;
            pressButt(motionBot);
            motionBot = -1;
            desperateSituation = false;
        } else {
            workBot(array);
        }
    }

    public void checkBotWin(int[] arrayOne, int motion){
        if ((arrayOne[0]==2)||(arrayOne[1]==2)||(arrayOne[2]==2)){
            motionBotWin = motion;
        }
    }

    public void workBot(int [][] array){
        Random random = new Random();
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sum+=array[i][j];
            }
        }
        if (sum == 1){
            if (array[1][1]==1){
                int r = random.nextInt(4)*2;
                while (r==4)
                    r = random.nextInt(4)*2;
                pressButt(r);
            }
            else if ((array[0][0]==1)||(array[0][2]==1)||(array[2][0]==1)||(array[2][2]==1)){
                pressButt(4);
            }
            else if ((array[0][1]==1)||(array[1][2]==1)||(array[1][0]==1)||(array[2][1]==1)){
                pressButt(4);
            }
        }
        else if (sum == 4){
            if ((array[1][1]==2)&&((array[0][0]==1)&&(array[2][2]==1)||(array[2][0]==1)&&(array[0][2]==1))){
                int r = (random.nextInt(3) + 1) * 2 - 1;
                pressButt(r);
            }
            else if ((array[1][1]==2)&&(array[1][0]==1)&&(array[0][2]==1))
                pressButt(0);
            else if ((array[1][1]==2)&&(array[1][0]==1)&&(array[2][2]==1))
                pressButt(2);
            else if ((array[1][1]==2)&&(array[0][0]==1)&&(array[2][1]==1))
                pressButt(3);
            else if ((array[1][1]==2)&&(array[0][2]==1)&&(array[2][1]==1))
                pressButt(8);
            else if ((array[1][1]==2)&&(array[2][0]==1)&&(array[1][2]==1))
                pressButt(8);
            else if ((array[1][1]==2)&&(array[0][0]==1)&&(array[1][2]==1))
                pressButt(6);
            else if ((array[1][1]==2)&&(array[2][0]==1)&&(array[0][1]==1))
                pressButt(0);
            else if ((array[1][1]==2)&&(array[2][2]==1)&&(array[0][1]==1))
                pressButt(6);
            else if ((array[1][1]==2)&&(array[0][1]==1)&&(array[1][0]==1))
                pressButt(0);
            else if ((array[1][1]==2)&&(array[1][0]==1)&&(array[2][1]==1))
                pressButt(2);
            else if ((array[1][1]==2)&&(array[2][1]==1)&&(array[1][2]==1))
                pressButt(8);
            else if ((array[1][1]==2)&&(array[1][2]==1)&&(array[0][1]==1))
                pressButt(6);
            else if ((array[1][1]==2)&&(array[0][1]==1)&&(array[2][1]==1))
                pressButt(0);
            else if ((array[1][1]==2)&&(array[1][0]==1)&&(array[1][2]==1))
                pressButt(2);
            else if (array[1][1]==1){
                if (array[0][0]==1)
                    pressButt(2);
                else if (array[2][0]==1)
                    pressButt(0);
                else if (array[0][2]==1)
                    pressButt(0);
                else if (array[2][2]==1)
                    pressButt(2);
            }
        }
        else if (sum==7){
            pressSomething();
        }
        else if (sum==10)
        {
            pressSomething();
        }
    }

    public void pressSomething(){
        if (!flagButton1)
            pressButt(0);
        else if (!flagButton2)
            pressButt(1);
        else if (!flagButton3)
            pressButt(2);
        else if (!flagButton4)
            pressButt(3);
        else if (!flagButton5)
            pressButt(4);
        else if (!flagButton6)
            pressButt(5);
        else if (!flagButton7)
            pressButt(6);
        else if (!flagButton8)
            pressButt(7);
        else if (!flagButton9)
            pressButt(8);
    }

    public void checkLine(int [] array, int number){
        if ((array[0]==array[2])&&(array[1]==0)&&(array[0]!=0)){
            motionBot = (number*3)+1;
            desperateSituation = true;
        }
        else if ((array[1]==array[2])&&(array[0]==0)&&(array[1]!=0)){
            motionBot = (number*3);
            desperateSituation = true;
        }
        else if ((array[0]==array[1])&&(array[2]==0)&&(array[0]!=0)){
            motionBot = (number*3)+2;
            desperateSituation = true;
        }
    }

    public void checkColumn(int [] array, int number){
        if ((array[0]==array[2])&&(array[1]==0)&&(array[0]!=0)){
            motionBot = number+3;
            desperateSituation = true;
        }
        else if ((array[1]==array[2])&&(array[0]==0)&&(array[1]!=0)){
            motionBot = number;
            desperateSituation = true;
        }
        else if ((array[0]==array[1])&&(array[2]==0)&&(array[0]!=0)){
            motionBot = number+6;
            desperateSituation = true;
        }
    }

    public void pressButt(int number){
        if (number==0)
            button1.doClick();
        else if (number==1)
            button2.doClick();
        else if (number==2)
            button3.doClick();
        else if (number==3)
            button4.doClick();
        else if (number==4)
            button5.doClick();
        else if (number==5)
            button6.doClick();
        else if (number==6)
            button7.doClick();
        else if (number==7)
            button8.doClick();
        else if (number==8)
            button9.doClick();
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
        if ((!gameWithHuman)&&(flagEndGame)) {
            if (motionInput % 2 == 0)
                outputText.append("Выиграл компьютер.");
            else
                outputText.append("Выиграл человек.");
        }
        int sum = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                sum+=array[i][j];
        if ((sum==13)&&(!flagEndGame)){
            outputText.append("Это ничья.");
            flagEndGame = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { new CrossZero(); }
        });
    }
}
