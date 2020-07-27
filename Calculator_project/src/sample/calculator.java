package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculator {

    TextField answer;
    double ans1,ans2;
    String s1,s2;



    public calculator(TextField answer,int operation,double fin_ans){
        this.answer=answer;


    }

    public void sum(){
        String getans=answer.getText();

        answer.setText("");

    }
    public void substract(){
        String getans=answer.getText();

        answer.setText("");
    }
    public void multiply(){
        String getans=answer.getText();

        answer.setText("");
    }
    public void divide(){
        String getans=answer.getText();

        answer.setText("");
    }

    public void equal(){

    }
}
class sumof implements command{

    calculator cal;
    public sumof(calculator cal){
        this.cal=cal;
    }

    @Override
    public void execute() {
        this.cal.sum();
    }

    @Override
    public void unexecute() {

    }
}

class substractof implements command{

    calculator cal;
    public substractof(calculator cal){
        this.cal=cal;
    }

    @Override
    public void execute() {
        this.cal.substract();
    }

    @Override
    public void unexecute() {

    }
}

class multiplyof implements command{

    calculator cal;
    public multiplyof(calculator cal){
        this.cal=cal;
    }

    @Override
    public void execute() {
        this.cal.multiply();
    }

    @Override
    public void unexecute() {

    }
}

class divideof implements command{

    calculator cal;
    public divideof(calculator cal){
        this.cal=cal;
    }

    @Override
    public void execute() {
        this.cal.divide();
    }

    @Override
    public void unexecute() {

    }
}

class equalof implements command{

    calculator cal;
    public equalof(calculator cal){
        this.cal=cal;
    }

    @Override
    public void execute() {
        this.cal.equal();
    }

    @Override
    public void unexecute() {

    }
}
