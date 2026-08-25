public class Product<T ,U>{
    private T item;
    private U price;
    public Product(T item, U price) {
        this.item = item;
        this.price = price;
    }
    public void print(){
        System.out.println("Item : " + item + " Price : "+price);
    }
}
