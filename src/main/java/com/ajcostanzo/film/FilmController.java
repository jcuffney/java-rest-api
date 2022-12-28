package com.ajcostanzo.film;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping(path="/film")
public class FilmController {

    private static ArrayList<Film> FILMS = new ArrayList<Film>(Arrays.asList(new Film("Jaws", "1")));

    @RequestMapping(path="/health", method = { RequestMethod.GET, RequestMethod.POST }, produces = "text/plain")
    public String getHealth() {
        return "ok";
    }

    @GetMapping(path="", produces = "application/json")
    public ArrayList<Film> getFilms() {
        return FILMS;
    }

    @GetMapping(path="/{id}", produces = "application/json")
    public ResponseEntity getFilm(@PathVariable("id") String id) {
        for (Film film : FILMS) {
            if (film.getId().equals(id)) {
                HttpHeaders headers = new HttpHeaders();
                return new ResponseEntity(film, headers, HttpStatus.OK);
            }
        }

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
