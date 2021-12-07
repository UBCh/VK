package domain;

public class LikesInfo {
    private int count;
    private int userLikes;
    private int canLike;
    private int can_publish;

    public LikesInfo() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCan_publish() {
        return can_publish;
    }

    public void setCan_publish(int can_publish) {
        this.can_publish = can_publish;
    }
}
