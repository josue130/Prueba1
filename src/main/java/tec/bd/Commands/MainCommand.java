package tec.bd.Commands;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;
@Command(
        name = "Star-Wars",
        subcommands = {
                HelpCommand.class ,
                PeopleCommand.class,
                PlanetCommand.class,
                },
        description = "Prueba")
public class MainCommand implements Runnable{
    @Override
    public void run() {
    }

}
