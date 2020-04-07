
class User {

    private String book_id, stu_id, book_name, publisher, date;
    private int price,edition;

    User(String a, String b, String c, int d, String e, int f, String g) {
        this.book_id = a;
        this.stu_id = b;
        this.book_name = c;
        this.edition = d;
        this.publisher = e;
        this.price = f;
        this.date = g;

    }

    public String get_book_id() {
        return book_id;
    }

    public String get_stu_id() {
        return stu_id;
    }
    public String get_book_name() {
        return book_name;
    }
    public int get_edition() {
        return edition;
    }
    public String get_publisher() {
        return publisher;
    }
    public int get_price() {
        return price;
    }
    public String get_date() {
        return date;
    }
}
