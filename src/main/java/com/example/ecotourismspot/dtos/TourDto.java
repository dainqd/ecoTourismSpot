package com.example.ecotourismspot.dtos;

import com.example.ecotourismspot.entity.Tours;
import lombok.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.Lob;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TourDto {
    private long id;
    private String thumbnail;
    private String name;
    private Integer star;
    private String address;
    private String description;
    private Float price;

    public TourDto(Tours tours) {
        BeanUtils.copyProperties(tours, this);
    }
}
