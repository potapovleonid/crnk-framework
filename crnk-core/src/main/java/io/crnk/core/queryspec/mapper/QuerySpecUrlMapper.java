package io.crnk.core.queryspec.mapper;

import java.util.Map;
import java.util.Set;

import io.crnk.core.engine.information.resource.ResourceInformation;
import io.crnk.core.queryspec.QuerySpec;

/**
 * converts a {@link QuerySpec} into URL parameters and back.
 */
public interface QuerySpecUrlMapper {

	void init(QuerySpecUrlContext ctx);

	Map<String, Set<String>> serialize(QuerySpec querySpec);

	QuerySpec deserialize(ResourceInformation resourceInformation, Map<String, Set<String>> queryParams);

}
