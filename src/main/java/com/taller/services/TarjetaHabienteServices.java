package com.taller.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.taller.dto.TarjetaHabiente;

import reactor.core.publisher.Flux;

@Service
public class TarjetaHabienteServices {

	
	public Flux<TarjetaHabiente> getAll() {
		
		List<TarjetaHabiente> list = new ArrayList<TarjetaHabiente>();
		
		list.add(new TarjetaHabiente(1, "OCHOA VALLADARES KATHERYNE PAOLA"));
		list.add(new TarjetaHabiente(2, "BENITEZ MONCADA MERCY JASMINE"));
		list.add(new TarjetaHabiente(3, "MARTINEZ FLORES WILIANS ALDAIR"));
		list.add(new TarjetaHabiente(4, "SALGADO TURCIOS JENNY YAXELI"));
		list.add(new TarjetaHabiente(5, "BLANDIN MARTINEZ ASHLI ELIANI"));
		list.add(new TarjetaHabiente(6, "HERNANDEZ VALLADARES ZULEMA YAMILETH"));
		list.add(new TarjetaHabiente(7, "ACOSTA VALLADARES KARLA XIOMARA"));
		list.add(new TarjetaHabiente(8, "TORRES  MOLINA MARVIN ENRIQUE "));
		list.add(new TarjetaHabiente(9, "OVIEDO  WILMER ALEXANDER"));
		list.add(new TarjetaHabiente(10, "REYES  CORTES KEVIN GABRIEL"));
		list.add(new TarjetaHabiente(11, "AGUILERA  ARAUZ CINTHIA MARBELI"));
		list.add(new TarjetaHabiente(12, "GOMEZ  HERNANDEZ RITZA GEORGINA"));
		list.add(new TarjetaHabiente(13, "MARTINEZ AVILA ERICKA YAMILETH"));
		list.add(new TarjetaHabiente(14, "MALDONADO FERRARI LUIS DANIEL"));
		list.add(new TarjetaHabiente(15, "PAVON PADILLA ROBERTO STARLEY"));
		list.add(new TarjetaHabiente(16, "BAQUEDANO VASQUEZ SANDRA MARIBEL"));
		list.add(new TarjetaHabiente(17, "CASTRO CHAVEZ WENDOLYN DEL CARMEN"));
		list.add(new TarjetaHabiente(18, "CORTES SOSA NELSON LEONIDE"));
		list.add(new TarjetaHabiente(19, "RAMOS FUNEZ MARIA DEL CARMEN"));
		list.add(new TarjetaHabiente(20, "VALLADARES AYESTAS JUAN ANGEL"));
		
		return Flux.fromIterable(list);
		
	}

}
