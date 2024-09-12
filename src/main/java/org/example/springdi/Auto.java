package org.example.springdi;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Scope;

@Data
@AllArgsConstructor
public class Auto { // cам автомобиль
private String model;
private Engine engine; // внедрение двс в машину

}
