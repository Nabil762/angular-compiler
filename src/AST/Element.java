package AST;

public class Element {
    TagStatement tagStatement;
    Comment comment;
    Interpolation interpolation;
    ImgTag imgTag;
    String text;

    public TagStatement getTagStatement() {
        return tagStatement;
    }

    public void setTagStatement(TagStatement tagStatement) {
        this.tagStatement = tagStatement;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Interpolation getInterpolation() {
        return interpolation;
    }

    public void setInterpolation(Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    public ImgTag getImgTag() {
        return imgTag;
    }

    public void setImgTag(ImgTag imgTag) {
        this.imgTag = imgTag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        if(tagStatement != null)
            return "\n Element{ tagStatement:" + tagStatement + "\n }";
        else if (comment != null) {
            return "\n Element{ comment:" + comment + "\n }";
        } else if (interpolation != null) {
            return "\n Element{ interpolation:" + interpolation + "\n }";
        } else if (imgTag != null) {
            return "\n Element{ imaTag:" + imgTag + "\n }";
        }
        return "\n Element{ " + text + "\n }";
    }
}
