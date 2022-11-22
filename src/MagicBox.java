import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int maxItems) {
        this.items = (T[]) new Object[maxItems];
    }

    int full = 0;

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                full += 1;
                return true;
            }
        }
        return false;
    }


    public T pick() {
        Random random = new Random();
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не заполнена, осталось " + (items.length - full) + " ячеек.");
            }
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                int randomInt = random.nextInt(items.length);
                System.out.println("Коробка заполнена. Случайный элемент из коробки: " + items[randomInt]);
                System.out.println();
                return items[randomInt];
            }
        }
        return null;
    }
}


