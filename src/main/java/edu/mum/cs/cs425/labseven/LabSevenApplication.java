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

@SpringBootApplication
public class LabSevenApplication implements CommandLineRunner {

    private static final Logger LOGGER = Logger.getLogger(LabSevenApplication.class.getName());

    private ITranscriptRepository transcriptRepository;
    private IClassRoomRepository classRoomRepository;
    private IStudentRepository studentRepository;

    @Autowired
    public LabSevenApplication(ITranscriptRepository transcriptRepository,
                               IClassRoomRepository classRoomRepository,
                               IStudentRepository studentRepository){
        this.transcriptRepository = transcriptRepository;
        this.classRoomRepository = classRoomRepository;
        this.studentRepository = studentRepository;
    }

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
        ClassRoom room = saveClassRoom(classRoom);
        LOGGER.log(Level.INFO,room.toString(), data);

        Student student = new Student("000-61-0001", "Fabrice","Nduwayo", trans, room);
        LOGGER.log(Level.INFO,saveStudent(student).toString(), data);
    }

    Transcript saveTranscript(Transcript transcript){
        return this.transcriptRepository.save(transcript);
    }

    ClassRoom saveClassRoom(ClassRoom classRoom){
        return this.classRoomRepository.save(classRoom);
    }

    Student saveStudent(Student student){
        return this.studentRepository.save(student);
    }



}
