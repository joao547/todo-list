package br.edu.ifpe.tads.todolist.state;

public enum StateEnum {
    TODO(new TodoState());

    private State state;

    StateEnum(State state){
        this.state = state;
    }

    public State onNext(){
        return this.state.onNext();
    }

    public State onPrevious(){
        return this.state.onPrevious();
    }
}
