
@Controller
@Scope("prototype")
public class RecommendController {
    private static final long serialVersionUID = 1L;

    @RequestMapping(value = "/recommendRoute", method = RequestMethod.POST)
    public List<Route> dorecommendRoute(ModelMap model, HttpServletRequest request) {

    }

    @RequestMapping(value = "/recommendPlaces", method = RequestMethod.POST)
    public List<Places> dorecommendPlaces(ModelMap model, HttpServletRequest request) {

    }

    @RequestMapping(value = "/recommendFood", method = RequestMethod.POST)
    public List<Food> dorecommendFood(ModelMap model, HttpServletRequest request) {

    }

    @RequestMapping(value = "/recommendFood", method = RequestMethod.POST)
    public RoutePlan auto(ModelMap model, HttpServletRequest request) {

    }
}