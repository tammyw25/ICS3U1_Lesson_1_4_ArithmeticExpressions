class ArithmeticExpressions1 extends ConsoleProgram {

  /**
  * Day Age Calculator
  */
  public void run() {
    
    int intAge;
    int intDays;

    intAge = readInt("How old are you? ");
    intDays = intAge * 365;

    //System.out.print("You have been alive for this many days: ");
    System.out.println("You have been alive for this many days: " + intDays);
    //System.out.println(intDays);

    int intNum1;
    int intNum2;
    double dblNum3;
    double dblNum4;

    intNum1 = 106;
    intNum2 = 42;
    dblNum3 = 3.1415;
    dblNum4 = 4.5;

    // divide an int by an int 15will always be an int
    System.out.println(intNum1/intNum2);
    // divide an int by a double will always be a double
    System.out.println(dblNum3/dblNum4);
    // divide an int by a double will always be a double
    

  }
}
