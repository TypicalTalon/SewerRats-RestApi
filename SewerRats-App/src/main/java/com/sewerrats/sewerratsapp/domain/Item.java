package com.sewerrats.sewerratsapp.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "item")
public class Item extends AbstractPersistable<Long> {
    @Column(name = "item_name")
    @NotBlank
    private String itemName;
    @Column(name = "item_description")
    @NotBlank
    private String itemDescription;
    @Column(name = "item_heal")
    @NotNull
    private double itemHeal;
    @Column(name = "item_paralyze")
    @NotNull
    private double itemParalyze;
    @Column(name = "item_poison")
    @NotNull
    private double itemPoison;
    @Column(name = "item_sleep")
    @NotNull
    private double itemSleep;
    @Column(name = "item_picture")
    @NotBlank
    private String itemPicture;
    @Column(name = "item_count")
    @NotNull
    private int itemCount;
}
