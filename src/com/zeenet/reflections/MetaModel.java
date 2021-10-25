package com.zeenet.reflections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MetaModel<T> {

	private Class<T> clss;

	public static <T> MetaModel<T> of(Class<T> clss) {
		return new MetaModel<>(clss);
	}

	public MetaModel(Class<T> clss) {
		this.clss = clss;
	}

	public Optional<PrimaryKeyField> getPrimarykey() {

		Field[] fields = clss.getDeclaredFields();
		for (Field field : fields) {
			PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
			if (primaryKey != null) {
				PrimaryKeyField primaryKeyField = new PrimaryKeyField(field);
				return Optional.of(primaryKeyField); // change this to optionals in futures
			}

		}

		return Optional.empty();// change this to optionals in futures
	}

	public List<ColumnField> getColumn() {

		Field[] declaredFields = clss.getDeclaredFields();
		List<ColumnField> columns = new ArrayList<>();
		for (Field field : declaredFields) {
			Column column = field.getAnnotation(Column.class);
			if (column != null) {
				ColumnField columnField = new ColumnField(field);
				columns.add(columnField); 
			}

		}

		return columns;
	}
}
