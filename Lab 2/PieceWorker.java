import java.util.Date;
import java.util.Calendar;

// PieceWorker class derived from Employee

public final class PieceWorker extends Employee 
{

    private double wagePerPiece; // wage per piece output
    private int quantity; // output for week

    // constructor for class PieceWorker
    public PieceWorker(String first, String last, Date join, double wage, int numberOfItems, int id) throws Exception 
    {
        super(first, last, join, id); // call superclass constructor
        setWage(wage);
        setQuantity(numberOfItems);
    }

    // set PieceWorker's wage
    public void setWage(double wage) 
    {
        wagePerPiece = (wage > 0 ? wage : 0);
    }

    // set number of items output
    public void setQuantity(int numberOfItems) 
    {
        quantity = (numberOfItems > 0 ? numberOfItems : 0);
    }

    // determine PieceWorker's earnings
    public double earnings() 
    {
        return quantity * wagePerPiece;
    }

    public String toString() 
    {
        return "Piece worker: " + super.toString();
    }
}
