package demo.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "assortment")
public class Assortment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "bathroom_id")
    private Bathroom bathroom;

    @ManyToOne
    @JoinColumn(name = "bedroom_id")
    private Bedroom bedroom;

    @ManyToOne
    @JoinColumn(name = "kitchen_id")
    private Kitchen kitchen;

    @ManyToOne
    @JoinColumn(name = "living_room_id")
    private LivingRoom livingRoom;

}