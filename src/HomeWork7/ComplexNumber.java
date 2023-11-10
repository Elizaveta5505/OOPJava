package HomeWork7;

public class ComplexNumber extends Operation {
    protected float real;
    protected float imaginary;

    public ComplexNumber(float r, float i) {
        super(r, i);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}
