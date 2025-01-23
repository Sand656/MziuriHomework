import java.io.*;

class Student {
    int id;
    String name;
    int grade;

    public Student(int id, String name, int grade) {
        this.id=id;
        this.name=name;
        this.grade=grade;
    }


    public String convertToString() {
        return id + "," + name + "," + grade;
    }

    public static Student fromString(String data) {
        String[] parts= data.split(","); //გაყოფის ლოგიკის წერის ნაცვლად შემიძლია გამოვიღენო split ფუნქცია(სიმარტივისთვის)
        int id=Integer.parseInt(parts[0]);
        String name=parts[1];
        int grade =Integer.parseInt(parts[2]);
        return new Student(id, name, grade);
    }

    public static void serializeArray(Student[] students1, String filePath){
        try{
            FileOutputStream fileOutputStream =new FileOutputStream(filePath);
            for(int i=0; i<students1.length; i++) {
                Student student=students1[i];
                fileOutputStream.write((student.convertToString()).getBytes()); //aaaaaaaaaaaaaaaa
            }
            fileOutputStream.close();
        }catch(IOException a) {
            System.out.println("Error serializing students");
        }
    }

    public static Student[] deserializeArray(String filePath, int size){
        Student[] students = new Student[size];
        try {
            FileInputStream fileInputStream= new FileInputStream(filePath);
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(fileInputStream));
            String line=".";
            int index = 0;
            while (line!=null && index<size){
                line = bufferedReader.readLine();
                students[index] = fromString(line);
                index++;
            }
        } catch (IOException e) {
            System.err.println("Error deserializing students");
        }
        return students;
    }

}


public class HwSerialization {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "a", 85);
        students[1] = new Student(2, "b", 90);
        students[2] = new Student(3, "c", 78);
        students[3] = new Student(4, "d", 95);
        students[4] = new Student(5, "e", 88);
        String filePath = "file";
        Student.serializeArray(students, filePath);
        Student[] deserializedStudents = Student.deserializeArray(filePath, 5);

      //N2
        Student topStudent = deserializedStudents[0];
        for (int i = 1; i < deserializedStudents.length; i++) {
            if (deserializedStudents[i].grade > topStudent.grade) {
                topStudent = deserializedStudents[i];
            }
        }
        System.out.println("top student: " + topStudent.name + " with grade " + topStudent.grade);
    }
}
