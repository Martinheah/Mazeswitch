private class Shelf {
    private String colour;
    private String Book;
    private int levels;
    private int booksPerLevel;

    @Override
    public String toString() {
        return "Shelf{" +
                "colour='" + colour + '\'' +
                ", Book='" + Book + '\'' +
                ", levels=" + levels +
                ", booksPerLevel=" + booksPerLevel +
                '}';
    }
}
