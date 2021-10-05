import java.util.List;

public interface TaskServiceApi {
    Task addTask(String name); //create new task , with new id and add to the list

    Task getTask(int taskId);

    Task getTask(String name);

    Task find(String name, boolean done);//search on both condition

    List<Task> findTasks(boolean done);//find all done/not done

    void removeTask(int taskId);

    void markAsDone(int taskId);

    List<Task> getAll();//this is expected in order by name
}


