package lv.console.services.tasks.deleteTask.validation;

import lv.console.services.TaskListError;
import lv.console.services.tasks.deleteTask.DeleteTaskRequest;

import java.util.List;

public interface DeleteTaskValidator {
     List<TaskListError> validate(DeleteTaskRequest deleteTaskRequest);
}
