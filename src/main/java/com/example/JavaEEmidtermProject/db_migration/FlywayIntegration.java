package com.example.JavaEEmidtermProject.db_migration;

import org.flywaydb.core.Flyway;

public class FlywayIntegration {
    public void init() {
        migrationDatabase();
    }

    private void migrationDatabase() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(
                "jdbc:mysql://localhost:3306/online_library?useUnicode=true&serverTimezone=UTC",
                "root",
                "");
        flyway.migrate();
    }
}
