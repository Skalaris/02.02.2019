package pl.sda.library.model;

public class MovieBuilder {

    private String title;
    private String directorFirstName;
    private String directorLastName;
    private int duration;

    public MovieBuilder title(String title){
        this.title = title;
        return this;
    }

    public MovieBuilder directorFirstName(String director){
        this.directorFirstName =director;
        return this;
    }

    public MovieBuilder directorLastName(String  director){
        this.directorLastName =director;
        return this;
    }


    public MovieBuilder duration(int duration){
        this.duration = duration;
        return this;
    }
    public Movie build() {
        Movie movie = new Movie();
        movie.setTitle(title);
        Creator director = new Creator();
        director.setFirstName(directorFirstName);
        director.setLastName(directorLastName);
        movie.setDirector(director);
        movie.setDuration(duration);
        return movie;
    }

}
