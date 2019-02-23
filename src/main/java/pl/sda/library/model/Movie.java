package pl.sda.library.model;

public class Movie extends Multimedia implements DigitalMultimadia {

    protected Creator director;
    private int duration;


    public Creator getDirector() {
        return director;
    }

    public void setDirector(Creator director) {
        this.director = director;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director=" + director +
                ", duration=" + duration +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
