package com.muhammedtopgul.chapter004.item33.example02;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 22:24
 */

public class DatabaseClient {

    public static void main(String[] args) {
        Column<Integer> integerColumn = new Column<>(Integer.class);
        Column<String> stringColumn = new Column<>(String.class);

        DatabaseRow databaseRow = new DatabaseRow();
        databaseRow.putColumn(stringColumn, "Java");
        databaseRow.putColumn(integerColumn, 11);

        System.out.println(databaseRow.getColumn(stringColumn));
        System.out.println(databaseRow.getColumn(integerColumn));
    }
}
