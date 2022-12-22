package org.sid.billingservice.repository;

import feign.Param;
import org.sid.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;
import java.util.List;

@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {

    //@RestResource(path = "/byProductId")
//    List<ProductItem> findByBillId(@Param("productID") Long billID);
      public Collection<ProductItem> findByBillId(Long id);
}
