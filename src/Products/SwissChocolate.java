package Products;

public class SwissChocolate extends Chocolate{
    @Override
    public int price() {
        return 700;
    }
    @Override
    public void print() {
        System.out.println("Please take your chocolate SwissChocolate");
    }
}
