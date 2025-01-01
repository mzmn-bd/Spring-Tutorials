package com.tasktracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tasktracker.entity.TaskLogs;

@Repository
public interface TaskLogsRepository extends JpaRepository<TaskLogs, Long> {
}

