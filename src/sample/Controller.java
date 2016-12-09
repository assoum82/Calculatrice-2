package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label resulta;
    @FXML
    private Label operation;

    private int number1;
    private int number2;
    private String operateur;


    @FXML
    private void calcul() {
        double resultacalcule = 0;
        switch (operateur) {
            case "+":
                resultacalcule = number1 + number2;
                resulta.setText(String.valueOf(resultacalcule));
                break;
            case "-":
                resultacalcule = number1 - number2;
                resulta.setText(String.valueOf(resultacalcule));
                break;
            case "*":
                resultacalcule = number1 * number2;
                resulta.setText(String.valueOf(resultacalcule));
                break;
            case "/":
                 resultacalcule =(double) number1 / number2;
                resulta.setText(String.valueOf(resultacalcule));
                break;
            default:
                resulta.setText("ERREUR");
                break;
        }
    }


    @FXML
    private void affiche0() {
        if (number1 == 0 && operateur.isEmpty()) {
            number1 = 0;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 0;
            operation.setText(operation.getText() + number2);

        }

    }

    @FXML
    private void affiche1() {
        if (number1 == 0 && operateur.isEmpty()) {
            number1 = 1;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 1;
            operation.setText(operation.getText() + number2);

        }
    }

    @FXML
    private void affiche2() {
        if (number1 == 0&& operateur.isEmpty()) {
            number1 = 2;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 2;
            operation.setText(operation.getText() + number2);

        }

    }

    @FXML
    private void affiche3() {
        if (number1 == 0 && operateur.isEmpty()) {
            number1 = 3;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 3;
            operation.setText(operation.getText() + number2);

        }

    }

    @FXML
    private void affiche4() {
        if (number1 == 0 && operateur.isEmpty()) {
            number1 = 4;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 4;
            operation.setText(operation.getText() + number2);

        }

    }

    @FXML
    private void affiche5() {
        if (number1 == 0 && operateur.isEmpty()) {
            number1 = 5;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 5;
            operation.setText(operation.getText() + number2);

        }

    }

    @FXML
    private void affiche6() {
        if (number1 == 0 && operateur.isEmpty()) {
            number1 = 6;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 6;
            operation.setText(operation.getText() + number2);

        }

    }

    @FXML
    private void affiche7() {
        if (number1 == 0 && operateur.isEmpty()) {
            number1 = 7;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 7;
            operation.setText(operation.getText() + number2);

        }
    }

    @FXML
    private void affiche8() {
        if (number1 == 0 && operateur.isEmpty()) {
            number1 = 8;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 8;
            operation.setText(operation.getText() + number2);

        }

    }

    @FXML
    private void affiche9() {
        if (number1 == 0 && operateur.isEmpty()) {
            number1 = 9;
            operation.setText(operation.getText() + number1);

        } else {
            number2 = 9;
            operation.setText(operation.getText() + number2);

        }

    }

    @FXML
    private void operateurPlus() {

        operateur = "+";
        operation.setText(operation.getText() + operateur);

    }




    @FXML
    private void operateurMoin() {
        operateur = "-";
        operation.setText(operation.getText() + operateur);
    }




    @FXML
    private void operateurMul() {

        operateur = "*";
        operation.setText(operation.getText() + operateur);}


    @FXML
    private void operateurDiv() {
        operateur = "/";
        operation.setText(operation.getText() + operateur);}



    @FXML
    private void reset(){
        this.number1 = 0;
        this.number2 = 0;
        this.operateur = "";
        this.resulta.setText("");
        this.operation.setText("");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       reset();

    }
}




