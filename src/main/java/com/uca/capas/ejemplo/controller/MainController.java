package com.uca.capas.ejemplo.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/alumno")
	public @ResponseBody String alumno() {
		String nombre,apellido,carnet,carrera,anio;
		nombre = "Javier Ernesto";
		apellido = "Mejia Arevalo";
		carnet="00076017";
		carrera="Ing. Informatica";
		anio="cuarto";
		return "nombre: "+nombre+" apellido: "+apellido+" carnet: "+carnet+" carrera: "+
				carrera+" año: "+anio;
	}
	@RequestMapping("/fecha")
	public @ResponseBody String fecha(HttpServletRequest dia,HttpServletRequest mes,HttpServletRequest anio){
		Integer fecha_dia = Integer.parseInt(dia.getParameter("dia"));
		Integer fecha_mes = Integer.parseInt(mes.getParameter("mes"));
		Integer fecha_anio = Integer.parseInt(anio.getParameter("anio"));
		LocalDate date = LocalDate.of(fecha_anio, fecha_mes, fecha_dia);
		return "Dia de la semana: " +date.getDayOfWeek()+" para la fecha: "+date;
	}
}
