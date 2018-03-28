

@Controller
@Scope("prototype")
public class UserController {
	private static final long serialVersionUID = 1L;


	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String doRegist(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/modifyInfo", method = RequestMethod.POST)
	public String doModifyInfo(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/checkOtherUser")
	public User doCheckOtherUser(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/follow", method = RequestMethod.POST)
	public int doFollow(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/unfollow", method = RequestMethod.POST)
	public int doUnFollow(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/getWish", method = RequestMethod.POST)
	public List<Wish> dogetWish(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/addWish", method = RequestMethod.POST)
	public int doaddWish(ModelMap model, HttpServletRequest request) {

	}

	@RequestMapping(value = "/deleteWish", method = RequestMethod.POST)
	public int dodeleteWish(ModelMap model, HttpServletRequest request) {

	}

}