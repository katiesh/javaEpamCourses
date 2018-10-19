package epam.java.data;

import epam.java.model.GameRoom;
import epam.java.model.Toy;
import epam.java.view.View;

public class SearchData <T extends Toy> {
    View view;
    GameRoom gameRoom;

    public SearchData(View view, GameRoom gameRoom) {
        this.view = view;
        this.gameRoom = gameRoom;
    }

    public T[] searchByMaterial(String material,T[] toys){
        T[] result = (T[]) gameRoom.getByMaterial(material,toys);
        if(result.length == 0) {
            view.printMessage("No toys -  ");
        }
        else{
            view.printToys("\nToy - " + material,result);
        }
        return result;
    }

    public T[] seatchByPrice(int priceFrom, int priceTo,T[] toys){
        T[] result = (T[]) gameRoom.getByPrice(priceFrom, priceTo,toys);
        if(result.length == 0) {
            view.printMessage("No toys -  ");
        }
        else{
            view.printToys("\nToys - ",result);
        }
        return result;
    }
}
