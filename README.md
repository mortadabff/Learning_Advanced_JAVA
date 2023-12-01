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


#### for more code implmentations look at the code examples within this repo,
 
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
### Examples : (for more look at the code in the .java file) 


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
        
##### But why we need this second method ? and when we use it 
Both approaches achieve the goal of creating a new thread, but using Runnable offers several advantages and is often preferred. Here are some reasons why you to choose to implement Runnable:

###### a) Better Object-Oriented Design:
In Java, you generally prefer composition over inheritance. Implementing Runnable allows you to separate the thread's behavior from the thread itself. Your class can extend another class if needed, and the thread behavior is encapsulated in a separate object.

###### b) Flexibility:
If you extend the Thread class, you lose the ability to extend any other class because Java supports single inheritance. By implementing Runnable, you can still extend another class if necessary.

###### c) Resource Sharing:
When you implement Runnable, you can pass the same instance of  your Runnable implementation to multiple threads . This allows multiple threads to share the same resources or perform the same task concurrently.
        
         MyRunnable myRunnable = new MyRunnable();
        // Create multiple threads with the same task
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
###### d) ThreadPool Usage:
If you are using a ThreadPoolExecutor or any other executor service, it typically expects tasks to implement the Runnable interface. By implementing Runnable, your task can be submitted to an executor for execution.
###### ThreadPoolExecutor ? 
In Java, a ThreadPoolExecutor is part of the java.util.concurrent package and provides a flexible way to manage and execute threads in a pool. Instead of creating a new thread for each task, a thread pool maintains a pool of worker threads that can be reused for different tasks. This can be more efficient than creating a new thread for each task, especially in applications with a high volume of short-lived tasks.
- ThreadPoolExecutor or any other executor service, tasks are typically represented by objects that implement the Runnable interface. The Runnable interface defines a single method, run(), which contains the code that will be executed by the task.
###### example:
 ###### Define a Runnable Task:
    class MyTask implements Runnable {
        public void run() {
        // Task logic goes here
        System.out.println("Task is running");
     }
   }

 ###### Create a ThreadPoolExecutor and  submit tasks:
  
      import java.util.concurrent.Executors;
      import java.util.concurrent.ThreadPoolExecutor;
      public class ThreadPoolExample {
          public static void main(String[] args) {
          ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
          // Submitting tasks to the executor
          for (int i = 0; i < 10; i++) {
            executor.submit(new MyTask());
         }
      }
   }

The executor will manage the execution of these tasks using the available threads in the pool.
###### for more look at the "Java executer service " 
###### e) Encapsulation:
Separating the task from the thread allows for better encapsulation. The Runnable instance represents the task or job to be executed by the thread, and the Thread class is used solely for managing the thread.

###### f) Cleaner Code:
Code that implements Runnable is often considered cleaner and more modular. It clearly separates the task's logic from the threading details, making the code easier to understand and maintain.

## 5 - Synchronization
### Def:
In Java, synchronization is a concept that is used to control access to shared resources or data by multiple threads. When multiple threads are accessing and modifying shared data concurrently, there is a potential for data corruption or inconsistency. Synchronization helps to ensure that only one thread can access a shared resource at a time, preventing race conditions and maintaining data integrity.
-> There are several ways to achieve synchronization in Java, and some common techniques include the use of synchronized methods, synchronized blocks, and locks.
#### 1) First method : Synchronized Methods
You can declare a method as synchronized by using the synchronized keyword. When a thread enters a synchronized method, it acquires the lock associated with the object and releases it when the method exits.
    public synchronized void increment() {
        count++;
    }
#### 2) Second method : Synchronized Blocks
Synchronized Blocks:
Instead of synchronizing entire methods, you can use synchronized blocks to control access to specific sections of code.

     public void increment() {
        synchronized (lock) {
            count++;
        }
     }
#### 3) Third method : Locks
The java.util.concurrent.locks package provides more flexible lock implementations. The ReentrantLock is commonly used for synchronization.

import package needed: 
 
     import java.util.concurrent.locks.Lock;
     import java.util.concurrent.locks.ReentrantLock;

Using lock method

     public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
