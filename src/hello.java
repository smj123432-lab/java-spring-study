import java.util.List;
import java.util.ArrayList;

public class hello {
    public static void main(String[] args) {
        int age = 27;
        if (age >= 20){
            System.out.println("응 성인이야 ~");
        }else{
            System.out.println("미자야");
        }
        List<String> jobTitles = new ArrayList<>();
        jobTitles.add("굴착기 기사");
        jobTitles.add("프론트엔드 개발자");

// 방법 1: 일반 for문
        for (int i = 0; i < jobTitles.size(); i++) {
            System.out.println(jobTitles.get(i));
        }

// 방법 2: 향상된 for문 (for-each) — 이게 훨씬 많이 쓰임
        for (String title : jobTitles) {
            System.out.println(title);
        }
        try {
            int result = 10 / 0;  // 여기서 에러 발생
            System.out.println(result);  // 이 줄은 실행 안 됨! (에러 나는 순간 바로 catch로 튐)
        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        }
        // 부모 클래스
        class Animal {
            String name;

            public void eat() {
                System.out.println(name + "가 먹는다");
            }
        }

// 자식 클래스 - Animal을 상속받음
        class Dog extends Animal {
            public void bark() {
                System.out.println(name + "가 짖는다");
            }
        }

        Dog dog = new Dog();
                dog.name = "사자";
                dog.bark();
                dog.eat();
        interface Payable {
            void pay(int amount);  // 몸통(구현) 없이 선언만
        }

        class CreditCard implements Payable {
            public void pay(int amount) {
                System.out.println(amount + "원을 카드로 결제");
            }
        }

        class Cash implements Payable {
            public void pay(int amount) {
                System.out.println(amount + "원을 현금으로 결제");
            }
        }
        Payable payment1 = new CreditCard();
        Payable payment2 = new Cash();
        payment1.pay(10000);  // "10000원을 카드로 결제"
        payment2.pay(5000);   // "5000원을 현금으로 결제"
    }

}

class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
