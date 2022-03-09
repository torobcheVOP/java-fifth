import java.io.*;
import java.util.ArrayList;

public class Main {
public static ArrayList<Player> playerArrayList=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the application");
        System.out.println("--------------------------");
        File file=new File("C:\\Players\\Players.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String str;
        while ((str=bufferedReader.readLine())!=null)
        {
            if(str.contains("Soccer"))
            {
            String s1[]=str.split("\\s+");
            if(s1.length==7)
            {

                Soccer_player soccer_player=new Soccer_player(s1[0],s1[1],s1[2],s1[3],s1[4],Integer.parseInt(s1[5]),Integer.parseInt(s1[6]));
                playerArrayList.add(soccer_player);
            }
            else if(s1.length==8)
            {

                Goalie goalie=new Goalie(s1[0],s1[1],s1[2],s1[3],s1[4],Integer.parseInt(s1[5]),Integer.parseInt(s1[6]),Integer.parseInt(s1[7]));
                playerArrayList.add(goalie);
                System.out.println(s1[5] + s1[6] + s1[7]);
            }
            }


            //baseball
            else if (str.contains("Baseball"))
            {
                String s1[]=str.split("\\s+");
                if(s1.length==7)
                {
                    Baseball_player baseball_player=new Baseball_player(s1[0],s1[1],s1[2],s1[3],s1[4],Integer.parseInt(s1[5]),Integer.parseInt(s1[6]));
                    playerArrayList.add(baseball_player);
                }
                else if(s1.length==9)
                {
                    Pitcher pitcher=new Pitcher(s1[0],s1[1],s1[2],s1[3],s1[4],Integer.parseInt(s1[5]),Integer.parseInt(s1[6]),Double.parseDouble(s1[7]),Integer.parseInt(s1[8]));
                    playerArrayList.add(pitcher);
                }

            }
        }

        //toStrings
      //  Player player=new Player();
        for (int i=0;i<playerArrayList.size();i++)
        {
           System.out.println( playerArrayList.get(i).toString());

            File fil1=new File("C:\\Players\\Output.txt");
            if (fil1.createNewFile()) {
                System.out.println("File created: " + fil1.getName());
            }
            FileWriter File=new FileWriter("C:\\Players\\Output.txt",true);
            String last=playerArrayList.get(i).toString();
            File.write(last);
            File.flush();
            File.close();
        }



    }
}
