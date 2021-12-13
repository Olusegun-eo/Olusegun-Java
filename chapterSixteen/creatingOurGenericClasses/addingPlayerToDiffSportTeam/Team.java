package chapterSixteen.creatingOurGenericClasses.addingPlayerToDiffSportTeam;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String teamName;
    private int gameWon = 0;
    private int gameLost = 0;
    private int gameTied = 0;
    private int gamePlayed = 0;
    private ArrayList<T> players = new ArrayList<>();
    

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }
    
    public boolean addPlayers(T  player) {
        if(players.contains(player)){
            System.out.println(player.getPlayerName() + "Player already exist");
            return false;
        }
        else{
            players.add(player);
            System.out.println(player.getPlayerName() + " picked for team " + getTeamName());
            return true;
        }
    }

    public int numberOfPlayersInTeam(){
        return this.players.size();
    }

    public void matchResult( Team<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            gameWon++;
        }
        else if(ourScore < theirScore){
            gameLost ++;
        }
        else {
            gameTied++;
        }
//        We increase the number of game Played
        gamePlayed++;

//        We can save the same Result for the opponent Team OBJECT as well
        if(opponent == null){
            opponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int teamRanking(){
        return (gameWon * 2) + gameTied;
    }
}
