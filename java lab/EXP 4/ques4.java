import java.util.Scanner;

class Complex {
    private int real;
    private int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex sum(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex difference(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    public Complex product(Complex c) {
        int newReal = (this.real * c.real) - (this.imag * c.imag);
        int newImag = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(newReal, newImag);
    }

    public void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + Math.abs(imag) + "i");
    }
}

class ComplexMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");

        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.sum(c2);
        Complex diff = c1.difference(c2);
        Complex prod = c1.product(c2);

        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        diff.display();
        System.out.print("Product: ");
        prod.display();
    }
}
