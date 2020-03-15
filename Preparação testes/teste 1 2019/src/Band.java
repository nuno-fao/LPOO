import java.util.ArrayList;
import java.util.List;

public class Band extends Act{
    private List<Artist> artists;

    public Band(String name, String country){
        super(name,country);
        artists = new ArrayList<>();
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public void addArtist(Artist artist){
        artists.add(artist);
    }

    public boolean containsArtist(Artist artist){
        for(Artist it:artists){
            if(it.equals(artist)){
                return true;
            }
        }
        return false;
    }
}
