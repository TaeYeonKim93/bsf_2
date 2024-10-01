package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "riskData", path = "riskData")
public interface RiskDataRepository
    extends PagingAndSortingRepository<RiskData, Long> {}
