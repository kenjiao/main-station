package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class UserCenterPage extends BaseClass {

	public UserCenterPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@class=\"i-refresh\"]")
	public static WebElement refresh_btn;

	@FindBy(how=How.XPATH, using="//*[@class=\"datum_content\"]/dl")
	public static List<WebElement> data_info;

	@FindBy(how=How.XPATH, using="//*[@id=\"edit_BasicInformation\"]")
	public static WebElement edit_basic_info_btn;

	@FindBy(how=How.XPATH, using="//*[@id=\"cancel_BasicInformation\"]")
	public static WebElement cancel_edit_basic_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_DemandInformation\"]")
	public static WebElement edit_demand_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_JobInformation\"]")
	public static WebElement edit_job_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_CompanyInformation\"]")
	public static WebElement edit_company_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_CreditInformation\"]")
	public static WebElement edit_credit_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_HouseInformation\"]")
	public static WebElement edit_house_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_CarInformation\"]")
	public static WebElement edit_car_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_EquipmentInformation\"]")
	public static WebElement edit_equipment_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_InsuranceInformation\"]")
	public static WebElement edit_insurance_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_OtherAssetsInformation\"]")
	public static WebElement edit_otherassets_info_btn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_GuaranteeInformation\"]")
	public static WebElement edit_guarantee_info_btn;

	//基本信息
	public static class BasicInformation extends BaseClass{
		public BasicInformation(WebDriver driver)
		{
			super(driver);
		}

		@FindBy(how=How.XPATH, using="//*[@id=\"UserName\"]")
		public static WebElement user_name;

		@FindBy(how=How.XPATH, using="//*[@id=\"Age\"]")
		public static WebElement age;

		@FindBy(how=How.XPATH, using="//*[@id=\"man\"]")
		public static WebElement man;

		@FindBy(how=How.XPATH, using="//*[@id=\"woman\"]")
		public static WebElement woman;

		@FindBy(how=How.XPATH, using="//*[@id=\"txt_Education\"]")
		public static WebElement education_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_Education\"]/li")
		public static List<WebElement> education;

		@FindBy(how=How.XPATH, using="//*[@id=\"txt_IsMarried\"]")
		public static WebElement married_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_IsMarried\"]/li")
		public static List<WebElement> married;

		@FindBy(how=How.XPATH, using="//*[@id=\"txt_LiveTime\"]")
		public static WebElement live_time_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_LiveTime\"]/li")
		public static List<WebElement> live_time;

		@FindBy(how=How.XPATH, using="//*[@id=\"IDCard\"]")
		public static WebElement id_card;

		@FindBy(how=How.XPATH, using="//*[@id=\"txt_Identity\"]")
		public static WebElement identity_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_Identity\"]/li")
		public static List<WebElement> identity;

		@FindBy(how=How.XPATH, using="//*[@id=\"submit_inner_BasicInformation\"]")
		public static WebElement submit;

		@FindBy(how=How.XPATH, using="//*[@id=\"cancel_inner_BasicInformation\"]")
		public static WebElement cancel;
	}

	//需求信息
	public static class DemandInformation extends BaseClass {
		public DemandInformation(WebDriver driver)
		{
			super(driver);
		}

		@FindBy(how=How.XPATH, using="//*[@id=\"LoanAmount\"]")
		public static WebElement loan_amount;

		@FindBy(how=How.XPATH, using="//*[@id=\"LoanPerod\"]")
		public static WebElement loan_perod;

		@FindBy(how=How.XPATH, using="//*[@id=\"btn_DemandInformation\"]/div")
		public static List<WebElement> demand_info_btn;
	}

	//职业信息
	public static class JobInformation extends BaseClass {
		public JobInformation(WebDriver driver) {
			super(driver);
		}

		//收入方式
		@FindBy(how = How.XPATH, using = "//*[@id=\"IncomeDistributionType\"]")
		public static WebElement income_distribution_type_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_IncomeDistributionType\"]/li")
		public static List<WebElement> income_distribution_type;

		//月打卡工资
		@FindBy(how = How.XPATH, using = "//*[@id=\"Salary\"]")
		public static WebElement salary;

		@FindBy(how=How.XPATH, using="//*[@id=\"btn_DemandInformation\"]/div")
		public static List<WebElement> demand_info_btn;
	}

	//公司信息
	public static class CompanyInformation extends BaseClass {
		public CompanyInformation(WebDriver driver) {
			super(driver);
		}

		//是否法定代表人
		@FindBy(how=How.XPATH, using="//*[@id=\"IsRepresentative\"]")
		public static WebElement isrepresentative_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_IsRepresentative\"]/li")
		public static List<WebElement> isrepresentative;

		//企业经营地
		@FindBy(how=How.XPATH, using="//*[@id=\"CompanyLocation\"]")
		public static WebElement company_location_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_CompanyLocation\"]/li")
		public static List<WebElement> company_location;

		//营业执照年限
		@FindBy(how=How.XPATH, using="//*[@id=\"BusinessYear\"]")
		public static WebElement business_year_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_BusinessYear\"]/li")
		public static List<WebElement> business_year;

		@FindBy(how=How.XPATH, using="//*[@id=\"btn_CompanyInformation\"]/div")
		public static List<WebElement> demand_info_btn;
	}

	//信用和负债信息
	public static class CreditInformation extends BaseClass {
		public CreditInformation(WebDriver driver) {
			super(driver);
		}

		//个人信用情况
		@FindBy(how=How.XPATH, using="//*[@id=\"CreditStanding\"]")
		public static WebElement credit_standing_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_CreditStanding\"]/li")
		public static List<WebElement> credit_standing;

		@FindBy(how=How.XPATH, using="//*[@id=\"btn_creditInformation\"]/div")
		public static List<WebElement> credit_info_btn;
	}

	//房产信息
	public static class HouseInformation extends BaseClass {
		public HouseInformation(WebDriver driver) {
			super(driver);
		}

		//名下房产情况
		@FindBy(how = How.XPATH, using = "//*[@id=\"HaveHouse\"]")
		public static WebElement ishave_house_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_HaveHouse\"]/li")
		public static List<WebElement> ishave_house;

		//房产抵押/按揭状态
		@FindBy(how = How.XPATH, using = "//*[@id=\"HouseMortgage\"]")
		public static WebElement house_mortgage_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_HouseMortgage\"]/li")
		public static List<WebElement> house_mortgage;

		@FindBy(how = How.XPATH, using = "//*[@id=\"btn_HouseInformation\"]/div")
		public static List<WebElement> house_info_btn;
	}

	//车产信息
	public static class CarInformation extends BaseClass {
		public CarInformation(WebDriver driver) {
			super(driver);
		}

		//名下房产情况
		@FindBy(how = How.XPATH, using = "//*[@id=\"HaveCar\"]")
		public static WebElement ishave_car_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_HaveCar\"]/li")
		public static List<WebElement> ishave_car;

		//车龄
		@FindBy(how = How.XPATH, using = "//*[@id=\"CarAgeYear\"]")
		public static WebElement car_age_year_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_CarAgeYear\"]/li")
		public static List<WebElement> car_age_year;

		//车产抵押/按揭状态
		@FindBy(how = How.XPATH, using = "//*[@id=\"CarMortgage\"]")
		public static WebElement car_mortgage_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_CarMortgage\"]/li")
		public static List<WebElement> car_mortgage;

		@FindBy(how = How.XPATH, using = "//*[@id=\"btn_CarInformation\"]/div")
		public static List<WebElement> car_info_btn;
	}

	//设备信息
	public static class EquipmentInformation extends BaseClass {
		public EquipmentInformation(WebDriver driver) {
			super(driver);
		}

		//名下设备情况
		@FindBy(how = How.XPATH, using = "//*[@id=\"IsHaveEquipment\"]")
		public static WebElement ishave_equipment_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_IsHaveEquipment\"]/li")
		public static List<WebElement> ishave_equipment;

		@FindBy(how = How.XPATH, using = "//*[@id=\"btn_EquipmentInformation\"]/div")
		public static List<WebElement> equipment_info_btn;
	}

	//保单信息
	public static class InsuranceInformation extends BaseClass {
		public InsuranceInformation(WebDriver driver) {
			super(driver);
		}

		//名下保单情况
		@FindBy(how = How.XPATH, using = "//*[@id=\"InsuranceInfo\"]")
		public static WebElement ishave_nsurance_info_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_InsuranceInfo\"]/li")
		public static List<WebElement> ishave_nsurance_info;

		@FindBy(how = How.XPATH, using = "//*[@id=\"btn_InsuranceInformation\"]/div")
		public static List<WebElement> insurance_info_btn;
	}

	//其他资产
	public static class OtherAssetsInformation extends BaseClass {
		public OtherAssetsInformation(WebDriver driver) {
			super(driver);
		}

		//其他资产情况
		@FindBy(how = How.XPATH, using = "//*[@id=\"OtherAssetsInfo\"]")
		public static WebElement ishave_other_assets_info_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_OtherAssetsInfo\"]/li")
		public static List<WebElement> ishave_other_assets_info;

		@FindBy(how = How.XPATH, using = "//*[@id=\"btn_OtherAssetsInformation\"]/div")
		public static List<WebElement> otherassets_info_btn;
	}

	//担保信息
	public static class GuaranteeInformation extends BaseClass {
		public GuaranteeInformation(WebDriver driver) {
			super(driver);
		}

		//是否有担保人
		@FindBy(how = How.XPATH, using = "//*[@id=\"IsGuarantee\"]")
		public static WebElement ishave_guarantee_btn;

		@FindBy(how=How.XPATH, using="//*[@id=\"ul_IsGuarantee\"]/li")
		public static List<WebElement> ishave_guarantee;

		@FindBy(how = How.XPATH, using = "//*[@id=\"btn_GuaranteeInformation\"]/div")
		public static List<WebElement> guarantee_info_btn;
	}

	//电审信息
	public static class EAduitingInformation extends BaseClass {
		public EAduitingInformation(WebDriver driver) {
			super(driver);
		}

		@FindBy(how = How.XPATH, using = "//*[@id=\"txt_EAduiting\"]")
		public static WebElement aduiting_btn;

		@FindBy(how = How.XPATH, using = "//*[@id=\"ul_EAduiting\"]/li")
		public static List<WebElement> aduiting_result;

		@FindBy(how = How.XPATH, using = "//*[@id=\"EAduitingRemark\"]")
		public static WebElement remarks;

		@FindBy(how = How.XPATH, using = "//*[@id=\"EAuditingSave\"]")
		public static WebElement aduiting_save_btn;
	}
}
