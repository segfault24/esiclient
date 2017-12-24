/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package is.ccp.tech.esi.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetCharactersCharacterIdNotifications200Ok {
  @SerializedName("notification_id")
  private Long notificationId = null;

  /**
   * type string
   */
  public enum TypeEnum {
    @SerializedName("AcceptedAlly")
    ACCEPTEDALLY("AcceptedAlly"),
    
    @SerializedName("AcceptedSurrender")
    ACCEPTEDSURRENDER("AcceptedSurrender"),
    
    @SerializedName("AllAnchoringMsg")
    ALLANCHORINGMSG("AllAnchoringMsg"),
    
    @SerializedName("AllMaintenanceBillMsg")
    ALLMAINTENANCEBILLMSG("AllMaintenanceBillMsg"),
    
    @SerializedName("AllStrucInvulnerableMsg")
    ALLSTRUCINVULNERABLEMSG("AllStrucInvulnerableMsg"),
    
    @SerializedName("AllStructVulnerableMsg")
    ALLSTRUCTVULNERABLEMSG("AllStructVulnerableMsg"),
    
    @SerializedName("AllWarCorpJoinedAllianceMsg")
    ALLWARCORPJOINEDALLIANCEMSG("AllWarCorpJoinedAllianceMsg"),
    
    @SerializedName("AllWarDeclaredMsg")
    ALLWARDECLAREDMSG("AllWarDeclaredMsg"),
    
    @SerializedName("AllWarInvalidatedMsg")
    ALLWARINVALIDATEDMSG("AllWarInvalidatedMsg"),
    
    @SerializedName("AllWarRetractedMsg")
    ALLWARRETRACTEDMSG("AllWarRetractedMsg"),
    
    @SerializedName("AllWarSurrenderMsg")
    ALLWARSURRENDERMSG("AllWarSurrenderMsg"),
    
    @SerializedName("AllianceCapitalChanged")
    ALLIANCECAPITALCHANGED("AllianceCapitalChanged"),
    
    @SerializedName("AllyContractCancelled")
    ALLYCONTRACTCANCELLED("AllyContractCancelled"),
    
    @SerializedName("AllyJoinedWarAggressorMsg")
    ALLYJOINEDWARAGGRESSORMSG("AllyJoinedWarAggressorMsg"),
    
    @SerializedName("AllyJoinedWarAllyMsg")
    ALLYJOINEDWARALLYMSG("AllyJoinedWarAllyMsg"),
    
    @SerializedName("AllyJoinedWarDefenderMsg")
    ALLYJOINEDWARDEFENDERMSG("AllyJoinedWarDefenderMsg"),
    
    @SerializedName("BattlePunishFriendlyFire")
    BATTLEPUNISHFRIENDLYFIRE("BattlePunishFriendlyFire"),
    
    @SerializedName("BillOutOfMoneyMsg")
    BILLOUTOFMONEYMSG("BillOutOfMoneyMsg"),
    
    @SerializedName("BillPaidCorpAllMsg")
    BILLPAIDCORPALLMSG("BillPaidCorpAllMsg"),
    
    @SerializedName("BountyClaimMsg")
    BOUNTYCLAIMMSG("BountyClaimMsg"),
    
    @SerializedName("BountyESSShared")
    BOUNTYESSSHARED("BountyESSShared"),
    
    @SerializedName("BountyESSTaken")
    BOUNTYESSTAKEN("BountyESSTaken"),
    
    @SerializedName("BountyPlacedAlliance")
    BOUNTYPLACEDALLIANCE("BountyPlacedAlliance"),
    
    @SerializedName("BountyPlacedChar")
    BOUNTYPLACEDCHAR("BountyPlacedChar"),
    
    @SerializedName("BountyPlacedCorp")
    BOUNTYPLACEDCORP("BountyPlacedCorp"),
    
    @SerializedName("BountyYourBountyClaimed")
    BOUNTYYOURBOUNTYCLAIMED("BountyYourBountyClaimed"),
    
    @SerializedName("BuddyConnectContactAdd")
    BUDDYCONNECTCONTACTADD("BuddyConnectContactAdd"),
    
    @SerializedName("CharAppAcceptMsg")
    CHARAPPACCEPTMSG("CharAppAcceptMsg"),
    
    @SerializedName("CharAppRejectMsg")
    CHARAPPREJECTMSG("CharAppRejectMsg"),
    
    @SerializedName("CharAppWithdrawMsg")
    CHARAPPWITHDRAWMSG("CharAppWithdrawMsg"),
    
    @SerializedName("CharLeftCorpMsg")
    CHARLEFTCORPMSG("CharLeftCorpMsg"),
    
    @SerializedName("CharMedalMsg")
    CHARMEDALMSG("CharMedalMsg"),
    
    @SerializedName("CharTerminationMsg")
    CHARTERMINATIONMSG("CharTerminationMsg"),
    
    @SerializedName("CloneActivationMsg")
    CLONEACTIVATIONMSG("CloneActivationMsg"),
    
    @SerializedName("CloneActivationMsg2")
    CLONEACTIVATIONMSG2("CloneActivationMsg2"),
    
    @SerializedName("CloneMovedMsg")
    CLONEMOVEDMSG("CloneMovedMsg"),
    
    @SerializedName("CloneRevokedMsg1")
    CLONEREVOKEDMSG1("CloneRevokedMsg1"),
    
    @SerializedName("CloneRevokedMsg2")
    CLONEREVOKEDMSG2("CloneRevokedMsg2"),
    
    @SerializedName("ContactAdd")
    CONTACTADD("ContactAdd"),
    
    @SerializedName("ContactEdit")
    CONTACTEDIT("ContactEdit"),
    
    @SerializedName("ContainerPasswordMsg")
    CONTAINERPASSWORDMSG("ContainerPasswordMsg"),
    
    @SerializedName("CorpAllBillMsg")
    CORPALLBILLMSG("CorpAllBillMsg"),
    
    @SerializedName("CorpAppAcceptMsg")
    CORPAPPACCEPTMSG("CorpAppAcceptMsg"),
    
    @SerializedName("CorpAppInvitedMsg")
    CORPAPPINVITEDMSG("CorpAppInvitedMsg"),
    
    @SerializedName("CorpAppNewMsg")
    CORPAPPNEWMSG("CorpAppNewMsg"),
    
    @SerializedName("CorpAppRejectCustomMsg")
    CORPAPPREJECTCUSTOMMSG("CorpAppRejectCustomMsg"),
    
    @SerializedName("CorpAppRejectMsg")
    CORPAPPREJECTMSG("CorpAppRejectMsg"),
    
    @SerializedName("CorpDividendMsg")
    CORPDIVIDENDMSG("CorpDividendMsg"),
    
    @SerializedName("CorpFriendlyFireDisableTimerCompleted")
    CORPFRIENDLYFIREDISABLETIMERCOMPLETED("CorpFriendlyFireDisableTimerCompleted"),
    
    @SerializedName("CorpFriendlyFireDisableTimerStarted")
    CORPFRIENDLYFIREDISABLETIMERSTARTED("CorpFriendlyFireDisableTimerStarted"),
    
    @SerializedName("CorpFriendlyFireEnableTimerCompleted")
    CORPFRIENDLYFIREENABLETIMERCOMPLETED("CorpFriendlyFireEnableTimerCompleted"),
    
    @SerializedName("CorpFriendlyFireEnableTimerStarted")
    CORPFRIENDLYFIREENABLETIMERSTARTED("CorpFriendlyFireEnableTimerStarted"),
    
    @SerializedName("CorpKicked")
    CORPKICKED("CorpKicked"),
    
    @SerializedName("CorpLiquidationMsg")
    CORPLIQUIDATIONMSG("CorpLiquidationMsg"),
    
    @SerializedName("CorpNewCEOMsg")
    CORPNEWCEOMSG("CorpNewCEOMsg"),
    
    @SerializedName("CorpNewsMsg")
    CORPNEWSMSG("CorpNewsMsg"),
    
    @SerializedName("CorpOfficeExpirationMsg")
    CORPOFFICEEXPIRATIONMSG("CorpOfficeExpirationMsg"),
    
    @SerializedName("CorpStructLostMsg")
    CORPSTRUCTLOSTMSG("CorpStructLostMsg"),
    
    @SerializedName("CorpTaxChangeMsg")
    CORPTAXCHANGEMSG("CorpTaxChangeMsg"),
    
    @SerializedName("CorpVoteCEORevokedMsg")
    CORPVOTECEOREVOKEDMSG("CorpVoteCEORevokedMsg"),
    
    @SerializedName("CorpVoteMsg")
    CORPVOTEMSG("CorpVoteMsg"),
    
    @SerializedName("CorpWarDeclaredMsg")
    CORPWARDECLAREDMSG("CorpWarDeclaredMsg"),
    
    @SerializedName("CorpWarFightingLegalMsg")
    CORPWARFIGHTINGLEGALMSG("CorpWarFightingLegalMsg"),
    
    @SerializedName("CorpWarInvalidatedMsg")
    CORPWARINVALIDATEDMSG("CorpWarInvalidatedMsg"),
    
    @SerializedName("CorpWarRetractedMsg")
    CORPWARRETRACTEDMSG("CorpWarRetractedMsg"),
    
    @SerializedName("CorpWarSurrenderMsg")
    CORPWARSURRENDERMSG("CorpWarSurrenderMsg"),
    
    @SerializedName("CustomsMsg")
    CUSTOMSMSG("CustomsMsg"),
    
    @SerializedName("DeclareWar")
    DECLAREWAR("DeclareWar"),
    
    @SerializedName("DistrictAttacked")
    DISTRICTATTACKED("DistrictAttacked"),
    
    @SerializedName("DustAppAcceptedMsg")
    DUSTAPPACCEPTEDMSG("DustAppAcceptedMsg"),
    
    @SerializedName("EntosisCaptureStarted")
    ENTOSISCAPTURESTARTED("EntosisCaptureStarted"),
    
    @SerializedName("FWAllianceKickMsg")
    FWALLIANCEKICKMSG("FWAllianceKickMsg"),
    
    @SerializedName("FWAllianceWarningMsg")
    FWALLIANCEWARNINGMSG("FWAllianceWarningMsg"),
    
    @SerializedName("FWCharKickMsg")
    FWCHARKICKMSG("FWCharKickMsg"),
    
    @SerializedName("FWCharRankGainMsg")
    FWCHARRANKGAINMSG("FWCharRankGainMsg"),
    
    @SerializedName("FWCharRankLossMsg")
    FWCHARRANKLOSSMSG("FWCharRankLossMsg"),
    
    @SerializedName("FWCharWarningMsg")
    FWCHARWARNINGMSG("FWCharWarningMsg"),
    
    @SerializedName("FWCorpJoinMsg")
    FWCORPJOINMSG("FWCorpJoinMsg"),
    
    @SerializedName("FWCorpKickMsg")
    FWCORPKICKMSG("FWCorpKickMsg"),
    
    @SerializedName("FWCorpLeaveMsg")
    FWCORPLEAVEMSG("FWCorpLeaveMsg"),
    
    @SerializedName("FWCorpWarningMsg")
    FWCORPWARNINGMSG("FWCorpWarningMsg"),
    
    @SerializedName("FacWarCorpJoinRequestMsg")
    FACWARCORPJOINREQUESTMSG("FacWarCorpJoinRequestMsg"),
    
    @SerializedName("FacWarCorpJoinWithdrawMsg")
    FACWARCORPJOINWITHDRAWMSG("FacWarCorpJoinWithdrawMsg"),
    
    @SerializedName("FacWarCorpLeaveRequestMsg")
    FACWARCORPLEAVEREQUESTMSG("FacWarCorpLeaveRequestMsg"),
    
    @SerializedName("FacWarCorpLeaveWithdrawMsg")
    FACWARCORPLEAVEWITHDRAWMSG("FacWarCorpLeaveWithdrawMsg"),
    
    @SerializedName("FacWarLPDisqualifiedEvent")
    FACWARLPDISQUALIFIEDEVENT("FacWarLPDisqualifiedEvent"),
    
    @SerializedName("FacWarLPDisqualifiedKill")
    FACWARLPDISQUALIFIEDKILL("FacWarLPDisqualifiedKill"),
    
    @SerializedName("FacWarLPPayoutEvent")
    FACWARLPPAYOUTEVENT("FacWarLPPayoutEvent"),
    
    @SerializedName("FacWarLPPayoutKill")
    FACWARLPPAYOUTKILL("FacWarLPPayoutKill"),
    
    @SerializedName("GameTimeAdded")
    GAMETIMEADDED("GameTimeAdded"),
    
    @SerializedName("GameTimeReceived")
    GAMETIMERECEIVED("GameTimeReceived"),
    
    @SerializedName("GameTimeSent")
    GAMETIMESENT("GameTimeSent"),
    
    @SerializedName("GiftReceived")
    GIFTRECEIVED("GiftReceived"),
    
    @SerializedName("IHubDestroyedByBillFailure")
    IHUBDESTROYEDBYBILLFAILURE("IHubDestroyedByBillFailure"),
    
    @SerializedName("IncursionCompletedMsg")
    INCURSIONCOMPLETEDMSG("IncursionCompletedMsg"),
    
    @SerializedName("IndustryTeamAuctionLost")
    INDUSTRYTEAMAUCTIONLOST("IndustryTeamAuctionLost"),
    
    @SerializedName("IndustryTeamAuctionWon")
    INDUSTRYTEAMAUCTIONWON("IndustryTeamAuctionWon"),
    
    @SerializedName("InfrastructureHubBillAboutToExpire")
    INFRASTRUCTUREHUBBILLABOUTTOEXPIRE("InfrastructureHubBillAboutToExpire"),
    
    @SerializedName("InsuranceExpirationMsg")
    INSURANCEEXPIRATIONMSG("InsuranceExpirationMsg"),
    
    @SerializedName("InsuranceFirstShipMsg")
    INSURANCEFIRSTSHIPMSG("InsuranceFirstShipMsg"),
    
    @SerializedName("InsuranceInvalidatedMsg")
    INSURANCEINVALIDATEDMSG("InsuranceInvalidatedMsg"),
    
    @SerializedName("InsuranceIssuedMsg")
    INSURANCEISSUEDMSG("InsuranceIssuedMsg"),
    
    @SerializedName("InsurancePayoutMsg")
    INSURANCEPAYOUTMSG("InsurancePayoutMsg"),
    
    @SerializedName("JumpCloneDeletedMsg1")
    JUMPCLONEDELETEDMSG1("JumpCloneDeletedMsg1"),
    
    @SerializedName("JumpCloneDeletedMsg2")
    JUMPCLONEDELETEDMSG2("JumpCloneDeletedMsg2"),
    
    @SerializedName("KillReportFinalBlow")
    KILLREPORTFINALBLOW("KillReportFinalBlow"),
    
    @SerializedName("KillReportVictim")
    KILLREPORTVICTIM("KillReportVictim"),
    
    @SerializedName("KillRightAvailable")
    KILLRIGHTAVAILABLE("KillRightAvailable"),
    
    @SerializedName("KillRightAvailableOpen")
    KILLRIGHTAVAILABLEOPEN("KillRightAvailableOpen"),
    
    @SerializedName("KillRightEarned")
    KILLRIGHTEARNED("KillRightEarned"),
    
    @SerializedName("KillRightUnavailable")
    KILLRIGHTUNAVAILABLE("KillRightUnavailable"),
    
    @SerializedName("KillRightUnavailableOpen")
    KILLRIGHTUNAVAILABLEOPEN("KillRightUnavailableOpen"),
    
    @SerializedName("KillRightUsed")
    KILLRIGHTUSED("KillRightUsed"),
    
    @SerializedName("LocateCharMsg")
    LOCATECHARMSG("LocateCharMsg"),
    
    @SerializedName("MadeWarMutual")
    MADEWARMUTUAL("MadeWarMutual"),
    
    @SerializedName("MercOfferedNegotiationMsg")
    MERCOFFEREDNEGOTIATIONMSG("MercOfferedNegotiationMsg"),
    
    @SerializedName("MissionOfferExpirationMsg")
    MISSIONOFFEREXPIRATIONMSG("MissionOfferExpirationMsg"),
    
    @SerializedName("MissionTimeoutMsg")
    MISSIONTIMEOUTMSG("MissionTimeoutMsg"),
    
    @SerializedName("MoonminingAutomaticFracture")
    MOONMININGAUTOMATICFRACTURE("MoonminingAutomaticFracture"),
    
    @SerializedName("MoonminingExtractionCancelled")
    MOONMININGEXTRACTIONCANCELLED("MoonminingExtractionCancelled"),
    
    @SerializedName("MoonminingExtractionFinished")
    MOONMININGEXTRACTIONFINISHED("MoonminingExtractionFinished"),
    
    @SerializedName("MoonminingLaserFired")
    MOONMININGLASERFIRED("MoonminingLaserFired"),
    
    @SerializedName("NPCStandingsGained")
    NPCSTANDINGSGAINED("NPCStandingsGained"),
    
    @SerializedName("NPCStandingsLost")
    NPCSTANDINGSLOST("NPCStandingsLost"),
    
    @SerializedName("OfferedSurrender")
    OFFEREDSURRENDER("OfferedSurrender"),
    
    @SerializedName("OfferedToAlly")
    OFFEREDTOALLY("OfferedToAlly"),
    
    @SerializedName("OldLscMessages")
    OLDLSCMESSAGES("OldLscMessages"),
    
    @SerializedName("OperationFinished")
    OPERATIONFINISHED("OperationFinished"),
    
    @SerializedName("OrbitalAttacked")
    ORBITALATTACKED("OrbitalAttacked"),
    
    @SerializedName("OrbitalReinforced")
    ORBITALREINFORCED("OrbitalReinforced"),
    
    @SerializedName("OwnershipTransferred")
    OWNERSHIPTRANSFERRED("OwnershipTransferred"),
    
    @SerializedName("ReimbursementMsg")
    REIMBURSEMENTMSG("ReimbursementMsg"),
    
    @SerializedName("ResearchMissionAvailableMsg")
    RESEARCHMISSIONAVAILABLEMSG("ResearchMissionAvailableMsg"),
    
    @SerializedName("RetractsWar")
    RETRACTSWAR("RetractsWar"),
    
    @SerializedName("SeasonalChallengeCompleted")
    SEASONALCHALLENGECOMPLETED("SeasonalChallengeCompleted"),
    
    @SerializedName("SovAllClaimAquiredMsg")
    SOVALLCLAIMAQUIREDMSG("SovAllClaimAquiredMsg"),
    
    @SerializedName("SovAllClaimLostMsg")
    SOVALLCLAIMLOSTMSG("SovAllClaimLostMsg"),
    
    @SerializedName("SovCommandNodeEventStarted")
    SOVCOMMANDNODEEVENTSTARTED("SovCommandNodeEventStarted"),
    
    @SerializedName("SovCorpBillLateMsg")
    SOVCORPBILLLATEMSG("SovCorpBillLateMsg"),
    
    @SerializedName("SovCorpClaimFailMsg")
    SOVCORPCLAIMFAILMSG("SovCorpClaimFailMsg"),
    
    @SerializedName("SovDisruptorMsg")
    SOVDISRUPTORMSG("SovDisruptorMsg"),
    
    @SerializedName("SovStationEnteredFreeport")
    SOVSTATIONENTEREDFREEPORT("SovStationEnteredFreeport"),
    
    @SerializedName("SovStructureDestroyed")
    SOVSTRUCTUREDESTROYED("SovStructureDestroyed"),
    
    @SerializedName("SovStructureReinforced")
    SOVSTRUCTUREREINFORCED("SovStructureReinforced"),
    
    @SerializedName("SovStructureSelfDestructCancel")
    SOVSTRUCTURESELFDESTRUCTCANCEL("SovStructureSelfDestructCancel"),
    
    @SerializedName("SovStructureSelfDestructFinished")
    SOVSTRUCTURESELFDESTRUCTFINISHED("SovStructureSelfDestructFinished"),
    
    @SerializedName("SovStructureSelfDestructRequested")
    SOVSTRUCTURESELFDESTRUCTREQUESTED("SovStructureSelfDestructRequested"),
    
    @SerializedName("SovereigntyIHDamageMsg")
    SOVEREIGNTYIHDAMAGEMSG("SovereigntyIHDamageMsg"),
    
    @SerializedName("SovereigntySBUDamageMsg")
    SOVEREIGNTYSBUDAMAGEMSG("SovereigntySBUDamageMsg"),
    
    @SerializedName("SovereigntyTCUDamageMsg")
    SOVEREIGNTYTCUDAMAGEMSG("SovereigntyTCUDamageMsg"),
    
    @SerializedName("StationAggressionMsg1")
    STATIONAGGRESSIONMSG1("StationAggressionMsg1"),
    
    @SerializedName("StationAggressionMsg2")
    STATIONAGGRESSIONMSG2("StationAggressionMsg2"),
    
    @SerializedName("StationConquerMsg")
    STATIONCONQUERMSG("StationConquerMsg"),
    
    @SerializedName("StationServiceDisabled")
    STATIONSERVICEDISABLED("StationServiceDisabled"),
    
    @SerializedName("StationServiceEnabled")
    STATIONSERVICEENABLED("StationServiceEnabled"),
    
    @SerializedName("StationStateChangeMsg")
    STATIONSTATECHANGEMSG("StationStateChangeMsg"),
    
    @SerializedName("StoryLineMissionAvailableMsg")
    STORYLINEMISSIONAVAILABLEMSG("StoryLineMissionAvailableMsg"),
    
    @SerializedName("StructureAnchoring")
    STRUCTUREANCHORING("StructureAnchoring"),
    
    @SerializedName("StructureCourierContractChanged")
    STRUCTURECOURIERCONTRACTCHANGED("StructureCourierContractChanged"),
    
    @SerializedName("StructureDestroyed")
    STRUCTUREDESTROYED("StructureDestroyed"),
    
    @SerializedName("StructureFuelAlert")
    STRUCTUREFUELALERT("StructureFuelAlert"),
    
    @SerializedName("StructureItemsDelivered")
    STRUCTUREITEMSDELIVERED("StructureItemsDelivered"),
    
    @SerializedName("StructureLostArmor")
    STRUCTURELOSTARMOR("StructureLostArmor"),
    
    @SerializedName("StructureLostShields")
    STRUCTURELOSTSHIELDS("StructureLostShields"),
    
    @SerializedName("StructureOnline")
    STRUCTUREONLINE("StructureOnline"),
    
    @SerializedName("StructureServicesOffline")
    STRUCTURESERVICESOFFLINE("StructureServicesOffline"),
    
    @SerializedName("StructureUnanchoring")
    STRUCTUREUNANCHORING("StructureUnanchoring"),
    
    @SerializedName("StructureUnderAttack")
    STRUCTUREUNDERATTACK("StructureUnderAttack"),
    
    @SerializedName("TowerAlertMsg")
    TOWERALERTMSG("TowerAlertMsg"),
    
    @SerializedName("TowerResourceAlertMsg")
    TOWERRESOURCEALERTMSG("TowerResourceAlertMsg"),
    
    @SerializedName("TransactionReversalMsg")
    TRANSACTIONREVERSALMSG("TransactionReversalMsg"),
    
    @SerializedName("TutorialMsg")
    TUTORIALMSG("TutorialMsg"),
    
    @SerializedName("WarAllyOfferDeclinedMsg")
    WARALLYOFFERDECLINEDMSG("WarAllyOfferDeclinedMsg"),
    
    @SerializedName("WarSurrenderDeclinedMsg")
    WARSURRENDERDECLINEDMSG("WarSurrenderDeclinedMsg"),
    
    @SerializedName("WarSurrenderOfferMsg")
    WARSURRENDEROFFERMSG("WarSurrenderOfferMsg"),
    
    @SerializedName("notificationTypeMoonminingExtractionStarted")
    NOTIFICATIONTYPEMOONMININGEXTRACTIONSTARTED("notificationTypeMoonminingExtractionStarted");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("sender_id")
  private Integer senderId = null;

  /**
   * sender_type string
   */
  public enum SenderTypeEnum {
    @SerializedName("character")
    CHARACTER("character"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("alliance")
    ALLIANCE("alliance"),
    
    @SerializedName("faction")
    FACTION("faction"),
    
    @SerializedName("other")
    OTHER("other");

    private String value;

    SenderTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("sender_type")
  private SenderTypeEnum senderType = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("is_read")
  private Boolean isRead = null;

  @SerializedName("text")
  private String text = null;

  public GetCharactersCharacterIdNotifications200Ok notificationId(Long notificationId) {
    this.notificationId = notificationId;
    return this;
  }

   /**
   * notification_id integer
   * @return notificationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "notification_id integer")
  public Long getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(Long notificationId) {
    this.notificationId = notificationId;
  }

  public GetCharactersCharacterIdNotifications200Ok type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * type string
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "type string")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GetCharactersCharacterIdNotifications200Ok senderId(Integer senderId) {
    this.senderId = senderId;
    return this;
  }

   /**
   * sender_id integer
   * @return senderId
  **/
  @ApiModelProperty(example = "null", required = true, value = "sender_id integer")
  public Integer getSenderId() {
    return senderId;
  }

  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }

  public GetCharactersCharacterIdNotifications200Ok senderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
    return this;
  }

   /**
   * sender_type string
   * @return senderType
  **/
  @ApiModelProperty(example = "null", required = true, value = "sender_type string")
  public SenderTypeEnum getSenderType() {
    return senderType;
  }

  public void setSenderType(SenderTypeEnum senderType) {
    this.senderType = senderType;
  }

  public GetCharactersCharacterIdNotifications200Ok timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * timestamp string
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", required = true, value = "timestamp string")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public GetCharactersCharacterIdNotifications200Ok isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * is_read boolean
   * @return isRead
  **/
  @ApiModelProperty(example = "null", value = "is_read boolean")
  public Boolean getIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public GetCharactersCharacterIdNotifications200Ok text(String text) {
    this.text = text;
    return this;
  }

   /**
   * text string
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "text string")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdNotifications200Ok getCharactersCharacterIdNotifications200Ok = (GetCharactersCharacterIdNotifications200Ok) o;
    return Objects.equals(this.notificationId, getCharactersCharacterIdNotifications200Ok.notificationId) &&
        Objects.equals(this.type, getCharactersCharacterIdNotifications200Ok.type) &&
        Objects.equals(this.senderId, getCharactersCharacterIdNotifications200Ok.senderId) &&
        Objects.equals(this.senderType, getCharactersCharacterIdNotifications200Ok.senderType) &&
        Objects.equals(this.timestamp, getCharactersCharacterIdNotifications200Ok.timestamp) &&
        Objects.equals(this.isRead, getCharactersCharacterIdNotifications200Ok.isRead) &&
        Objects.equals(this.text, getCharactersCharacterIdNotifications200Ok.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationId, type, senderId, senderType, timestamp, isRead, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdNotifications200Ok {\n");
    
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

