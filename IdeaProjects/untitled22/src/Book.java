private class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private String backText;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", backText='" + backText + '\'' +
                '}';
    }
}

