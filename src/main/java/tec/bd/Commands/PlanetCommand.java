package tec.bd.Commands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import tec.bd.StarWars.StarsWarsService;



@Command(name = "planet", description = "Get name of characters ")
public class PlanetCommand implements Runnable{
    private static final Logger LOGGER = LoggerFactory.getLogger(PeopleCommand.class);

    @Parameters(paramLabel = "<planet id>", description = "people to be resolved")
    private  String id;
    @Override
    public void run() {
        var planet = new StarsWarsService();
        var information = planet.GetPlanet(id);
        System.out.println(information);
        System.exit(0);

    }
}

