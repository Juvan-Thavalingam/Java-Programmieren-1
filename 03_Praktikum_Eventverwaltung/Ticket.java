public class Ticket {

    public Ticket(String ticketName, int preis, int anzahlTicket){
        erstelleTicket(ticketName, preis, anzahlTicket);
    }
    private String ticketName;
    private int preis;
    private int anzahlTicket;
    private int maxTicket;

    private void erstelleTicket(String ticketName, int preis, int anzahlTicket){
        this.ticketName = ticketName;
        this.preis = preis;
        this.anzahlTicket = anzahlTicket;
        this.maxTicket = anzahlTicket;

    }

    public int getEinnahmen(){
        return (getMaxTicket() - getAnzahlTicket()) * preis;
    }

    public String getTicketName(){
        return ticketName;
    }
    public int getAnzahlTicket(){
        return anzahlTicket;
    }

    public void setAnzahlTicket(int anzahlTicket){
        this.anzahlTicket = anzahlTicket;
    }

    public int getVerkaufteTicket(){
        return getMaxTicket() - getAnzahlTicket();
    }

    public int getMaxTicket(){
        return maxTicket;
    }

    public int getPreis(){
        return preis;
    }

    public Ticket ticket(Ticket ticket){
        return ticket;
    }
}
