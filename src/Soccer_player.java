import java.util.Random;

public class Soccer_player extends Player implements Shoot{
    int minuts;
    int goals;

    //const
    public  Soccer_player(String sport,String team,String position,String first,String last,int minuts,int goals)
    {
        super(sport, team, position, first, last);
        this.minuts=minuts;
        this.goals=goals;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

//methods

    public String goalsPerGames()
    {

        String goals_per_minuts=String.format("goals per minuts is %f",(float)(((float)goals/(float)minuts)*90));


        return goals_per_minuts;
    }


    public String toString()
    {
        String sup=super.toString();
        return "Sport: "+sport+"\t"+"Team : "+team+"\t"+"Position: "+position+"\t"+"First: "+first+"\t"+"Last: "+last+"\t"+"minuts: "+minuts+"\t"+"Goals: "+goals+"\t"+"goals per minuts: "+goalsPerGames()+"\t"+"can shoot: "+canShoot()+"\n"+"(and the output of the superclass is :"+sup+")"+"\n";
    }

    @Override
    public boolean canShoot() {
        boolean canShoot;
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
}
