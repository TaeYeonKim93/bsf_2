package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "trainData", path = "trainData")
public interface TrainDataRepository
    extends PagingAndSortingRepository<TrainData, Long> {}
