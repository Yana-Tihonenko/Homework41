# Task 1
Create your own IncorrectWeightException exception and inherit it from IllegalArgumentException.

Add a constructor to it, to which you can pass one integer.

The IllegalArgumentException superclass should be created with an error message of the form "Weight cannot be negative: [invalid weight]"

Complete the Pizza.java file from the classwork by throwing an IncorrectWeightException exception in the constructor when trying to create a pizza with a negative weight.

# Task 2* (optional)
Complete the Pizza.java and PizzaRunner.java files from the classwork (and task #1).

Add a private static attribute to the Pizza class - the maximum possible weight of the pizza.

Add a public static method (setter) to the Pizza class to change this attribute.

When running the PizzaRunner.java program, it should be possible to:

run the program as before, without arguments, then there is no limitation (Or is there? hint: Integer.MAX_VALUE).
run the program with a single command line argument: an integer. Then this integer will be the maximum possible pizza weight (in grams).
Note
You can also check the command line parameter for correctness and use IncorrectWeightException from task 1 in case the program starts incorrectly.
