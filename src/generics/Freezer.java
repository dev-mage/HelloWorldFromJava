package generics;

public class Freezer {
    static <T extends FreshIngredient> void freeze(StorageBox<T> storageBox) {
        for(FreshIngredient i : storageBox.list) {
            i.state = "frozen";
        }
    }
}
