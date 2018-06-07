package no.nordli.observeradapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;

public class ObservableArrayList<T extends Observable> extends ArrayList<T> {

    @Override
    public boolean add(T obj) {
        boolean added = super.add(obj);
        if (added) {
            obj.notifyObservers();
        }
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        boolean added = super.addAll(collection);
        if (added) {
            for (T obj : collection) {
                obj.notifyObservers();
            }
        }
        return added;
    }

    @Override
    public boolean remove(Object obj) {
        boolean removed = super.remove(obj);
        if (removed && obj instanceof Observable) {
            ((Observable) obj).notifyObservers();
        }
        return removed;
    }

    @Override
    public void clear() {
        super.clear();
        // TODO: Notify
    }
}