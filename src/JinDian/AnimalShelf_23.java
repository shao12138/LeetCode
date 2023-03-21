package JinDian;

import java.util.LinkedList;

public class AnimalShelf_23 {
    LinkedList<int[]> linkedList = new LinkedList();

    public AnimalShelf_23() {
    }

    public void enqueue(int[] animal) {
        linkedList.add(animal);
    }

    public int[] dequeueAny() {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) != null) {
                int[] result = linkedList.get(i);
                linkedList.remove(i);
                return result;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] dequeueDog() {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) != null && linkedList.get(i)[1] == 1) {
                int[] result = linkedList.get(i);
                linkedList.remove(i);
                return result;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] dequeueCat() {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) != null && linkedList.get(i)[1] == 0) {
                int[] result = linkedList.get(i);
                linkedList.remove(i);
                return result;
            }
        }
        return new int[]{-1, -1};
    }
}
