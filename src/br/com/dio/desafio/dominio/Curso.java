package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private Integer cargaHoraria;

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("titulo='").append(getTituto()).append('\'');
        sb.append(", descricao='").append(getDescricao()).append('\'');
        sb.append(", cargaHoraria=").append(cargaHoraria);
        sb.append('}');
        return sb.toString();
    }


}
