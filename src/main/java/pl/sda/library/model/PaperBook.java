package pl.sda.library.model;

import java.util.Objects;

public class PaperBook extends Book {

    PaperBook(){

    }

    private CoverKind coverKind;

    public CoverKind getCoverKind() {
        return coverKind;
    }

    public void setCoverKind(CoverKind coverKind) {
        this.coverKind = coverKind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        PaperBook paperBook = (PaperBook) o;
        return coverKind == paperBook.coverKind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coverKind);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", coverKind='" + coverKind.getName() + '\'' +
                '}';
    }
}
