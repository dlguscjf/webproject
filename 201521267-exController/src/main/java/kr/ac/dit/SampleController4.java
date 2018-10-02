package kr.ac.dit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class SampleController4 {
 private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
 @RequestMapping("urlE")
 public String urlE(RedirectAttributes rttr) {
  logger.info("urlE called but redirected to /urlF............."); //콘솔창에 로그를 찍는다.
  rttr.addAttribute("msg", "This is the message with redirected"); //msg에 뒤의 값을 삽입
  return "redirect:/urlF"; //urlE를 실행시키면 urlF로 이동한다.
 }
 @RequestMapping("/urlF")
 public void urlF(String msg) {
  logger.info("urlF called......" + msg); // urlE에서 선언한 변수값을 불러와서 콘솔에 로그를 찍는다
 }
}

