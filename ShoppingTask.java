public class ShoppingTask extends Task {
    private String itemName;
    private int quantity;
    public ShoppingTask(String taskName, String itemName, int quantity) {
        super(taskName);
        this.itemName = itemName;
        this.quantity = quantity;
    }
    
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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