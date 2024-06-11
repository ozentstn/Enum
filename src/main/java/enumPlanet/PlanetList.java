package enumPlanet;

public class PlanetList {
    public static void main(String[] args) {
        for (Planet planet : Planet.values())
            System.out.println(planet.ListOfPlanet());
      }
}

