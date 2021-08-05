import java.util.List;

public class TestInterface implements TaskServiceApi{

    @Override
    public Task addTask(String name) {

        return null;
    }

    @Override
    public Task getTask(int taskId) {
        return null;
    }

    @Override
    public Task getTask(String name) {
        return null;
    }

    @Override
    public Task find(String name, boolean done) {
        return null;
    }

    @Override
    public List<Task> findTasks(boolean done) {
        return null;
    }

    @Override
    public void removeTask(int taskId) {

    }

    @Override
    public void markAsDone(int taskId) {

    }

    @Override
    public List<Task> getAll() {
        return null;
    }
}
