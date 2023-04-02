public class Server {

    //RED -GREEN -REFACTOR
    // Refactoring means improving the code to make it more efficient]

//    combining the methods together for checking wallet and age -- Bouncer method
    public boolean canServeGuest(Guest guest){
        if (guest.getAge() < 18){
            return false;
        }
        if(guest.getWallet() < 5.0){
            return false;
        }
        return true;
    }


}
