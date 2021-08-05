import java.util.ArrayList;
import java.util.List;

public class TaskService implements TaskServiceApi{
    // make a list of all the tasks and put them in a list
    List<Task> allTasks = new ArrayList<>();

    @Override
    public Task addTask(String name) {
        //create object
//        Task task = new Task();
//        int id = 0;
//        task.setId(id);
//        task.setName(name);
//        allTasks.add(task);
//        return task;
        return null;
    }

    @Override
    public Task getTask(int taskId) {

        return null;//user Java streams and filter
    }

    @Override
    public Task getTask(String name) {

        return null; //user Java streams and filter
    }

    @Override
    public Task find(String name, boolean done) {
        return null; //user Java streams and filter
    }

    @Override
    public List<Task> findTasks(boolean done) {

        return null;//user Java streams and filter
    }

    @Override
    public void removeTask(int taskId) {
            //read collections operations;
    }

    @Override
    public void markAsDone(int taskId) {
        //user Java streams and filter then set the fields
    }

    @Override
    public List<Task> getAll() {

        return null;//use stream, sorting
    }
}
