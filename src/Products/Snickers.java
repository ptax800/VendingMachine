package Products;

public class Snickers extends Chocolate{
    @Override
    public int price() {
        return 300;
    }
    @Override
    public void print() {
        System.out.println("Please take your chocolate Mars");
    }
}
