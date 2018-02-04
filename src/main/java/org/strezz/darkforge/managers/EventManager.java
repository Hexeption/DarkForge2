package org.strezz.darkforge.managers;

import com.google.common.collect.Lists;
import org.strezz.darkforge.event.Event;
import org.strezz.darkforge.event.EventListener;

import java.util.Comparator;
import java.util.List;

public class EventManager {

    private static final List<EventListener> EVENT_LISTENER_LIST = Lists.newCopyOnWriteArrayList();

    public static void register(EventListener listener) {
        EVENT_LISTENER_LIST.add(listener);
        EVENT_LISTENER_LIST.sort(Comparator.comparing(EventListener::getPriority));
    }

    public static void handleEvent(Event event) {
        EVENT_LISTENER_LIST.forEach(listener -> listener.onEvent(event));
    }
}
