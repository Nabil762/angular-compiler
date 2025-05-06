package AST;

public class Comment {
    String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "\ncomment='" + comment + '\'' + "\n}";
    }
}
