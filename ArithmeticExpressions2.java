class ArithmeticExpressions2 extends ConsoleProgram {

  /**
  * Program that calculates the cost of internet for a year
  *    Inputs - The cost of the plan per month
  *    Calculations - How much it would cost per year
  *                 - How much would it cost after taxes
  *    Outputs - Cost per year after taxes
  *    Variables
  *    Number of months - integer
  *    Cost per month - double
  *    Taxes - double
  *    Total - double
  */ 
  
  public void run() {
    // Variables
    double dblCost;
    double dblTax;
    double dblTotal;
    double dblSubTotal;

    // Inputs
    dblCost = readDouble("How much does your plan cost per month? ");
    
    // Processing
    dblSubTotal = dblCost * 12;
    dblTax = dblSubTotal * 0.13;
    dblTotal = dblSubTotal + dblTax;
    
    // Output
    System.out.println("The subtotal is: "+ dblSubTotal);
    System.out.println("The tax is: "+ dblTax);
    System.out.println("The final total for the year is: "+dblTotal);
  }
}
