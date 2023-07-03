package br.edu.ifpe.tads.todolist.Entity;


import br.edu.ifpe.tads.todolist.state.State;
import br.edu.ifpe.tads.todolist.state.StateEnum;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

@Entity
public class Task extends Observable implements Serializable {
    @Serial
    private static final long serialVersionUID = -4477070963407450060L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private Task parent;
    @OneToMany(mappedBy="parent")
    private List<Task> children;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private StateEnum state;

    private int totalExecuted;

    private int total;

    public Task() {
    }

    public void addChild(Task task) {
        children.add(task);
        setChanged();
        notifyObservers();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task getParent() {
        return parent;
    }

    public void setParent(Task parent) {
        this.parent = parent;
    }

    public int getTotalExecuted() {
        return totalExecuted;
    }

    public void setTotalExecuted(int totalExecuted) {
        this.totalExecuted = totalExecuted;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public List<Task> getChildren(){
        return this.children;
    }
}
