package pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.dto.FilmDetailDto;
import pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.dto.FilmDto;
import pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.entity.Film;
import pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.repository.FilmRepository;
import pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.service.MaintenanceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    @Autowired
    FilmRepository filmRepository;

    @Override
    public List<FilmDto> getAllFilms() {

        List<FilmDto> films = new ArrayList<>();
        Iterable<Film> iterable = filmRepository.findAll();
        iterable.forEach(film -> {
            FilmDto filmDto = new FilmDto(film.getFilmId(),
                    film.getTitle(),
                    film.getLanguage().getName(),
                    film.getRentalRate());
            films.add(filmDto);
        });

        return films;
    }

    @Override
    public FilmDetailDto getFilmById(int id) {

        Optional<Film> optional = filmRepository.findById(id);
        return optional.map(
                film -> new FilmDetailDto(film.getFilmId(),
                        film.getTitle(),
                        film.getDescription(),
                        film.getReleaseYear(),
                        film.getLanguage().getLanguageId(),
                        film.getLanguage().getName(),
                        film.getRentalDuration(),
                        film.getRentalRate(),
                        film.getLength(),
                        film.getReplacementCost(),
                        film.getRating(),
                        film.getSpecialFeatures(),
                        film.getLastUpdate())
        ).orElse(null);

    }

}