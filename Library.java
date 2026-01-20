class Library {
    private Book[] books;
    private int count;

    public Library() {
        books = new Book[5];
        count = 0;
    }

  
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full.");
        }
    }

    
    public void replaceBook(int bookID, String newTitle, String newAuthor) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                System.out.println("Book updated successfully.");
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("BookID | Title | Author | Available");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
