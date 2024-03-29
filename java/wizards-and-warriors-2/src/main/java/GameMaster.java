public class GameMaster {

    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with "
                + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants()
                + " inhabitants.";
    }

    public String describe(TravelMethod travelMethod) {
        switch (travelMethod) {
            case TravelMethod.WALKING:
                return "You're traveling to your destination by walking.";
            case TravelMethod.HORSEBACK:
                return "You're traveling to your destination on horseback.";
        }

        return "You're traveling to your destination.";
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
}
