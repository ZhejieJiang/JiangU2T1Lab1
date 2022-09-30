public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Loki",7,8.7);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Max",4,7.9);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
