package domain;

public class Comment {
    private int id;
    private int idAuthor;
    private String date;
    private int count;
    private String text;
    private int canPost;
    private int groupsСanPost;
    private Boolean canClose;
    private Boolean canOpen;

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsСanPost() {
        return groupsСanPost;
    }

    public void setGroupsСanPost(int groupsСanPost) {
        this.groupsСanPost = groupsСanPost;
    }

    public Boolean getCanClose() {
        return canClose;
    }

    public void setCanClose(Boolean canClose) {
        this.canClose = canClose;
    }

    public Boolean getCanOpen() {
        return canOpen;
    }

    public void setCanOpen(Boolean canOpen) {
        this.canOpen = canOpen;
    }
}
