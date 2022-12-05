package TaskThree;

public class Fractions {
    private int decimal;
    private int fractional;

    private int getDecimal(){return decimal;}
    private void setMaster(int decimal){this.decimal = decimal;}

    private int getFractional(){return fractional;}
    private void setFractional(int fractional){this.fractional = fractional;}

    public Fractions(int decimal, int fractional) {
        this.decimal = decimal;
        this.fractional = fractional;
    }

    public void Sum(Fractions object) {
        int objDecimal = object.getDecimal();
        int objFractional = object.getFractional();
        if(this.fractional + objFractional>99) {
          this.decimal++;
          this.fractional = (this.fractional + objFractional) % 100;
        } else {
            this.fractional = this.fractional + objFractional;
        }
        this.decimal  += object.decimal;
    }

    public void Mul(Fractions object) {
        int objDecimal = object.getDecimal();
        int objFractional = object.getFractional();
        String fullMyFraction = String.valueOf(decimal) + String.valueOf(fractional);
        String fullInputFraction = String.valueOf(objDecimal) + String.valueOf(objFractional);
        int result = Integer.parseInt(fullMyFraction) + Integer.parseInt(fullInputFraction);
        this.decimal = result / 1000;
        this.fractional = result % 1000 / 100;
    }

    public void Min(Fractions object) {
        int objDecimal = object.getDecimal();
        int objFractional = object.getFractional();
        if(this.fractional - objFractional<0) {
            this.decimal--;
            this.fractional = this.fractional +100 - objFractional;
        }
        this.decimal = this.decimal - objDecimal;
    }

    public double Div(Fractions object) {
        int objDecimal = object.getDecimal();
        int objFractional = object.getFractional();
        String fullMyFraction = String.valueOf(decimal) + String.valueOf(fractional);
        String fullInputFraction = String.valueOf(objDecimal) + String.valueOf(objFractional);
        double result = Integer.parseInt(fullMyFraction) / Integer.parseInt(fullInputFraction);
        return result;
    }
}