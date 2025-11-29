package SpringBoot.practiceProject;

import SpringBoot.practiceProject.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @RequestMapping({"home","/"})
    public String home() {
        return "home";
    }

    @RequestMapping({"addjob"})
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        return "success";
    }
}
