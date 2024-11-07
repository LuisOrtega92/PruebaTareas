-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS task_management;
USE task_management;

-- Crear la tabla tasks
CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,           -- Identificador único de la tarea
    nombre VARCHAR(100) NOT NULL,                -- Nombre de la tarea
    descripcion TEXT,                            -- Descripción detallada de la tarea
    fecha_inicio DATE NOT NULL,                  -- Fecha de inicio de la tarea
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  -- Fecha y hora en que la tarea fue creada
    fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  -- Fecha de última actualización
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Índices adicionales para optimizar consultas
CREATE INDEX idx_nombre ON tasks(nombre);task_managementtasks