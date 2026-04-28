import java.time.LocalTime;

public class Horario {
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private int limiteAlunos;

    public Horario(String diaSemana, LocalTime horaInicio, LocalTime horaFim, int limiteAlunos) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.limiteAlunos = limiteAlunos;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public int getLimiteAlunos() {
        return limiteAlunos;
    }

    public void setLimiteAlunos(int limiteAlunos) {
        this.limiteAlunos = limiteAlunos;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "diaSemana='" + diaSemana + '\'' +
                ", horaInicio=" + horaInicio +
                ", horaFim=" + horaFim +
                ", limiteAlunos=" + limiteAlunos +
                '}';
    }
}
