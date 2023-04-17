package com.faith.service;

import com.faith.dao.IBookDao;
import com.faith.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public class BookService implements IBookDao {
    private IBookDao bookMapper;

    public void setBookMapper(IBookDao bookMapper) {
        this.bookMapper = bookMapper;
    }
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }
    public int updateBook(Book books) {
        return bookMapper.updateBook(books);
    }
    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
