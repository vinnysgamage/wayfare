package com.wayfare.wayfare_api.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.Instant;

import jakarta.persistence.Column;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(length=255, nullable=false, unique=true)
    private String email;

    @Column(name="DISPLAY_NAME", length=50, nullable=false, unique=false)
    private String displayName;

    @Column(name="CREATED_AT", nullable=false)
    private Instant createdAt;

    protected User() {}

    public User(String email, String displayName) {
        this.email = email;
        this.displayName = displayName;
        this.createdAt = Instant.now();
    }

    public Long getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
}
