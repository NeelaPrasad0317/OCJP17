package zoo.visitor;

import java.util.*;

import zoo.tours.api.*;
import zoo.tours.reservations.*;
public class Tourist {
	public static void main(String[] args) {
		Tour tour=TourFinder.findSingleTour();
		System.out.println("Singler tour:"+tour);
		
		List<Tour> allTours=TourFinder.findAllTours();
		System.out.println("#Tours size:"+allTours.size());
	}
}
