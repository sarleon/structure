

@Controller
@Scope("prototype")
public class TravelController {
	private static final long serialVersionUID = 1L;

	@RequestMapping(value = "/addNote", method = RequestMethod.POST)
	public int doaddNote(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/checkNote", method = RequestMethod.POST)
	public List<Note> docheckNote(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/commentNote", method = RequestMethod.POST)
	public Note docommentNote(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/collectNote", method = RequestMethod.POST)
	public List<Note> docollectNote(ModelMap model, HttpServletRequest request) {

	}


}