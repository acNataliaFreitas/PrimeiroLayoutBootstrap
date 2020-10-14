package layoutcom.LayoutComBootstrap.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador {

		@RequestMapping("/")
		public String pg1() {
			return "paginaInicial";
		}
		
		@RequestMapping("/pagina2")
		public String pg2() {
			return "paginaSecundaria";
		}
		}



