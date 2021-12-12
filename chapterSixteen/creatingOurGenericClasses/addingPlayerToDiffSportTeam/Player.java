package chapterSixteen.creatingOurGenericClasses.addingPlayerToDiffSportTeam;

public abstract class Player {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}
