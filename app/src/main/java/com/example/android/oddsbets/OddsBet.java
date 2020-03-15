package com.example.android.oddsbets;

public class OddsBet {

    public String sport_key;
    public String sport_nice;
    public String [] teams;
    public String commence_time;
    public String home_team;
    public String [] sites;

    public  OddsBet(){

    }

    public OddsBet(String sport_key, String sport_nice, String[] teams, String commence_time, String home_team, String[] sites) {
        this.sport_key = sport_key;
        this.sport_nice = sport_nice;
        this.teams = teams;
        this.commence_time = commence_time;
        this.home_team = home_team;
        this.sites = sites;
    }

    public String getSport_key() {
        return sport_key;
    }

    public void setSport_key(String sport_key) {
        this.sport_key = sport_key;
    }

    public String getSport_nice() {
        return sport_nice;
    }

    public void setSport_nice(String sport_nice) {
        this.sport_nice = sport_nice;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public String getCommence_time() {
        return commence_time;
    }

    public void setCommence_time(String commence_time) {
        this.commence_time = commence_time;
    }

    public String getHome_team() {
        return home_team;
    }

    public void setHome_team(String home_team) {
        this.home_team = home_team;
    }

    public String[] getSites() {
        return sites;
    }

    public void setSites(String[] sites) {
        this.sites = sites;
    }
}
