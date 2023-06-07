package lessons.task28;

public class Generic<T extends Number> {

    private T field;

    public Generic(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public <T> double pow(int degree) {
        return Math.pow(field.doubleValue(), degree);
    }
}