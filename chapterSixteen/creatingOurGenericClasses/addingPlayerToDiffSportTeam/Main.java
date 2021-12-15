package chapterSixteen.creatingOurGenericClasses.addingPlayerToDiffSportTeam;

public class Main {

    public static void main(String[] args) {
        BaseBallPlayer joe = new BaseBallPlayer("Cannon");
        FootBallPlayer partey = new FootBallPlayer("Partey");
        SoccerPlayer jay = new SoccerPlayer("Jay-jay");

        Team<BaseBallPlayer> fearless = new Team<>("Fearless");
        fearless.addPlayers(joe);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("The Gunners");
        soccerPlayerTeam.addPlayers(jay);

        Team<FootBallPlayer> footBallPlayerTeam = new Team<>("Salacy");
        footBallPlayerTeam.addPlayers(partey);


        Team<FootBallPlayer> liverpool = new Team<>("Liverpool");
        Team<FootBallPlayer> arsenal = new Team<>("Arsenal");

        FootBallPlayer mane = new FootBallPlayer("Mane");
        liverpool.addPlayers(mane);

        FootBallPlayer saka = new FootBallPlayer("Saka");
        arsenal.addPlayers(saka);


        liverpool.matchResult(arsenal,3,1);
        arsenal.matchResult(liverpool, 2,5);


        System.out.println(fearless.numberOfPlayersInTeam());
    }


}
