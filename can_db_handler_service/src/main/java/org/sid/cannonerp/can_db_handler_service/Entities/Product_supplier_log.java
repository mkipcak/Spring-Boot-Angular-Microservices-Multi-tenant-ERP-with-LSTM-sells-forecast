package org.sid.cannonerp.can_db_handler_service.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product_supplier_log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
}
