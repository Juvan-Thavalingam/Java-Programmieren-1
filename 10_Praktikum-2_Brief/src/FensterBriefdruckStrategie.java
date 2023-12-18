public class FensterBriefdruckStrategie implements Briefdruckstrategie{

    @Override
    public void druckeBrief(Brief brief) {
        System.out.println("Fenster!");
        System.out.println(brief.getEmpfaenger().getVorname());
        System.out.println(brief.getInhalt().getText());
    }
}
