package sk.tuke.mp.persistence.valueAccess;

/**
 * Created by DAVID on 16.2.2017.
 */
public interface IValueAccessor {
    Object get(Object obj);
    void set(Object instance, Object value);
    Class getValueType();
}
