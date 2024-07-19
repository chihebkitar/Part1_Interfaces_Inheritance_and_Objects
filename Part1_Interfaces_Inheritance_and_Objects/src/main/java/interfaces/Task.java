package interfaces;

import java.time.LocalDate;
import java.util.Objects;

public class Task implements Comparable<Task>{
    private int id;
    private String name;
    private LocalDate startDate = LocalDate.now();
    private LocalDate endDate = LocalDate.now();
    private int priority;
    private boolean completed;

    public Task() {}

    public Task(int id, String name, int priority) {
        this(id, name, LocalDate.now(), LocalDate.now(), priority, false);
    }

    public Task(int id, String name, LocalDate startDate, LocalDate endDate, int priority, boolean completed) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.completed = completed;
    }

    @Override
    public int compareTo(Task task) {
        return name.compareTo(task.name);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", priority=" + priority +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && priority == task.priority && completed == task.completed && Objects.equals(name, task.name) && Objects.equals(startDate, task.startDate) && Objects.equals(endDate, task.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, startDate, endDate, priority, completed);
    }

//Objects.hash used to reduce Boilerplate code
    // instead of implementing result*31
}
