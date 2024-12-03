package pe.edu.cibertec.DAWI_Pecho_Franco_Fernando_Josue.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class inventory {

    @Id
    private Integer inventory_id;
    private Integer film_id;
    private Integer store_id;
    private Date last_update;
}
