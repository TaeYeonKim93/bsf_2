package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "statistics",
    path = "statistics"
)
public interface StatisticRepository
    extends PagingAndSortingRepository<Statistic, Long> {}
