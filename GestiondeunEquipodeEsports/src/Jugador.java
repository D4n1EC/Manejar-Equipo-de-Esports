public abstract class Jugador {
    protected String nombre;
    protected String rol;
    protected int nivelHabilidad;  // Nivel de habilidad en su rol

    public Jugador(String nombre, String rol, int nivelHabilidad) {
        this.nombre = nombre;
        this.rol = rol;
        this.nivelHabilidad = nivelHabilidad;
    }

    // Método abstracto para entrenar y mejorar nivel de habilidad
    public abstract void entrenar();

    public void mostrarEstadisticas() {
        System.out.println("Rol: " + rol);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel de Habilidad: " + nivelHabilidad);
        System.out.println();
    }
}

class Top extends Jugador {
    private static final int NIVEL_BASE = 50;

    public Top(String nombre) {
        super(nombre, "Top (Carril Superior)", NIVEL_BASE);
    }

    @Override
    public void entrenar() {
        nivelHabilidad += 5;
        System.out.println(nombre + " ha entrenado y mejorado su nivel (Top).");
    }
}

class Jungla extends Jugador {
    private static final int NIVEL_BASE = 50;

    public Jungla(String nombre) {
        super(nombre, "Jungla", NIVEL_BASE);
    }

    @Override
    public void entrenar() {
        nivelHabilidad += 5;
        System.out.println(nombre + " ha entrenado y mejorado su nivel (Jungla).");
    }
}

class Mid extends Jugador {
    private static final int NIVEL_BASE = 50;

    public Mid(String nombre) {
        super(nombre, "Mid (Carril Central)", NIVEL_BASE);
    }

    @Override
    public void entrenar() {
        nivelHabilidad += 6;
        System.out.println(nombre + " ha entrenado y mejorado su nivel (Mid).");
    }
}

class ADC extends Jugador {
    private static final int NIVEL_BASE = 50;

    public ADC(String nombre) {
        super(nombre, "ADC (Attack Damage Carry)", NIVEL_BASE);
    }

    @Override
    public void entrenar() {
        nivelHabilidad += 7;
        System.out.println(nombre + " ha entrenado y mejorado su nivel (ADC).");
    }
}

class Support extends Jugador {
    private static final int NIVEL_BASE = 50;

    public Support(String nombre) {
        super(nombre, "Support (Soporte)", NIVEL_BASE);
    }

    @Override
    public void entrenar() {
        nivelHabilidad += 4;
        System.out.println(nombre + " ha entrenado y mejorado su nivel (Support).");
    }
}
