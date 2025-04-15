package backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ocorrencias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Occurrence {

  @Id
  @GeneratedValue
  private UUID id;

  @NotNull
  private Double latitude;

  @NotNull
  private Double longitude;

  @NotNull
  @Enumerated(EnumType.STRING)
  private OccurrenceType type;

  @NotNull
  @Enumerated(EnumType.STRING)
  private OccurenceStatus status;

  @Column(columnDefinition = "TEXT")
  private String notes;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;

}
