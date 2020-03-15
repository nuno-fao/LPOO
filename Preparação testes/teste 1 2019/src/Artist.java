public class Artist extends Act{

    public Artist(String name, String country){
        super(name,country);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean containsArtist(Artist artist){
        return artist.equals(this);
    }
}
