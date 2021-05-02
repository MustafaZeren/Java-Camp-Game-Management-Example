package javacampgamemanagement;

public class Main {

    public static void main(String[] args){

        Player player=new Player(1,"Barış","Manço",1943);
        PlayerManager playerManager=new PlayerManager(player);
        playerManager.add();
        playerManager.update();
        playerManager.delete();

        Campaign campaign=new Campaign("Free Campaign");
        CampaignManager campaignManager=new CampaignManager(campaign);
        campaignManager.add();
        campaignManager.update();
        campaignManager.delete();

        System.out.println("-------------------------------------------");

        Campaign[] campaigns={new Campaign("%25 Campaign"),new Campaign("Game Money Campaign")};
        Player player1=new Player(2,"Michael","Jackson",1958);
        GameOperations gameOperations=new GameOperations(player1,campaigns);
        gameOperations.sell();

        System.out.println("-------------------------------------------");

        Player player2=new Player(3,"Cem","Karaca",1945);
        GameOperations gameOperations2=new GameOperations(player2);
        gameOperations2.sell();



    }

}
