

@Controller
@Scope("prototype")
public class TravelController {
	private static final long serialVersionUID = 1L;

	@RequestMapping(value = "/addTopic", method = RequestMethod.POST)
	public List<Topic> doaddTopic(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/commentTopic", method = RequestMethod.POST)
	public List<Comment> docommentTopic(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/searchTopic", method = RequestMethod.POST)
	public Topic dosearchTopic(ModelMap model, HttpServletRequest request) {

	}
}