package Products;

public class Alenka extends Chocolate{
    @Override
    public int price() {
        return 130;
    }

    @Override
    public void print() {
        System.out.println("Please take your chocolate Alenka");
    }
}
