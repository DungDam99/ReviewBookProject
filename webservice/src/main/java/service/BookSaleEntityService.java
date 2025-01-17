package service;

import entity.BookSaleEntity;

public interface BookSaleEntityService {
    Iterable<BookSaleEntity> findAll();
    void save(BookSaleEntity bookEntity);
    void delete(BookSaleEntity bookEntity);
}
