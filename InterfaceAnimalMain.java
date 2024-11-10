package poly.ex5;

public class InterfaceAnimalMain {

    public static void main(String[] args) {

        InterfaceAnimal[] interfaceAnimals = {new Dog(), new Cat(), new Cow()};

        for (InterfaceAnimal interfaceAnimal : interfaceAnimals) {
            soundAnimal(interfaceAnimal);
            moveAnimal(interfaceAnimal);
        }
    }

    public static void soundAnimal(InterfaceAnimal interfaceAnimal) {
        System.out.println("동물 소리 테스트 시작");
        interfaceAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void moveAnimal(InterfaceAnimal interfaceAnimal) {
        System.out.println("동물 이동 테스트 시작");
        interfaceAnimal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
