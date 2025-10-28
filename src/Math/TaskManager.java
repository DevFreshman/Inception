package Math;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

class InfoTaskManager {
    int userId;
    int taskId;
    int priority;

    public InfoTaskManager(int userId, int taskId, int priority) {
        this.userId = userId;
        this.taskId = taskId;
        this.priority = priority;
    }
}

public class TaskManager {
    Map<Integer, InfoTaskManager> taskMap = new HashMap<>();
    Comparator<InfoTaskManager> cmp = (a, b) -> {
        if (a.priority != b.priority)
            return b.priority - a.priority;
        return b.taskId - a.taskId;
    };
    TreeSet<InfoTaskManager> taskTree = new TreeSet<>(cmp);

    public TaskManager(List<List<Integer>> tasks) {
        for (List<Integer> listTask : tasks) {
            taskMap.put(listTask.get(1), new InfoTaskManager(listTask.get(0).intValue(), listTask.get(1).intValue(),
                    listTask.get(2).intValue()));
            taskTree.add(taskMap.get(listTask.get(1)));
        }
    }

    public void add(int userId, int taskId, int priority) {
        taskMap.put(Integer.valueOf(taskId), new InfoTaskManager(userId, taskId, priority));
        taskTree.add(taskMap.get(Integer.valueOf(taskId)));
    }

    public void edit(int taskId, int newPriority) {
        InfoTaskManager info = taskMap.get(taskId);
        taskTree.remove(info);
        info.priority = newPriority;
        taskTree.add(info);

    }

    public void rmv(int taskId) {
        InfoTaskManager info = taskMap.get(taskId);
        taskTree.remove(info);
        taskMap.remove(taskId);
    }

    public int execTop() {
        if (taskTree.isEmpty())
            return -1;
        InfoTaskManager top = taskTree.pollFirst();
        taskMap.remove(top.taskId);
        return top.userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
