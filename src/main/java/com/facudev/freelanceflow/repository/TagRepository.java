package com.facudev.freelanceflow.repository;

import com.facudev.freelanceflow.domain.model.Tag;
import com.facudev.freelanceflow.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, Long> {

    List<Tag> findByTagName(String tagName);

}
