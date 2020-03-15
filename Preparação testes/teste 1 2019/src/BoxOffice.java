import java.util.ArrayList;
import java.util.List;

public class BoxOffice {
    static public List<Ticket> buy(Concert concert, int number) throws InvalidTicket{

        List<Ticket> out = new ArrayList<>();

        for(int i=0;i<number;i++){
            concert.setTicketNumber(concert.getTicketNumber()+1);
            out.add(new Ticket(concert.getTicketNumber(), concert));
        }

        return out;
    }
}
