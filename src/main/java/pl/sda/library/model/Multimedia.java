package pl.sda.library.model;

import java.util.Objects;
import java.util.stream.Stream;

public abstract class  Multimedia {

    protected String title;


    public Multimedia() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}

