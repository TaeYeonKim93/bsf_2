package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "aiModels", path = "aiModels")
public interface AiModelRepository
    extends PagingAndSortingRepository<AiModel, Long> {}
