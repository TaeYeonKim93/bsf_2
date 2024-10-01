package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "summaries", path = "summaries")
public interface SummaryRepository
    extends PagingAndSortingRepository<Summary, Long> {}
