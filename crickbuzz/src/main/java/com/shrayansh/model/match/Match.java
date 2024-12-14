package com.shrayansh.model;

import java.util.Date;

public class Match {
    private int id;
    private String venue;
    private Date date;
    private Inning[] innings;
    private MatchType matchType;
    private MatchStatus matchStatus;
    private Team tossWinner;

    public void matchStart(){
        // todo: need to be implemented.
    }
}
