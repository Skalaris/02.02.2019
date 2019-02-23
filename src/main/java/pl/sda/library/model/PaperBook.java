package pl.sda.library.model;

import java.util.Objects;

public class PaperBook extends Book implements PaperMedium {

    PaperBook(){
    }
    private CoverKind coverKind;
    private int pageCount;

    public CoverKind getCoverKind() {
        return coverKind;
    }
    public void setCoverKind(CoverKind coverKind) {
        this.coverKind = coverKind;
    }

    @Override
    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void setPageCount(int pageCount) {
        this.pageCount=pageCount;
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
                "coverKind=" + coverKind +
                ", pageCount=" + pageCount +
                ", author=" + author +
                ", title='" + title + '\'' +
                '}';
    }
}
