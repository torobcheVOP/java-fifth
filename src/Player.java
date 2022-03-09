public class Player {
    String sport;
    String team;
    String position;
    String first;
    String last;

    public Player(String sport,String team,String position,String first,String last)
    {
this.sport=sport;
this.team=team;
this.position=position;
this.first=first;
this.last=last;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
    public String toString()
    {
        return "Sport: "+sport+"\t"+"Team : "+team+"\t"+"Position: "+position+"\t"+"First: "+first+"\t"+"Last: "+last+"\n";

    }
}
