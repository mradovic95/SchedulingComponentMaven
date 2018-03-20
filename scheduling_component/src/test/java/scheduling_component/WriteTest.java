package scheduling_component;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.junit.Test;

import exceptions.InvalidSheduleExcepiton;
import import_export_impl.SheduleImportExportJsonImplementation;
import model.Event;
import model.EventFactory;
import model.Schedule;

public class WriteTest {

	@Test
	public void test() {
		Schedule schedule = new Schedule();
		EventFactory eventFactory = new EventFactory();
		Event workEvent1 = eventFactory.getEvent("FunEvent");
		workEvent1.setStartActivity(LocalDateTime.of(2018, 1, 12, 12, 25));
		workEvent1.setEndActivity(LocalDateTime.of(2018, 1, 20, 12, 25));
		workEvent1.setTitle("evea");
		schedule.add(workEvent1);

		Event workEvent2 = eventFactory.getEvent("WorkEvent");
		workEvent2.setStartActivity(LocalDateTime.of(2018, 1, 13, 12, 25));
		workEvent2.setEndActivity(LocalDateTime.of(2018, 1, 25, 12, 25));
		workEvent2.setTitle("event22222222");
		schedule.add(workEvent2);

		SheduleImportExportJsonImplementation sheduleImportExportJsonImplementation = new SheduleImportExportJsonImplementation();

		try {
			sheduleImportExportJsonImplementation.exportShedule(new File("Proba.json"), schedule);
		} catch (InvalidSheduleExcepiton | IOException e) {
			e.printStackTrace();
		}
	}

}
