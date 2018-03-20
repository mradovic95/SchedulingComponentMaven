package scheduling_component;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import import_export_impl.SheduleImportExportJsonImplementation;
import model.Schedule;

public class ReadTest {

	@Test
	public void test() {
		SheduleImportExportJsonImplementation sheduleImportExportJsonImplementation = new SheduleImportExportJsonImplementation();

		try {
			Schedule schedule=sheduleImportExportJsonImplementation.importShedule(new File("Proba.json"));
			System.out.println(schedule);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
