package br.edu.ifpb.esperanca.pdp.adesp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "class_schedule")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClassSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_discipline", nullable = false)
    private Discipline discipline;

    @ManyToOne
    @JoinColumn(name = "id_teacher", nullable = false)
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "id_location", nullable = false)
    private ClassLocation location;

    @Enumerated(EnumType.STRING)
    private Schedule schedule;

    @Enumerated(EnumType.STRING)
    private WeekDay day;
}
