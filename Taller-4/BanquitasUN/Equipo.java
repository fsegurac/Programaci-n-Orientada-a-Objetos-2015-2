
package banquitasun;


class Equipo {
    private String nombre;
    private int partidosJugados;
    private int partidosGanados;
    private int empates;
    private int partidosPerdidos;
    private int golesFavor;
    private int golesEnContra;
    public int puntos() {
        return partidosJugados * 3 + empates;
    }
    public int calcularpuntaje() {
        return puntos() * 10
        + golesFavor * 50
        - partidosPerdidos * 500
        + (partidosJugados % 2 == 0 ? 500 : 0);
    }
    @Override
    public String toString()  {
        return String.format("Nombre: %-20s, Bono: %-10d, Puntos: %-10d", nombre, calcularpuntaje(), puntos());
    }
    public static Equipo creaEquipo( String nombre, int jj, int jg, int je, int jp, int gf, int ge ) {
        Equipo equipo = new Equipo();
        equipo.nombre = nombre;
        equipo.partidosJugados = jj;
        equipo.partidosGanados = jg;
        equipo.empates = je;
        equipo.partidosPerdidos = jp;
        equipo.golesFavor = gf;
        equipo.golesEnContra = ge;
        return equipo;
    }
}
