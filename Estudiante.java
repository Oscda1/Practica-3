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
        System.out.println("\nNombre: "+nombre+"\nNumero de Control: "+NC+"\nMateria: "+materia+"\nCalificacion: "+calificacion+"\nEstado de calificacion: "+estado+"\nSemestre
                           en Curso: "+semestre+"\nNumero de Asistencias en el Semestre: "+asistencias);
    }
    public void AsignarEstado(){
        String aprobado;
        if (this.calificacion<60)
            aprobado = "Reprobado";
        else
            aprobado = "Aprobado";
        this.estado=aprobado;
    }
}
class Practica3{
    public static void main(String[] args){
        Estudiante Alumnos[]= new Estudiante[10];
        Alumnos[0]=new Estudiante("Lorena Mejia",0,"Matematicas",70,"Aprobado",5,28);
        Alumnos[1]=new Estudiante("Henar Escobar",1,"Educacion Fisica",40,"Reprobado",1,2);
        Alumnos[2]=new Estudiante("Dionisio Toledano",2,"Geografia",90,"Aprobado",3,23);
        Alumnos[3]=new Estudiante("Yesica Bermejo",3,"Historia",70,"Aprobado",6,21);
        Alumnos[4]=new Estudiante("Najat Moyano",4,"Ingles",100,"Aprobado",2,35);
        for (int y=5;y<=9;y++){
            Alumnos[y] = new Estudiante("X",0,"X",0,"X",0,0);
        }
        boolean salir=false;
        int opcion=0;
        String nombreAlumno=null;
        int numeroControl=0;
        String materiaAlumno=null;
        int calificacionAlumno=0;
        String estadoAlumno=null;
        int semestreAlumno=0;
        int asistenciasAlumno=0;
        do{
            System.out.println("Escoja una opcion:\n1)Asignar los datos de un alumno\n2)Asignar el estado de un alumno\n3)Imprimir los datos de los alumnos\n4)Salir\n");
            opcion=Integer.parseInt(System.console().readLine());
            switch(opcion){
                case 1:
                    System.out.println("Nombre del Alumno: ");
                    nombreAlumno=System.console().readLine();
                    System.out.println("Numero de Control: ");
                    numeroControl=Integer.parseInt(System.console().readLine());
                    System.out.println("Materia del Alumno: ");
                    materiaAlumno=System.console().readLine();
                    System.out.println("Calificacion del Alumno: ");
                    calificacionAlumno=Integer.parseInt(System.console().readLine());
                    System.out.println("Semestre en Curso del Alumno: ");
                    semestreAlumno=Integer.parseInt(System.console().readLine());
                    System.out.println("Numero de Asistencias del Alumno: ");
                    asistenciasAlumno=Integer.parseInt(System.console().readLine());
                    Alumnos[numeroControl]=AsignarNombre(nombreAlumno,numeroControl,materiaAlumno,calificacionAlumno,semestreAlumno,asistenciasAlumno);
                    break;
                case 2:
                    System.out.println("Ingrese el numero de control: ");
                    numeroControl=Integer.parseInt(System.console().readLine());
                    Alumnos[numeroControl].AsignarEstado();;
                    break;
                case 3:
                    for(int x=0;x<=9;x++){
                        Alumnos[x].Imprimir();
                    }
                    break;
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion no valida, favor de intentar de nuevo");
                    break;
            }
        }while(salir==false);
    }
    public static Estudiante AsignarNombre(String nombreAlumno, int numeroControl, String materiaAlumno, int calificacionAlumno, int semestreAlumno, int asistenciasAlumno){
        Estudiante Caso[] = new Estudiante[1];
        Caso[0]= new Estudiante(nombreAlumno, numeroControl, materiaAlumno, calificacionAlumno,"Reprobado", semestreAlumno, asistenciasAlumno);
        return(Caso[0]);
    }
}
