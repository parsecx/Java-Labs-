import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Cart cartInUse = new Cart(6);
        for(int i = 0; i < 5; i++){
            BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

            System.out.print("Enter name of item: ");
            String nameOfItem = reader.readLine();
            System.out.print("Enter price of item: ");
            String priceOfItem = reader.readLine();
            Item cartPiece = new Item(nameOfItem,Double.parseDouble(priceOfItem));

            cartInUse.addItemToCart(cartPiece);
        }
        double sumPriceForItems = cartInUse.sumOfAllPrices();
        System.out.println("Price for all items is: " + sumPriceForItems);

        cartInUse.upAllItemsByPercent(15);
        sumPriceForItems = cartInUse.sumOfAllPrices();
        System.out.println("Price for all after rising by 15% is: " + sumPriceForItems);

        cartInUse.downAllItemsByPercent(30);
        sumPriceForItems = cartInUse.sumOfAllPrices();
        System.out.println("Price for all after decreasing by 30% is: " + sumPriceForItems);
    }
}