package projekti;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author salon
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername (String username);
    List<Account> findAllByNameContainingIgnoreCase(String name);
}
