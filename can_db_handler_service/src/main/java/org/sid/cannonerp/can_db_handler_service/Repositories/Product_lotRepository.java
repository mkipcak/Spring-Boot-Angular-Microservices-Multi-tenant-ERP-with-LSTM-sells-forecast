package org.sid.cannonerp.can_db_handler_service.Repositories;




import org.sid.cannonerp.can_db_handler_service.Entities.Product_lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Product_lotRepository extends JpaRepository<Product_lot,Long> {
}