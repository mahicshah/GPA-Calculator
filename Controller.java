package com.example.gpa_calculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController{

    @FXML
    public TextField Subject;
    @FXML
    public TextField Credits;
    @FXML
    public TextField Grade;
    @FXML
    private Label GPA;
    @FXML
    private Button AddButton;
    @FXML
    private Button CalculateButton;
    @FXML
    private Button ResetButton;
    @FXML
    private ListView myList_1;
    @FXML
    private ListView myList_2;
    @FXML
    private ListView myList_3;


    double marks = 0, sum = 0, gpa = 0.00;
    int cred = 0, total_cred = 0;
    public String s, c, g;


    public void calculation(ActionEvent event) {

        s = Subject.getText();
        c = Credits.getText();
        g = Grade.getText();

        if (g.equals("A+"))
            marks = 10;

        else if (g.equals("A"))
            marks = 9;

        else if (g.equals("B"))
            marks = 8;

        else if (g.equals("C"))
            marks = 7;

        else if (g.equals("D"))
            marks = 6;

        else if (g.equals("E"))
            marks = 5;

        else if (g.equals("F"))
            marks = 0;

        else
            Grade.setText(("Invalid Grade."));

        cred = Integer.parseInt(Credits.getText());
        total_cred += cred;
        sum = sum + (cred * marks);

        gpa = sum / total_cred;

        double rounded_gpa = Math.round(gpa * 100.0) / 100.0;

        GPA.setText(String.valueOf(rounded_gpa));

        myList_1.getItems().add("                           "+ Subject.getText() + "           ");
        myList_2.getItems().add("                          "+ Credits.getText() + "           ");
        myList_3.getItems().add("                       "+ g + "         ");

        System.out.println("subject = " + s);
        System.out.println("credits = " + cred);
        System.out.println("grade = " + g);
        System.out.println("marks = " + marks);
        System.out.println("sum = " + sum);
        System.out.println("gpa = " + gpa);

        Subject.setText("");
        Credits.setText("");
        Grade.setText("");
    }


    public void add(ActionEvent event) {

        g = Grade.getText();

        if (g.equals("A+"))
            marks = 10;

        else if (g.equals("A"))
            marks = 9;

        else if (g.equals("B"))
            marks = 8;

        else if (g.equals("C"))
            marks = 7;

        else if (g.equals("D"))
            marks = 6;

        else if (g.equals("E"))
            marks = 5;

        else if (g.equals("F"))
            marks = 0;

        else
            Grade.setText(("Invalid Grade."));

        cred = Integer.parseInt(Credits.getText());
        total_cred += cred;
        sum = sum + (cred * marks);

        gpa = sum / total_cred;

        double rounded_gpa = Math.round(gpa * 100.0) / 100.0;

        myList_1.getItems().add("                           "+ Subject.getText() + "           ");
        myList_2.getItems().add("                          "+ Credits.getText() + "           ");
        myList_3.getItems().add("                       "+ g + "         ");

        System.out.println("total cred = " + total_cred);
        System.out.println("sum = " + sum);


        Subject.setText("");
        Credits.setText("");
        Grade.setText("");
    }

    public void reset(ActionEvent event) {

        marks = 0;
        sum = 0;
        gpa = 0.00;
        cred = 0;
        total_cred = 0;

        GPA.setText("0.00");
        Subject.setText("");
        Credits.setText("");
        Grade.setText("");

        myList_1.getItems().clear();
        myList_2.getItems().clear();
        myList_3.getItems().clear();

    }
}
