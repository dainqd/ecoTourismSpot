package com.example.ecotourismspot.entity;

import com.example.ecotourismspot.dtos.TourDto;
import lombok.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


import javax.persistence.*;

@Entity
@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tours")
public class Tours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String thumbnail;
    private String name;
    private Integer star;
    @Lob
    private String description;
    private String address;
    private Float price;

    public Tours(TourDto tourDto) {
        BeanUtils.copyProperties(tourDto, this);
    }
}
