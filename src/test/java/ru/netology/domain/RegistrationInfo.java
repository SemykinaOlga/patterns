package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class RegistrationInfo {
    private String city;
    private String dateFirstMeeting;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String dateSecondMeeting;
}
