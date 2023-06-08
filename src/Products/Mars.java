package Products;

public class Mars extends Chocolate{
    @Override
    public int price() {
        return 350;
    }
    @Override
    public void print() {
        System.out.println("Please take your chocolate Mars");
    }
}
