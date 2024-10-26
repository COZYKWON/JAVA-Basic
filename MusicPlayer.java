package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어 ON");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어 OFF");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
