package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
public class Restaurant {

	private final Chef chef;

}
