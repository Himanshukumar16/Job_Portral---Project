package SpringBoot.practiceProject;

import SpringBoot.practiceProject.model.JobPost;
import SpringBoot.practiceProject.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private jobService js;

    @RequestMapping({"home","/"})
    public String home() {
        return "home";
    }

    @GetMapping({"addjob"})
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        js.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m) {
        List<JobPost> j = js.getJobPost();
        m.addAttribute("jobPosts",j);
        return "viewalljobs";
    }
}
