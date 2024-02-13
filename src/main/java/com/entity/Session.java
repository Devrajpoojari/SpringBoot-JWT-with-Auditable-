package com.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sessionId;
	
	@NotEmpty
	private String title;
	
	private String place;
	
	private String link;
	
	@Enumerated(EnumType.STRING)
	private DeckType type;
	
	

}
