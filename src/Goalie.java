public class Goalie extends Soccer_player{
    int goalsAllowed;





    //const

    public Goalie(String sport, String team, String position, String first, String last,int minutes,int goals,int goalsAllowed) {
        super(sport, team, position, first, last,minutes,goals);
        this.goalsAllowed=goalsAllowed;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }




//method


    public String averageGoalsAllowed()
    {
        if(goalsAllowed==0)
        {
            String average_goals_allowed="zero";
            return average_goals_allowed;

        }
        else {
            String average_goals_allowed=String.format("average goals allowed is %f",(((float)goalsAllowed/(float)minuts)*90));
            return average_goals_allowed;

        }


    }


    public String toString()
    {
        String sup=super.toString();
        return "Sport: "+sport+"\t"+"Team : "+team+"\t"+"Position: "+position+"\t"+"First: "+first+"\t"+"Last: "+last+"\t"+"minuts: "+minuts+"\t"+"Goals: "+goals+"\t"+"goals allowed: "+goalsAllowed+"\t"+"average goals allowed: "+averageGoalsAllowed()+"\n"+"(and the output of the superclass is :"+sup+")"+"\n";
    }






}
