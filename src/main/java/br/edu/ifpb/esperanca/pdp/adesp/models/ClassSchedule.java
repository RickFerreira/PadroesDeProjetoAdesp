package br.edu.ifpb.esperanca.pdp.adesp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "id_discipline", nullable = false)
    private Discipline discipline;

    @ManyToOne
    @JoinColumn(name = "id_teacher", nullable = false)
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "id_location", nullable = false)
    private ClassLocation location;

    @ManyToOne
    @JoinColumn(name = "id_schedule", nullable = false)
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "id_day", nullable = false)
    private WeekDay day;
}
