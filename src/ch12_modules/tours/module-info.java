module zoo.tour.agency {
	
	requires zoo.tours.api;
	provides zoo.tours.api.Tour with zoo.tours.agency.TourImpl;
	
}