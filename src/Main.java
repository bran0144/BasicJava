public class Main {
  /*
   *
   * This is a comment line
   */

  public static void main(String[] args) {
    System.out.println("First line from app"); // This is a line comment
    System.out.println("Second line from app");
    System.out.println("Third line from app");

    int myVar;
    myVar = 50;
    System.out.println(myVar);

    int anotherVar = 100;
    System.out.println(anotherVar);

    final int someVariable;

    someVariable = 10;
    System.out.println(someVariable);

    byte numberOfLetters = 26;
    short feetInMile = 5280;
    int milesToSun = 92960000;
    long milesInALightYear = 5879000000000L;

    float kilometersInAMarathon = 42.195f;
    double atomWidthInMeters = 0.00000000001d;

    char regularU = 'U';
    char accentedU = '\u00DA';

    boolean iLoveJava = true;

    int someValue = 5;
    System.out.println(++someValue);
    int someOtherValue = 5;
    System.out.println(someOtherValue++);
    System.out.println(someOtherValue);

    int value1 = 7;
    int value2 = 5;

    //conditional statement
    int maxValue = value1 > value2 ? value1 : value2;
    System.out.println(maxValue);

    //conditionals
    if (value1 > value2) {
      System.out.println("value1 is bigger");
    } else {
      System.out.println("value2 is bigger");
    }

    double value10 = 100.0d;
    double value11 = 50.0d;
    double result = 0.0;
    char opCode = 'd';

    switch (opCode) {
      case 'a': {
        result = value10 + value11;
        break;
      }
      case 's': {
        result = value10 - value11;
        break;
      }
      case 'm': {
        result = value10 * value11;
        break;
      }
      case 'd': {
        result = value11 != 0 ? value10 / value11 : 0.0d;
        break;
      }
      default: {
        System.out.println("Invalid code: " + opCode);
        result = 0.0d;
        break;
      }
    }

    System.out.println(result);

    int students = 150;
    int rooms = 4;

    if (rooms != 0 && students / rooms > 30) {
      System.out.println("Crowded");
    }

//    loops
    int aValue = 4;
    int factorial = 1;
    while (aValue > 1) {
      factorial *= aValue;
      aValue--;
    }
    System.out.println(factorial);

//    do while loop
    int iVal = 80;
    do {
      System.out.print(iVal);
      System.out.print(" * 2 = ");
      iVal *= 2;
      System.out.println(iVal);

    } while (iVal < 25);

//    for loop
    for (int i = 1; i < 100; i *= 2) {
      System.out.println(i);
    }

//    arrays
    float[] theVals = {10.0f, 20.0f, 15.0f};
    float sum = 0.0f;
    for (int index = 0; index < theVals.length; index++) {
      sum += theVals[index];
    }
    System.out.println(sum);
  }
}
