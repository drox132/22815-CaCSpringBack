package clase9;

import java.util.List;

public class DBUtils {

	public static List<String> listaMediosDePago (){
		return List.of("MERCADO_PAGO","RAPI_PAGO","PAGO_FACIL", "CRIPTO","VISA","MASTER");
	}
}
