package lv.initex.console.services.taskLists.addTaskList.validation.rules;

import lv.initex.console.services.TaskListError;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AddEmptyTaskListTitleRule {
    public Optional<TaskListError> execute(String title) {

        if (title == null || title.isEmpty()) {
            TaskListError error = new TaskListError("TaskList title", "Title field is empty");
            return Optional.of(error);
        } else {
            return Optional.empty();
        }
    }
}
