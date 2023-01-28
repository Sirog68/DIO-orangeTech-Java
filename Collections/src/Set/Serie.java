package Set;

import java.util.Comparator;

class Serie implements Comparable<Serie>{
    
    private String nome;
    private String genero;
    private Integer duracaoEpisodio;

    public Serie(String nome, String genero, Integer duracaoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.duracaoEpisodio = duracaoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie [nome=" + nome + ", genero=" + genero + ", duracaoEpisodio=" + duracaoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((duracaoEpisodio == null) ? 0 : duracaoEpisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (duracaoEpisodio == null) {
            if (other.duracaoEpisodio != null)
                return false;
        } else if (!duracaoEpisodio.equals(other.duracaoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int duracaoEpisodio = Integer.compare(this.getDuracaoEpisodio(), serie.getDuracaoEpisodio());
        if (duracaoEpisodio != 0) {
            return duracaoEpisodio;
        }
        return this.getGenero().compareTo(serie.getGenero());
    }

}

class ComparatorNomeGeneroDuracao implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getDuracaoEpisodio(), s2.getDuracaoEpisodio());
    }

}
