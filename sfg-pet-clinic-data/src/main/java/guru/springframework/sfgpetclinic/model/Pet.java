package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private Owner owner;
    private PetType petType;
    private LocalDate birthDate;
}
