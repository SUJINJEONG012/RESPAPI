package com.restapi.study.dto;


import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//응답할 때 사용
public class ResponseDto<T> {
	int status;
	T data;
	
}
