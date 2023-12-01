# Learning_Advanced_JAVA
A repo for learning advanced concepts in JAVA 
In this repo you will find some exercices and codes that i have written when learning some advanced notions and features in JAVA porogramming language
## 1 - ENUMERATIONS
 ### def 
 
 In Java, an enumeration (enum) is a special data type that allows you to define a set of named constants. Enumerations are introduced in Java to provide a way to represent a fixed set of constants  (like Days , Months ... ) in a more readable and type-safe manner.
 ### creation ex: Days enum
 public enum Days {
 
    MONDAY("monday"), TUESDAY("tuesday"), WEDNESDAY("wednesday"), THURSDAY("thursday"), 
    FRIDAY("friday"), SATURDAY ("satudrday"), SUNDAY ("sunday")
    
   // we can add attribut and we can not; 
    private String value;

    
    // Enum constructor
    
    public Day(String value) {
    
        this.value = value;
        
    }
    
    public getValue(){
    
      return value;
      
    } 
    
}


the value "monday".. between bracket is optional , wa can ad it and set a getter to get it , and we can not , it depends.


#### for more code implmentations look at the code exemples within this repo,
 
## 2 - ANNOTATIONS
### Built-in Annotations in JAVA :

1."@Override":
Used to indicate that a method in a subclass is intended to override a method in its superclass.

2."@Deprecated":
Marks a method, class, or field as deprecated, indicating that it is discouraged to use.

3."@SuppressWarnings":
Suppresses compiler warnings.

4."@Target":
This is an annotation applied on an annotations when we create it , it  Specifies where the annotation can be applied (e.g., METHOD, FIELD, PARAMETER)

5."@Retention":
This is also an annotation applied on an annotations when we create it Specifies how long the annotation should be retained (e.g., SOURCE, CLASS, RUNTIME).
## 3 - Serialization 
### def
Serialization in Java refers to the process of converting an object into a byte stream, which can be easily stored in a file or sent over a network. Deserialization is the process of reconstructing the object from the serialized byte stream. This allows you to persist the state of an object or transfer it between different Java Virtual Machines (JVMs).
### Exemples : (for more look at the code in the .java file) 


// A simple class that implements Serializable
class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
#### test in the main
        Person person = new Person("John", 25);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            // Serialize the object to a file
            oos.writeObject(person);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
 ## 4 - Concurrency and Threads
 ### def
 ##### Threads:
In Java, a thread is the smallest unit of execution within a process. It represents an independent flow of control in a program. Java supports multithreading, allowing multiple threads to run concurrently within a single program. Each thread has its own stack and program counter, but they share the same heap memory.

##### Concurrency:
Concurrency in Java refers to the ability of a program to execute multiple threads in parallel. It allows different parts of a program to be executed independently and potentially simultaneously. Concurrency is essential for improving the performance of applications, especially in systems with multiple processors or cores.

### Two Methods for Creating a Thread in Java:
##### 1) Extending the Thread Class:
You can create a new class that extends the Thread class and overrides its run() method. The run() method contains the code that will be executed in the new thread.
###### creating a class extending Thread class that is implemented in the JDK 
class MyThread extends Thread {
    public void run() {
        // Code to be executed in the new thread
        System.out.println("Thread is running");
    }
}

###### test 
        // Creating an instance of your custom thread class
        MyThread myThread = new MyThread();

        // Starting the thread
        myThread.start();
 ##### 2) Implementing the Runnable Interface:
Another approach is to create a class that implements the Runnable interface. This class must provide a run() method. Then, you can create an instance of Thread and pass an instance of your class to its constructor. 
###### creating a class implementing  Runnable interface that is implemented in the JDK 

    class MyRunnable implements Runnable {
        public void run() {
        // Code to be executed in the new thread
        System.out.println("Thread is running");
      }
   }

###### test 
        // Creating an instance of your class implementing Runnable
        MyRunnable myRunnable = new MyRunnable();

        // Creating an instance of Thread and passing your Runnable instance
        Thread myThread = new Thread(myRunnable);

        // Starting the thread
        myThread.start();
 

