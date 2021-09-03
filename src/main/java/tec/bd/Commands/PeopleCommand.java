package tec.bd.Commands;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import tec.bd.StarWars.StarsWarsService;

@Command(name = "people", description = "Get name of characters ")
public class PeopleCommand implements Runnable{
    private static final Logger LOGGER = LoggerFactory.getLogger(PeopleCommand.class);

    @Parameters(paramLabel = "<people id>", description = "people to be resolved")
    private  String id;
    @Override
    public void run() {
        var people = new StarsWarsService();
        var information = people.GetPeople(id);
        System.out.println(information);
        System.exit(0);

    }
}
