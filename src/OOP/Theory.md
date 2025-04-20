# Constructor
- It is used to create an instance/initialize the instance variables of a class
- It's similar to method except:
    - Name: Constructor name is same as class name
    - Return type: Constructor has no return type
    - Constructor can not be static or final or abstract, synchronized

### Types of Constructor
- Default Constructor
    - Constructor with no arguments
    - If we do not create any constructor, compiler creates default constructor
    - If we create any constructor, compiler does not create default constructor
- No Argument Constructor (Similar to default constructor but explicitly defined)
    - used to initialize instance variables with default values
- Parameterized Constructor
    - Constructor with parameters
    - We can create multiple constructors with different number of arguments
- Private Constructor
    - Constructor with private access modifier
    - Used in Singleton Design Pattern
    - Used to restrict instantiation of class from outside the class

### FAQ
- Why constructor can not be final?
  - Final means method can not be overridden.
- Why constructor can not be static?
  - Static means method can be called without creating instance of class.
- Can constructor be overridden?
  - No, constructor can not be overridden. because constructor is not inherited.
