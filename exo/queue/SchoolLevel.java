package exo.queue;

public enum SchoolLevel {
    GRETA(1),
    TERMINAL(3),
    PREMIERE(5),
    SECONDE(10);

    int priority;

    SchoolLevel(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
