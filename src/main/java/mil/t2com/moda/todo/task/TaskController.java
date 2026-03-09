package mil.t2com.moda.todo.task;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task saveNewTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @GetMapping()
    public List<Task> findAllTasks() { return taskService.findAllTasks(); }

}
