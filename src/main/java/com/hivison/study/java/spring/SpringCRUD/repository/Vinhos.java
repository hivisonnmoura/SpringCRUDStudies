package com.hivison.study.java.spring.SpringCRUD.repository;

import com.hivison.study.java.spring.SpringCRUD.model.Vinho;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hivisonmoura on 2017-07-20.
 */
public interface Vinhos extends JpaRepository<Vinho, Long> {
}
