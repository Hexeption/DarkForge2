package org.strezz.darkforge.event;

public interface EventListener {

    enum Priority {
        LOW, NORMAL, HIGH
    }

    default Priority getPriority() {
        return Priority.NORMAL;
    }

    void onEvent(Event event);
}
