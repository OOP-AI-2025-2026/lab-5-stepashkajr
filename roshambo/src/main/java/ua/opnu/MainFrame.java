package ua.opnu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame implements ActionListener {

    public MainFrame(String title) throws HeadlessException {
        super(title);

        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        ((JComponent) getContentPane()).setBorder(
                BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));

        JButton rockButton = new JButton("Камінь");
        rockButton.addActionListener(this);
        rockButton.setActionCommand("rock");
        JButton paperButton = new JButton("Папір");
        paperButton.addActionListener(this);
        paperButton.setActionCommand("paper");
        JButton scissorsButton = new JButton("Ножиці");
        scissorsButton.addActionListener(this);
        scissorsButton.setActionCommand("scissors");

        this.add(rockButton);
        this.add(paperButton);
        this.add(scissorsButton);

        this.pack();
        this.setVisible(true);
    }

    private GameShape generateShape() {


        int random = new Random().nextInt(3);

        if(random == 0) {
            return new Scissors();
        } else if (random == 1) {
            return new Rock();
        } else {
            return new Paper();
        }

    }

    private int checkWinner(GameShape player, GameShape computer) {

        if(player instanceof Rock && computer instanceof Scissors){
            return 1;
        } else if(player instanceof Scissors && computer instanceof Paper){
            return 1;
        } else if(player instanceof Paper && computer instanceof Rock){
            return 1;
        } else if (player.getClass()==computer.getClass() ){
            return 0;
        } else {
            return -1;
        }


    }

    public String classNameStr(String str){
        String[] masStr = str.split("\\.");
        return masStr[masStr.length-1];
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Генерується ход комп'ютеру
        GameShape computerShape = generateShape();

        GameShape playerShape = new GameShape();
        // Визначаємо, на яку кнопку натиснув гравець
        switch (e.getActionCommand()) {
            case "rock":
                playerShape = new Rock();
                // присвоїти playerShape об'єкт відповідного класу
                break;
            case "paper":
                playerShape = new Paper();
                // присвоїти playerShape об'єкт відповідного класу
                break;
            case "scissors":
                playerShape = new Scissors();
                // присвоїти playerShape об'єкт відповідного класу
                break;
        }

        // Визначити результат гри
        int gameResult = checkWinner(playerShape, computerShape);

        // Сформувати повідомлення
        String message = "Player shape: " + classNameStr(playerShape.getClass().getName()) + ". Computer shape: " + classNameStr(computerShape.getClass().getName()) + ". ";
        switch (gameResult) {
            case -1:
                message += "Computer has won!";
                break;
            case 0:
                message += "It's a tie!";
                break;
            case 1:
                message += "Player has won!";
        }



        // Вивести діалогове вікно з повідомленням
        JOptionPane.showMessageDialog(null, message);
    }
}
