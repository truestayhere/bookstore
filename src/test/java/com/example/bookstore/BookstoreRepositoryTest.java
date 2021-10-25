package com.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Test;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookRepository;
import com.example.bookstore.model.CategoryRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BookstoreRepositoryTest {

	@Autowired
	private BookRepository brepository;
	
	@Autowired
	private CategoryRepository crepository;

	@Test
	public void findByTitleShouldReturnBook() {
		List<Book> books = brepository.findByTitle("Animal Farm");
		assertThat(books).hasSize(1);
		assertThat(books.get(0).getAuthor()).isEqualTo("George Orwell");
	}

	@Test
	public void createBook() {
		Book book = new Book("The Idiot", "Fyodor Dostoevsky", crepository.findByName("Realism").get(0), 1868,
				"3213213-13", 12);
		brepository.save(book);
		assertThat(book.getId()).isNotNull();
	}

	@Test
	public void deleteBook() {
		List<Book> books = brepository.findByTitle("Animal Farm");
		brepository.delete(books.get(0));
		assertThat(brepository.findByTitle("AnimalFarm")).isNullOrEmpty();
	}

}



