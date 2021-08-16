package com.littlebill.webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Weather {
    private String averageTemp;
    private String minTemp;
    private String maxTemp;
    private String windSpeed;
    private String city;
}
