package HomeWork7;

public class Operation {
    protected float real;
    protected float imaginary;

    public Operation(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Operation add(Operation z) {
        return new Operation(real += z.real, imaginary += z.imaginary);
    }

    public Operation sub(Operation z) {
        return new Operation(real -= z.real, imaginary -= z.imaginary);

    }

    public Operation mult(Operation z) {
        float tempReal = real;
        float tempImaginary = imaginary;
        return new Operation(real = (tempReal * z.real) - (tempImaginary * z.imaginary),
                imaginary = (tempReal * z.imaginary) + (tempImaginary * z.real));
    }

    public Operation div(Operation z) {
        float tempReal = real;
        float tempImaginary = imaginary;
        float temp = (z.real * z.real) + (z.imaginary * z.imaginary);
        return new Operation(real = ((tempReal * z.real) + (tempImaginary * z.imaginary)) / temp,
                imaginary = ((tempImaginary * z.real) - (tempReal * z.imaginary)) / temp);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "f";
        } else {
            return real + " - " + Math.abs(imaginary) + "f";
        }
    }
}
