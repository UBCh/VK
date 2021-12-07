package domain;

public class Donut {
    private Boolean isDonut;
    private int paidDuration;
    private Object placeholder;
    private Boolean canPublishFreeCopy;
    private String editMode;

    public Donut() {
    }

    public Boolean getDonut() {
        return isDonut;
    }

    public void setDonut(Boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Object getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(Object placeholder) {
        this.placeholder = placeholder;
    }

    public Boolean getCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(Boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
