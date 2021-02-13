package io.github.agpaluch.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SqlTaskRepository extends JpaRepository<Task, Integer>, TaskRepository {
}
