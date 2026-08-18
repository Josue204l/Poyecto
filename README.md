# Sistema de Reservas

Sistema de escritorio Java Swing para gestión de reservas de recursos (salas, computadoras, proyectores, etc.) con arquitectura por capas + MVC, persistencia XML (JAXB), reportes PDF (OpenPDF) y estadísticas con gráficos de barras (JFreeChart).

---

## Requisitos previos

- Java 17+
- Maven 3.8+
- Git

---

## Clonar el repositorio

```bash
git clone <URL_DEL_REPOSITORIO>
cd sistema-reservas
```

---

## Compilar y ejecutar tests

```bash
# Compilar, ejecutar tests unitarios (*Test.java) y de integración (*IT.java)
mvn clean install

# Solo tests unitarios
mvn test

# Solo tests de integración
mvn verify -DskipTests
```

---

## Ejecutar la aplicación

```bash
mvn package -DskipTests
java -jar target/sistema-reservas-1.0-SNAPSHOT.jar
```

---

## Configurar la API de IA (Anthropic)

Editar `ConfiguracionApp.java` y reemplazar `<ANTHROPIC_API_KEY>` con la clave real:

```java
public static final String IA_API_KEY = "sk-ant-...";
```

---

## Estructura del proyecto

```
src/
├── main/
│   ├── java/com/una/reservas/
│   │   ├── modelo/          # Entidades JAXB
│   │   ├── excepcion/       # Excepciones de negocio
│   │   ├── dao/             # Persistencia XML genérica
│   │   ├── servicio/        # Lógica de negocio
│   │   ├── dto/             # Objetos de transferencia
│   │   ├── controlador/     # Capa MVC - controladores
│   │   ├── vista/           # Capa MVC - vistas Swing
│   │   └── util/            # Utilidades y configuración
│   └── resources/datos/     # Archivos XML de datos iniciales
└── test/
    └── java/com/una/reservas/servicio/
        ├── *Test.java        # Tests unitarios (Surefire)
        └── *IT.java          # Tests de integración (Failsafe)
```

---

## Distribución de trabajo entre ramas Git

| Rama              | Responsable | Módulos                                              |
|-------------------|-------------|------------------------------------------------------|
| `feature/dao-servicios` | Dev 1 | `dao/`, `servicio/`, `excepcion/`, `util/`     |
| `feature/vistas`        | Dev 2 | `vista/`, `controlador/`                       |
| `feature/reportes-ia`   | Dev 3 | `ReporteServicio`, `IAExtraccionServicio`, `ClienteIA`, tests |

```bash
git checkout -b feature/dao-servicios
git checkout -b feature/vistas
git checkout -b feature/reportes-ia
```
