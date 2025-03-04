package in.shiva.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shiva.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
