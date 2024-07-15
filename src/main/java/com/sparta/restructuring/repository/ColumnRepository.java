package com.sparta.restructuring.repository;

import com.sparta.restructuring.entity.Columns;
import com.sparta.restructuring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ColumnRepository extends JpaRepository<Columns, Long> {

    Long countByColumnId(Long boardId);

    Optional<Columns> findByColumnIdAndColumnName(Long boardId, String columnName);

    List<Columns> findAllByBoardBoardIdAndColumnOrderBetween(Long boardId, Long newOrder, Long columnOrder);



    List<Columns> findAllByColumnIdAndColumnOrderGreaterThan(Long id, Long columnOrder);

    Columns findByColumnName(String status);

    List<Columns> findByBoardBoardId(Long boardId);
}
