package lv.database.orm;

import lv.database.TaskListRepository;
import lv.domain.TaskList;
import lv.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
@Transactional
public class TaskListRepositoryImpl extends ORMRepository implements TaskListRepository {
    @Override
    public void save(TaskList taskList) {
        session().save(taskList);
    }

    @Override
    public Optional<TaskList> findByUserAndTitle(User user, String title) {
        String query = "from TaskList tl where tl.title = :title and tl.user = :user";
        TaskList shoppingList = (TaskList) session().createQuery(query)
                .setParameter("title", title)
                .setParameter("user", user)
                .uniqueResult();
        return Optional.ofNullable(shoppingList);
    }
}
