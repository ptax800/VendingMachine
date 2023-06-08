package Products;

public class Baunty extends Chocolate{
    @Override
    public int price() {
        return 300;
    }
    @Override
    public void print() {
        System.out.println("Please take your chocolate Baunty");
    }
}
