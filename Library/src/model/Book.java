package model;

public class Book {
    private long id;
    private String title;
    public String ISBN;
    private long authorId;

    public Book(long id, String title, String ISBN, long authorId) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.authorId = authorId;
    }

    public Book() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (authorId != book.authorId) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return ISBN != null ? ISBN.equals(book.ISBN) : book.ISBN == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (ISBN != null ? ISBN.hashCode() : 0);
        result = 31 * result + (int) (authorId ^ (authorId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}
