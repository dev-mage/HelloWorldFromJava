package file;

import java.io.File;
import java.util.Scanner;

public class FileGenerator {
    static File generateFile(String fileName) throws Exception {
        if(fileName == null || fileName.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다.");
        }
        File file = new File("./src/file/files/", fileName);
        file.createNewFile();
        return file;
    }

    public static void main(String[] args) {
        System.out.println("파일 이름을 입력하세요.");
        try (Scanner scanner = new Scanner(System.in)) {
            String fileName = scanner.nextLine();
            File file = generateFile(fileName);
            System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 실행해 주시기 바랍니다.");
        }
    }
}