import java.util.ArrayList;
import java.util.List;

public class Party extends Event {
    List<Event> events;

    public Party(String title,String date, String description){
        super(title,date,description);
        events = new ArrayList<>();
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public void addEvent(Event e){
        events.add(e);
        List<Person> persons= super.getAudience();
        for(Person person:e.getAudience()){
           persons.add(person);
        }
        super.setAudience(persons);
    }
}
