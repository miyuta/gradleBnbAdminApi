package com.example.gradlebnbadminapi.model.entity;

import com.example.gradlebnbadminapi.model.enumClass.HasOrNot;
import com.example.gradlebnbadminapi.model.network.response.AmenitiesApiResponse;
import constant.ConstCommon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
@Accessors(chain = true)
@EntityListeners(AuditingEntityListener.class)
public class Amenities {
//    `id` BIGINT NOT NULL AUTO_INCREMENT,
//    `wifi` TINYINT NOT NULL DEFAULT 0,
//    `TV` TINYINT NOT NULL DEFAULT 0,
//    `heater` TINYINT NOT NULL DEFAULT 0,
//    `air_conditioner` TINYINT NOT NULL DEFAULT 0,
//    `iron` TINYINT NOT NULL DEFAULT 0,
//    `shampoo` TINYINT NOT NULL DEFAULT 0,
//    `hair_dryer` TINYINT NOT NULL DEFAULT 0,
//    `breakfast` TINYINT NOT NULL DEFAULT 0,
//    `business_space` TINYINT NOT NULL DEFAULT 0,
//    `fire_place` TINYINT NOT NULL DEFAULT 0,
//    `closet` TINYINT NOT NULL DEFAULT 0,
//    `guest_entrance` TINYINT NOT NULL DEFAULT 0,
//    `created_at` DATETIME NOT NULL,
//    `update_at` DATETIME NULL,
//    `room_id` BIGINT NOT NULL,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private HasOrNot wifi;

    private HasOrNot tv;

    private HasOrNot heater;

    private HasOrNot airConditioner;

    private HasOrNot iron;

    private HasOrNot shampoo;

    private HasOrNot hairDryer;

    private HasOrNot breakfast;

    private HasOrNot businessSpace;

    private HasOrNot fireplace;

    private HasOrNot closet;

    private HasOrNot guestEntrance;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @OneToOne
    private Accommodation accommodation;

    public static AmenitiesApiResponse makeResponse(Amenities amenities) {
        return AmenitiesApiResponse.builder()
                .wifi(ConstCommon.HAS.equals(amenities.getWifi().getTitle()))
                .tv(ConstCommon.HAS.equals(amenities.getTv().getTitle()))
                .heater(ConstCommon.HAS.equals(amenities.getHeater().getTitle()))
                .airConditioner(ConstCommon.HAS.equals(amenities.getAirConditioner().getTitle()))
                .iron(ConstCommon.HAS.equals(amenities.getIron().getTitle()))
                .shampoo(ConstCommon.HAS.equals(amenities.getShampoo().getTitle()))
                .hairDryer(ConstCommon.HAS.equals(amenities.getHairDryer().getTitle()))
                .breakfast(ConstCommon.HAS.equals(amenities.getBreakfast().getTitle()))
                .businessSpace(ConstCommon.HAS.equals(amenities.getBusinessSpace().getTitle()))
                .fireplace(ConstCommon.HAS.equals(amenities.getFireplace().getTitle()))
                .closet(ConstCommon.HAS.equals(amenities.getCloset().getTitle()))
                .guestEntrance(ConstCommon.HAS.equals(amenities.getGuestEntrance().getTitle()))
                .build();
    }
}
