package edu.mum.cs.cs425.labseven;

import edu.mum.cs.cs425.labseven.models.ClassRoom;
import edu.mum.cs.cs425.labseven.models.Student;
import edu.mum.cs.cs425.labseven.models.Transcript;
import edu.mum.cs.cs425.labseven.repository.IClassRoomRepository;
import edu.mum.cs.cs425.labseven.repository.IStudentRepository;
import edu.mum.cs.cs425.labseven.repository.ITranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The type Lab seven application.
 * @author nduwayofabrice
 */
@SpringBootApplication
public class LabSevenApplication implements CommandLineRunner {

    private static final Logger LOGGER = Logger.getLogger(LabSevenApplication.class.getName());

    private ITranscriptRepository transcriptRepository;
    private IClassRoomRepository classRoomRepository;
    private IStudentRepository studentRepository;

    /**
     * Instantiates a new Lab seven application.
     *
     * @param transcriptRepository the transcript repository
     * @param classRoomRepository  the class room repository
     * @param studentRepository    the student repository
     */
    @Autowired
    public LabSevenApplication(ITranscriptRepository transcriptRepository,
                               IClassRoomRepository classRoomRepository,
                               IStudentRepository studentRepository){
        this.transcriptRepository = transcriptRepository;
        this.classRoomRepository = classRoomRepository;
        this.studentRepository = studentRepository;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(LabSevenApplication.class, args);
    }

    @Override
    public void run(String... args){

        String data = "New data saved";

        Transcript transcript = new Transcript("BS in Computer Science");
        Transcript trans = saveTranscript(transcript);
        LOGGER.log(Level.INFO,trans.toString(), data);

        ClassRoom classRoom = new ClassRoom("McLaughlin building", "M105");

        Student student1 = new Student("000-61-0001", "Fabrice","Nduwayo", trans);
        Student student2 = new Student("000-61-0002", "Brian","Bwengye", trans);
        Student student3 = new Student("000-61-0003", "Robert","Rusarwa", trans);

        classRoom.getStudents().add(student1);
        classRoom.getStudents().add(student2);
        classRoom.getStudents().add(student3);
        ClassRoom room = saveClassRoom(classRoom);
        LOGGER.log(Level.INFO,room.toString(), data);


    }

    /**
     * Save transcript transcript.
     *
     * @param transcript the transcript
     *
     * @return the transcript
     */
    Transcript saveTranscript(Transcript transcript){
        return this.transcriptRepository.save(transcript);
    }

    /**
     * Save class room class room.
     *
     * @param classRoom the class room
     *
     * @return the class room
     */
    ClassRoom saveClassRoom(ClassRoom classRoom){
        return this.classRoomRepository.save(classRoom);
    }

    /**
     * Save student student.
     *
     * @param student the student
     *
     * @return the student
     */
    Student saveStudent(Student student){
        return this.studentRepository.save(student);
    }

}
