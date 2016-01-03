package com.mcvn.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mcvn.project.model.DataItem;

public interface DataItemRepository extends JpaRepository<DataItem, Integer> {
	@Query("SELECT NAME FROM DataItem as item WHERE DATAGROUPID = 1 AND LEVEL = 1 AND NODE_1 = :node1")
	public String getTinh(@Param("node1") String node1);

	@Query("SELECT NAME FROM DataItem as item WHERE DATAGROUPID = 1  AND LEVEL = 2 AND NODE_1 = :node1 AND node_2 = :node2")
	public String getHuyen(@Param("node1") String node1, @Param("node2") String node2);

}
