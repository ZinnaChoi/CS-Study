# 옵저버 패턴

> 주체가 어떤 객체의 상태 변화를 관찰하다가, 상태 변화가 있을 때마다 메서드 등을 통해 옵저버 목록에 있는 옵저버들에게 객체의 변화를 알려주는 디자인 패턴

- 트위터의 메인 로직, 그리고 MVC 패턴에도 적용됨
- 주체 스스로가 자신의 변화를 관찰하다가, 상태 변화가 있을 때 옵저버들에게 알려주는 경우도 존재

```java
import java.util.ArrayList;
import java.util.List;

interface Subject {
    public void register(Observer obj);

    public void unregister(Observer obj);

    public void notifyObservers();

    public Object getUpdate(Observer obj);
}

interface Observer {
    public void update();
}

class Topic implements Subject {
    private List<Observer> observers;
    private String message;

    public Topic() {
        this.observers = new ArrayList<>();
        this.message = "";
    }

    @Override

    //관리 대상 observer들 등록
    public void register(Observer obj) {
        if (!observers.contains(obj))
            observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);

    }

    // 옵저버에게 변한 상태 알림
    @Override
    public void notifyObservers() {
        this.observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message sended to Topic: " + msg);
        this.message = msg;
        notifyObservers();
    }
}

class TopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public TopicSubscriber(String name, Subject topic) {
        this.name = name;
        this.topic = topic;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        System.out.println(name + ":: got message >> " + msg);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Topic topic = new Topic();  // 주체이자 변경을 감지할 객체
        Observer a = new TopicSubscriber("a", topic);
        Observer b = new TopicSubscriber("b", topic);
        Observer c = new TopicSubscriber("c", topic);
        topic.register(a);

        topic.register(b);
        topic.register(c);
        topic.postMessage("amumu is op champion!!");  // 주체에 변경이 일어났을 때, observer a,b,c에 변경이 전달되는지 확인
    }
}
/*
 * Message sended to Topic: amumu is op champion!!   // 토픽이 변경됨
 * a:: got message >> amumu is op champion!!
 * b:: got message >> amumu is op champion!!
 * c:: got message >> amumu is op champion!!
 */
```

- 토픽의 변화가 observer들에게 전달되는 옵저버 패턴
