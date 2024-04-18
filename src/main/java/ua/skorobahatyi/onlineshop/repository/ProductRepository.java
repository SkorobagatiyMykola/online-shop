package ua.skorobahatyi.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.skorobahatyi.onlineshop.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
