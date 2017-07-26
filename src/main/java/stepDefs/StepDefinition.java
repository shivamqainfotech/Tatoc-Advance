package stepDefs;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.qait.tatocAdvance.actions.Action;
import com.qait.tatocAdvance.driver.DriverClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	static ResourceBundle rs = ResourceBundle.getBundle("Resources.credentials");
	private WebDriver driver=DriverClass.getDriver(rs.getString("browser"));
	private Action action=new Action(driver);
	final static Logger logger = Logger.getLogger(StepDefinition.class);
	
	@Given("^I am on tatoc page and select advance course$")
	public void i_am_on_tatoc_page_and_select_advance_course() throws Throwable {
	    action.select_advance();
	    logger.info("I am on tatoc page and select advance course.");
	}

	@Given("^I hover over to MenuTwo and click on goNext button from the drop down and reached to queryGate page$")
	public void i_hover_over_to_MenuTwo_and_click_on_goNext_button_from_the_drop_down_and_reached_to_queryGate_page() throws Throwable {
	    action.hover_over_than_click();
	    logger.info("I hover over to MenuTwo and click on goNext button from the drop down and reached to queryGate page.");
	}

	@When("^I enter name and pass key obtained from DB and click proceed a video player must appear$")
	public void i_enter_name_and_pass_key_obtained_from_DB_and_click_proceed_a_video_player_must_appear() throws Throwable {
	    action.enter_name_and_pass_key_obtained_from_DB_and_click_proceed();
	    logger.info("I enter name and pass key obtained from DB and click proceed a video player must appear.");
	}

	@When("^I click on video to play$")
	public void i_click_on_video_to_play() throws Throwable {
		logger.info("I click on video to play.");
	}

	@Then("^wait untill video playback is finished then click Proceed to go to next page$")
	public void wait_untill_video_playback_is_finished_then_click_Proceed_to_go_to_next_page() throws Throwable {
	    
	}



	
}
