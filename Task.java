public class Task{
    protected String taskName;
    protected boolean isComplete;
    Task(String taskName){
        this.taskName=taskName;
        isComplete=false;
    }
    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String taskName){
        this.taskName=taskName;
    }
    public boolean getIsComplete() {
        return isComplete;
    }
    public void setIsComplete(boolean complete) {
        isComplete = complete;
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