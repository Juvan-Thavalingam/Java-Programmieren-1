public class Event {

    private Event(){}

    private Ticket ticket1;
    private Ticket ticket2;
    private Ticket ticket3;
    private Ticket checkTicket;

    private Künstler künstler;

    private Event(Künstler künstler, Ticket ticket1, Ticket ticket2, Ticket ticket3){
        this.künstler = künstler;
        this.ticket1 = ticket1;
        this.ticket2 = ticket2;
        this.ticket3 = ticket3;
    }

    public void kaufeTicket(int kategorie, int anzahlTicket){
        switch (kategorie){
            case 1:
                checkTicket = ticket1;
                break;
            case 2:
                checkTicket = ticket2;
                break;
            case 3:
                checkTicket = ticket3;
                break;
        }
        if(checkTicket.getAnzahlTicket() < anzahlTicket){
            System.err.println("Es sind nur " + checkTicket.getAnzahlTicket() + " Tickets verfügbar!");
        } else {
            System.out.println("Alter Bestand: " + checkTicket.getAnzahlTicket());
            checkTicket.setAnzahlTicket(checkTicket.getAnzahlTicket() - anzahlTicket);
            System.out.println("Kauf erfolgreich!");
            System.out.println("Neuer Bestand: " + checkTicket.getAnzahlTicket() + "\n");
        }
    }

    public static void main(String[] args) {
        Event event = new Event(new Künstler("Elvis", 20000),
                new Ticket("Kategorie_1", 500, 100),
                new Ticket("Kategorie_2", 200, 500),
                new Ticket("Kategorie_3", 100, 2000));

        event.kaufeTicket(1, 56);
        event.kaufeTicket(1, 56);
        event.kaufeTicket(2, 56);
        event.printSheet();
    }

    public int getGesamtEinnahmen(){
        return ticket1.getEinnahmen() + ticket2.getEinnahmen() + ticket3.getEinnahmen();
    }

    public void printSheet(){
        System.out.println("Künstler: " + künstler.getName() + " Gage: CHF " + künstler.getGage());
        System.out.println(ticket1.getTicketName() + ": " + ticket1.getVerkaufteTicket() + " von " + ticket1.getMaxTicket() + " verkauft, Einnahmen: CHF " + ticket1.getEinnahmen());
        System.out.println(ticket2.getTicketName() + ": " + ticket2.getVerkaufteTicket() + " von " + ticket2.getMaxTicket() + " verkauft, Einnahmen: CHF " + ticket2.getEinnahmen());
        System.out.println(ticket3.getTicketName() + ": " + ticket3.getVerkaufteTicket() + " von " + ticket3.getMaxTicket() + " verkauft, Einnahmen: CHF " + ticket3.getEinnahmen());
        System.out.println("Gesamteinnahmen: CHF "+ getGesamtEinnahmen());
        System.out.println("Gewinn: CHF " + (getGesamtEinnahmen() - künstler.getGage()));
    }
}
