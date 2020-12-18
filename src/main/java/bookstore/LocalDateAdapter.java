package bookstore;

import java.io.IOException;
import java.time.LocalDate;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class LocalDateAdapter extends TypeAdapter<LocalDate> {

	@Override
	public void write(JsonWriter out, LocalDate value) throws IOException {
		// TODO Auto-generated method stub
		out.value(value.toString()); // Escribe la fecha con formato estándar
	}

	@Override
	public LocalDate read(JsonReader in) throws IOException {
		// TODO Auto-generated method stub

		String fecha = in.nextString();

		return LocalDate.parse(fecha);

	}
}
