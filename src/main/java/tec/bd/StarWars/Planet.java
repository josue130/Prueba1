package tec.bd.StarWars;

import java.util.List;

public class Planet {
    private String name;
    private String rotation_period;
    private String orbital_period;
    private String diameter;
    private String gravity;
    private String terrain;
    private String surface_water;
    private String population;
    private List<String> residents;
    private List<String> films;
    private String created;
    private String edited;
    private String url;


    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", rotation_period='" + rotation_period + '\'' +
                ", orbital_period='" + orbital_period + '\'' +
                ", diameter='" + diameter + '\'' +
                ", gravity='" + gravity + '\'' +
                ", terrain='" + terrain + '\'' +
                ", surface_water='" + surface_water + '\'' +
                ", population='" + population + '\'' +
                ", residents=" + residents +
                ", films=" + films +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" +url+ '\'' +
                '}';
    }
}
