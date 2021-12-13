package schoolSystemChief.models;

import schoolSystemChief.enums.Status;

import java.time.LocalDate;

public abstract class SchoolUser {
    private String id;
    private String firstName;
    private String surname;
    private String password;
    private LocalDate dateOfBirth;
    Status Status;

}
