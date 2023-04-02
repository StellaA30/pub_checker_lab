import java.util.ArrayList;


//RED -GREEN -REFACTOR
// Refactoring means improving the code to make it more efficient]
public class Server {

    private ArrayList<String> possibleDrinks;

    public Server(ArrayList<String> possibleDrinks){
        this.possibleDrinks = possibleDrinks;
    }
    public boolean canServeGuest(Guest guest){
        if(guest.getAge() < 18){
            return false;
        }
        if(guest.getMoney() < 5.0){
            return false;
        }
//        Sobriety under 50 considered too drunk to be served
        if(guest.getSobriety() < 50){
            return false;
        }
        if(guest.getIsBanned() == true){
            return false;
        }
        if(guest.getCurrency() != '£'){
            return false;
        }
        if(!possibleDrinks.contains(guest.getFavouriteDrink())){
            return false;
        }
        return true;
    }
}