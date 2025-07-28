package com.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public abstract class BaseClass {
	public static WebDriver driver;

//	This method contains browser launch and window maximize.
	protected static WebDriver browserLaunch(String BrowserName) {
		try {
			if (BrowserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (BrowserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR DURING LAUNCHING THE BROWSER");
		}
		driver.manage().window().maximize();
		return driver;
	}
	
//  This method contains browser close and quit
	protected static void browserCloseOrQuit(String option) {
		try {
			if (option.equalsIgnoreCase("close")) {
				driver.close();
			} else if (option.equalsIgnoreCase("quit")) {
				driver.quit();
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR DURING CLOSING THE WINDOW OR TAB");
		}

	}
	
//  This method contains browser url launch and navigate to
	protected static void browserUrls(String url, String option) {
		try {
			if (option.equalsIgnoreCase("directLink")) {
				driver.get(url);
			} else if (option.equalsIgnoreCase("navigateTo")) {
				driver.navigate().to(url);
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR DURING URL LAUNCH");
		}
	}

//  This method contains browser actions like back,forward,refresh, simple alert, confirm, getcurrentUrl, getTitle
	protected static void browserActions(String option) {
		try {
			if (option.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (option.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			} else if (option.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			} else if (option.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			} else if (option.equalsIgnoreCase("decline")) {
				driver.switchTo().alert().dismiss();
			} else if (option.equalsIgnoreCase("getUrl")) {
				driver.getCurrentUrl();
			} else if (option.equalsIgnoreCase("getTitle")) {
				driver.getTitle();
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR DURING BROWSER ACTIONS");
		}

	}

//  This method contains prompt window	
	protected static void promptWindow(String value, String action) {		try {
			driver.switchTo().alert().sendKeys(value);
	if (action.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			} else if (action.equalsIgnoreCase("decline")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR DURING PROMPT ALERT");
		}
	}

// This method contains mouse Action like click, doubleclick, rightclick, click&Hold, simple click.
	protected static void mouseAction(String option, WebElement element) {
	Actions act = new Actions(driver);
//	try {
		if (option.equalsIgnoreCase("Actclick")) {
			act.click(element).perform();
		}
			 else if (option.equalsIgnoreCase("doubleClick")) {
				act.doubleClick(element).perform();
			} else if (option.equalsIgnoreCase("rightClick")) {
				act.contextClick(element).perform();
			} else if (option.equalsIgnoreCase("clickAndHold")) {
				act.clickAndHold(element).perform();	
			} else if (option.equalsIgnoreCase("click")) {
				element.click();
	}
//		} catch (Exception e) {
//			Assert.fail("ERROR OCCUR WHILE DOING MOUSE ACTIONS");
//		}
	}

//  This method contains frames switch	
	protected static void handleFrames(String option, WebElement element) {
		try {
			if (option.equalsIgnoreCase("childFrame")) {
				driver.switchTo().frame(element);
			} else if (option.equalsIgnoreCase("homeFrame")) {
				driver.switchTo().defaultContent();
			} else if (option.equalsIgnoreCase("parentFrame")) {
				driver.switchTo().parentFrame();
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR WHILE HANDLEING FRAMES");
		}

	}
	
//  This method contains element status like isSelected, isEnabled, isDisplayed
	protected static void elementStatus(String option, WebElement element) {
		try {
			if (option.equalsIgnoreCase("isSelected")) {
				boolean isSelected = element.isSelected();
				System.out.println("Element is selected " + isSelected);
			} else if (option.equalsIgnoreCase("isEnabled")) {
				boolean isEnabled = element.isEnabled();
				System.out.println("Element is enabled " + isEnabled);
			} else if (option.equalsIgnoreCase("isDisplayed")) {
				boolean isDisplayed = element.isDisplayed();
				System.out.println("Element is displayed " + isDisplayed);
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR WHILE CHECKING ELEMENT STATUS");
		}

	}
	
//  This method contains sending input values
	protected static void printInput(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR DURING PASSING VALUE");
		}
	}
	
//  This method contains windowhandles
	protected static void windowHandles(int numb) {

		try {
			List<String> allWindows = new ArrayList(driver.getWindowHandles());
			driver.switchTo().window(allWindows.get(numb));
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR WHILE HANDLING WINDOWS");
		}

	}
	
//  This method contains robot action like down arrow.
	protected static void robotActions(String keys) {
		try {
			Robot r = new Robot();
			if (keys.equalsIgnoreCase("tab")) {
				r.keyPress(KeyEvent.VK_TAB);
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR WHILE USING ROBOT CLASS");

		}

	}
	
//  This method contains select option of dropdown
	protected static void selectDropDowns(WebElement element, String type, String value) {
		try {
			Select sel = new Select(element);
			if (type.equalsIgnoreCase("byValue")) {
				sel.selectByIndex(Integer.parseInt(value));
			} else if (type.equalsIgnoreCase("index")) {
				sel.selectByValue(value);
			} else if (type.equalsIgnoreCase("text")) {
				sel.selectByVisibleText(value);
			}

		} catch (Exception e) {
			Assert.fail("ERROR OCCUR DURING SELECTING DROPDOWN OPTIONS");

		}

	}
	
//  This method contains deselect opiton of dropwdown
	protected static void deselectDropDowns(WebElement element, String type, String value) {
		try {
			Select deSelect = new Select(element);
			if (type.equalsIgnoreCase("byValue")) {
				deSelect.deselectByIndex(0);
			} else if (type.equalsIgnoreCase("index")) {
				deSelect.deselectByValue(value);
			} else if (type.equalsIgnoreCase("text")) {
				deSelect.deselectByVisibleText(value);

			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR DURING DESELECTING DROPDOWN OPTIONS");

		}

	}
	
//  This method contains dropdown option like getalloptions, allselectedoption, isMultiple
	protected static void getDropDowns(String option, WebElement element) {
		try {
			Select SelectOpt = new Select(element);
			if (option.equalsIgnoreCase("getAllOptions")) {
				List<WebElement> getAllOptions = SelectOpt.getOptions();
				for (WebElement value:  getAllOptions) {

					System.out.println(value.getText());
				}

			} else if (option.equalsIgnoreCase(option)) {
				List<WebElement> allSelectedOptions = SelectOpt.getAllSelectedOptions();
				for (WebElement value:  allSelectedOptions) {
					System.out.println(value.getText());

				}
			} else if (option.equalsIgnoreCase("isMultiple")) {
				boolean isMultiple = SelectOpt.isMultiple();
				System.out.println("This element is Multiple " + isMultiple);
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCUR WHILE GETTING DROPDOWN OPTIONS");
		}

	}
	
//  This method contains element properties like getText and getAttribute
	protected static void getElementProp(WebElement element, String option, String attributekey) {
		try {
			if (option.equalsIgnoreCase("getText")) {
				String text = element.getText();
				System.out.println(text);
			} else if (option.equalsIgnoreCase("getAttributes")) {
				String attribute = element.getAttribute(attributekey);
				System.out.println(attribute);
			}

		} catch (Exception e) {
			Assert.fail("ERROR OCCUR WHILE GETTING SPECIFIC ELEMENT PROPERTIES ");
		}
}
	
//  This method contains Wait action like implicit and explicit
	protected static void waitActions(WebElement element, String option, String value) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			if (option.equalsIgnoreCase("implicitWait")) {
				int seconds = Integer.parseInt(value);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
			} else if (option.equalsIgnoreCase("explicitWait")) {
				wait.until(ExpectedConditions.visibilityOf(element));
			}

		} catch (Exception e) {
			Assert.fail("ERROR OCCUR WHILE USING WAITS" );
		}
	}
	
//  This method contains jsExecutors like scrollup,scrolldown, scrollByelement, click, sendkeys.
	protected static void javaScriptExecution(WebElement element, String option, String value, String x_axis,
			String y_axis) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			int Xaxis = Integer.parseInt(x_axis);
			int Yaxis = Integer.parseInt(y_axis);

			if (option.equalsIgnoreCase("scrollintoView")) {
				js.executeScript("arguments[0].scrollIntoView()", element);
			} else if (option.equalsIgnoreCase("sendkeys")) {
				js.executeScript("arguments[0].value=arguments[1]:", element, value);
			} else if (option.equalsIgnoreCase("scrollup")) {

				js.executeScript("window.scrollBy(arguments[0],arguments[1])", Xaxis, Yaxis);
			} else if (option.equalsIgnoreCase("scrolldown")) {
				js.executeScript("window.scrollBy(arguments[0],arguments[1])", Xaxis, Yaxis);
			}

		} catch (Exception e) {
			Assert.fail("ERROR OCCUR WHILE USING JAVASCRIPT EXECUTOR" );
		}

	}
	protected static void jsClick(WebElement element) {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected static void clear(WebElement element) {
		element.clear();
		
	}

////  This method contains browser screenshots	
//	protected static void ScreenShots() {
//
//		try {
//			File screenshotDir = new File("./Screenshot");
//
//			if (!screenshotDir.exists()) {
//				boolean mkdirs = screenshotDir.mkdirs();
//				System.out.println(mkdirs);
//			}
//
//			String dateFile = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(0));
//			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//			// Fix path concatenation
//			FileHandler.copy(screenshot, new File(screenshotDir, "ScreenShot" + dateFile + ".png"));
//
//			System.out.println("Screenshot saved: " + dateFile + ".png");
//		}
//
//		catch (Exception e) {
//			Assert.fail("ERROR OCCURE: WHILE TAKING A SCREENSHOT");
//		}
//	}

	
//	}

		protected static void validation(WebElement element, String value) {
			try {
				Assert.assertEquals(element.getText(), value);
				System.out.println("Validation successfull");
		} catch (Exception e) {
			Assert.fail("Error: Occur During Validation");
			}
		}}



