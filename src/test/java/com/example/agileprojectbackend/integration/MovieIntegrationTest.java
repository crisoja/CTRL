package com.example.agileprojectbackend.integration;

import com.example.agileprojectbackend.model.Movie;
import com.example.agileprojectbackend.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MovieIntegrationTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private MovieRepository movieRepository;

    @Test
    void should_return_correct_employee_when_call_find_employee_by_id_api() throws Exception {
        //given

        final Movie movie = new Movie(2,"Enteng Kabisote","Enteng bought mushroom","Directed by: Piolo", "Rated: PG",
               null,"Genre: Romance", null, "Cast: Edgar", "sampleurl");
        final Movie getMovie =  movieRepository.save(movie);
        //when and then
        mockMvc.perform(MockMvcRequestBuilders.get("/movies/{id}", movie.getId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Enteng Kabisote"))
                .andExpect(jsonPath("$.synopsis").value("Enteng bought mushroom"))
                .andExpect(jsonPath("$.directedBy").value("Directed by: Piolo"))
                .andExpect(jsonPath("$.rated").value("Rated: PG"));

    }
}
