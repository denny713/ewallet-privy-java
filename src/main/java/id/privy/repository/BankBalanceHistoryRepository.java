package id.privy.repository;

import id.privy.entity.BankBalanceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankBalanceHistoryRepository extends JpaRepository<BankBalanceHistory, Integer> {

    public List<BankBalanceHistory> findByIdOrderByBankBalanceIdDesc(Integer id);
}
