# Learning_Advanced_JAVA
A repo for learning advanced concepts in JAVA 
In this repo you will find some exercices and codes that i have written when learning some advanced notions and features in JAVA porogramming language
## 1 ENUMERATIONS
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
 
## 2 ANNOTATIONS
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
## 3 Serialization 
### def
Serialization in Java refers to the process of converting an object into a byte stream, which can be easily stored in a file or sent over a network. Deserialization is the process of reconstructing the object from the serialized byte stream. This allows you to persist the state of an object or transfer it between different Java Virtual Machines (JVMs).
### vue exemple of use in the folder "Serialization"
