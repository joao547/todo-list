package br.edu.ifpe.tads.todolist.state;

import br.edu.ifpe.tads.todolist.Entity.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class TodoState implements State {
    @Override
    public State onNext() {

        return null;
    }

    @Override
    public State onPrevious() {
        return null;
    }
}
