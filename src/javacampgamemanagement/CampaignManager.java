package javacampgamemanagement;

public class CampaignManager implements BaseManager {

    private Campaign campaign;

    public CampaignManager(Campaign campaign) {
        this.campaign = campaign;
    }

    @Override
    public void add() {
        System.out.println("Added Campaign : " + campaign.getName());
    }

    @Override
    public void delete() {
        System.out.println("Deleted Campaign : " + campaign.getName());
    }

    @Override
    public void update() {
        System.out.println("Updated Campaign : " + campaign.getName());
    }
}
