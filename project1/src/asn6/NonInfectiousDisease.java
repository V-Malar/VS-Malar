package asn6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class NonInfectiousDisease extends Disease  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 714397575429177708L;

	@Override
	public ArrayList<String> getExamples() {
		return new ArrayList<>(Arrays.asList("Cancer", "BP", "Back Pain", "Head Pain"));
	}

}
