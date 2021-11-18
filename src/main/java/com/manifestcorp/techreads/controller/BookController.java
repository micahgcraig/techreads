package com.manifestcorp.techreads.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.servlet.view.RedirectView;

import com.manifestcorp.techreads.model.Book;
import com.manifestcorp.techreads.repository.BookRepository;


@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping({"","/"})
    public ModelAndView books(){
        ModelAndView mav = new ModelAndView("books");
        List<Book> books = bookRepository.findAll();
        mav.addObject("books", books);

        return mav;
    }

    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("bookForm", new Book());
        return "add";
    }
    @RequestMapping("/details/{id}")
    public ModelAndView details(@PathVariable("id") Long id) {
        ModelAndView mav = new ModelAndView("details");
        mav.addObject("book", bookRepository.getById(id));
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public RedirectView delete(@PathVariable("id") Long id){
        bookRepository.delete(bookRepository.getById(id));
        return new RedirectView("/books");
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("bookForm", bookRepository.getById(id));
        return "add";
    }

    @RequestMapping(value = {"","/"}, method=POST)
    public RedirectView addBook(Book book){
        bookRepository.saveAndFlush(book);
        return new RedirectView("books");
    }

}
