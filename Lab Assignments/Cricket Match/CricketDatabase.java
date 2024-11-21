

class Players {
    String name;
    String quality;
    int jersey;
    int number = 0;

    Players(String name, String quality, int jersey) {
        this.name = name;
        this.quality = quality;
        this.jersey = jersey;
    }

}

class match {
    String name;
    String quality;
    int jersey;

    match(String name, String quality, int jersey) {
        this.name = name;
        this.quality = quality;
        this.jersey = jersey;
    }
}

class features {

    int i = 0;

    Players[] member = new Players[100];

    void addplayer() {

        for (i = 0; i <50; i++) {

            if (i % 3 == 0) {
                member[i] = new Players("Marcus(" + i + ")", "All_rounder", i);
            } else if (i % 2 == 0) {
                member[i] = new Players("Marcus(" + i+ ")", "Batsman", i);
            }

            else {
                member[i] = new Players("Marcus(" + i+ ")", "Bowler", i);
            }

        }

    }

    void newplayer(String name, String quality, int jersey) {

        member[jersey] = new Players(name + i, "All_rounder", i);

    }

    match[][] newman = new match[8][8];

    void addmatch(int day,int index) {

        for (int k = 1; k <8; k++) {
            
            int m = k;
            if(day==1)
            {
                newman[day][k] = new match(member[m].name, member[m].quality, member[m].jersey);
            }
            if(day==2)
            {   
                m = m+7;
                newman[day][k] = new match(member[m].name, member[m].quality, member[m].jersey);
            }
            if(day==3)
            {
                m = m+14;
                newman[day][k] = new match(member[m].name, member[m].quality, member[m].jersey);
            }
            if(day==4)
            {
                m = m+21;
                newman[day][k] = new match(member[m].name, member[m].quality, member[m].jersey);
            }
            if(day==5)
            {
                m = m+28;
                newman[day][k] = new match(member[m].name, member[m].quality, member[m].jersey);
            }
            if(day==6)
            {
                m = m+35;
                newman[day][k] = new match(member[m].name, member[m].quality, member[m].jersey);
            }
            if(day==7)
            {
                m = m+42;
                newman[day][k] = new match(member[m].name, member[m].quality, member[m].jersey);
            }
        }

    }

    void totaplayer() {
        for (int index = 0; index <= i; index++) {

            System.out.println(member[index].name);
            System.out.println(member[index].quality);
            System.out.println(member[index].jersey);
        }
    }

    void matchplayer(int n) {

        int b = 0;
        int bow = 0;
        int al = 0;
        for (int index = 1; index <=7; index++) {

            for (int k = 1; k <=7; k++) {
                {
                    if (n == index) {

                        System.out.println(newman[index][k].name);
                        System.out.println(newman[index][k].quality);
                        System.out.println(newman[index][k].jersey);

                        if (newman[index][k].quality.equals("Batsman")) {
                            b++;
                        }

                        else if (newman[index][k].quality.equals("Bowler")) {
                            bow++;
                        }

                        else if (newman[index][k].quality.equals("All_rounder")) {
                            al++;
                        }

                    }

                }

            }
        }

        System.out.println("Total batsman in the match : " + b);
        System.out.println("Total bowlers in the match : " + bow);
        System.out.println("Total all rounder in the match : " + al);
    }
}

public class CricketDatabase {
    public static void main(String[] args) {

        features ff = new features();

        ff.addplayer();
        ff.newplayer("mehedi", "Batsman", 50);

         ff.totaplayer();

        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                ff.addmatch(i, j);
            }
        }

        ff.matchplayer(4);

    }
}
