public class Main{
    public static void main(String[] args) {
        Box<String> box = new Box<>("Banana");
        System.out.println(box.getItem());
        Box<Integer> box1 = new Box<>(10);
        System.out.println(box1.getItem());

        Product<String, Integer> p1 = new Product<>("Appol", 20);
        p1.print();
        Product<String, Double> p2 = new Product<>("Mangu", 12.25);
        p2.print();
    }
}