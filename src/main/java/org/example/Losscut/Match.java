package org.example.Losscut;

public class Match {
    String team1="A";
    String team2="B";
    double rate1=2.3;
    double rate2=1.75;

    double profit1=0,loss1=0;
    double profit2=0,loss2=0;
    double amount=0;

    Match(double amount,String team){
        this.amount=amount;
        if(team=="A"){
            profit1=(rate1-1)*amount;
            loss2=amount;
        }
        if(team=="B"){
            profit2=(rate2-1)*amount;
            loss1=amount;
        }
    }
    double getrate(double profit){
        return 1+ loss2/(profit1-profit);

    }

}
