import java.sql.DriverManager
import java.sql.SQLException
import java.io.File
import java.io.FileWriter

object SampleClass {
    @JvmStatic
    fun main(args: Array<String>) {
        val QUERY = "it's QUERY!!!"
        try {
            val url = "it's url "
            val user = "it's user_name"
            val password = "it's user_password"
            DriverManager.getConnection(url, user, password)
                .let { connection -> connection.prepareStatement(QUERY)
                    .let { preparedStatement ->
                        val rs = preparedStatement.executeQuery()

                        while (rs.next()) {
                            val value_name1 = rs.getString("column_name1")
                            val value_name2 = rs.getInt("column_name2")
                            }

                            val directory = "save_path"
                            val folder = File("${System.getProperty("user.dir")}/in_project_path")
                            if (!folder.exists()) {
                                folder.mkdirs()
                            }
                            var writer: BufferedWriter? = null
                            try {
                                writer = BufferedWriter((FileWriter(File(directory))))
                                writer.write("stringBulider to be wanted to save".toString())
                            } finally {
                                writer?.close()
                            }
                        }
                    }
            } catch (e: SQLException) {
                printSQLException(e)
            }
        }
    }

    private fun printSQLException(ex: SQLException) {
        for (e in ex) {
            if (e is SQLException) {
                e.printStackTrace(System.err)
                System.err.println("SQLState: " + e.sqlState)
                System.err.println("Error Code: " + e.errorCode)
                System.err.println("Message: " + e.message)
                var t = ex.cause
                while (t != null) {
                    println("Cause: $t")
                    t = t.cause
                }
            }
        }
    }
}
