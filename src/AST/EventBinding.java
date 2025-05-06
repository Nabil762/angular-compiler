package AST;

public class EventBinding {
    String standard_event;

    public String getStandard_event() {
        return standard_event;
    }

    public void setStandard_event(String standard_event) {
        this.standard_event = standard_event;
    }

    @Override
    public String toString() {
        return "\nEventBinding{" +
                "standard_event= '" + standard_event + '\'' +
                "\n}";
    }
}
