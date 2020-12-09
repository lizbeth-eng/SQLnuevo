package com.example.appsqlite;

public class Constants {

    // Nombre de la base de datos
    public static final String DB_NAME = "BD_SMARTPHONES";

    // Versión de la base de datos
    public static final int DB_VERSION = 1;

    // Nombre de la tabla
    public static final String TABLE_NAME = "SMARTPHONES";

    // Definir los campos
    public static final String C_ID = "ID";
    public static final String C_PHOTO = "PHOTO";
    public static final String C_BRAND = "BRAND";
    public static final String C_MODEL = "MODEL";
    public static final String C_SERIALNUMBER = "SERIALNUMBER";
    public static final String C_IMEI = "IMEI";
    public static final String C_COMPANY = "COMPANY";
    public static final String C_PROPERTIES = "PROPERTIES";
    public static final String C_PRICE = "PRICE";

    // Crear consultas de SQLite
    // Insertar datos en TABLE_NAME
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + C_ID              + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + C_PHOTO           + " TEXT,"
            + C_BRAND           + " TEXT,"
            + C_MODEL           + " TEXT,"
            + C_SERIALNUMBER    + " TEXT,"
            + C_IMEI            + " TEXT,"
            + C_COMPANY         + " TEXT,"
            + C_PROPERTIES      + " TEXT,"
            + C_PRICE           + " TEXT"
            + ")";
}
