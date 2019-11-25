package customer_management.repositories;

import customer_management.models.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}
