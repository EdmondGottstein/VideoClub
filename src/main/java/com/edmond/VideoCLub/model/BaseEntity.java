package com.edmond.VideoCLub.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false)
    private LocalDateTime createdDate = LocalDateTime.now();

    private LocalDateTime modifyDate;

    @NotNull
    private boolean deleted = false;

    @PreUpdate
    protected void onUpdate() {
        this.modifyDate = LocalDateTime.now();
    }

    @PrePersist
    protected void onCreate()  {
        this.createdDate = LocalDateTime.now();
        this.modifyDate = LocalDateTime.now();
    }

}
