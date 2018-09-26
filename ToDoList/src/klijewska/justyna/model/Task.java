package klijewska.justyna.model;

public class Task {

//    // Konwersja String do Java Date
//    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
//    String dateString = "04.08.2015 07:42:00";
//    Date date = dateFormat.parse(dateString);
//System.out.println(date);

    private String dateOfTask;
    private String timeOfTask;
    private String task;
    private String labelOfTask;

    public String getDateOfTask() {
        return dateOfTask;
    }

    public void setDateOfTask(String dateOfTask) {
        this.dateOfTask = dateOfTask;
    }

    public String getTimeOfTask() {
        return timeOfTask;
    }

    public void setTimeOfTask(String timeOfTask) {
        this.timeOfTask = timeOfTask;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getLabelOfTask() {
        return labelOfTask;
    }

    public void setLabelOfTask(String labelOfTask) {
        this.labelOfTask = labelOfTask;
    }

    public Task(String dateOfTask, String timeOfTask, String task, String labelOfTask) {
        this.dateOfTask = dateOfTask;
        this.timeOfTask = timeOfTask;
        this.task = task;
        this.labelOfTask = labelOfTask;
    }

    public Task() {

    }

    @Override
    public String toString() {
        return "Task{" +
                "dateOfTask='" + dateOfTask + '\'' +
                ", timeOfTask='" + timeOfTask + '\'' +
                ", task='" + task + '\'' +
                ", labelOfTask='" + labelOfTask + '\'' +
                '}';
    }
}
