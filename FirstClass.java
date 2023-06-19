import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class FirstClass {
  static int number = 7;
  void funDay1(){
    // ! Standard console print
    System.out.println("Houston we have liftoff...");
    // < VARIABLES: dataType variableName = VALUE;
    String cameronName = "Cameron";
    // < Primitives
    int cameronAge;
    cameronAge = 3;
    // todo Providing a long/double value upon initialization
    // ? The literal 12993485799 of type int is out of range
    // ? Type mismatch: cannot convert from long to int
    long myGrandfathersAge = 1299348579999l;
    double harpersAge = 7.5d;
    boolean isHappy = true;
    char initial = 'd';
    // < Wrapper classes
    Integer $waltersAge = 4;
    System.out.println($waltersAge);
    String _sonsName = "Walter";
    Long bigNumber;
    Double decimalNumber = 7.58;
    Integer result = $waltersAge/cameronAge;
    System.out.println(result);
    System.out.println(number);
  }
  void conditionals(){
    // todo Conditionals
    //? if(condition) {
      // what to do if condition is true
      // ...can have 1 or many if statements
    //? }
    //* else if(2nd condition) {        
        // what to do if 2nd condition is true
        // ... can have 0 to many else-if statements ...
    //* }
    //> else {                           
          // what to do if none of the previous conditions are met
          // can have 1 or no else statement
    //> } 
    // ! in loops you can use continue/break to implement flow control on the current loop
    Double double1 = 1234d;
    Double double2 = 123d;
    if(Double.compare(double1, double2) == 0){
      System.out.println("The Same");
    }
    else if(Double.compare(double1, double2) > 0){
      System.out.println("double1 > double2");
    }
    else{
      System.out.println("double1 < double2");
    }

  }
  void switches(){
    // todo Switch
    //> switch(parameterValueToCheck){
      
      //< case parameterValueToCheck:
        // Do stuff & things
        //< break;
      //< case parameterValueToCheck:
        // Do stuff & things
        //< break;
      //< default:
        // Do stuff & things
      //> }
      int day = 6;
      // int myDay = 6;
      switch(day){
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
        default:
          System.out.println("There are only seven days in a week...");
}
  }
  void Ternary(){
    // todo Ternary
    //<The ternary operator consists of three pieces; 
      // the condition, 
      // the return value if the condition is true, 
      // and the return value if the condition is false.
      boolean isHappy = false;
      // variable = (condition) ? expressionIfTrue : expressionIfFalse;
      String output = !(isHappy)? "YAY": "Thats terrible";
      System.out.println(output);
  }
  void Strings(){
    // todo Strings
    System.out.println("What is your name?");
    String name = System.console().readLine();
    char punctuation = '!';
    double orderTotal = 10.3463457;
    String output = String.format("Hello %s%s your total is $%.2f...", name, punctuation, orderTotal);
    System.out.println(output);
    System.out.print(output);
    System.out.print(output);
    System.out.print(output);
    // System.out.print("Hello %s%s your total is $%.2f...", name, punctuation, orderTotal);
  }
  String fixedArrays(){
    int [] myArray = new int[6];
    System.out.println("myArray");
    System.out.println(myArray);
    for(int iterator : myArray){
      System.out.println(iterator);
    }
    int [] myOtherArray = {45,56,67,78};
    System.out.println("myOtherArray");
    System.out.println(myOtherArray);
    //> [I@4617c264
    for(int i = 0; i < myOtherArray.length; i++){
      System.out.println(i);
      System.out.println(myOtherArray[i]);
    }
    return Arrays.toString(myOtherArray);
  }
  void arrayLists(){
    ArrayList<String> myArrayList = new ArrayList<String>(){
      {
        
        add("Tima");
        add("Logan");
        add("John");
      }
    };
    myArrayList.add("Tima");
    myArrayList.add("Logan");
    myArrayList.add("John");
    System.out.println(myArrayList);
    System.out.println(myArrayList.size());
    myArrayList.remove(1);
    System.out.println(myArrayList);
    System.out.println(myArrayList.size());
    // int i = 0;
    // while(i <= 10){
    //   System.out.println("Doing stuff and things");
    //   i++;
    // }
    for(String i : myArrayList){
      System.out.println(i);
    }
  }
  HashMap<String, String> Maps(){
    HashMap<String, String> myMap = new HashMap<String, String>();
    myMap.put("name1","Cameron");
    myMap.put("name2","Douglas");
    myMap.put("name3","Kalvin");
    System.out.println(myMap);
    System.out.println(myMap.get("name2"));
    Set<String> myMapKeys = myMap.keySet();
    for(String i : myMapKeys){
      System.out.println(i);
      System.out.println(myMap.get(i));
    }
    return myMap;
  }
  ArrayList<Character> alphabet(){
    ArrayList<Character> alph = new ArrayList<Character>();
    for(char i = 'a'; i <= 'z'; i++){
      // System.out.println(i);
      alph.add(i);
    }
    // System.out.println(alph);
    return alph;
  }
  void sandbox(){
    int[] numbers = {1,2,3,4};
    for (int value : numbers){
      System.out.println(value);
      // System.out.println(value = value + 3);
      System.out.println(value += 3);
    }
    System.out.println(Arrays.toString(numbers));
    for (int i = 0; i < numbers.length; i++){
      numbers[i] += 3;
    }
    System.out.println(Arrays.toString(numbers));
  }
}
  public static void changeMyArr(String[] someArr) {
    someArr[0] = “foo”;

}
