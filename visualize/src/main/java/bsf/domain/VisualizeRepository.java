package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "visualizes",
    path = "visualizes"
)
public interface VisualizeRepository
    extends PagingAndSortingRepository<Visualize, Long> {}
