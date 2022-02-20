import java.io.File
import java.io.BufferedWriter
import java.io.FileWriter

val directory = "${System.getProperty("user.dir")}/\"directory\"/\file_name\".kt" // 프로젝트 내부에서 저장하려고 하는 주소
val folder = File("${System.getProperty("user.dir")}/\"directory\"")
var writer: BufferedWriter? = null

if (!folder.exists()) { // 저장하는 폴더가 존재하지 않는다면 폴더 생성
    folder.mkdirs()
}

try {
    writer = BufferedWriter((FileWriter(File(directory)))) // 파일 저장 위치에 폴더를 지정하고 파일을 쓰도록 한다.
    writer.write("\"StringBuilder_or StringBuffer\"".toString()) // 저장된 string을 쓴다.
} finally {
    writer?.close()
}
