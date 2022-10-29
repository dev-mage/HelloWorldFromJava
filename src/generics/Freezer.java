package generics;

public class Freezer {
    static void freeze(StorageBox<? extends FreshIngredient> storageBox) {
        for(FreshIngredient i : storageBox.list) {
            i.state = "frozen";
        }
    }
}
