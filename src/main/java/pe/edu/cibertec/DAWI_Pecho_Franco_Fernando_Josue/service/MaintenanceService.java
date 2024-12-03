package pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.service;

import pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.dto.FilmDetailDto;
import pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> getAllFilms();

    FilmDetailDto getFilmById(int id);

}