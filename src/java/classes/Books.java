/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Laércio Rodrigues
 */
public class Books {
    
    private int id;
    private String title;
    private String author;
    private String description;
    private String pages;
    private String ISBN;
    
    public Books(String title, String author, String description, String pages, String ISBN) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.pages = pages;
        this.ISBN = ISBN;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getPages() {
        return pages;
    }
    
    public void setPages(String pages) {
        this.pages = pages;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

}
