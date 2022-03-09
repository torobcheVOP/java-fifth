import java.util.Random;

public class Baseball_player extends Player implements Defend{
    int atBats;
    int hits;

    //const
public  Baseball_player(String sport,String team,String position,String first,String last,int atBats,int hits)
{
    super(sport, team, position, first, last);
    this.atBats=atBats;
    this.hits=hits;
}

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

//methods

    public  String battingaverage()
    {
        String batting_average=String.format("batting average is %f",((float)hits/(float)atBats));
        return batting_average;
    }


    @Override
    public boolean canDefend() {
        boolean canDefend;
        Random r=new Random();
        double num=r.nextDouble();
        if(num>=0.5)
        {
            return true;
        }
        else
        {
            return false;

        }
    }

    public String toString()
    {
        String sup=super.toString();
        return "Sport: "+sport+"\t"+"Team : "+team+"\t"+"Position: "+position+"\t"+"First: "+first+"\t"+"Last: "+last+"\t"+"atBats: "+atBats+"\t"+"hits: "+hits +"\t"+"can defend: "+canDefend()+"\t"+"batting average: "+battingaverage()+"\n"+"(and the output of the superclass is :"+sup+")"+"\n";
    }


}
