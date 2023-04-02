import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;

    @BeforeEach
    public void setUp(){

        server = new Server();
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canOnlyServedIfOver18_true(){
//        guest needs age
//        check age is over 18
//        assertThat(server.canServeGuest(guest)).isEqualTo(true);
        Guest guest = new Guest("Stella", 19, 30);
        boolean actual = server.canServeGuest(guest);
        assertThat(actual).isEqualTo(true);


    }

    @Test
    public void canOnlyBeServedOver18_false(){
        Guest guest = new Guest("Stella", 11, 5);
        boolean actual = server.canServeGuest(guest);
        assertThat(actual).isEqualTo(false);

    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void cannotGetServedIfBroke(){
        Guest brokeGuest = new Guest("Florian", 44, 2.5);

    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
