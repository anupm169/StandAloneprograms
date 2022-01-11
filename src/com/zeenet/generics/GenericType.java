package com.zeenet.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericType {
	

	public static void main(String[] args) {

		Person donDrapper = new Person("Don Drapper", 89);
		Person peggyOlson = new Person("Peggy Olson", 65);
		Person bertCopper = new Person("Bert Copper", 100);

		List<Person> madMen = new ArrayList<>();

		madMen.add(donDrapper);
		madMen.add(peggyOlson);
		madMen.add(bertCopper);

		System.out.println(madMen);

		Comparator<Person> newComparator = (Person p1, Person p2) -> -1 * Integer.compare(p1.getAge(), p2.getAge());

		Collections.sort(madMen, new AgeComparator());

		System.out.println(madMen);

		Collections.sort(madMen, new ReverseComparator<>(new AgeComparator()));
		
		System.out.println(madMen);

	}

}
