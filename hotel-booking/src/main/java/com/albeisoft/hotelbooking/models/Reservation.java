package com.albeisoft.hotelbooking.models;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @NotNull(message = "Client is required.")
    @Positive
    //@Min(value = 1, message = "Client '${validatedValue}' must be grater or equal with {value}.")
    @Range(min = 1, max = Integer.MAX_VALUE, message = "Client '${validatedValue}' must be grater or equal with {min}.")
    private Long client_id;

    @NotNull(message = "Room is required.")
    @Positive
    //@Min(value = 1, message = "Room '${validatedValue}' must be grater or equal with {value}.")
    @Range(min = 1, max = Integer.MAX_VALUE, message = "Room '${validatedValue}' must be grater or equal with {min}.")
    private Long room_id;

    @NotNull(message = "Reservation Date is required.")
    //@Future
    @FutureOrPresent
    //@Temporal(TemporalType.TIMESTAMP)
    //@DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date date;

    @NotNull(message = "No Days is required.")
    @Range(min = 1, max = Integer.MAX_VALUE, message = "No Days '${validatedValue}' must be grater or equal with {min}.")
    private Integer no_days;

    @NotNull(message = "No Persons is required.")
    @Range(min = 1, max = Integer.MAX_VALUE, message = "No Persons '${validatedValue}' must be grater or equal with {min}.")
    private Integer no_persons;

    private Timestamp created_at;

    private Timestamp updated_at;
}
