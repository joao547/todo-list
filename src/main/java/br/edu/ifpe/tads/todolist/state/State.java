package br.edu.ifpe.tads.todolist.state;

public interface State {

    public State onNext();
    public State onPrevious();
}
