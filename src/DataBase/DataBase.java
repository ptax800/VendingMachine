package DataBase;
import java.io.*;
public class DataBase {
    public StringBuilder readBase() {
        StringBuilder quantity = new StringBuilder();
        try(FileReader reader = new FileReader("C:\\Users\\User\\IdeaProjects\\VendingMachine\\src\\DataBase\\data.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                quantity.append((char)c);
                System.out.print((char)c); //"эту строчку удалить"
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return quantity;
    }
    public void writeBase(String string){
        try(FileWriter writer = new FileWriter("C:\\Users\\User\\IdeaProjects\\VendingMachine\\src\\DataBase\\data.txt", false))
        {
            writer.write(String.valueOf(string));
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

