package GuideExam1;

import java.util.Collection;
import java.util.Set;

public class PatternMatchingWIthCollections {

	void print(Collection<Integer> reptiles) {
//		   if(reptiles instanceof  List snakes) {
//		   if(reptiles instanceof  List<Integer> snakes) {
		if (reptiles instanceof Set<Integer> snakes) {
			System.out.print(snakes.toString());
		}
	}

}
