package entity;

import java.time.LocalDateTime;

public class Client {
    private String name;
    private LocalDateTime enterAt;
    private LocalDateTime leavedAt;
    private int age;

    public Client(String name, LocalDateTime enterAt, LocalDateTime leavedAt, int age) {
        this.name = name;
        this.enterAt = enterAt;
        this.leavedAt = leavedAt;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEnterAt() {
        return enterAt;
    }

    public void setEnterAt(LocalDateTime enterAt) {
        this.enterAt = enterAt;
    }

    public LocalDateTime getLeavedAt() {
        return leavedAt;
    }

    public void setLeavedAt(LocalDateTime leavedAt) {
        this.leavedAt = leavedAt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
