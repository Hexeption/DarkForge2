package org.strezz.darkforge.event;

public class Event {

    public enum Type {
        PRE, POST
    }

    private Type type;
    private boolean cancelled;

    public Event(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void cancel() {
        cancelled = true;
    }

    public <T extends Event> T cast() {
        return (T) this;
    }
}
