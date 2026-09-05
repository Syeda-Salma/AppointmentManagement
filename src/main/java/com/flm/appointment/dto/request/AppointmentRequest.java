package com.flm.appointment.dto.request;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentRequest {

	private String patientId;
	private String doctorId;
	private LocalDate appointmentDate;
	private LocalTime startTime;
	private String notes;
	private String reasonForVisit;
}
