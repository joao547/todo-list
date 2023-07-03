package br.edu.ifpe.tads.todolist.Observable;

import br.edu.ifpe.tads.todolist.Entity.Task;

import java.util.Observable;
import java.util.Observer;

public class TotalExecutedObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Task task = (Task) o;
        Task parent = task.getParent();
        int total = parent.getTotalExecuted();
        parent.setTotalExecuted(total + 1);
    }
}
