package Skiff.dao;

import java.util.List;

import edu.nju.hello_order.temp_model.Note;

public interface NoteDao {
	
	public Note getNoteByID(int id);
	
	public List<Note> getNoteByAuthor(String uid);
	
	public List<Note> getNoteByCity(String city);
	
	public List<Note> getFondNote(String uid);
	
	public List<Note> getNoteByTag(List<String> tags);
	
	public int addNote(Note note);
	
	public int deleteNote(int id);

}
