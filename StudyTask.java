public class StudyTask extends Task {
    private String subjectName;
    private int date;
    public StudyTask(String taskName, String subjectName, int date) {
        super(taskName);
        this.subjectName = subjectName;
        this.date = date;
    }
    
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public String toString() {
        if(isComplete){
            return taskName + "- Complete";
        }
        else{
            return taskName + "- Incomplete";
        }
    }
}