package com.pardot.service.tools.CassandraObj;

import java.util.HashMap;

/**
 * Pardot, An ExactTarget Company.
 * User: robrighter
 * Date: 4/4/13
 */
public interface CIndexFilter {

	public boolean isIncluded(HashMap obj);
}
