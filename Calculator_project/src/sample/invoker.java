package sample;

public class invoker {
    command sum;
    command substract;
    command multiply;
    command divide;
    command equal;

    public invoker() { }

    public void setSum(command sum) {
        this.sum = sum;
    }

    public void setSubstract(command substract) {
        this.substract = substract;
    }

    public void setMultiply(command multiply) {
        this.multiply = multiply;
    }

    public void setDivide(command divide) {
        this.divide = divide;
    }

    public void setEqual(command equal){
        this.equal=equal;
    }

    public void sumpressed(){
        sum.execute();
    }

    public void substractpressed(){
        substract.execute();
    }

    public void multiplypressed(){
        multiply.execute();
    }

    public void dividepressed(){
        divide.execute();
    }

    public void equalpressed(){
        equal.execute();
    }
}
