
// 개와 돼지를 동물이라는 공통점을 찾아 추상화
// sleep  공통점
// 소리를 낸다는 공통점
// 울음 소리의 종류는 차이점

abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("꿀꿀꿀~");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("왈왈~");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig a = new Pig();
        a.animalSound();
        a.sleep();
        Dog b = new Dog();
        b.animalSound();
        b.sleep();
    }
}
