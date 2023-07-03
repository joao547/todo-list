package br.edu.ifpe.tads.todolist.Observable;

import br.edu.ifpe.tads.todolist.Entity.Task;

import java.util.Observable;
import java.util.Observer;

public class TotalObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Task task = (Task) o;
        int total = task.getChildren().size();
        task.setTotal(total);
    }
}
