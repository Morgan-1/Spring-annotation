package annotation.service;

import annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;


@Service
public class BookService
{
    @Override
    public String toString()
    {
        return "BookService{" +
                "bookDao1=" + bookDao2 +
                '}';
    }

  //  @Autowired
    @Inject
    private BookDao bookDao2;


    public void print()
    {
        System.out.println(bookDao2);
    }
}
