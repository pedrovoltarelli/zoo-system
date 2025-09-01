package entity;

import java.time.LocalDateTime;

public class Employee {
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;

    public Employee(Long id, String name, String email, String password, LocalDateTime startedAt, LocalDateTime finishedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.startedAt = startedAt;
        this.finishedAt = finishedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public LocalDateTime getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(LocalDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }
}
