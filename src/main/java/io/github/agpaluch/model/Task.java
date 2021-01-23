package io.github.agpaluch.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
class Task {
    @Id
    private int id;
    private String description;
    private boolean done;

    int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    String getDescription() {
        return description;
    }

    void setDescription(final String description) {
        this.description = description;
    }

    boolean isDone() {
        return done;
    }

    void setDone(final boolean done) {
        this.done = done;
    }
}
