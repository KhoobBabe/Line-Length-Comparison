package com.khubaib;

public abstract class AbstractLine {

    public abstract double getLength();

    public abstract boolean isGreater(Object a, Object b);

    public abstract boolean isLess(Object a, Object b);

    public abstract boolean isEqual(Object a, Object b);


}


//Concrete class
class ConcreteLine extends AbstractLine{

    //Declaring instance Variables
    double point_1;
    double point_2;
    double point_3;
    double point_4;

    //Declaring a Constructor
    ConcreteLine(double point_1, double point_2, double point_3, double point_4){

        this.point_1 = point_1;
        this.point_2 = point_2;
        this.point_3 = point_3;
        this.point_4 = point_4;
    }

    //returns the length of a line between the two coordinates
    public double getLength() {

        double a = Math.pow(point_3-point_1, 2) + Math.pow(point_4 - point_2, 2);

        return Math.pow(a, 0.5);
    }

    //compares the lengths of two lines and tells if the asked one is greater than the other
    public boolean isGreater(Object line_1, Object line_2) {

        ConcreteLine a = (ConcreteLine) line_1;
        ConcreteLine b = (ConcreteLine) line_2;

        if (a.getLength() > b.getLength()){
            return true;
        }
        else{
            return false;
        }
    }

    //compares the lengths of two lines and tells if the asked one is smaller than the other
    public boolean isLess(Object line_1, Object line_2) {

        ConcreteLine a = (ConcreteLine) line_1;
        ConcreteLine b = (ConcreteLine) line_2;

        if (a.getLength() < b.getLength()){
            return true;
        }
        else{
            return false;
        }
    }

    //compares the lengths of two lines and tells if the asked one is equal than the other
    public boolean isEqual(Object line_1, Object line_2) {

        ConcreteLine a = (ConcreteLine) line_1;
        ConcreteLine b = (ConcreteLine) line_2;

        if (a.getLength() == b.getLength()){
            return true;
        }
        else{
            return false;
        }
    }


}

//Testing class
class ConcreteLineTesting{

    public static void main(String[] args) {

        ConcreteLine line1 = new ConcreteLine(0, 0, 4, 4);//declaring the object 1
        ConcreteLine line2 = new ConcreteLine(1, 1, 6, 6);//declaring the object 2

        System.out.println("--------LINE COMPARISON--------\n");

        //prints the lengths of the two lines
        System.out.println("the length of the line 1 is: " + line1.getLength());
        System.out.println("the length of the line 2 is: " + line2.getLength());

        //prints the ouput if line 2 is greater than line 1
        System.out.println("\nIs line 2 Greater than line 1: "  + line2.isGreater(line2, line1));

        //prints the ouput if line 2 is less than line 1
        System.out.println("\nIs line 2 smaller than line 1: " + line2.isLess(line2, line1));

        //prints the ouput if line 1 is equal to line 2
        System.out.println("\nIs line 1 equal to line 2: " + line1.isEqual(line1, line2));


    }
}
