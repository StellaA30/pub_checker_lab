import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;

    @BeforeEach
    public void setUp(){
        ArrayList<String> possibleDrinks = new ArrayList<>();
        possibleDrinks.add("G&T");
        possibleDrinks.add("Rakija");
        possibleDrinks.add("Johnny Silverhand");
        possibleDrinks.add("Islay Malt");
        possibleDrinks.add("Espresso Martini");
        possibleDrinks.add("Wine");
        server = new Server(possibleDrinks);
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeGuestIfOver18(){
        Guest anna = new Guest("Anna", 21, 100.0, 100, false, '£', "G&T");
        boolean result = server.canServeGuest(anna);
        assertThat(result).isTrue();
    }

    @Test
    public void cannotServeGuestIfUnder18(){
        Guest youngGuest = new Guest("Lebowski", 17, 100.0, 51, false, '£', "White Russian");
        boolean result = server.canServeGuest(youngGuest);
        assertThat(result).isFalse();
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void canServeGuestIfHaveEnoughMoney(){
        Guest eoan = new Guest("Eoan", 25, 100.0, 100, false, '£', "Rakija");
        boolean result = server.canServeGuest(eoan);
        assertThat(result).isTrue();
    }

    @Test
    public void cannotServeGuestIfDoesntHaveEnoughMoney(){
        Guest brokeGuest = new Guest("Lebowski", 45, 0.0, 51, false, '£', "White Russian");
        boolean result = server.canServeGuest(brokeGuest);
        assertThat(result).isFalse();
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void canServeGuestIfSoberEnough(){
        Guest zsolt = new Guest("Zsolt", 30, 100.0, 100, false, '£', "Johnny Silverhand");
        boolean result = server.canServeGuest(zsolt);
        assertThat(result).isTrue();
    }

    @Test
    public void cannotServeGuestIfTooDrunk(){
        Guest drunkGuest = new Guest("Lebowski", 45, 100.0, 0, false, '£', "White Russian");
        boolean result = server.canServeGuest(drunkGuest);
        assertThat(result).isFalse();
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void canServeGuestIfNotBanned(){
        Guest colin = new Guest("Colin", 30, 100.0, 100, false, '£', "Islay Malt");
        boolean result = server.canServeGuest(colin);
        assertThat(result).isTrue();
    }

    @Test
    public void cannotServeGuestIfBanned(){
        Guest bannedGuest = new Guest("Lebowski", 45, 100.0, 100, true, '£', "White Russian");
        boolean result = server.canServeGuest(bannedGuest);
        assertThat(result).isFalse();
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void canServeGuestIfLocalCurrency(){
        Guest ed = new Guest("Ed", 30, 100.0, 100, false, '£', "Espresso Martini");
        boolean result = server.canServeGuest(ed);
        assertThat(result).isTrue();
    }

    @Test
    public void cannotServeGuestIfNotLocalCurrency(){
        Guest foreignGuest = new Guest("Lebowski", 45, 100.0, 100, false, '$', "White Russian");
        boolean result = server.canServeGuest(foreignGuest);
        assertThat(result).isFalse();
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)
    @Test
    public void canServeGuestIfCanMakeDrink(){
        Guest iain = new Guest("Iain", 30, 100.0, 100, false, '£', "Wine");
        boolean result = server.canServeGuest(iain);
        assertThat(result).isTrue();
    }

    @Test
    public void cannotServeGuestIfCannotMakeDrink(){
        Guest pickyGuest = new Guest("Lebowski", 45, 100.0, 100, false, '$', "White Russian");
        boolean result = server.canServeGuest(pickyGuest);
        assertThat(result).isFalse();
    }

}