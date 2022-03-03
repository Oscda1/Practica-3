import javax.swing.JOptionPane;
class Estudiante{
    String nombre;
    int NC;
    String materia;
    int calificacion; //Base 100
    String estado;
    int semestre;
    int asistencias;
    Estudiante(String nombre, int NC, String materia, int calificacion, String estado, int semestre, int asistencias){
        this.nombre=nombre;
        this.NC=NC;
        this.materia=materia;
        this.calificacion=calificacion;
        this.estado=estado;
        this.semestre=semestre;
        this.asistencias=asistencias;
    }
    public void Imprimir(){
        System.out.println("Nombre: "+nombre+"\nNumero de Control: "+NC+"\nMateria: "+materia+"\nCalificacion: "+calificacion+"\nEstado de calificacion: "+estado+"\nSemestre en 
        Curso: "+semestre+"\nNumero de Asistencias en el Semestre: "+asistencias);
    }

}
public class Practica3{
    public static void main(String[] args){
        Estudiante Alumnos[]= new Estudiante[10];
        boolean salir=false;
        int opcion=0;
        String nombreAlumno=null;
        int numeroControl=0;
        String materiaAlumno=null;
        int calificacionAlumno=0;
        int semestreAlumno=0;
        int asistenciasAlumno=0;
        do{
            opcion=JOptionPane.showInputDialog("Escoja una opcion:\n1)Asignar los datos de un alumno\n2)Asignar el estado de un alumno\n3)Imprimir los datos de los alumnos\n4)Salir");
            switch(opcion){
                case 1:
                    nombreAlumno=JOptionPane.showInputDialog("Nombre del Alumno: ");
                    numeroControl=JOptionPane.showInputDialog("Numero de Control: ");
                    materiaAlumno=JOptionPane.showInputDialog("Materia del Alumno: ");
                    calificacionAlumno=JOptionPane.showInputDialog("Calificacion del Alumno: ");
                    semestreAlumno=JOptionPane.showInputDialog("Semestre en Curso del Alumno: ");
                    asistenciasAlumno=JOptionPane.showInputDialog("Numero de Asistencias del Alumno: ");
                    Alumnos[numeroControl]=Estudiante.AsignarNombre(nombreAlumno,numeroControl,materiaAlumno,calificacionAlumno,semestreAlumno,asistenciasAlumno);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    salir=true;
                    break;
                default:
                    system.out.println("Opcion no valida, favor de intentar de nuevo");
                    break;
            }
        }while(salir==false);
    }
    public AsignarNombre(String nombreAlumno, int numeroControl, String materiaAlumno, int calificacionAlumno, int semestreAlumno, int asistenciasAlumno){
        Alumnos[numeroControl]= new Estudiante(nombreAlumno, numeroControl, materiaAlumno, calificacionAlumno,"Desconocido", semestreAlumno, asistenciasAlumno);
    }
    public boolean AsignarEstado(int Calificacion){
        boolean aprobado;
        if (Calificacion<60)
            aprobado = false;
        else
            aprobado = true;
        return aprobado;
    }
}