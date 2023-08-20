package zoo.tours.reservations;

import java.util.*;
import java.util.stream.*;

import zoo.tours.api.*;

public class TourFinder {
	public static Tour findSingleTour() {
		ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
		return loader.findFirst().orElse(null);
	}

	public static List<Tour> findAllTours() {
		ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
		return loader.stream().map(provider -> provider.get()).collect(Collectors.toList());
	}
}
