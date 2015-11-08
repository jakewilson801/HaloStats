package me.jakewilson.halostats.net;

import java.util.ArrayList;

/**
 * Created by jakewilson on 11/8/15.
 */
public class Match {
    public ArrayList<Team> Teams;
    public Id Id;
    public ArrayList<Player> Players;
    public String MapId;

    public class Player {
        public Integer TeamdId;
        public Integer Rank;
        public Integer TotalKills;
        public Integer TotalDeaths;
        public Integer TotalAssists;
    }

    public class Team {
        public Integer Id;
        public Integer Score;
        public Integer Rank;
    }
    public class Id {
        public String MatchId;
        public Integer GameMode;
    }
}
