import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert implements Comparable<Concert> {
    private List<Act> acts;
    private String city;
    private String country;
    private String date;
    private int ticketNumber;

    public Concert(String city, String country, String date){
        this.city=city;
        this.country=country;
        this.date=date;
        this.ticketNumber=0;
        acts = new ArrayList<>();
    }

    public List<Act> getActs() {
        return acts;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setActs(List<Act> acts) {
        this.acts = acts;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void addAct(Act act){
        acts.add(act);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return Objects.equals(acts, concert.acts) &&
                Objects.equals(city, concert.city) &&
                Objects.equals(country, concert.country) &&
                Objects.equals(date, concert.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acts, city, country, date);
    }

    @Override
    public int compareTo(Concert o) {
        if(city.equals(o.getCity()) && country.equals(o.getCountry()) && date.equals(o.getDate())){
            return 0;
        }
        else{
            return date.compareTo(o.getDate());
        }
    }

    public boolean isValid(Ticket ticket) throws InvalidTicket{
        if(ticket.getConcert().equals(this)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean participates(Artist artist){
        for(Act it:acts){
            if(it.containsArtist(artist)){
                return true;
            }
        }
        return false;
    }
}
