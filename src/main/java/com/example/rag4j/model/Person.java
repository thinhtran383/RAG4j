package com.example.rag4j.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Description("A person with a first name, last name, and birth date")
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}
