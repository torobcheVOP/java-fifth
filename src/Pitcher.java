public class Pitcher extends  Baseball_player{
    double innings;
    int earnedRuns;



    //const
    public Pitcher(String sport, String team, String position, String first, String last,int atBats,int hits,double innings,int earnedRuns) {
        super(sport, team, position, first, last,atBats,hits);
        this.earnedRuns=earnedRuns;
        this.innings=innings;

    }




    //methods


    public double getInnings() {
        return innings;
    }

    public void setInnings(double innings) {
        this.innings = innings;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public String eranedRunAverage()
    {
        String earned_run_average=String.format("earned run average is %f",((float)earnedRuns/(float)innings));
        return earned_run_average;
    }



    public String toString()
    {
        String sup=super.toString();
        return "Sport: "+sport+"\t"+"Team : "+team+"\t"+"Position: "+position+"\t"+"First: "+first+"\t"+"Last: "+last+"\t"+"atBats: "+atBats+"\t"+"hits: "+hits +"\t"+"innings: "+innings+"\t"+"earned runs: "+earnedRuns+"\t"+"earned run average is: "+eranedRunAverage()+"\n"+"(and the output of the superclass is :"+sup+")"+"\n";
    }
}
