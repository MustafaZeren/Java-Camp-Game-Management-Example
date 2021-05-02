package javacampgamemanagement;

public class GameOperations implements Operation{

    private Player player;
    private Campaign[] campaigns;

    //İKİNCİ PARAMETRE NULLABLE OLARAK TANIMLANDI. KAMPANYA OLMAYABİLİR.
    public GameOperations(Player player, Campaign... campaigns){
        this.player=player;
        this.campaigns=campaigns;
    }

    @Override
    public void sell() {
        System.out.println("The product was sold to "+player.getFirstName()+" "+player.getLastName());
        if(campaigns.length>0){
            System.out.println("Campaigns : ");
            for (Campaign campaign:campaigns) {
                System.out.println(campaign.getName());
            }
        }
    }
}
