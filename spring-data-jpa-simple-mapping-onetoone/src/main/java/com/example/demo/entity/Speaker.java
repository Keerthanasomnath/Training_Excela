package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Keer_speaker_mapping")

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Speaker {

	@Id
	@Column(name="speaker_id")
	int speakerId;
		
	@Column(name="speaker_name")
	String speakerName;

		
	@Column(name="qualification")
	String qualification;
		
		}

