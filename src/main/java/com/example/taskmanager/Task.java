package com.example.taskmanager;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private boolean completed= false;

    @Column(name = "created_at")
    private LocalDateTime createdAt= LocalDateTime.now();
    
    //Getters and Setters
    public Long getId() { return id;}
    public void setId(Long id){ this.id= id;}

    public String getTitile() {return title;}
    public void setTitle(String title) { this.title= title;}

    public boolean isCompleted() {return completed;}
    public void setCompleted() {this.completed= true;} 

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt= createdAt; }
}
