package com.bengisu.springProje.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest
{
    private String firstName;
    private String lastName;
    private Date birthOfDate;
}
