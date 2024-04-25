package Chapter9And10;
public class Main {

//CHAPTER 9
    //Java has two areas of memory we care about: the Stack and the Heap.
    //Object reference variables work just like primitive variables, if the reference is declared as a local variable, it goes to the stack.
    //"Objects" live on the "heap"
    //Local variables are also known as "stack" variables.
    //Local variables are declared inside a method, including method parameters.
        public void foo(int x){
            int i = x + 3;
            boolean b = true;
        }
    //The parameter x and the variables i and b are all local variables.

    //Instance variables are declared inside a class but not inside a method.
        int size;
    //"size" is our instance variable here.

    //If the local variable is a reference to an object, only the variable (the reference/remote control) goes on the stack.
    //Most people use constructors to initialize the state of an object.
    //A constructor is the code that runs when you saw 'new' on a class type.
    //Constructors must have the same name as the class, and must not have a return type.
        public Main(){
            System.out.println("Hello");
        }
    //You can use a constructor to initialize the state (i.e the instance variables) of the object being constructed.
        public void Main(){
            size = 44;
        }
    //If you don't put a constructor in your class, the compiler will put in a default constructor.
    //The default constructor is always a no-arg constructor.
    //If you put a constructor (any constructor) in your class, the compiler will not build the default constructor.
    //If you want a no-arg constructor but you've already used one with arguments, you'll have to build the no-arg constructor yourself.
        public Main(){
        }
    //Always provide a no-arg constructor if you can, to make it easy for programmers to make a working object.
    //Overloaded constructors means you have more than one constructor in your class.
    //You cannot have two constructors with the same argument lists.
    //A constructor is the code that runs when somebody says 'new' on a class tye.
    //A constructor must have the same name as the class, and NO return type.
    //You can have more than one constructor in a class, as long as the argument lists are different.
    //Having more than one constructor in a class means you have OVERLOADED constructors.
    //Instance variables are assigned a default value, even when you don't explicitly assign one.
    //When a constructor runs, it immediately calls its superclass constructor.
    //The only way to call a super constructor is by calling 'super()'.
        public Main (int newSize){
            super();
            size = newSize;
        }
    //Superclass constructors must finish before its subclass constructor.
    //Use 'this()' to call a constructor from another overloaded constructor in the same class.
    //The call to 'this()' can be used only in a constructor, and must be the first statement in a constructor.
    //A constructor can have a call to 'super()' OR 'this()', BUT NEVER BOTH.


//CHAPTER 10
    //A static method should be called using the class name rather than an object reference variable.
        static void methodName(){
            System.out.println("hi");
        }

        Main.methodName();
    //A static method can be invoked without any instances of the method's class on the heap.
    //A static method is good for a utility method that does not (and will never) depend on a particular instance variable value.
    //A static method is not associated with a particular instance, only the class, so it cannot access any instance variable values of its class.
    //A static method cannot access a non-static method, since non-static methods are usually associated with instance variable state.
    //If you have a class with only static methods, and you do not want the class to be instantiated, you can mark the constructor private.
    //A static variable is a variable shared by all members of a given class.
    //A static method can access a static variable.
    //To make a constant in Java,  mark a variable as both static and final.
        final static int SHOE_SIZE = 10;
    //A final static variable must be assigned a value either at the time it is declared, or in a static initializer.
    //The naming convention for constants (final static variables) is to make the name all uppercase.
    //A final variable value cannot be changed once it has been assigned.
    //Assigning a value to a final instance variable must be either at the time it is declared, or in the constructor.
    //A final method cannot be overridden.
    //A final class cannot be extended(subclassed).
    //The autoboxing feature does the conversion from primitive to wrapper object automatically.
    //Autoboxing also lets you use either a primitive or its wrapper type virtually anywhere one or the other is expected.
    //If a method takes a wrapper type, you can pass a reference to a wrapper or a primitive of the matching type.
    //If a method takes a primitive, you can pass either a compatible primitive or a reference to a wrapper of that primitive type.
    //If a method declares a primitive return type, you can return either a compatible primitive or a reference to the wrapper of said primitive type.
    //If a method declares a wrapper return type, you can return a reference to the wrapper type or a primitive of the matching type.
    //How to turn a number into a String:
        double d = 42.5;
        String dString = Double.toString(d);
    //Formatting a number to use commas:
        String s = String.format("%, d", 1000000000);
        System.out.println(s);
    //Results in 1,000,000,000^^^
    //What does this format specifier actually say? "Take the second argument of the method, and format is as a (d)ecimal integer and insert commas".
    //At the most basic level, formatting consists of two main parts:
        //1. Formatting Instructions - You use special format specifiers that describe how the argument should be formatted.
        //2. The argument to be formatted - The argument type has to be something that can be formatted using the format specifiers in the formatting instructions.
    //The percent (%) says, "insert argument here" (and format it using these instructions).
    //%d - insert commas and format as decimal integer
    //%.2f - format the number as a floating point with decimal places
    //%,.2f - insert commas and format number as floating point and two decimal places

    //A format specifier can have up to 5 different parts(not including the %).
    //You must include a type in your format instructions, and if you specify things besides type, the type must always come last!!
    //Most times you will be formatting numbers using either "d" for decimal or "f" for floating point.
    //If you have more than one argument, simply add two arguments after the format string.

    //When it comes to date formatting, you will use a two-character type that starts with "t".
        // %tc - date and time formatting
        // %tr - just time formatting
        // %tA, %tB, %td - Day of the week, month and day
    //Use "java.util.Calendar" for your date manipulation
    //This is how you get an "instance" of an abstract class:
        //Main variable = Main.getInstance();
    //You can't get an instance of Calendar class, but you can get an instance of a concrete subclass.
    //CALENDAR OBJECTS
        //Field hold state - A Calendar object has many fields that are used to represent aspects of its ultimate state, its date and time.
        //Dates and Times can be incremented - The calendar class has methods that allow you to add and subtract values from various fields.
        //Dates and Times can be represented in milliseconds - The Calendar class lets you convert your dates into and out of a millisecond representation.
    //KEY CALENDAR METHODS
        //add(int field, int amount) - Adds/subtracts time from calendar's field
        //get(int field) - Returns value of given calendar field
        //getInstance() - Returns a Calendar, you can specify a locale
        //getTimeInMills() - Returns this Calendar's time in mills, as a long
        //roll(int field, boolean up) - Adds/subtracts time without changing larger fields
        //set(int field, int value) - Sets the value of a given Calendar field
        //set(year, month, day, hour, minute)(all ints) - A common variety of set to set a complete time
        //setTimeInMills(long mills) - Sets a Calendar's time based on a long milli-time
//KEY CALENDAR FIELDS
    //DATE / DAY_OF_MONTH - get/set the day of the month
    //HOUR / HOUR_OF_DAY - get/set the 12/24 hour value
    //MILLISECOND - get/set the milliseconds
    //MINUTE - get/set the minute
    //MONTH - get/set the month
    //YEAR
    //ZONE_OFFSET - get/set raw offset of GMT in mills
//STATIC IMPORTS
//If you're going to use a static member a few times, we think you should avoid static imports, to help keep the code more readable
//If you're going to use a static member a lot, (like doing lots of Math calculations), then it's probably okay to use the static import
//Notice that you can use wildcards(.*) in your static import declaration
//A big issue with static imports is that it's not too hard to create naming conflicts















































    }

