package Stringmethods;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;

public class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        ComplexNumber add = null;
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);

    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }

    ComplexNumber subtract(ComplexNumber other) {
        ComplexNumber sub = null;
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ComplexNumber that = (ComplexNumber) o;
//        return Double.compare(real, that.real) == 0 && Double.compare(imaginary, that.imaginary) == 0;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber that)) return false;
        return Double.compare(real, that.real) == 0 && Double.compare(imaginary, that.imaginary) == 0;
    }

    /**
     * Constructs a new object.
     */
    public ComplexNumber() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        ComplexNumber other = (ComplexNumber) obj;
//        return this.real == other.real && this.imaginary == other.imaginary;
//
//}
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
        }

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("2022503041");
        System.out.println("ComplexNumber");
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, -2);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        ComplexNumber sum = c1.add(c2);
        ComplexNumber difference = c1.subtract(c2);
        ComplexNumber mul = c1.multiply(c2);
        ComplexNumber divide = c1.divide(c2);
        boolean isEqual = c1.equals(c2);
        System.out.println("c1 equals c2: " + isEqual);
        System.out.println("C1: "+c1.toString());
        System.out.println("C2: "+c2.toString());
        System.out.println("SUM: "+sum.toString());
        System.out.println("SUB: "+difference.toString());
        System.out.println("MUL: "+mul.toString());
        System.out.println("DIV: "+divide.toString());


    }
}
