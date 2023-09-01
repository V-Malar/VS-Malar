package asn6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class InfectiousDisease extends Disease  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -500067877761022286L;

	@Override
	public ArrayList<String> getExamples() {
		return new ArrayList<String>(Arrays.asList("Corona", "Flu", "Dengue", "Cold"));
	}

}
