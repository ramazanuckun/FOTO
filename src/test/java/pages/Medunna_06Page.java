package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Medunna_06Page {   // Ramazan Uckun

    public Medunna_06Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
//Giris




//<US16>
@FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
public WebElement signInGiris;
    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "(//*[.='Sign in'])[4]")
    public WebElement sinInOnay;
    @FindBy(xpath = "(//*[.='Items&Titles'])[2]")
    public WebElement itemTitlesIkonu;
    //<US17>
    @FindBy(xpath = "(//*[.='Test Item'])[1]")
    public WebElement testItems;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement crateaTestItemsOlustur;

    @FindBy(xpath = "(//*[.='Create or edit a Test Item'])[4]")
    public WebElement createoreditaTestItemYazisiGorunurlugu;

    @FindBy(xpath = "//input[@id='c-test-item-name']")
    public WebElement nameTestItems;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveTestItems;

    @FindBy(xpath = "//*[@id='c-test-item-description']")
    public WebElement descrictionTestItems;
    @FindBy(xpath = "//*[@id='c-test-item-defaultValMin']")
    public WebElement defaultminValueTestItems;

    @FindBy(xpath = "//*[@id='c-test-item-defaultValMax']")
    public WebElement defaultmaxValuedescrictionTestItems;

    @FindBy(xpath = "//*[@id='c-test-item-price']")
    public WebElement priceTestItems;

    @FindBy(xpath = "//*[@id='c-test-item-createdDate']")
    public WebElement creadDataTestItems;
    @FindBy(xpath = "//*[.='Test Items']")
    public WebElement testItemsGorunurlugu;
    @FindBy(xpath = "//thead//th")
    public List<WebElement> testogeleri;
    //@FindBy(xpath = "//*[starts-with(@href,'/c-test-item/335068/delete')]")
    //public WebElement delete;


    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm']//span//span)[1]")
    public WebElement delete;


    @FindBy(xpath = "//thead/tr[1]/th[1]")
    public WebElement sortIconTestPage;



    @FindBy(xpath = "//button[@id='jhi-confirm-delete-cTestItem']//span")
    public WebElement deleteOnayTestITemss;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement deleteSuccessMessage;



    @FindBy(xpath = "//thead//th[7]")
    public WebElement deleteicinSonSayfaSirala;
//===188===///

    //*[.='Physicians']
    @FindBy(xpath = "(//*[starts-with(@href,'/physician')])[1]")
    public WebElement physicians;

@FindBy(xpath = "//*[.='Physicians']")
    public WebElement physiciansGorunurlugu;

    @FindBy(xpath = "//*[.='Create a new Physician']")
    public WebElement createaNewPhysician;

    @FindBy(xpath = "//*[@id='useSSNSearch']")
    public WebElement checxbox;
    @FindBy(xpath = "//*[@id='searchSSN']")
    public WebElement useSearchButton;

    @FindBy(xpath = "//*[@class='btn btn-secondary']")
    public WebElement searchUserOnay;
    @FindBy(xpath = "//div[text()='User found with search SSN']")
    public WebElement userFoundScrollingText01; // K??sa s??re ekranda kal??p yok olan text yaz??s??n?? al??r
    @FindBy(xpath = "//*[contains(text(), 'User found with search SSN')]")
    public WebElement userFoundScrollingText; // K??sa s??re ekranda kal??p yok olan text yaz??s??n?? al??r

    @FindBy(xpath = "//ul[@class='pagination']/li[9]/a")
    public WebElement endPage;

    @FindBy(xpath = " (//table//tbody//tr[1]//td[18]//span)[4]")
    public WebElement physicianlocateSonSayfa;

    @FindBy(xpath = " //*[@id='physician-firstName']")
    public WebElement namePhysician;


    @FindBy(xpath = " //*[@id='physician-lastName']")
    public WebElement lastnamePhysician;


    @FindBy(xpath = " //*[@id='physician1-birthDate']")
    public WebElement birtDatePhysician;



    @FindBy(xpath = " //*[@id='physician-phone']")
    public WebElement phonePhysician;


    @FindBy(xpath = " //*[@id='physician-adress']")
    public WebElement adressPhysician;

    @FindBy(xpath = " //*[@id='physician-gender']")
    public WebElement genderPhysician;
    @FindBy(xpath = " //*[@id='physician-speciality']")
    public WebElement specialityPhysician;
    @FindBy(xpath = " //*[@id='physician-bloodGroup']")
    public WebElement bloodGroupPhysician;

    @FindBy(xpath = " //*[@id='physician-examFee']")
    public WebElement examFeePhysician;

    @FindBy(xpath = " //*[@id='physician-country']")
    public WebElement countryPhysician;

    @FindBy(xpath = " //*[@id='physician-cstate']")
    public WebElement stateCtyPhysician;
    @FindBy(xpath = " //*[@id='save-entity']")
    public WebElement savePhysician;

    @FindBy(xpath = " //*[@id='file_image']")
    public WebElement fotodosyaPhysician;


    @FindBy(xpath = " //button[@id='jhi-confirm-delete-physician']//span")
    public WebElement deleteOnayPhysician;

    @FindBy(xpath = "(//*[.='Room'])[1]")
    public WebElement room;
    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewRoom;

    @FindBy (xpath = "(//*[.='Create or edit a Room'])[1]")
    public WebElement createOrEditAroom;

    @FindBy(xpath = "//*[.='Room Number']")
    public WebElement roomNumberBaslangicRoom;
    @FindBy(xpath = "//*[@id='room-roomNumber']")
    public WebElement roomNumberRoom;
    @FindBy(xpath = "//*[@id='room-roomType']")
    public WebElement roomTypeSelectRoom;
    @FindBy(xpath = "(//*[.='This field is required.'])[2]")
    public WebElement roomTypeGirilmediRoom;
    @FindBy(xpath = "//*[@id='createdDateLabel']")
    public WebElement creadDataRoom;
    @FindBy(xpath = "//*[contains(text(),'A new Room is created with identifier']")
    public WebElement yeniOdaOlusturlduYazisiRoom;
    @FindBy(xpath = "//*[@id='room-status']")
    public WebElement statusRoom;

    @FindBy(xpath = "//*[@id='room-description']")
    public WebElement descriptionsRoom;
    @FindBy(xpath = "//*[@id='priceLabel']")
    public WebElement priceuyariIcinRoom;
    @FindBy(xpath = "//*[.='This field is required.']//div")
    public WebElement priceuyariYazisiIcinRoom;

    @FindBy(xpath = "//*[@id='room-price']")
    public WebElement priceRoom;

    @FindBy(xpath = "//button[starts-with(@id,'save')]")
    public WebElement saveKaydetRoom;

    @FindBy(xpath = "//thead//tr[1]")
    public WebElement roomTypeTusuRoom;

    @FindBy(xpath = "(//table//tbody//tr[3]//td[8]//span)[3]")
    public WebElement editSonSayfaRoom;

    @FindBy(xpath = "(//table//tbody//tr[3]//td[8]//span)[6]")
    public WebElement deleteSonSayfaRoom;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-room']//span")
    public WebElement deleteOnayRoom;
    @FindBy(xpath = "//thead//tr[1]")
    public WebElement roomTypeTusuSiralaRoom;

    @FindBy (xpath = "//*[contains(text(), 'A new Room is created with identifier')]")
    public WebElement popUpMessage;
    @FindBy(xpath = "//*[contains(text(), 'A Room is deleted')]")
    public WebElement popUpMessageDeleteRoom;
}