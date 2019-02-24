package pl.sda.library.model;

public interface MultimediaState {

    MultimediaState borrowMultimedia(String firstName, String lastName);

    MultimediaState returMultimedia();
}
