package ru.itsjava.jdbc;

public interface EmployerDao {
    int findAgeByName(String name);

    int getAgeByUserName(String name);
}
