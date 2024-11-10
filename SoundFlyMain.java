package poly.ex6;

public class SoundFlyMain {

    public static void main(String[] args) {

        AbstractAnimal[] abstractAnimals = {new Dog(), new Bird(), new Chicken()};

        for (AbstractAnimal abstractAnimal : abstractAnimals) {
            soundAnimal(abstractAnimal);
            moveAnimal(abstractAnimal);
            flyAnimal(abstractAnimal);
        }
    }

    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 이동 테스트 시작");
        abstractAnimal.move();
        System.out.println("동물 이동 테스트 종료");
    }

    private static void flyAnimal(AbstractAnimal abstractAnimal) {
        if (abstractAnimal instanceof Fly) {
            System.out.println("날기 테스트 시작");
            ((Fly)abstractAnimal).fly();
            System.out.println("날기 테스트 종료");
        }
    }
}
