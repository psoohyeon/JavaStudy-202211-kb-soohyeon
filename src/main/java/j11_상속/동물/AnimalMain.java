package j11_상속.동물;

import j11_상속.A;

import javax.print.attribute.standard.JobHoldUntil;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal(); //생성자 호출
        Human human = new Human(); // 상위객체가 먼저이기때문에 한번더 호출
        Tiger tiger = new Tiger();

        int a = (int) 3.14;
        double d = (double) 3;


        Animal hAnimal = (Animal) human; // 업캐스팅.
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[3];

//        animals[0] = hAnimal; // hunman으로 업캐스팅도 가능
//        animals[0] = new Human();

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Animal();

        for(int i = 0; i < animals.length; i++){
            animals[i].move();
        }
        for(int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Human) {
                Human h = (Human) animals[i];// 다운캐스팅, 명시적 형변환
                h.readBooks();
            } else if (animals[i] instanceof Tiger) {
                Tiger t = (Tiger) animals[i];
                t.hunting();
            } else {
                System.out.println("다운캐스팅 불가");
            }
        }

//        animal.move();
//        human.move();
//        tiger.move();
//
//        human.readBooks();
//        tiger.hunting();

    }
}
