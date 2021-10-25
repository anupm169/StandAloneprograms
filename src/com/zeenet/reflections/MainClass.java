package com.zeenet.reflections;

import java.util.List;
import java.util.Optional;

public class MainClass {

	public static void main(String[] args) {

		MetaModel<Person> metaModel = MetaModel.of(Person.class);

		Optional<PrimaryKeyField> primarykey = metaModel.getPrimarykey();
		List<ColumnField> columnFields = metaModel.getColumn();

		primarykey.ifPresent(pk -> System.out
				.println("Primarykey name : " + pk.getName() + " Primarykey type : " + pk.getType().getSimpleName()));

		columnFields.forEach(column -> System.out
				.println("Column Name : " + column.getName() + " column type : " + column.getType().getSimpleName()));

	}

}
