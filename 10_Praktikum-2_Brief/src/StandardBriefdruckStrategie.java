public class StandardBriefdruckStrategie implements Briefdruckstrategie{

    @Override
    public void druckeBrief(Brief brief) {
        System.out.println("Standard!");
        System.out.println(brief.getEmpfaenger().getVorname());
        System.out.println(brief.getInhalt().getText());
    }
}
