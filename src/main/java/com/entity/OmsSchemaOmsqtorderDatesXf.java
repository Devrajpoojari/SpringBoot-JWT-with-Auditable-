package com.entity;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

@Entity
@Table(name = "omsschema.omsqtorderdatesxf")
public class OmsSchemaOmsqtorderDatesXf {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bigint")
	private int bigInt;

	@Column(name = "date_creation")
	private Date dateCreation;

	@Column(name = "date_product_validate")
	private Date dateProductValidate;

	@Column(name = "year_week_confirmation")
	//@Max(value = 8, message = "Max value is only 8")
	private String yearWeekConfirmation;

	@Column(name = "year_week_requested_production")
//	@Max(value = 8, message = "Max value is only 8")
	private String yearWeekRequestedProduction;

	@Column(name = "date_creation_miss")
	private Date dateCreationMiss;

	@Column(name = "date_ocf_assign")
	private Date dateOcfAssign;

	@Column(name = "date_valid_begin")
	private Date dateValidBegin;

	@Column(name = "date_valid_end")
	private Date dateValidEnd;

	@Column(name = "date_confirm_begin")
	private Date dateConfirmBegin;

	@Column(name = "date_confirm_first")
	private Date dateConfirmFirst;

	@Column(name = "date_last_variability")
	private Date dateLastVariability;

	@Column(name = "date_confirm_requested")
	private Date dateConfirmRequested;

	@Column(name = "date_redquested_delivery")
	private Date dateRequestedDelivery;

	@Column(name = "date_confirm_requested_begin")
	private Date dateConfirmRequestedBegin;

	@Column(name = "date_confirm_requested_end")
	private Date dateConfirmRequestedEnd;

	@Column(name = "date_agreed_delivery")
	private Date dateAgreedDelivery;

	@Column(name = "date_customer_wished")
	private Date dateCustomerWished;

	@Column(name = "date_expected_arrival_dealer")
	private Date dateExpectedArrivalDealer;

	@Column(name = "date_expected_production")
	private Date dateExpectedProduction;

	@Column(name = "date_forecast_dop")
	private Date dateForeCastDop;

	@Column(name = "date_forecast_transit_a")
	private Date dateForeCastTransitA;

	@Column(name = "date_forecast_transit_b")
	private Date dateForeCastTransitB;

	@Column(name = "date_forecast_transit_d")
	private Date dateForeCastTransitD;

	@Column(name = "date_forecast_transit_g")
	private Date dateForeCastTransitG;

	@Column(name = "date_forecast_transit_g_kpi")
	private Date dateForeCastTransitGKpi;

	@Column(name = "date_estimated_arrival_dealer")
	private Date dateEstimatedArrivalDealer;

	@Column(name = "date_estimated_arrival_dealer_vin")
	private Date dateEstimatedArrivalDealerVin;

	@Column(name = "date_transit_a")
	private Date dateTrsitA;

	@Column(name = "date_transit_b")
	private Date dateTrsitB;

	@Column(name = "date_transit_c")
	private Date dateTrsitC;

	@Column(name = "datetime_transit_d")
	private Timestamp dateTimeTransitD;

	@Column(name = "datetime_transit_e")
	private Timestamp dateTimeTransitE;

	@Column(name = "date_ex_factory")
	private Date dateExFactory;

	@Column(name = "date_arrival_dealer")
	private Date dateArrivalDealer;

	@Column(name = "date_delivery_final_customer")
	private Date dateDeliveryFinalCustomer;

	@Column(name = "date_registration")
	private Date dateRegistration;

	@Column(name = "date_cancellation")
	private Date dateCancellation;

	public int getBigInt() {
		return bigInt;
	}

	public void setBigInt(int bigInt) {
		this.bigInt = bigInt;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateProductValidate() {
		return dateProductValidate;
	}

	public void setDateProductValidate(Date dateProductValidate) {
		this.dateProductValidate = dateProductValidate;
	}

	public String getYearWeekConfirmation() {
		return yearWeekConfirmation;
	}

	public void setYearWeekConfirmation(String yearWeekConfirmation) {
		this.yearWeekConfirmation = yearWeekConfirmation;
	}

	public String getYearWeekRequestedProduction() {
		return yearWeekRequestedProduction;
	}

	public void setYearWeekRequestedProduction(String yearWeekRequestedProduction) {
		this.yearWeekRequestedProduction = yearWeekRequestedProduction;
	}

	public Date getDateCreationMiss() {
		return dateCreationMiss;
	}

	public void setDateCreationMiss(Date dateCreationMiss) {
		this.dateCreationMiss = dateCreationMiss;
	}

	public Date getDateOcfAssign() {
		return dateOcfAssign;
	}

	public void setDateOcfAssign(Date dateOcfAssign) {
		this.dateOcfAssign = dateOcfAssign;
	}

	public Date getDateValidBegin() {
		return dateValidBegin;
	}

	public void setDateValidBegin(Date dateValidBegin) {
		this.dateValidBegin = dateValidBegin;
	}

	public Date getDateValidEnd() {
		return dateValidEnd;
	}

	public void setDateValidEnd(Date dateValidEnd) {
		this.dateValidEnd = dateValidEnd;
	}

	public Date getDateConfirmBegin() {
		return dateConfirmBegin;
	}

	public void setDateConfirmBegin(Date dateConfirmBegin) {
		this.dateConfirmBegin = dateConfirmBegin;
	}

	public Date getDateConfirmFirst() {
		return dateConfirmFirst;
	}

	public void setDateConfirmFirst(Date dateConfirmFirst) {
		this.dateConfirmFirst = dateConfirmFirst;
	}

	public Date getDateLastVariability() {
		return dateLastVariability;
	}

	public void setDateLastVariability(Date dateLastVariability) {
		this.dateLastVariability = dateLastVariability;
	}

	public Date getDateConfirmRequested() {
		return dateConfirmRequested;
	}

	public void setDateConfirmRequested(Date dateConfirmRequested) {
		this.dateConfirmRequested = dateConfirmRequested;
	}

	public Date getDateRequestedDelivery() {
		return dateRequestedDelivery;
	}

	public void setDateRequestedDelivery(Date dateRequestedDelivery) {
		this.dateRequestedDelivery = dateRequestedDelivery;
	}

	public Date getDateConfirmRequestedBegin() {
		return dateConfirmRequestedBegin;
	}

	public void setDateConfirmRequestedBegin(Date dateConfirmRequestedBegin) {
		this.dateConfirmRequestedBegin = dateConfirmRequestedBegin;
	}

	public Date getDateConfirmRequestedEnd() {
		return dateConfirmRequestedEnd;
	}

	public void setDateConfirmRequestedEnd(Date dateConfirmRequestedEnd) {
		this.dateConfirmRequestedEnd = dateConfirmRequestedEnd;
	}

	public Date getDateAgreedDelivery() {
		return dateAgreedDelivery;
	}

	public void setDateAgreedDelivery(Date dateAgreedDelivery) {
		this.dateAgreedDelivery = dateAgreedDelivery;
	}

	public Date getDateCustomerWished() {
		return dateCustomerWished;
	}

	public void setDateCustomerWished(Date dateCustomerWished) {
		this.dateCustomerWished = dateCustomerWished;
	}

	public Date getDateExpectedArrivalDealer() {
		return dateExpectedArrivalDealer;
	}

	public void setDateExpectedArrivalDealer(Date dateExpectedArrivalDealer) {
		this.dateExpectedArrivalDealer = dateExpectedArrivalDealer;
	}

	public Date getDateExpectedProduction() {
		return dateExpectedProduction;
	}

	public void setDateExpectedProduction(Date dateExpectedProduction) {
		this.dateExpectedProduction = dateExpectedProduction;
	}

	public Date getDateForeCastDop() {
		return dateForeCastDop;
	}

	public void setDateForeCastDop(Date dateForeCastDop) {
		this.dateForeCastDop = dateForeCastDop;
	}

	public Date getDateForeCastTransitA() {
		return dateForeCastTransitA;
	}

	public void setDateForeCastTransitA(Date dateForeCastTransitA) {
		this.dateForeCastTransitA = dateForeCastTransitA;
	}

	public Date getDateForeCastTransitB() {
		return dateForeCastTransitB;
	}

	public void setDateForeCastTransitB(Date dateForeCastTransitB) {
		this.dateForeCastTransitB = dateForeCastTransitB;
	}

	public Date getDateForeCastTransitD() {
		return dateForeCastTransitD;
	}

	public void setDateForeCastTransitD(Date dateForeCastTransitD) {
		this.dateForeCastTransitD = dateForeCastTransitD;
	}

	public Date getDateForeCastTransitG() {
		return dateForeCastTransitG;
	}

	public void setDateForeCastTransitG(Date dateForeCastTransitG) {
		this.dateForeCastTransitG = dateForeCastTransitG;
	}

	public Date getDateForeCastTransitGKpi() {
		return dateForeCastTransitGKpi;
	}

	public void setDateForeCastTransitGKpi(Date dateForeCastTransitGKpi) {
		this.dateForeCastTransitGKpi = dateForeCastTransitGKpi;
	}

	public Date getDateEstimatedArrivalDealer() {
		return dateEstimatedArrivalDealer;
	}

	public void setDateEstimatedArrivalDealer(Date dateEstimatedArrivalDealer) {
		this.dateEstimatedArrivalDealer = dateEstimatedArrivalDealer;
	}

	public Date getDateEstimatedArrivalDealerVin() {
		return dateEstimatedArrivalDealerVin;
	}

	public void setDateEstimatedArrivalDealerVin(Date dateEstimatedArrivalDealerVin) {
		this.dateEstimatedArrivalDealerVin = dateEstimatedArrivalDealerVin;
	}

	public Date getDateTrsitA() {
		return dateTrsitA;
	}

	public void setDateTrsitA(Date dateTrsitA) {
		this.dateTrsitA = dateTrsitA;
	}

	public Date getDateTrsitB() {
		return dateTrsitB;
	}

	public void setDateTrsitB(Date dateTrsitB) {
		this.dateTrsitB = dateTrsitB;
	}

	public Date getDateTrsitC() {
		return dateTrsitC;
	}

	public void setDateTrsitC(Date dateTrsitC) {
		this.dateTrsitC = dateTrsitC;
	}

	public Timestamp getDateTimeTransitD() {
		return dateTimeTransitD;
	}

	public void setDateTimeTransitD(Timestamp dateTimeTransitD) {
		this.dateTimeTransitD = dateTimeTransitD;
	}

	public Timestamp getDateTimeTransitE() {
		return dateTimeTransitE;
	}

	public void setDateTimeTransitE(Timestamp dateTimeTransitE) {
		this.dateTimeTransitE = dateTimeTransitE;
	}

	public Date getDateExFactory() {
		return dateExFactory;
	}

	public void setDateExFactory(Date dateExFactory) {
		this.dateExFactory = dateExFactory;
	}

	public Date getDateArrivalDealer() {
		return dateArrivalDealer;
	}

	public void setDateArrivalDealer(Date dateArrivalDealer) {
		this.dateArrivalDealer = dateArrivalDealer;
	}

	public Date getDateDeliveryFinalCustomer() {
		return dateDeliveryFinalCustomer;
	}

	public void setDateDeliveryFinalCustomer(Date dateDeliveryFinalCustomer) {
		this.dateDeliveryFinalCustomer = dateDeliveryFinalCustomer;
	}

	public Date getDateRegistration() {
		return dateRegistration;
	}

	public void setDateRegistration(Date dateRegistration) {
		this.dateRegistration = dateRegistration;
	}

	public Date getDateCancellation() {
		return dateCancellation;
	}

	public void setDateCancellation(Date dateCancellation) {
		this.dateCancellation = dateCancellation;
	}

	public OmsSchemaOmsqtorderDatesXf() {
		super();
	}
}
