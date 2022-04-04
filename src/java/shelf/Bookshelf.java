/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelf;

import classes.Books;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laércio Rodrigues
 */
public class Bookshelf {
    
    private static int lastCode = 1;
    private static List<Books> books = new ArrayList<>();
    
    public static void insert(Books b) {
        b.setId(lastCode++);
        books.add(b);
    }
    
    public static Books read(int id) {
        for(Books book: books) {
            if(book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    
    public static void change(Books b) {
        for(Books book: books) {
            if(book.getId() == b.getId()) {
                book.setTitle(b.getTitle());
                book.setAuthor(b.getAuthor());
                book.setDescription(b.getDescription());
                book.setPages(b.getPages());
                book.setISBN(b.getISBN());
            }
            return;
        }
    }
    
    public static void delete(Books b) {
        
        Books bAux = null;
        
        for(Books book: books) {
            if(book.getId() == b.getId()) {
                bAux = book;
                break;
            }
        }
        books.remove(bAux);
    }
    
    public static List<Books> readAll() {
        return books;
    }
}
