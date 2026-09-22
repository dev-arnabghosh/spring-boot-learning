package com.app.arnab;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Process {

	@NonNull
	private String code;
	
	@NonNull
	private Integer port;
	
	private boolean exist;	
	
}
