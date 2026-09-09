public class LambdaExample {
 interface Greeting{
     void sayHello(String name);
 }

 public static void main(String[] args){
     Greeting greeting = (name) -> {
         System.out.println(name + "님 안녕하세요");
     };
     greeting.sayHello("형님");
 }
}
