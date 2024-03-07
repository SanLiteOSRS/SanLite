import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class327 {
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = -1780120473
	)
	public static int field825;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	static final class234 field827;
	@ObfuscatedName("wm")
	static int[] field747;
	@ObfuscatedName("wu")
	static int[] field833;
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final ApproximateRouteStrategy field801;
	@ObfuscatedName("wz")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wg")
	@ObfuscatedGetter(
		intValue = -923638989
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ws")
	@ObfuscatedGetter(
		intValue = 1276913145
	)
	static int field786;
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static class494 field818;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	static class442 field821;
	@ObfuscatedName("wy")
	static List field826;
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("wi")
	@ObfuscatedGetter(
		intValue = -1986284989
	)
	static int field824;
	@ObfuscatedName("bl")
	static boolean field713;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1315283989
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1346977341
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 838367065
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cn")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cz")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1393191435
	)
	static int field688;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -939822325
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1600774139
	)
	static int field528;
	@ObfuscatedName("ce")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -746408051
	)
	static int field530;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 277927783
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("do")
	static boolean field532;
	@ObfuscatedName("dv")
	static boolean field718;
	@ObfuscatedName("dw")
	static boolean field610;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1387447217
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		longValue = 7443342472488198759L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -314425721
	)
	static int field557;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1843973795
	)
	static int field697;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		longValue = 7145015646080244557L
	)
	static long field539;
	@ObfuscatedName("dh")
	static boolean field567;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 920673195
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1145494839
	)
	static int field542;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1249095621
	)
	static int field543;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 752637337
	)
	static int field536;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1036795159
	)
	static int field545;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -824878655
	)
	static int field546;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1904963820
	)
	static int field547;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1673849920
	)
	static int field548;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -176247613
	)
	static int field549;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ej")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static class93 field553;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 645407575
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 207834183
	)
	static int field555;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field556;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -1320612361
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static class67 field558;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 1231060837
	)
	static int field559;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = 199695521
	)
	static int field560;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 60100643
	)
	static int field561;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static class125 field573;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static class538 field563;
	@ObfuscatedName("gq")
	static final String field708;
	@ObfuscatedName("gz")
	static final String field719;
	@ObfuscatedName("ht")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	static SecureRandomFuture field579;
	@ObfuscatedName("hr")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 342022333
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hi")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = 110348205
	)
	static int field634;
	@ObfuscatedName("he")
	static int[] field588;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -1385349531
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("if")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("iv")
	static HashMap field743;
	@ObfuscatedName("it")
	static String field822;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = -1965610875
	)
	static int field594;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -424954165
	)
	static int field666;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1221342267
	)
	static int field621;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = 1671990469
	)
	static int field597;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -1949134805
	)
	static int field598;
	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "[Liz;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jr")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jv")
	static int[][][] field830;
	@ObfuscatedName("jw")
	static final int[] field602;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -131614477
	)
	static int field831;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1262421433
	)
	static int field604;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -827451549
	)
	static int field605;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -29210233
	)
	static int field609;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -418333105
	)
	static int field618;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -144548927
	)
	static int field667;
	@ObfuscatedName("kv")
	static boolean field717;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 1543442017
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 1411178027
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -2009099817
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1963375923
	)
	static int field819;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -1937402279
	)
	static int field632;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -1458723051
	)
	static int field615;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -1360376197
	)
	static int field616;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -1759317199
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -139063713
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -404585469
	)
	static int field619;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -750348187
	)
	static int field620;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -1884928305
	)
	static int field577;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -1504521897
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 614929157
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 48430203
	)
	static int field624;
	@ObfuscatedName("lp")
	static boolean field625;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -118368819
	)
	static int field626;
	@ObfuscatedName("lm")
	static boolean field544;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -1610481647
	)
	static int field795;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -69188651
	)
	static int field629;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1655907717
	)
	static int field630;
	@ObfuscatedName("lc")
	static int[] field631;
	@ObfuscatedName("la")
	static int[] field796;
	@ObfuscatedName("lj")
	static int[] field633;
	@ObfuscatedName("lg")
	static int[] field562;
	@ObfuscatedName("ln")
	static int[] field635;
	@ObfuscatedName("lx")
	static int[] field636;
	@ObfuscatedName("lw")
	static int[][] field637;
	@ObfuscatedName("ls")
	static int[] field638;
	@ObfuscatedName("lh")
	static String[] field769;
	@ObfuscatedName("ll")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 1980196113
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -1052478027
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 954664791
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -1259386215
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1371404823
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 711945476
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 1692235865
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("lq")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1928953845
	)
	static int field649;
	@ObfuscatedName("mf")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "[Ldj;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = -435095249
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 1683137435
	)
	static int field653;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		longValue = -9027930301327693909L
	)
	static long field654;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		longValue = 6505267217668183629L
	)
	static long field601;
	@ObfuscatedName("ms")
	static boolean field656;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -247587981
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -1554492337
	)
	static int field658;
	@ObfuscatedName("mu")
	static int[] field659;
	@ObfuscatedName("mv")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("my")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("me")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ma")
	static int[] field663;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -1565872725
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "[[[Lpr;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nv")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nb")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nj")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nm")
	static int[] field672;
	@ObfuscatedName("nn")
	static boolean field673;
	@ObfuscatedName("nt")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 554102269
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nh")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ne")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ny")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("nz")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("nk")
	static int[] field680;
	@ObfuscatedName("nr")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("na")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("nl")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("nu")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ni")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oy")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -817466127
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 1637161577
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 1786363607
	)
	static int field689;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -1975817115
	)
	static int field690;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 863565673
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("or")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -1682230505
	)
	static int field538;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 2055926567
	)
	static int field695;
	@ObfuscatedName("ov")
	static String field696;
	@ObfuscatedName("oc")
	static String field574;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1089260507
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -1321564409
	)
	static int field575;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -1798703301
	)
	static int field701;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 2112194593
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 508408261
	)
	static int field704;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -234307999
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 875247969
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -1975274671
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pd")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -1521770609
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = -172024139
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ps")
	static boolean field746;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 1235435531
	)
	static int field765;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 339351437
	)
	static int field774;
	@ObfuscatedName("pk")
	static boolean field810;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 1781113487
	)
	static int field640;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1495844795
	)
	static int field720;
	@ObfuscatedName("pi")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1113748411
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qi")
	static int[] field702;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 1927371475
	)
	static int field823;
	@ObfuscatedName("ql")
	static int[] field646;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = 1664141073
	)
	static int field608;
	@ObfuscatedName("qm")
	static int[] field727;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 2143852043
	)
	static int field782;
	@ObfuscatedName("qa")
	static int[] field729;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -711374491
	)
	static int field730;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 1063359219
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 23977357
	)
	static int field732;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1387904953
	)
	static int field733;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -487550257
	)
	static int field734;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -1914605043
	)
	static int field735;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 450315751
	)
	static int field736;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 380956697
	)
	static int field537;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 1857230521
	)
	static int field738;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 1458631819
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static class551 field740;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	static NodeDeque field802;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	static NodeDeque field533;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	static NodeDeque field744;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = 1153475991
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = 1299529609
	)
	static int field832;
	@ObfuscatedName("rt")
	static boolean[] field816;
	@ObfuscatedName("rd")
	static boolean[] field721;
	@ObfuscatedName("rk")
	static boolean[] field570;
	@ObfuscatedName("rj")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ra")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rg")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("re")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = 371879277
	)
	static int field755;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		longValue = -8272478942833346001L
	)
	static long field756;
	@ObfuscatedName("rm")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("rp")
	static int[] field758;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -2030879835
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 459206771
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rx")
	static String field643;
	@ObfuscatedName("sr")
	static long[] field762;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -1511129525
	)
	static int field763;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static class228 field792;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static class226 field737;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 497751849
	)
	static int field706;
	@ObfuscatedName("sn")
	static int[] field660;
	@ObfuscatedName("sy")
	static int[] field768;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		longValue = 1284094464533904175L
	)
	static long field583;
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "[Lgt;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "[Lgg;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = -1658833547
	)
	static int field772;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 1124792061
	)
	static int field773;
	@ObfuscatedName("sm")
	static int[] field552;
	@ObfuscatedName("sb")
	static int[] field775;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	static SpritePixels[] field776;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 1335999021
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		intValue = -1472174375
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 997632745
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tp")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -1927631551
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tj")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ta")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tl")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("ty")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ti")
	static int[] field554;
	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "[Lbn;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("tw")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("td")
	static boolean field789;
	@ObfuscatedName("to")
	static boolean field790;
	@ObfuscatedName("uw")
	static boolean field614;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	static class498 field813;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	static class497 field793;
	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	static class497 field794;
	@ObfuscatedName("uu")
	static boolean field728;
	@ObfuscatedName("up")
	static boolean[] field797;
	@ObfuscatedName("ul")
	static int[] field798;
	@ObfuscatedName("ug")
	static int[] field799;
	@ObfuscatedName("uj")
	static int[] field800;
	@ObfuscatedName("ur")
	static int[] field754;
	@ObfuscatedName("uk")
	static short field724;
	@ObfuscatedName("uv")
	static short field803;
	@ObfuscatedName("ua")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("uy")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vg")
	static short field806;
	@ObfuscatedName("vd")
	static short field807;
	@ObfuscatedName("vp")
	static short field722;
	@ObfuscatedName("ve")
	static short field809;
	@ObfuscatedName("vk")
	@ObfuscatedGetter(
		intValue = -582890335
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = -368886745
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = -1305150611
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = 1835053825
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = -1562005381
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = 1008357811
	)
	static int field593;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 31127813
	)
	static int field716;
	@ObfuscatedName("ge")
	String field564;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class14 field565;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	class18 field522;
	@ObfuscatedName("gl")
	OtlTokenRequester field764;
	@ObfuscatedName("go")
	Future field568;
	@ObfuscatedName("gy")
	boolean field617;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1065100237
	)
	int field699;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	class18 field808;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field572;
	@ObfuscatedName("gs")
	Future field541;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field580;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	class7 field581;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		longValue = 7462993987836899009L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field713 = true; // L: 167
		worldId = 1; // L: 168
		worldProperties = 0; // L: 169
		gameBuild = 0; // L: 171
		isMembersWorld = false; // L: 174
		isLowDetail = false; // L: 175
		field688 = -1; // L: 180
		clientType = -1; // L: 181
		field528 = -1; // L: 182
		onMobile = false; // L: 183
		field530 = 220; // L: 184
		gameState = 0; // L: 196
		field532 = false; // L: 197
		field718 = false; // L: 198
		field610 = true; // L: 201
		cycle = 0; // L: 202
		mouseLastLastPressedTimeMillis = -1L; // L: 203
		field557 = -1; // L: 205
		field697 = -1; // L: 206
		field539 = -1L; // L: 207
		field567 = true; // L: 208
		rebootTimer = 0; // L: 209
		field542 = 0; // L: 210
		field543 = 0; // L: 211
		field536 = 0; // L: 212
		field545 = 0; // L: 213
		field546 = 0; // L: 214
		field547 = 0; // L: 215
		field548 = 0; // L: 216
		field549 = 0; // L: 217
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 219
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 220
		renderSelf = false; // L: 222
		field553 = class93.field1165; // L: 231
		js5ConnectState = 0; // L: 234
		field555 = 0; // L: 235
		js5Errors = 0; // L: 259
		field559 = 0; // L: 263
		field560 = 0; // L: 264
		field561 = 0; // L: 265
		field573 = class125.field1498; // L: 266
		field563 = class538.field5255; // L: 267
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 295
		byte[] var2 = new byte[var1]; // L: 296

		int var3;
		char var4;
		for (var3 = 0; var3 < var1; ++var3) { // L: 297
			var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 298
			if (var4 > 127) { // L: 299
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 300
			}
		}

		field708 = class371.method7022(var2); // L: 304
		var1 = "com_jagex_auth_desktop_runelite:public".length(); // L: 312
		var2 = new byte[var1]; // L: 313

		for (var3 = 0; var3 < var1; ++var3) { // L: 314
			var4 = "com_jagex_auth_desktop_runelite:public".charAt(var3); // L: 315
			if (var4 > 127) { // L: 316
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 317
			}
		}

		field719 = class371.method7022(var2); // L: 321
		Login_isUsernameRemembered = false; // L: 337
		field579 = new SecureRandomFuture(); // L: 338
		randomDatData = null; // L: 344
		npcs = new NPC[65536]; // L: 348
		npcCount = 0; // L: 349
		npcIndices = new int[65536]; // L: 350
		field634 = 0; // L: 351
		field588 = new int[250]; // L: 352
		packetWriter = new PacketWriter(); // L: 355
		logoutTimer = 0; // L: 357
		hadNetworkError = false; // L: 358
		timer = new Timer(); // L: 359
		field743 = new HashMap(); // L: 365
		field594 = 0; // L: 372
		field666 = 1; // L: 373
		field621 = 0; // L: 374
		field597 = 1; // L: 375
		field598 = 0; // L: 376
		collisionMaps = new CollisionMap[4]; // L: 384
		isInInstance = false; // L: 385
		field830 = new int[4][13][13]; // L: 386
		field602 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 387
		field831 = -1; // L: 390
		field604 = 0; // L: 391
		field605 = 2301979; // L: 403
		field609 = 5063219; // L: 404
		field618 = 3353893; // L: 405
		field667 = 7759444; // L: 406
		field717 = false; // L: 407
		alternativeScrollbarWidth = 0; // L: 408
		camAngleX = 128; // L: 416
		camAngleY = 0; // L: 417
		field819 = 0; // L: 418
		field632 = 0; // L: 419
		field615 = 0; // L: 420
		field616 = 0; // L: 421
		oculusOrbState = 0; // L: 422
		camFollowHeight = 50; // L: 423
		field619 = 0; // L: 427
		field620 = 0; // L: 428
		field577 = 0; // L: 429
		oculusOrbNormalSpeed = 12; // L: 431
		oculusOrbSlowedSpeed = 6; // L: 432
		field624 = 0; // L: 433
		field625 = false; // L: 434
		field626 = 0; // L: 435
		field544 = false; // L: 436
		field795 = 0; // L: 437
		field629 = 0; // L: 438
		field630 = 50; // L: 439
		field631 = new int[field630]; // L: 440
		field796 = new int[field630]; // L: 441
		field633 = new int[field630]; // L: 442
		field562 = new int[field630]; // L: 443
		field635 = new int[field630]; // L: 444
		field636 = new int[field630]; // L: 445
		field637 = new int[field630][]; // L: 446
		field638 = new int[field630]; // L: 447
		field769 = new String[field630]; // L: 448
		tileLastDrawnActor = new int[104][104]; // L: 449
		viewportDrawCount = 0; // L: 450
		viewportTempX = -1; // L: 451
		viewportTempY = -1; // L: 452
		mouseCrossX = 0; // L: 453
		mouseCrossY = 0; // L: 454
		mouseCrossState = 0; // L: 455
		mouseCrossColor = 0; // L: 456
		showMouseCross = true; // L: 457
		field649 = 0; // L: 458
		showLoadingMessages = true; // L: 460
		players = new Player[2048]; // L: 462
		localPlayerIndex = -1; // L: 464
		field653 = 0; // L: 465
		field654 = -1L; // L: 466
		field601 = -1L; // L: 467
		field656 = true; // L: 469
		drawPlayerNames = 0; // L: 474
		field658 = 0; // L: 475
		field659 = new int[1000]; // L: 476
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 478
		playerMenuActions = new String[8]; // L: 479
		playerOptionsPriorities = new boolean[8]; // L: 480
		field663 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 481
		combatTargetPlayerIndex = -1; // L: 482
		groundItems = new NodeDeque[4][104][104]; // L: 483
		pendingSpawns = new NodeDeque(); // L: 484
		projectiles = new NodeDeque(); // L: 485
		graphicsObjects = new NodeDeque(); // L: 486
		currentLevels = new int[25]; // L: 487
		levels = new int[25]; // L: 488
		experience = new int[25]; // L: 489
		field672 = new int[25]; // L: 490
		field673 = false; // L: 491
		isMenuOpen = false; // L: 492
		menuOptionsCount = 0; // L: 498
		menuArguments1 = new int[500]; // L: 499
		menuArguments2 = new int[500]; // L: 500
		menuOpcodes = new int[500]; // L: 501
		menuIdentifiers = new int[500]; // L: 502
		field680 = new int[500]; // L: 503
		menuActions = new String[500]; // L: 504
		menuTargets = new String[500]; // L: 505
		menuShiftClick = new boolean[500]; // L: 506
		followerOpsLowPriority = false; // L: 507
		tapToDrop = false; // L: 509
		showMouseOverText = true; // L: 510
		viewportX = -1; // L: 511
		viewportY = -1; // L: 512
		field689 = 0; // L: 516
		field690 = 50; // L: 517
		isItemSelected = 0; // L: 518
		field822 = null; // L: 522
		isSpellSelected = false; // L: 523
		field538 = -1; // L: 525
		field695 = -1; // L: 526
		field696 = null; // L: 528
		field574 = null; // L: 529
		rootInterface = -1; // L: 530
		interfaceParents = new NodeHashTable(8); // L: 531
		field575 = 0; // L: 536
		field701 = -1; // L: 537
		chatEffects = 0; // L: 538
		meslayerContinueWidget = null; // L: 539
		field704 = 0; // L: 540
		weight = 0; // L: 541
		staffModLevel = 0; // L: 542
		followerIndex = -1; // L: 543
		playerMod = false; // L: 544
		viewportWidget = null; // L: 545
		clickedWidget = null; // L: 546
		clickedWidgetParent = null; // L: 547
		widgetClickX = 0; // L: 548
		widgetClickY = 0; // L: 549
		draggedOnWidget = null; // L: 550
		field746 = false; // L: 551
		field765 = -1; // L: 552
		field774 = -1; // L: 553
		field810 = false; // L: 554
		field640 = -1; // L: 555
		field720 = -1; // L: 556
		isDraggingWidget = false; // L: 557
		cycleCntr = 1; // L: 562
		field702 = new int[32]; // L: 565
		field823 = 0; // L: 566
		field646 = new int[32]; // L: 567
		field608 = 0; // L: 568
		field727 = new int[32]; // L: 569
		field782 = 0; // L: 570
		field729 = new int[32]; // L: 571
		field730 = 0; // L: 572
		chatCycle = 0; // L: 573
		field732 = 0; // L: 574
		field733 = 0; // L: 575
		field734 = 0; // L: 576
		field735 = 0; // L: 577
		field736 = 0; // L: 578
		field537 = 0; // L: 579
		field738 = 0; // L: 580
		mouseWheelRotation = 0; // L: 586
		field740 = new class551(); // L: 587
		scriptEvents = new NodeDeque(); // L: 588
		field802 = new NodeDeque(); // L: 589
		field533 = new NodeDeque(); // L: 590
		field744 = new NodeDeque(); // L: 591
		widgetFlags = new NodeHashTable(512); // L: 592
		rootWidgetCount = 0; // L: 594
		field832 = -2; // L: 595
		field816 = new boolean[100]; // L: 596
		field721 = new boolean[100]; // L: 597
		field570 = new boolean[100]; // L: 598
		rootWidgetXs = new int[100]; // L: 599
		rootWidgetYs = new int[100]; // L: 600
		rootWidgetWidths = new int[100]; // L: 601
		rootWidgetHeights = new int[100]; // L: 602
		field755 = 0; // L: 603
		field756 = 0L; // L: 604
		isResizable = true; // L: 605
		field758 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 612
		publicChatMode = 0; // L: 613
		tradeChatMode = 0; // L: 615
		field643 = ""; // L: 616
		field762 = new long[100]; // L: 618
		field763 = 0; // L: 619
		field792 = new class228(); // L: 620
		field737 = new class226(); // L: 621
		field706 = 0; // L: 623
		field660 = new int[128]; // L: 624
		field768 = new int[128]; // L: 625
		field583 = -1L; // L: 626
		currentClanSettings = new ClanSettings[4]; // L: 630
		currentClanChannels = new ClanChannel[4]; // L: 632
		field772 = -1; // L: 634
		field773 = 0; // L: 635
		field552 = new int[1000]; // L: 636
		field775 = new int[1000]; // L: 637
		field776 = new SpritePixels[1000]; // L: 638
		destinationX = 0; // L: 639
		destinationY = 0; // L: 640
		minimapState = 0; // L: 647
		playingJingle = false; // L: 648
		soundEffectCount = 0; // L: 653
		soundEffectIds = new int[50]; // L: 654
		queuedSoundEffectLoops = new int[50]; // L: 655
		queuedSoundEffectDelays = new int[50]; // L: 656
		soundLocations = new int[50]; // L: 657
		field554 = new int[50]; // L: 658
		soundEffects = new SoundEffect[50]; // L: 659
		isCameraLocked = false; // L: 661
		field789 = false; // L: 667
		field790 = false; // L: 668
		field614 = false; // L: 669
		field813 = null; // L: 675
		field793 = null; // L: 676
		field794 = null; // L: 677
		field728 = false; // L: 678
		field797 = new boolean[5]; // L: 686
		field798 = new int[5]; // L: 687
		field799 = new int[5]; // L: 688
		field800 = new int[5]; // L: 689
		field754 = new int[5]; // L: 690
		field724 = 256; // L: 691
		field803 = 205; // L: 692
		zoomHeight = 256; // L: 693
		zoomWidth = 320; // L: 694
		field806 = 1; // L: 695
		field807 = 32767; // L: 696
		field722 = 1; // L: 697
		field809 = 32767; // L: 698
		viewportOffsetX = 0; // L: 699
		viewportOffsetY = 0; // L: 700
		viewportWidth = 0; // L: 701
		viewportHeight = 0; // L: 702
		viewportZoom = 0; // L: 703
		playerAppearance = new PlayerComposition(); // L: 705
		field593 = -1; // L: 706
		field716 = -1; // L: 707
		field818 = new DesktopPlatformInfoProvider(); // L: 709
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 711
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 714
		field821 = new class442(8, class440.field4712); // L: 716
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 718
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 719
		field824 = -1; // L: 722
		field825 = -1; // L: 728
		field826 = new ArrayList(); // L: 729
		field827 = new class234(); // L: 730
		archiveLoaders = new ArrayList(10); // L: 731
		archiveLoadersDone = 0; // L: 732
		field786 = 0; // L: 733
		field801 = new ApproximateRouteStrategy(); // L: 742
		field747 = new int[50]; // L: 743
		field833 = new int[50]; // L: 744
	}

	public Client() {
		this.field617 = false; // L: 285
		this.field699 = 0; // L: 286
		this.accountHash = -1L; // L: 343
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field756 = SecureRandomCallable.method2320() + 500L; // L: 4656
		this.resizeJS(); // L: 4657
		if (rootInterface != -1) { // L: 4658
			this.resizeRoot(true);
		}

	} // L: 4659

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-946246730"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 1028
		int[] var2 = new int[]{1000, 100, 500}; // L: 1029
		if (var1 != null && var2 != null) { // L: 1031
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1; // L: 1038
			class130.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 1039
			Varcs.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 1040

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 1041
				Varcs.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 1042
				ByteArrayPool.field4646.add(var1[var3]); // L: 1043
			}

			Collections.sort(ByteArrayPool.field4646); // L: 1045
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null; // L: 1032
			class130.ByteArrayPool_altSizeArrayCounts = null; // L: 1033
			Varcs.ByteArrayPool_arrays = null; // L: 1034
			Message.method1184(); // L: 1035
		}

		WorldMapScaleHandler.field2696 = class59.method1133(worldProperties, class529.field5174); // L: 1047
		class211.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1048
		class150.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1049
		class316.currentPort = class211.worldPort; // L: 1050
		Messages.field1422 = class348.field3704; // L: 1051
		class407.field4547 = class348.field3706; // L: 1052
		PlayerComposition.field3671 = class348.field3707; // L: 1053
		class143.field1665 = class348.field3705; // L: 1054
		InvDefinition.urlRequester = new class114(this.field617, 220); // L: 1055
		this.setUpKeyboard(); // L: 1057
		this.method485(); // L: 1058
		ServerPacket.field3423 = this.mouseWheel(); // L: 1059
		this.method546(field737, 0); // L: 1060
		this.method546(field792, 1); // L: 1061
		this.setUpClipboard(); // L: 1062
		class155.field1730 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1064
		class30.clientPreferences = class167.method3498(); // L: 1065
		String var4 = class161.field1781; // L: 1067
		class31.field164 = this; // L: 1069
		if (var4 != null) { // L: 1070
			class31.field160 = var4;
		}

		FloorOverlayDefinition.setWindowedMode(class30.clientPreferences.method2553()); // L: 1072
		InterfaceParent.friendSystem = new FriendSystem(FriendLoginUpdate.loginType); // L: 1073
		this.field565 = new class14("tokenRequest", 1, 1); // L: 1074
		Skeleton.method5417(this); // L: 1075
		field827.method4570(); // L: 1076
	} // L: 1077

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "156558232"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1085
		this.doCycleJs5(); // L: 1086
		class103.method2737(); // L: 1087
		boolean var2 = false; // L: 1090
		boolean var3 = false; // L: 1091
		if (!class321.field3481.isEmpty()) { // L: 1092
			class425 var4 = (class425)class321.field3481.get(0); // L: 1093
			if (var4 == null) { // L: 1094
				class321.field3481.remove(0); // L: 1095
			} else if (var4.vmethod8043()) { // L: 1097
				if (var4.method8013()) { // L: 1098
					System.out.println("Error in midimanager.service: " + var4.method8015()); // L: 1099
					var2 = true; // L: 1100
				} else {
					if (var4.method8016() != null) { // L: 1103
						class321.field3481.add(1, var4.method8016()); // L: 1104
					}

					var3 = var4.method8038(); // L: 1106
				}

				class321.field3481.remove(0); // L: 1108
			} else {
				var3 = var4.method8038(); // L: 1111
			}
		}

		if (var2) { // L: 1114
			class321.field3481.clear(); // L: 1115
			Iterator var13 = class321.field3474.iterator(); // L: 1117

			label122:
			while (true) {
				class333 var5;
				do {
					if (!var13.hasNext()) {
						class321.field3474.clear(); // L: 1139
						break label122;
					}

					var5 = (class333)var13.next(); // L: 1118
				} while(var5 == null); // L: 1120

				var5.field3594.clear(); // L: 1123
				var5.field3594.method6202(); // L: 1124
				var5.field3594.setPcmStreamVolume(0); // L: 1125
				var5.field3594.field3518 = 0; // L: 1126
				int var6 = var5.field3590; // L: 1127
				int var7 = var5.field3591; // L: 1128
				Iterator var8 = class321.field3482.iterator(); // L: 1130

				while (var8.hasNext()) {
					class327 var9 = (class327)var8.next(); // L: 1131
					var9.vmethod6339(var6, var7); // L: 1133
				}
			}
		}

		if (var3 && playingJingle && class125.pcmPlayer1 != null) { // L: 1145 1146
			class125.pcmPlayer1.tryDiscard();
		}

		class190.method3774(); // L: 1148
		field792.method4430(); // L: 1149
		this.method532(); // L: 1150
		synchronized(MouseHandler.MouseHandler_instance) { // L: 1152
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1153
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1154
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1155
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1156
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1157
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1158
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1159
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1160
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1161
		} // L: 1162

		if (ServerPacket.field3423 != null) { // L: 1164
			int var14 = ServerPacket.field3423.useRotation(); // L: 1165
			mouseWheelRotation = var14; // L: 1166
		}

		if (gameState == 0) { // L: 1168
			BufferedNetSocket.method8501(); // L: 1169
			class321.method6145(); // L: 1170
		} else if (gameState == 5) { // L: 1172
			class429.method8088(this, class60.field435, class141.fontPlain12); // L: 1173
			BufferedNetSocket.method8501(); // L: 1174
			class321.method6145(); // L: 1175
		} else if (gameState != 10 && gameState != 11) { // L: 1177
			if (gameState == 20) { // L: 1180
				class429.method8088(this, class60.field435, class141.fontPlain12); // L: 1181
				this.doCycleLoggedOut(); // L: 1182
			} else if (gameState == 50) { // L: 1184
				class429.method8088(this, class60.field435, class141.fontPlain12); // L: 1185
				this.doCycleLoggedOut(); // L: 1186
			} else if (gameState == 25) { // L: 1188
				class59.method1134(); // L: 1189
			}
		} else {
			class429.method8088(this, class60.field435, class141.fontPlain12); // L: 1178
		}

		if (gameState == 30) { // L: 1191
			this.doCycleLoggedIn(); // L: 1192
		} else if (gameState == 40 || gameState == 45) { // L: 1194
			this.doCycleLoggedOut(); // L: 1195
		}

	} // L: 1197

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1901702854"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field756 && SecureRandomCallable.method2320() > field756) { // L: 1201 1202
			FloorOverlayDefinition.setWindowedMode(AbstractUserComparator.getWindowedMode()); // L: 1203
		}

		int var2;
		if (var1) { // L: 1206
			for (var2 = 0; var2 < 100; ++var2) { // L: 1207
				field816[var2] = true;
			}
		}

		if (gameState == 0) { // L: 1209
			this.method479(Login.Login_loadingPercent, Login.Login_loadingText, var1, VarbitComposition.field2061); // L: 1210
		} else if (gameState == 5) { // L: 1212
			Login.drawTitle(class166.fontBold12, class60.field435, class141.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1213
			if (gameState == 20) { // L: 1214
				Login.drawTitle(class166.fontBold12, class60.field435, class141.fontPlain12);
			} else if (gameState == 50) { // L: 1215
				Login.drawTitle(class166.fontBold12, class60.field435, class141.fontPlain12);
			} else if (gameState == 25) { // L: 1216
				if (field598 == 1) { // L: 1217
					if (field594 > field666) { // L: 1218
						field666 = field594;
					}

					var2 = (field666 * 50 - field594 * 50) / field666; // L: 1219
					RouteStrategy.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1220
				} else if (field598 == 2) { // L: 1222
					if (field621 > field597) { // L: 1223
						field597 = field621;
					}

					var2 = (field597 * 50 - field621 * 50) / field597 + 50; // L: 1224
					RouteStrategy.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1225
				} else {
					RouteStrategy.drawLoadingMessage("Loading - please wait.", false); // L: 1227
				}
			} else if (gameState == 30) { // L: 1229
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1230
				RouteStrategy.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1231
				RouteStrategy.drawLoadingMessage("Please wait...", false);
			}
		} else {
			Login.drawTitle(class166.fontBold12, class60.field435, class141.fontPlain12); // L: 1221
		}

		if (gameState == 30 && field755 == 0 && !var1 && !isResizable) { // L: 1232
			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1233
				if (field721[var2]) { // L: 1234
					UserComparator8.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]); // L: 1235
					field721[var2] = false; // L: 1236
				}
			}
		} else if (gameState > 0) { // L: 1240
			UserComparator8.rasterProvider.drawFull(0, 0); // L: 1241

			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1242
				field721[var2] = false;
			}
		}

	} // L: 1244

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1161058155"
	)
	@Export("kill0")
	protected final void kill0() {
		// $FF: Couldn't be decompiled
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	protected final void vmethod1380() {
	} // L: 755

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	boolean method1212() {
		return this.field699 == 1; // L: 925
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2010664558"
	)
	boolean method1214() {
		return class25.field119 != null && !class25.field119.trim().isEmpty() && class521.field5131 != null && !class521.field5131.trim().isEmpty(); // L: 965
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1964077379"
	)
	boolean method1215() {
		return class357.field3901 != null && !class357.field3901.trim().isEmpty() && Renderable.field2922 != null && !Renderable.field2922.trim().isEmpty(); // L: 969
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "65280"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field764 != null; // L: 973
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1903120586"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 977
		var2.put("grant_type", "refresh_token"); // L: 978
		var2.put("scope", "gamesso.token.create"); // L: 979
		var2.put("refresh_token", var1); // L: 980
		URL var3 = new URL(class391.field4484 + "shield/oauth/token" + (new class482(var2)).method8783()); // L: 981
		class438 var4 = new class438(); // L: 982
		if (this.method1212()) { // L: 983
			var4.method8140(field719); // L: 984
		} else {
			var4.method8140(field708); // L: 987
		}

		var4.method8137("Host", (new URL(class391.field4484)).getHost()); // L: 989
		var4.method8144(class479.field4879); // L: 990
		class9 var5 = class9.field28; // L: 991
		RefreshAccessTokenRequester var6 = this.field572; // L: 992
		if (var6 != null) { // L: 993
			this.field541 = var6.request(var5.method64(), var3, var4.method8157(), ""); // L: 994
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field617); // L: 997
			this.field808 = this.field565.method158(var7); // L: 998
		}
	} // L: 995 999

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1529205719"
	)
	void method1218(String var1) throws IOException {
		URL var2 = new URL(class391.field4484 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 1002
		class438 var3 = new class438(); // L: 1003
		var3.method8141(var1); // L: 1004
		class9 var4 = class9.field26; // L: 1005
		OtlTokenRequester var5 = this.field764; // L: 1006
		if (var5 != null) { // L: 1007
			this.field568 = var5.request(var4.method64(), var2, var3.method8157(), ""); // L: 1008
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field617); // L: 1011
			this.field522 = this.field565.method158(var6); // L: 1012
		}
	} // L: 1009 1013

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-160281969"
	)
	void method1219(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class134.field1597 + "game-session/v1/tokens"); // L: 1016
		class10 var4 = new class10(var3, class9.field28, this.field617); // L: 1017
		var4.method85().method8141(var1); // L: 1018
		var4.method85().method8144(class479.field4879); // L: 1019
		JSONObject var5 = new JSONObject(); // L: 1020
		var5.put("accountId", var2); // L: 1021
		var4.method86(new class481(var5)); // L: 1022
		this.field522 = this.field565.method158(var4); // L: 1023
	} // L: 1024

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-483617262"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1384
			boolean var1 = class356.field3897.method7210(); // L: 1385
			if (!var1) { // L: 1386
				this.method1225();
			}

		}
	} // L: 1387

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	void method1225() {
		if (class356.field3897.field4416 >= 4) { // L: 1390
			this.error("js5crc"); // L: 1391
			Interpreter.method2106(1000); // L: 1392
		} else {
			if (class356.field3897.field4433 >= 4) { // L: 1395
				if (gameState <= 5) { // L: 1396
					this.error("js5io"); // L: 1397
					Interpreter.method2106(1000); // L: 1398
					return; // L: 1399
				}

				field555 = 3000; // L: 1402
				class356.field3897.field4433 = 3; // L: 1403
			}

			if (--field555 + 1 <= 0) { // L: 1406
				try {
					if (js5ConnectState == 0) { // L: 1408
						GrandExchangeOffer.js5SocketTask = GameEngine.taskHandler.method4189(class183.worldHost, class316.currentPort); // L: 1409
						++js5ConnectState; // L: 1410
					}

					if (js5ConnectState == 1) { // L: 1412
						if (GrandExchangeOffer.js5SocketTask.status == 2) { // L: 1413
							this.js5Error(-1); // L: 1414
							return; // L: 1415
						}

						if (GrandExchangeOffer.js5SocketTask.status == 1) { // L: 1417
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1419
						Socket var2 = (Socket)GrandExchangeOffer.js5SocketTask.result; // L: 1421
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1423
						class210.js5Socket = var1; // L: 1425
						Buffer var3 = new Buffer(5); // L: 1426
						var3.writeByte(class314.field3425.field3432); // L: 1427
						var3.writeInt(220); // L: 1428
						class210.js5Socket.write(var3.array, 0, 5); // L: 1429
						++js5ConnectState; // L: 1430
						class73.field922 = SecureRandomCallable.method2320(); // L: 1431
					}

					if (js5ConnectState == 3) { // L: 1433
						if (class210.js5Socket.vmethod8476() > 0) { // L: 1434
							int var4 = class210.js5Socket.vmethod8489(); // L: 1435
							if (var4 != 0) { // L: 1436
								this.js5Error(var4); // L: 1437
								return; // L: 1438
							}

							++js5ConnectState; // L: 1440
						} else if (SecureRandomCallable.method2320() - class73.field922 > 30000L) { // L: 1443
							this.js5Error(-2); // L: 1444
							return; // L: 1445
						}
					}

					if (js5ConnectState == 4) { // L: 1449
						class356.field3897.method7218(class210.js5Socket, gameState > 20); // L: 1450
						GrandExchangeOffer.js5SocketTask = null; // L: 1451
						class210.js5Socket = null; // L: 1452
						js5ConnectState = 0; // L: 1453
						js5Errors = 0; // L: 1454
					}
				} catch (IOException var5) { // L: 1457
					this.js5Error(-3); // L: 1458
				}

			}
		}
	} // L: 1393 1460

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "366416062"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		GrandExchangeOffer.js5SocketTask = null; // L: 1463
		class210.js5Socket = null; // L: 1464
		js5ConnectState = 0; // L: 1465
		if (class211.worldPort == class316.currentPort) { // L: 1466
			class316.currentPort = class150.js5Port;
		} else {
			class316.currentPort = class211.worldPort; // L: 1467
		}

		++js5Errors; // L: 1468
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1469
			if (gameState <= 5) { // L: 1470
				this.error("js5connect_full"); // L: 1471
				Interpreter.method2106(1000); // L: 1472
			} else {
				field555 = 3000; // L: 1474
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1476
			this.error("js5connect_outofdate"); // L: 1477
			Interpreter.method2106(1000); // L: 1478
		} else if (js5Errors >= 4) { // L: 1480
			if (gameState <= 5) { // L: 1481
				this.error("js5connect"); // L: 1482
				Interpreter.method2106(1000); // L: 1483
			} else {
				field555 = 3000; // L: 1485
			}
		}

	} // L: 1487

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2026098259"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2044
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2045

		try {
			if (field558 == class67.field519) { // L: 2047
				if (ApproximateRouteStrategy.field489 == null && (field579.isDone() || field559 > 250)) { // L: 2048
					ApproximateRouteStrategy.field489 = field579.get(); // L: 2049
					field579.shutdown(); // L: 2050
					field579 = null; // L: 2051
				}

				if (ApproximateRouteStrategy.field489 != null) { // L: 2053
					if (var1 != null) { // L: 2054
						((AbstractSocket)var1).close(); // L: 2055
						var1 = null; // L: 2056
					}

					ClientPreferences.field1324 = null; // L: 2058
					hadNetworkError = false; // L: 2059
					field559 = 0; // L: 2060
					if (field563.method9755()) { // L: 2061
						if (this.method1214()) { // L: 2062
							try {
								this.requestOtlToken(class521.field5131); // L: 2064
								class407.method7638(class67.field516); // L: 2065
							} catch (Throwable var21) { // L: 2067
								class315.RunException_sendStackTrace((String)null, var21); // L: 2068
								class93.getLoginError(65); // L: 2069
								return; // L: 2070
							}
						} else {
							if (!this.method1215()) { // L: 2073
								class93.getLoginError(65); // L: 2085
								return; // L: 2086
							}

							try {
								this.method1219(class357.field3901, Renderable.field2922); // L: 2075
								class407.method7638(class67.field515); // L: 2076
							} catch (Exception var20) { // L: 2078
								class315.RunException_sendStackTrace((String)null, var20); // L: 2079
								class93.getLoginError(65); // L: 2080
								return; // L: 2081
							}
						}
					} else {
						class407.method7638(class67.field495); // L: 2090
					}
				}
			}

			class20 var23;
			if (field558 == class67.field516) { // L: 2094
				if (this.field541 != null) { // L: 2095
					if (!this.field541.isDone()) { // L: 2096
						return; // L: 2097
					}

					if (this.field541.isCancelled()) { // L: 2099
						class93.getLoginError(65); // L: 2100
						this.field541 = null; // L: 2101
						return; // L: 2102
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field541.get(); // L: 2105
						if (!var3.isSuccess()) { // L: 2106
							class93.getLoginError(65); // L: 2107
							this.field541 = null; // L: 2108
							return; // L: 2109
						}

						class25.field119 = var3.getAccessToken(); // L: 2111
						class521.field5131 = var3.getRefreshToken(); // L: 2112
						this.field541 = null; // L: 2113
					} catch (Exception var19) { // L: 2115
						class315.RunException_sendStackTrace((String)null, var19); // L: 2116
						class93.getLoginError(65); // L: 2117
						this.field541 = null; // L: 2118
						return; // L: 2119
					}
				} else {
					if (this.field808 == null) { // L: 2122
						class93.getLoginError(65); // L: 2152
						return; // L: 2153
					}

					if (!this.field808.method250()) { // L: 2123
						return; // L: 2124
					}

					if (this.field808.method238()) { // L: 2126
						class315.RunException_sendStackTrace(this.field808.method237(), (Throwable)null); // L: 2127
						class93.getLoginError(65); // L: 2128
						this.field808 = null; // L: 2129
						return; // L: 2130
					}

					var23 = this.field808.method239(); // L: 2132
					if (var23.method264() != 200) { // L: 2133
						class93.getLoginError(65); // L: 2134
						this.field808 = null; // L: 2135
						return; // L: 2136
					}

					field559 = 0; // L: 2138
					class481 var4 = new class481(var23.method263()); // L: 2139

					try {
						class25.field119 = var4.method8769().getString("access_token"); // L: 2141
						class521.field5131 = var4.method8769().getString("refresh_token"); // L: 2142
					} catch (Exception var18) { // L: 2144
						class315.RunException_sendStackTrace("Error parsing tokens", var18); // L: 2145
						class93.getLoginError(65); // L: 2146
						this.field808 = null; // L: 2147
						return; // L: 2148
					}
				}

				this.method1218(class25.field119); // L: 2155
				class407.method7638(class67.field515); // L: 2156
			}

			if (class67.field515 == field558) { // L: 2158
				if (this.field568 != null) { // L: 2159
					if (!this.field568.isDone()) { // L: 2160
						return; // L: 2161
					}

					if (this.field568.isCancelled()) { // L: 2163
						class93.getLoginError(65); // L: 2164
						this.field568 = null; // L: 2165
						return; // L: 2166
					}

					try {
						OtlTokenResponse var24 = (OtlTokenResponse)this.field568.get(); // L: 2169
						if (!var24.isSuccess()) { // L: 2170
							class93.getLoginError(65); // L: 2171
							this.field568 = null; // L: 2172
							return; // L: 2173
						}

						this.field564 = var24.getToken(); // L: 2175
						this.field568 = null; // L: 2176
					} catch (Exception var17) { // L: 2178
						class315.RunException_sendStackTrace((String)null, var17); // L: 2179
						class93.getLoginError(65); // L: 2180
						this.field568 = null; // L: 2181
						return; // L: 2182
					}
				} else {
					if (this.field522 == null) { // L: 2185
						class93.getLoginError(65); // L: 2221
						return; // L: 2222
					}

					if (!this.field522.method250()) { // L: 2186
						return; // L: 2187
					}

					if (this.field522.method238()) { // L: 2189
						class315.RunException_sendStackTrace(this.field522.method237(), (Throwable)null); // L: 2190
						class93.getLoginError(65); // L: 2191
						this.field522 = null; // L: 2192
						return; // L: 2193
					}

					var23 = this.field522.method239(); // L: 2195
					if (var23.method264() != 200) { // L: 2196
						class315.RunException_sendStackTrace("Response code: " + var23.method264() + "Response body: " + var23.method263(), (Throwable)null); // L: 2197
						class93.getLoginError(65); // L: 2198
						this.field522 = null; // L: 2199
						return; // L: 2200
					}

					List var26 = (List)var23.method262().get("Content-Type"); // L: 2202
					if (var26 != null && var26.contains(class479.field4879.method8751())) { // L: 2203
						try {
							JSONObject var5 = new JSONObject(var23.method263()); // L: 2205
							this.field564 = var5.getString("token"); // L: 2206
						} catch (JSONException var16) { // L: 2208
							class315.RunException_sendStackTrace((String)null, var16); // L: 2209
							class93.getLoginError(65); // L: 2210
							this.field522 = null; // L: 2211
							return; // L: 2212
						}
					} else {
						this.field564 = var23.method263(); // L: 2216
					}

					this.field522 = null; // L: 2218
				}

				field559 = 0; // L: 2224
				class407.method7638(class67.field495); // L: 2225
			}

			if (class67.field495 == field558) { // L: 2227
				if (ClientPreferences.field1324 == null) { // L: 2228
					ClientPreferences.field1324 = GameEngine.taskHandler.method4189(class183.worldHost, class316.currentPort); // L: 2229
				}

				if (ClientPreferences.field1324.status == 2) { // L: 2231
					throw new IOException();
				}

				if (ClientPreferences.field1324.status == 1) { // L: 2232
					Socket var28 = (Socket)ClientPreferences.field1324.result; // L: 2234
					BufferedNetSocket var25 = new BufferedNetSocket(var28, 40000, 5000); // L: 2236
					var1 = var25; // L: 2238
					packetWriter.setSocket(var25); // L: 2239
					ClientPreferences.field1324 = null; // L: 2240
					class407.method7638(class67.field496); // L: 2241
				}
			}

			PacketBufferNode var27;
			if (field558 == class67.field496) { // L: 2244
				packetWriter.clearBuffer(); // L: 2245
				var27 = class166.method3491(); // L: 2246
				var27.packetBuffer.writeByte(class314.field3435.field3432); // L: 2247
				packetWriter.addNode(var27); // L: 2248
				packetWriter.flush(); // L: 2249
				var2.offset = 0; // L: 2250
				class407.method7638(class67.field497); // L: 2251
			}

			int var12;
			if (field558 == class67.field497) { // L: 2253
				if (class125.pcmPlayer1 != null) { // L: 2254
					class125.pcmPlayer1.method741();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2255
					var12 = ((AbstractSocket)var1).vmethod8489(); // L: 2256
					if (class125.pcmPlayer1 != null) { // L: 2257
						class125.pcmPlayer1.method741();
					}

					if (var12 != 0) { // L: 2258
						class93.getLoginError(var12); // L: 2259
						return; // L: 2260
					}

					var2.offset = 0; // L: 2262
					class407.method7638(class67.field498); // L: 2263
				}
			}

			if (class67.field498 == field558) { // L: 2266
				if (var2.offset < 8) { // L: 2267
					var12 = ((AbstractSocket)var1).vmethod8476(); // L: 2268
					if (var12 > 8 - var2.offset) { // L: 2269
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) { // L: 2270
						((AbstractSocket)var1).read(var2.array, var2.offset, var12); // L: 2271
						var2.offset += var12; // L: 2272
					}
				}

				if (var2.offset == 8) { // L: 2275
					var2.offset = 0; // L: 2276
					VarpDefinition.field1862 = var2.readLong(); // L: 2277
					class407.method7638(class67.field499); // L: 2278
				}
			}

			if (field558 == class67.field499) { // L: 2281
				packetWriter.packetBuffer.offset = 0; // L: 2282
				packetWriter.clearBuffer(); // L: 2283
				PacketBuffer var29 = new PacketBuffer(500); // L: 2284
				int[] var30 = new int[]{ApproximateRouteStrategy.field489.nextInt(), ApproximateRouteStrategy.field489.nextInt(), ApproximateRouteStrategy.field489.nextInt(), ApproximateRouteStrategy.field489.nextInt()}; // L: 2285 2286 2287 2288 2289
				var29.offset = 0; // L: 2290
				var29.writeByte(1); // L: 2291
				var29.writeInt(var30[0]); // L: 2292
				var29.writeInt(var30[1]); // L: 2293
				var29.writeInt(var30[2]); // L: 2294
				var29.writeInt(var30[3]); // L: 2295
				var29.writeLong(VarpDefinition.field1862); // L: 2296
				if (gameState == 40) { // L: 2297
					var29.writeInt(class1.field0[0]); // L: 2298
					var29.writeInt(class1.field0[1]); // L: 2299
					var29.writeInt(class1.field0[2]); // L: 2300
					var29.writeInt(class1.field0[3]); // L: 2301
				} else {
					if (gameState == 50) { // L: 2304
						var29.writeByte(class125.field1493.rsOrdinal()); // L: 2305
						var29.writeInt(class318.field3457); // L: 2306
					} else {
						var29.writeByte(field573.rsOrdinal()); // L: 2309
						switch(field573.field1494) { // L: 2310
						case 0:
						case 2:
							var29.writeMedium(class36.field247); // L: 2324
							++var29.offset; // L: 2325
						case 1:
						default:
							break;
						case 3:
							var29.writeInt(class30.clientPreferences.method2536(Login.Login_username)); // L: 2318
							break; // L: 2319
						case 4:
							var29.offset += 4; // L: 2313
						}
					}

					if (field563.method9755()) { // L: 2330
						var29.writeByte(class538.field5253.rsOrdinal()); // L: 2331
						var29.writeStringCp1252NullTerminated(this.field564); // L: 2332
					} else {
						var29.writeByte(class538.field5255.rsOrdinal()); // L: 2335
						var29.writeStringCp1252NullTerminated(Login.Login_password); // L: 2336
					}
				}

				var29.encryptRsa(class75.field934, class75.field935); // L: 2339
				class1.field0 = var30; // L: 2340
				PacketBufferNode var31 = class166.method3491(); // L: 2341
				var31.packetBuffer.offset = 0; // L: 2342
				if (gameState == 40) { // L: 2343
					var31.packetBuffer.writeByte(class314.field3426.field3432); // L: 2344
				} else {
					var31.packetBuffer.writeByte(class314.field3424.field3432); // L: 2347
				}

				var31.packetBuffer.writeShort(0); // L: 2349
				int var6 = var31.packetBuffer.offset; // L: 2350
				var31.packetBuffer.writeInt(220); // L: 2351
				var31.packetBuffer.writeInt(1); // L: 2352
				var31.packetBuffer.writeByte(clientType); // L: 2353
				var31.packetBuffer.writeByte(field528); // L: 2354
				byte var7 = 0; // L: 2355
				var31.packetBuffer.writeByte(var7); // L: 2356
				var31.packetBuffer.writeBytes(var29.array, 0, var29.offset); // L: 2357
				int var8 = var31.packetBuffer.offset; // L: 2358
				var31.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2359
				var31.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2360
				var31.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2361
				var31.packetBuffer.writeShort(WorldMapArea.canvasHeight); // L: 2362
				KitDefinition.method3636(var31.packetBuffer); // L: 2363
				var31.packetBuffer.writeStringCp1252NullTerminated(class106.field1372); // L: 2364
				var31.packetBuffer.writeInt(class403.field4531); // L: 2365
				var31.packetBuffer.writeByte(0); // L: 2366
				Buffer var9 = new Buffer(class31.field165.size()); // L: 2367
				class31.field165.write(var9); // L: 2368
				var31.packetBuffer.writeBytes(var9.array, 0, var9.array.length); // L: 2369
				var31.packetBuffer.writeByte(clientType); // L: 2370
				var31.packetBuffer.writeInt(0); // L: 2371
				if (WorldMapScaleHandler.field2696) { // L: 2372
					var31.packetBuffer.method9525(class311.field3274.hash); // L: 2374
					var31.packetBuffer.method9525(class376.field4387.hash); // L: 2375
					var31.packetBuffer.method9528(Renderable.field2921.hash); // L: 2376
					var31.packetBuffer.method9677(class391.field4483.hash); // L: 2377
					var31.packetBuffer.method9525(class86.field1084.hash); // L: 2378
					var31.packetBuffer.method9525(ScriptFrame.field468.hash); // L: 2379
					var31.packetBuffer.method9677(class25.archive13.hash); // L: 2380
				} else {
					var31.packetBuffer.method9525(class311.field3274.hash); // L: 2385
					var31.packetBuffer.writeInt(JagexCache.field2336.hash); // L: 2386
					var31.packetBuffer.method9677(class12.field52.hash); // L: 2387
					var31.packetBuffer.method9677(class362.field3958.hash); // L: 2388
					var31.packetBuffer.writeInt(class19.archive2.hash); // L: 2389
					var31.packetBuffer.writeInt(ScriptFrame.field464.hash); // L: 2390
					var31.packetBuffer.method9677(ScriptFrame.field468.hash); // L: 2391
					var31.packetBuffer.method9677(class154.field1724.hash); // L: 2392
					var31.packetBuffer.method9677(0); // L: 2393
					var31.packetBuffer.method9528(class376.field4387.hash); // L: 2394
					var31.packetBuffer.method9528(Varcs.field1417.hash); // L: 2395
					var31.packetBuffer.writeInt(class198.field2070.hash); // L: 2396
					var31.packetBuffer.method9677(WorldMapSectionType.archive12.hash); // L: 2397
					var31.packetBuffer.writeInt(class86.field1084.hash); // L: 2398
					var31.packetBuffer.writeInt(field556.hash); // L: 2399
					var31.packetBuffer.writeInt(class25.archive13.hash); // L: 2400
					var31.packetBuffer.writeInt(Renderable.field2921.hash); // L: 2401
					var31.packetBuffer.method9525(class170.field1832.hash); // L: 2402
					var31.packetBuffer.method9528(WorldMapSectionType.field2612.hash); // L: 2403
					var31.packetBuffer.writeInt(class391.field4483.hash); // L: 2404
					var31.packetBuffer.method9677(SpotAnimationDefinition.field2045.hash); // L: 2405
				}

				var31.packetBuffer.xteaEncrypt(var30, var8, var31.packetBuffer.offset); // L: 2408
				var31.packetBuffer.writeLengthShort(var31.packetBuffer.offset - var6); // L: 2409
				packetWriter.addNode(var31); // L: 2410
				packetWriter.flush(); // L: 2411
				packetWriter.isaacCipher = new IsaacCipher(var30); // L: 2412
				int[] var10 = new int[4]; // L: 2413

				for (int var11 = 0; var11 < 4; ++var11) { // L: 2414
					var10[var11] = var30[var11] + 50;
				}

				var2.newIsaacCipher(var10); // L: 2415
				class407.method7638(class67.field500); // L: 2416
			}

			int var13;
			if (field558 == class67.field500 && ((AbstractSocket)var1).vmethod8476() > 0) { // L: 2418 2419
				var12 = ((AbstractSocket)var1).vmethod8489(); // L: 2420
				if (var12 == 61) { // L: 2421
					var13 = ((AbstractSocket)var1).vmethod8476(); // L: 2422
					GameObject.field3131 = var13 == 1 && ((AbstractSocket)var1).vmethod8489() == 1; // L: 2423
					class407.method7638(class67.field499); // L: 2424
				}

				if (var12 == 21 && gameState == 20) { // L: 2426
					class407.method7638(class67.field511); // L: 2427
				} else if (var12 == 2) { // L: 2429
					if (WorldMapScaleHandler.field2696) { // L: 2430
						class407.method7638(class67.field517); // L: 2431
					} else {
						class407.method7638(class67.field501); // L: 2434
					}
				} else if (var12 == 15 && gameState == 40) { // L: 2437
					packetWriter.serverPacketLength = -1; // L: 2438
					class407.method7638(class67.field507); // L: 2439
				} else if (var12 == 64) { // L: 2441
					class407.method7638(class67.field504); // L: 2442
				} else if (var12 == 23 && field560 < 1) { // L: 2444
					++field560; // L: 2445
					class407.method7638(class67.field519); // L: 2446
				} else if (var12 == 29) { // L: 2448
					class407.method7638(class67.field512); // L: 2449
				} else {
					if (var12 != 69) { // L: 2451
						class93.getLoginError(var12); // L: 2455
						return; // L: 2456
					}

					class407.method7638(class67.field494); // L: 2452
				}
			}

			if (field558 == class67.field517) { // L: 2460
				VarbitComposition.field2061 = true; // L: 2461
				WorldMapDecoration.method5033(class93.field1166); // L: 2462
				Interpreter.method2106(0); // L: 2463
			}

			if (field558 == class67.field494 && ((AbstractSocket)var1).vmethod8476() >= 2) { // L: 2465 2466
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2467
				var2.offset = 0; // L: 2468
				class410.field4556 = var2.readUnsignedShort(); // L: 2469
				class407.method7638(class67.field502); // L: 2470
			}

			if (class67.field502 == field558 && ((AbstractSocket)var1).vmethod8476() >= class410.field4556) { // L: 2473 2474
				var2.offset = 0; // L: 2475
				((AbstractSocket)var1).read(var2.array, var2.offset, class410.field4556); // L: 2476
				class6[] var32 = new class6[]{class6.field12}; // L: 2479
				class6 var33 = var32[var2.readUnsignedByte()]; // L: 2481

				try {
					class3 var34 = class218.method4251(var33); // L: 2483
					this.field581 = new class7(var2, var34); // L: 2484
					class407.method7638(class67.field503); // L: 2485
				} catch (Exception var15) { // L: 2487
					class93.getLoginError(22); // L: 2488
					return; // L: 2489
				}
			}

			if (field558 == class67.field503 && this.field581.method40()) { // L: 2493 2494
				this.field580 = this.field581.method42(); // L: 2495
				this.field581.method41(); // L: 2496
				this.field581 = null; // L: 2497
				if (this.field580 == null) { // L: 2498
					class93.getLoginError(22); // L: 2499
					return; // L: 2500
				}

				packetWriter.clearBuffer(); // L: 2502
				var27 = class166.method3491(); // L: 2503
				var27.packetBuffer.writeByte(class314.field3433.field3432); // L: 2504
				var27.packetBuffer.writeShort(this.field580.offset); // L: 2505
				var27.packetBuffer.method9467(this.field580); // L: 2506
				packetWriter.addNode(var27); // L: 2507
				packetWriter.flush(); // L: 2508
				this.field580 = null; // L: 2509
				class407.method7638(class67.field500); // L: 2510
			}

			if (field558 == class67.field504 && ((AbstractSocket)var1).vmethod8476() > 0) { // L: 2513 2514
				class133.field1589 = ((AbstractSocket)var1).vmethod8489(); // L: 2515
				class407.method7638(class67.field505); // L: 2516
			}

			if (field558 == class67.field505 && ((AbstractSocket)var1).vmethod8476() >= class133.field1589) { // L: 2519 2520
				((AbstractSocket)var1).read(var2.array, 0, class133.field1589); // L: 2521
				var2.offset = 0; // L: 2522
				class407.method7638(class67.field500); // L: 2523
			}

			if (field558 == class67.field511 && ((AbstractSocket)var1).vmethod8476() > 0) { // L: 2526 2527
				field561 = (((AbstractSocket)var1).vmethod8489() + 3) * 60; // L: 2528
				class407.method7638(class67.field506); // L: 2529
			}

			if (field558 == class67.field506) { // L: 2532
				field559 = 0; // L: 2533
				class114.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field561 / 60 + " seconds."); // L: 2534
				if (--field561 <= 0) { // L: 2535
					class407.method7638(class67.field519);
				}

			} else if (class67.field514 == field558) { // L: 2538
				var27 = class166.method3491(); // L: 2539
				var27.packetBuffer.writeByte(class314.field3429.field3432); // L: 2540
				var27.packetBuffer.writeShort(class314.field3429.field3431); // L: 2541
				class161.method3436(var27); // L: 2542
				packetWriter.addNode(var27); // L: 2543
				packetWriter.flush(); // L: 2544
				class407.method7638(class67.field501); // L: 2545
			} else {
				if (field558 == class67.field501 && ((AbstractSocket)var1).vmethod8476() >= 1) { // L: 2548 2549
					UrlRequester.field1442 = ((AbstractSocket)var1).vmethod8489(); // L: 2550
					if (UrlRequester.field1442 != class314.field3430.field3431) { // L: 2551
						class93.getLoginError(UrlRequester.field1442); // L: 2552
						return; // L: 2553
					}

					class407.method7638(class67.field509); // L: 2555
				}

				if (class67.field509 == field558 && ((AbstractSocket)var1).vmethod8476() >= UrlRequester.field1442) { // L: 2558 2559
					boolean var43 = ((AbstractSocket)var1).vmethod8489() == 1; // L: 2560
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2561
					var2.offset = 0; // L: 2562
					boolean var42 = false; // L: 2563
					if (var43) { // L: 2564
						var13 = var2.readByteIsaac() << 24; // L: 2565
						var13 |= var2.readByteIsaac() << 16; // L: 2566
						var13 |= var2.readByteIsaac() << 8; // L: 2567
						var13 |= var2.readByteIsaac(); // L: 2568
						class30.clientPreferences.method2573(Login.Login_username, var13); // L: 2569
					}

					if (Login_isUsernameRemembered) { // L: 2571
						class30.clientPreferences.method2548(Login.Login_username); // L: 2572
					} else {
						class30.clientPreferences.method2548((String)null); // L: 2575
					}

					class160.savePreferences(); // L: 2577
					staffModLevel = ((AbstractSocket)var1).vmethod8489(); // L: 2578
					playerMod = ((AbstractSocket)var1).vmethod8489() == 1; // L: 2579
					localPlayerIndex = ((AbstractSocket)var1).vmethod8489(); // L: 2580
					localPlayerIndex <<= 8; // L: 2581
					localPlayerIndex += ((AbstractSocket)var1).vmethod8489(); // L: 2582
					field653 = ((AbstractSocket)var1).vmethod8489(); // L: 2583
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2584
					var2.offset = 0; // L: 2585
					this.accountHash = var2.readLong(); // L: 2586
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2587
					var2.offset = 0; // L: 2588
					field654 = var2.readLong(); // L: 2589
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2590
					var2.offset = 0; // L: 2591
					field601 = var2.readLong(); // L: 2592
					VarbitComposition.method3830().method4263(this.field617); // L: 2593
					class407.method7638(class67.field518); // L: 2594
				}

				if (class67.field518 == field558 && ((AbstractSocket)var1).vmethod8476() >= packetWriter.serverPacketLength) { // L: 2597 2598
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2599
					var2.offset = 0; // L: 2600
					if (var2.method9431()) { // L: 2601
						((AbstractSocket)var1).read(var2.array, 1, 1); // L: 2602
						var2.offset = 0; // L: 2603
					}

					ServerPacket[] var36 = NPCComposition.method3704(); // L: 2605
					var13 = var2.readSmartByteShortIsaac(); // L: 2606
					if (var13 < 0 || var13 >= var36.length) { // L: 2607
						throw new IOException("Invalid ServerProt: " + var13 + " at " + var2.offset); // L: 2608
					}

					packetWriter.serverPacket = var36[var13]; // L: 2610
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2611
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2612
					var2.offset = 0; // L: 2613
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2614

					try {
						Client var37 = class193.client; // L: 2616
						JSObject.getWindow(var37).call("zap", (Object[])null); // L: 2619
					} catch (Throwable var14) { // L: 2622
					}

					class407.method7638(class67.field508); // L: 2623
				}

				if (class67.field508 == field558) { // L: 2626
					if (((AbstractSocket)var1).vmethod8476() >= packetWriter.serverPacketLength) { // L: 2627
						var2.offset = 0; // L: 2628
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2629
						timer.method8104(); // L: 2630
						Message.method1173(); // L: 2631
						class1.updatePlayer(var2); // L: 2632
						class378.field4434 = -1; // L: 2633
						BuddyRankComparator.loadRegions(false, var2); // L: 2634
						packetWriter.serverPacket = null; // L: 2635
						field532 = false; // L: 2636
					}

				} else {
					if (field558 == class67.field512 && ((AbstractSocket)var1).vmethod8476() >= 2) { // L: 2640 2641
						var2.offset = 0; // L: 2642
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2643
						var2.offset = 0; // L: 2644
						class131.field1550 = var2.readUnsignedShort(); // L: 2645
						class407.method7638(class67.field513); // L: 2646
					}

					if (class67.field513 == field558 && ((AbstractSocket)var1).vmethod8476() >= class131.field1550) { // L: 2649 2650
						var2.offset = 0; // L: 2651
						((AbstractSocket)var1).read(var2.array, 0, class131.field1550); // L: 2652
						var2.offset = 0; // L: 2653
						String var39 = var2.readStringCp1252NullTerminated(); // L: 2654
						String var35 = var2.readStringCp1252NullTerminated(); // L: 2655
						String var40 = var2.readStringCp1252NullTerminated(); // L: 2656
						class114.setLoginResponseString(var39, var35, var40); // L: 2657
						Interpreter.method2106(10); // L: 2658
						if (field563.method9755()) { // L: 2659
							JagexCache.method4224(9); // L: 2660
						}
					}

					if (field558 != class67.field507) { // L: 2664
						++field559; // L: 2720
						if (field559 > 2000) { // L: 2721
							if (field560 < 1) { // L: 2722
								if (class211.worldPort == class316.currentPort) { // L: 2723
									class316.currentPort = class150.js5Port;
								} else {
									class316.currentPort = class211.worldPort; // L: 2724
								}

								++field560; // L: 2725
								class407.method7638(class67.field519); // L: 2726
							} else {
								class93.getLoginError(-3); // L: 2729
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2665
							if (((AbstractSocket)var1).vmethod8476() < 2) { // L: 2666
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2667
							var2.offset = 0; // L: 2668
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2669
						}

						if (((AbstractSocket)var1).vmethod8476() >= packetWriter.serverPacketLength) { // L: 2671
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2672
							var2.offset = 0; // L: 2673
							var12 = packetWriter.serverPacketLength; // L: 2674
							timer.method8123(); // L: 2675
							packetWriter.clearBuffer(); // L: 2677
							packetWriter.packetBuffer.offset = 0; // L: 2678
							packetWriter.serverPacket = null; // L: 2679
							packetWriter.field1423 = null; // L: 2680
							packetWriter.field1435 = null; // L: 2681
							packetWriter.field1424 = null; // L: 2682
							packetWriter.serverPacketLength = 0; // L: 2683
							packetWriter.field1432 = 0; // L: 2684
							rebootTimer = 0; // L: 2685
							menuOptionsCount = 0; // L: 2687
							isMenuOpen = false; // L: 2688
							minimapState = 0; // L: 2690
							destinationX = 0; // L: 2691

							for (var13 = 0; var13 < 2048; ++var13) { // L: 2692
								players[var13] = null;
							}

							VarpDefinition.localPlayer = null; // L: 2693

							for (var13 = 0; var13 < npcs.length; ++var13) { // L: 2694
								NPC var41 = npcs[var13]; // L: 2695
								if (var41 != null) { // L: 2696
									var41.targetIndex = -1; // L: 2697
									var41.field1241 = false; // L: 2698
								}
							}

							PendingSpawn.method2459(); // L: 2701
							Interpreter.method2106(30); // L: 2702

							for (var13 = 0; var13 < 100; ++var13) { // L: 2703
								field816[var13] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 2705
								PacketBufferNode var38 = ViewportMouse.getPacketBufferNode(ClientPacket.field3177, packetWriter.isaacCipher); // L: 2707
								var38.packetBuffer.writeByte(AbstractUserComparator.getWindowedMode()); // L: 2708
								var38.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2709
								var38.packetBuffer.writeShort(WorldMapArea.canvasHeight); // L: 2710
								packetWriter.addNode(var38); // L: 2711
							}

							class1.updatePlayer(var2); // L: 2714
							if (var12 != var2.offset) { // L: 2715
								throw new RuntimeException(); // L: 2716
							}
						}
					}
				}
			}
		} catch (IOException var22) { // L: 2733
			if (field560 < 1) { // L: 2734
				if (class211.worldPort == class316.currentPort) { // L: 2735
					class316.currentPort = class150.js5Port;
				} else {
					class316.currentPort = class211.worldPort; // L: 2736
				}

				++field560; // L: 2737
				class407.method7638(class67.field519); // L: 2738
			} else {
				class93.getLoginError(-2); // L: 2741
			}
		}
	} // L: 2536 2546 2638 2718 2727 2730 2739 2742 2744

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "870333583"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3158
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3159
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3160
			hadNetworkError = false; // L: 3161
			Huffman.method6966(); // L: 3162
		} else {
			if (!isMenuOpen) { // L: 3165
				class255.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1295(packetWriter); ++var1) { // L: 3166 3167
			}

			if (gameState == 30) { // L: 3169
				int var2;
				PacketBufferNode var14;
				while (class107.method2782()) { // L: 3170
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.field3245, packetWriter.isaacCipher); // L: 3171
					var14.packetBuffer.writeByte(0); // L: 3172
					var2 = var14.packetBuffer.offset; // L: 3173
					AbstractArchive.performReflectionCheck(var14.packetBuffer); // L: 3174
					var14.packetBuffer.method9470(var14.packetBuffer.offset - var2); // L: 3175
					packetWriter.addNode(var14); // L: 3176
				}

				if (timer.field4665) { // L: 3178
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.field3228, packetWriter.isaacCipher); // L: 3180
					var14.packetBuffer.writeByte(0); // L: 3181
					var2 = var14.packetBuffer.offset; // L: 3182
					timer.write(var14.packetBuffer); // L: 3183
					var14.packetBuffer.method9470(var14.packetBuffer.offset - var2); // L: 3184
					packetWriter.addNode(var14); // L: 3185
					timer.method8105(); // L: 3186
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				PacketBuffer var10000;
				synchronized(ByteArrayPool.mouseRecorder.lock) { // L: 3189
					if (!field713) { // L: 3190
						ByteArrayPool.mouseRecorder.index = 0; // L: 3276
					} else if (MouseHandler.MouseHandler_lastButton != 0 || ByteArrayPool.mouseRecorder.index >= 40) { // L: 3191
						PacketBufferNode var15 = null; // L: 3193
						var3 = 0; // L: 3194
						var4 = 0; // L: 3195
						var5 = 0; // L: 3196
						var6 = 0; // L: 3197

						for (var7 = 0; var7 < ByteArrayPool.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3198 3199
							var4 = var7; // L: 3200
							var8 = ByteArrayPool.mouseRecorder.ys[var7]; // L: 3201
							if (var8 < -1) { // L: 3202
								var8 = -1;
							} else if (var8 > 65534) { // L: 3203
								var8 = 65534;
							}

							var9 = ByteArrayPool.mouseRecorder.xs[var7]; // L: 3204
							if (var9 < -1) { // L: 3205
								var9 = -1;
							} else if (var9 > 65534) { // L: 3206
								var9 = 65534;
							}

							if (var9 != field557 || var8 != field697) { // L: 3207
								if (var15 == null) { // L: 3210
									var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3229, packetWriter.isaacCipher); // L: 3211
									var15.packetBuffer.writeByte(0); // L: 3212
									var3 = var15.packetBuffer.offset; // L: 3213
									var10000 = var15.packetBuffer; // L: 3214
									var10000.offset += 2;
									var5 = 0; // L: 3215
									var6 = 0; // L: 3216
								}

								int var11;
								int var12;
								if (field539 != -1L) { // L: 3221
									var10 = var9 - field557; // L: 3222
									var11 = var8 - field697; // L: 3223
									var12 = (int)((ByteArrayPool.mouseRecorder.millis[var7] - field539) / 20L); // L: 3224
									var5 = (int)((long)var5 + (ByteArrayPool.mouseRecorder.millis[var7] - field539) % 20L); // L: 3225
								} else {
									var10 = var9; // L: 3228
									var11 = var8; // L: 3229
									var12 = Integer.MAX_VALUE; // L: 3230
								}

								field557 = var9; // L: 3232
								field697 = var8; // L: 3233
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3234
									var10 += 32; // L: 3235
									var11 += 32; // L: 3236
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3237
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3239
									var10 += 128; // L: 3240
									var11 += 128; // L: 3241
									var15.packetBuffer.writeByte(var12 + 128); // L: 3242
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3243
								} else if (var12 < 32) { // L: 3245
									var15.packetBuffer.writeByte(var12 + 192); // L: 3246
									if (var9 != -1 && var8 != -1) { // L: 3247
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3248
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3251
									if (var9 != -1 && var8 != -1) { // L: 3252
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3253
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3255
								field539 = ByteArrayPool.mouseRecorder.millis[var7]; // L: 3256
							}
						}

						if (var15 != null) { // L: 3258
							var15.packetBuffer.method9470(var15.packetBuffer.offset - var3); // L: 3259
							var7 = var15.packetBuffer.offset; // L: 3260
							var15.packetBuffer.offset = var3; // L: 3261
							var15.packetBuffer.writeByte(var5 / var6); // L: 3262
							var15.packetBuffer.writeByte(var5 % var6); // L: 3263
							var15.packetBuffer.offset = var7; // L: 3264
							packetWriter.addNode(var15); // L: 3265
						}

						if (var4 >= ByteArrayPool.mouseRecorder.index) { // L: 3267
							ByteArrayPool.mouseRecorder.index = 0;
						} else {
							MouseRecorder var54 = ByteArrayPool.mouseRecorder; // L: 3269
							var54.index -= var4;
							System.arraycopy(ByteArrayPool.mouseRecorder.xs, var4, ByteArrayPool.mouseRecorder.xs, 0, ByteArrayPool.mouseRecorder.index); // L: 3270
							System.arraycopy(ByteArrayPool.mouseRecorder.ys, var4, ByteArrayPool.mouseRecorder.ys, 0, ByteArrayPool.mouseRecorder.index); // L: 3271
							System.arraycopy(ByteArrayPool.mouseRecorder.millis, var4, ByteArrayPool.mouseRecorder.millis, 0, ByteArrayPool.mouseRecorder.index); // L: 3272
						}
					}
				}

				if (MouseHandler.MouseHandler_lastButton == 1 || !class524.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3278
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3279
					if (var16 > 32767L) { // L: 3280
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3281
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3282
					if (var3 < 0) { // L: 3283
						var3 = 0;
					} else if (var3 > WorldMapArea.canvasHeight) { // L: 3284
						var3 = WorldMapArea.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3285
					if (var4 < 0) { // L: 3286
						var4 = 0;
					} else if (var4 > GameEngine.canvasWidth) { // L: 3287
						var4 = GameEngine.canvasWidth;
					}

					var5 = (int)var16; // L: 3288
					PacketBufferNode var18 = ViewportMouse.getPacketBufferNode(ClientPacket.field3212, packetWriter.isaacCipher); // L: 3289
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3290
					var18.packetBuffer.writeShort(var4); // L: 3291
					var18.packetBuffer.writeShort(var3); // L: 3292
					packetWriter.addNode(var18); // L: 3293
				}

				if (mouseWheelRotation != 0) { // L: 3295
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.field3269, packetWriter.isaacCipher); // L: 3296
					var14.packetBuffer.writeShort(mouseWheelRotation); // L: 3297
					packetWriter.addNode(var14); // L: 3298
				}

				if (field792.field2431 > 0) { // L: 3300
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.field3174, packetWriter.isaacCipher); // L: 3301
					var14.packetBuffer.writeShort(0); // L: 3302
					var2 = var14.packetBuffer.offset; // L: 3303
					long var19 = SecureRandomCallable.method2320(); // L: 3304

					for (var5 = 0; var5 < field792.field2431; ++var5) { // L: 3305
						long var21 = var19 - field583; // L: 3306
						if (var21 > 16777215L) { // L: 3307
							var21 = 16777215L;
						}

						field583 = var19; // L: 3308
						var14.packetBuffer.method9699((int)var21); // L: 3309
						var14.packetBuffer.writeByte(field792.field2423[var5]); // L: 3310
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3312
					packetWriter.addNode(var14); // L: 3313
				}

				if (field626 > 0) { // L: 3315
					--field626;
				}

				if (field792.method4466(96) || field792.method4466(97) || field792.method4466(98) || field792.method4466(99)) { // L: 3316
					field544 = true; // L: 3317
				}

				if (field544 && field626 <= 0) { // L: 3319
					field626 = 20; // L: 3320
					field544 = false; // L: 3321
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.field3182, packetWriter.isaacCipher); // L: 3323
					var14.packetBuffer.method9548(camAngleY); // L: 3324
					var14.packetBuffer.method9508(camAngleX); // L: 3325
					packetWriter.addNode(var14); // L: 3326
				}

				if (class423.hasFocus && !field567) { // L: 3328
					field567 = true; // L: 3329
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.field3213, packetWriter.isaacCipher); // L: 3331
					var14.packetBuffer.writeByte(1); // L: 3332
					packetWriter.addNode(var14); // L: 3333
				}

				if (!class423.hasFocus && field567) { // L: 3335
					field567 = false; // L: 3336
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.field3213, packetWriter.isaacCipher); // L: 3338
					var14.packetBuffer.writeByte(0); // L: 3339
					packetWriter.addNode(var14); // L: 3340
				}

				if (Tiles.worldMap != null) { // L: 3343
					Tiles.worldMap.method8901();
				}

				Player var40;
				if (DevicePcmPlayerProvider.FriendsChatManager_inFriendsChat) { // L: 3345
					if (Projectile.friendsChatManager != null) { // L: 3346
						Projectile.friendsChatManager.sort(); // L: 3347
					}

					for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3350
						var40 = players[Players.Players_indices[var1]]; // L: 3351
						var40.method2390(); // L: 3352
					}

					DevicePcmPlayerProvider.FriendsChatManager_inFriendsChat = false; // L: 3355
				}

				if (class257.field2665) { // L: 3359
					for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3361
						var40 = players[Players.Players_indices[var1]]; // L: 3362
						var40.method2388(); // L: 3363
					}

					class257.field2665 = false; // L: 3366
				}

				if (field772 != class473.Client_plane) { // L: 3370
					field772 = class473.Client_plane; // L: 3371
					Decimator.method1096(class473.Client_plane); // L: 3372
				}

				if (gameState == 30) { // L: 3375
					class59.method1135(); // L: 3376

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3378
						var10002 = queuedSoundEffectDelays[var1]--; // L: 3379
						if (queuedSoundEffectDelays[var1] >= -10) { // L: 3380
							SoundEffect var41 = soundEffects[var1]; // L: 3393
							if (var41 == null) { // L: 3394
								var10000 = null; // L: 3395
								var41 = SoundEffect.readSoundEffect(class376.field4387, soundEffectIds[var1], 0);
								if (var41 == null) { // L: 3396
									continue;
								}

								int[] var55 = queuedSoundEffectDelays; // L: 3397
								var55[var1] += var41.calculateDelay();
								soundEffects[var1] = var41; // L: 3398
							}

							if (queuedSoundEffectDelays[var1] < 0) { // L: 3404
								if (soundLocations[var1] != 0) { // L: 3406
									var4 = (soundLocations[var1] & 255) * 128; // L: 3407
									var5 = soundLocations[var1] >> 16 & 255; // L: 3408
									var6 = Math.abs(var5 * 128 + 64 - VarpDefinition.localPlayer.x); // L: 3409
									var7 = soundLocations[var1] >> 8 & 255; // L: 3410
									var8 = Math.abs(var7 * 128 + 64 - VarpDefinition.localPlayer.y); // L: 3411
									var9 = Math.max(var8 + var6 - 128, 0); // L: 3412
									var10 = Math.max(((field554[var1] & 31) - 1) * 128, 0); // L: 3413
									if (var9 >= var4) { // L: 3414
										queuedSoundEffectDelays[var1] = -100; // L: 3415
										continue; // L: 3416
									}

									float var37 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F; // L: 3418
									var3 = (int)(var37 * (float)class30.clientPreferences.method2572()); // L: 3419
								} else {
									var3 = class30.clientPreferences.method2622(); // L: 3421
								}

								if (var3 > 0) { // L: 3422
									RawSound var23 = var41.toRawSound().resample(class73.field919); // L: 3423
									RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3); // L: 3424
									var24.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3425
									SceneTilePaint.pcmStreamMixer.addSubStream(var24); // L: 3426
								}

								queuedSoundEffectDelays[var1] = -100; // L: 3428
							}
						} else {
							--soundEffectCount; // L: 3381

							for (var2 = var1; var2 < soundEffectCount; ++var2) { // L: 3382
								soundEffectIds[var2] = soundEffectIds[var2 + 1]; // L: 3383
								soundEffects[var2] = soundEffects[var2 + 1]; // L: 3384
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1]; // L: 3385
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1]; // L: 3386
								soundLocations[var2] = soundLocations[var2 + 1]; // L: 3387
								field554[var2] = field554[var2 + 1]; // L: 3388
							}

							--var1; // L: 3390
						}
					}

					if (playingJingle) { // L: 3431
						boolean var33;
						if (!class321.field3481.isEmpty()) { // L: 3434
							var33 = true; // L: 3435
						} else if (!class321.field3474.isEmpty() && class321.field3474.get(0) != null && ((class333)class321.field3474.get(0)).field3594 != null) { // L: 3438
							var33 = ((class333)class321.field3474.get(0)).field3594.isReady(); // L: 3442
						} else {
							var33 = false; // L: 3439
						}

						if (!var33) { // L: 3444
							if (class30.clientPreferences.method2544() != 0 && VarbitComposition.method3831()) { // L: 3445
								Interpreter.method2056(Renderable.field2921, class30.clientPreferences.method2544()); // L: 3446
							}

							playingJingle = false; // L: 3448
						}
					}

					++packetWriter.field1432; // L: 3452
					if (packetWriter.field1432 > 750) { // L: 3453
						Huffman.method6966(); // L: 3454
					} else {
						AbstractByteArrayCopier.method6954(); // L: 3457
						Login.method2178(); // L: 3458
						int[] var38 = Players.Players_indices; // L: 3460

						for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 3461
							Player var25 = players[var38[var2]]; // L: 3462
							if (var25 != null && var25.overheadTextCyclesRemaining > 0) { // L: 3463
								--var25.overheadTextCyclesRemaining; // L: 3464
								if (var25.overheadTextCyclesRemaining == 0) { // L: 3465
									var25.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) { // L: 3468
							var3 = npcIndices[var2]; // L: 3469
							NPC var46 = npcs[var3]; // L: 3470
							if (var46 != null && var46.overheadTextCyclesRemaining > 0) { // L: 3471
								--var46.overheadTextCyclesRemaining; // L: 3472
								if (var46.overheadTextCyclesRemaining == 0) { // L: 3473
									var46.overheadText = null;
								}
							}
						}

						++field604; // L: 3477
						if (mouseCrossColor != 0) { // L: 3478
							mouseCrossState = mouseCrossState * 400 + 400; // L: 3479
							if (mouseCrossState * 20 >= 400) { // L: 3480
								mouseCrossColor = 0;
							}
						}

						Widget var39 = class134.mousedOverWidgetIf1; // L: 3482
						Widget var43 = FontName.field5062; // L: 3483
						class134.mousedOverWidgetIf1 = null; // L: 3484
						FontName.field5062 = null; // L: 3485
						draggedOnWidget = null; // L: 3486
						field810 = false; // L: 3487
						field746 = false; // L: 3488
						field706 = 0; // L: 3489

						while (field792.method4431() && field706 < 128) { // L: 3490
							if (staffModLevel >= 2 && field792.method4466(82) && field792.field2434 == 66) { // L: 3491
								StringBuilder var47 = new StringBuilder(); // L: 3494

								Message var42;
								for (Iterator var49 = Messages.Messages_hashTable.iterator(); var49.hasNext(); var47.append(var42.text).append('\n')) { // L: 3495 3501
									var42 = (Message)var49.next(); // L: 3496
									if (var42.sender != null && !var42.sender.isEmpty()) { // L: 3498
										var47.append(var42.sender).append(':'); // L: 3499
									}
								}

								String var51 = var47.toString(); // L: 3504
								class193.client.method463(var51); // L: 3507
							} else if (oculusOrbState != 1 || field792.field2428 <= 0) { // L: 3510
								field768[field706] = field792.field2434; // L: 3513
								field660[field706] = field792.field2428; // L: 3514
								++field706; // L: 3515
							}
						}

						boolean var34 = staffModLevel >= 2; // L: 3519
						if (var34 && field792.method4466(82) && field792.method4466(81) && mouseWheelRotation != 0) { // L: 3521
							var4 = VarpDefinition.localPlayer.plane - mouseWheelRotation; // L: 3522
							if (var4 < 0) { // L: 3523
								var4 = 0;
							} else if (var4 > 3) { // L: 3524
								var4 = 3;
							}

							if (var4 != VarpDefinition.localPlayer.plane) { // L: 3525
								Login.method2195(VarpDefinition.localPlayer.pathX[0] + Projectile.baseX * 64, VarpDefinition.localPlayer.pathY[0] + GameEngine.baseY * 8, var4, false); // L: 3526
							}

							mouseWheelRotation = 0; // L: 3528
						}

						if (rootInterface != -1) { // L: 3530
							ClanSettings.method3336(rootInterface, 0, 0, GameEngine.canvasWidth, WorldMapArea.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3531

						while (true) {
							Widget var44;
							ScriptEvent var48;
							Widget var50;
							do {
								var48 = (ScriptEvent)field802.removeLast(); // L: 3533
								if (var48 == null) { // L: 3534
									while (true) {
										do {
											var48 = (ScriptEvent)field533.removeLast(); // L: 3545
											if (var48 == null) { // L: 3546
												while (true) {
													do {
														var48 = (ScriptEvent)scriptEvents.removeLast(); // L: 3557
														if (var48 == null) { // L: 3558
															boolean var35 = false; // L: 3568

															while (true) {
																class227 var52 = (class227)field744.removeLast(); // L: 3570
																if (var52 == null) { // L: 3571
																	if (!var35 && MouseHandler.MouseHandler_lastButton == 1) { // L: 3628
																		field737.method4394(); // L: 3629
																	}

																	this.menu(); // L: 3631
																	if (Tiles.worldMap != null) { // L: 3633
																		Tiles.worldMap.method8911(class473.Client_plane, Projectile.baseX * 64 + (VarpDefinition.localPlayer.x >> 7), GameEngine.baseY * 8 + (VarpDefinition.localPlayer.y >> 7), false); // L: 3634
																		Tiles.worldMap.loadCache(); // L: 3635
																	}

																	if (clickedWidget != null) { // L: 3638
																		this.method1559();
																	}

																	if (Scene.shouldSendWalk()) { // L: 3639
																		var5 = Scene.Scene_selectedX; // L: 3640
																		var6 = Scene.Scene_selectedY; // L: 3641
																		PacketBufferNode var28 = ViewportMouse.getPacketBufferNode(ClientPacket.field3256, packetWriter.isaacCipher); // L: 3643
																		var28.packetBuffer.writeByte(5); // L: 3644
																		var28.packetBuffer.method9505(field792.method4466(82) ? (field792.method4466(81) ? 2 : 1) : 0); // L: 3645
																		var28.packetBuffer.method9548(Projectile.baseX * 64 + var5); // L: 3646
																		var28.packetBuffer.method9548(GameEngine.baseY * 8 + var6); // L: 3647
																		packetWriter.addNode(var28); // L: 3648
																		Scene.method5462(); // L: 3649
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3650
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3651
																		mouseCrossColor = 1; // L: 3652
																		mouseCrossState = 0; // L: 3653
																		destinationX = var5; // L: 3654
																		destinationY = var6; // L: 3655
																	}

																	if (var39 != class134.mousedOverWidgetIf1) { // L: 3657
																		if (var39 != null) { // L: 3658
																			UserComparator5.invalidateWidget(var39);
																		}

																		if (class134.mousedOverWidgetIf1 != null) { // L: 3659
																			UserComparator5.invalidateWidget(class134.mousedOverWidgetIf1);
																		}
																	}

																	if (var43 != FontName.field5062 && field689 == field690) { // L: 3661
																		if (var43 != null) { // L: 3662
																			UserComparator5.invalidateWidget(var43);
																		}

																		if (FontName.field5062 != null) { // L: 3663
																			UserComparator5.invalidateWidget(FontName.field5062);
																		}
																	}

																	if (FontName.field5062 != null) { // L: 3665
																		if (field689 < field690) { // L: 3666
																			++field689; // L: 3667
																			if (field690 == field689) { // L: 3668
																				UserComparator5.invalidateWidget(FontName.field5062);
																			}
																		}
																	} else if (field689 > 0) { // L: 3671
																		--field689;
																	}

																	class315.load(); // L: 3672
																	if (field728) { // L: 3673
																		class7.method53(class362.field3961, ArchiveDiskAction.field4355, class276.field2914); // L: 3674
																		ScriptEvent.method2360(WorldMapCacheName.field2683, FriendsChatManager.field4736); // L: 3675
																		if (class362.field3961 == FriendsChatMember.cameraX && ArchiveDiskAction.field4355 == class18.cameraY && class276.field2914 == class317.cameraZ && WorldMapCacheName.field2683 == FriendSystem.cameraPitch && Script.cameraYaw == FriendsChatManager.field4736) { // L: 3676
																			field728 = false; // L: 3677
																			isCameraLocked = false; // L: 3678
																			field789 = false; // L: 3679
																			field790 = false; // L: 3680
																			VarbitComposition.field2065 = 0; // L: 3681
																			class11.field46 = 0; // L: 3682
																			ChatChannel.field1045 = 0; // L: 3683
																			class135.field1618 = 0; // L: 3684
																			class18.field86 = 0; // L: 3685
																			GameBuild.field3978 = 0; // L: 3686
																			class516.field5118 = 0; // L: 3687
																			WorldMapArea.field2529 = 0; // L: 3688
																			UserComparator7.field1462 = 0; // L: 3689
																			WorldMapSectionType.field2609 = 0; // L: 3690
																			field813 = null; // L: 3691
																			field794 = null; // L: 3692
																			field793 = null; // L: 3693
																		}
																	} else if (isCameraLocked) { // L: 3696
																		class192.method3779();
																	}

																	for (var5 = 0; var5 < 5; ++var5) { // L: 3697
																		var10002 = field754[var5]++;
																	}

																	ScriptFrame.varcs.tryWrite(); // L: 3698
																	var5 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3701
																	var7 = class431.method8099(); // L: 3704
																	PacketBufferNode var53;
																	if (var5 > 15000 && var7 > 15000) { // L: 3705
																		logoutTimer = 250; // L: 3706
																		Archive.method7069(14500); // L: 3707
																		var53 = ViewportMouse.getPacketBufferNode(ClientPacket.field3187, packetWriter.isaacCipher); // L: 3709
																		packetWriter.addNode(var53); // L: 3710
																	}

																	InterfaceParent.friendSystem.processFriendUpdates(); // L: 3712

																	for (var8 = 0; var8 < field826.size(); ++var8) { // L: 3714
																		var10 = (Integer)field826.get(var8); // L: 3716
																		class140 var29 = (class140)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var10); // L: 3720
																		class140 var30;
																		if (var29 != null) { // L: 3721
																			var30 = var29; // L: 3722
																		} else {
																			var29 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var10, false); // L: 3725
																			if (var29 != null) { // L: 3726
																				SequenceDefinition.SequenceDefinition_cachedModel.put(var29, (long)var10);
																			}

																			var30 = var29; // L: 3727
																		}

																		if (var30 == null) { // L: 3730
																			var9 = 2; // L: 3731
																		} else {
																			var9 = var30.method3160() ? 0 : 1; // L: 3734
																		}

																		if (var9 != 2) { // L: 3736
																			field826.remove(var8); // L: 3737
																			--var8; // L: 3738
																		}
																	}

																	++packetWriter.pendingWrites; // L: 3742
																	if (packetWriter.pendingWrites > 50) { // L: 3743
																		var53 = ViewportMouse.getPacketBufferNode(ClientPacket.field3225, packetWriter.isaacCipher); // L: 3745
																		packetWriter.addNode(var53); // L: 3746
																	}

																	try {
																		packetWriter.flush(); // L: 3749
																	} catch (IOException var31) { // L: 3751
																		Huffman.method6966(); // L: 3752
																	}

																	VarbitComposition.method3830().method4268(); // L: 3754
																	return; // L: 3755
																}

																if (var52.field2420.type == 12) { // L: 3572
																	var35 = true;
																}

																if (var52 != null && var52.field2420 != null) { // L: 3574
																	if (var52.field2420.childIndex >= 0) { // L: 3575
																		var44 = ArchiveLoader.field1070.method6431(var52.field2420.parentId); // L: 3576
																		if (var44 == null || var44.children == null || var44.children.length == 0 || var52.field2420.childIndex >= var44.children.length || var52.field2420 != var44.children[var52.field2420.childIndex]) { // L: 3577
																			continue;
																		}
																	}

																	if (var52.field2420.type == 11 && var52.field2419 == 0) { // L: 3581
																		if (var52.field2420.method6888(var52.field2417, var52.field2418, 0, 0)) { // L: 3582
																			var52.field2420.method6819().method4161().method4262(1, var52.field2420.method6819().method4141()); // L: 3583
																			switch(var52.field2420.method6815()) { // L: 3584
																			case 0:
																				class137.openURL(var52.field2420.method6817(), true, false); // L: 3606
																				break;
																			case 1:
																				var7 = class429.getWidgetFlags(var52.field2420); // L: 3587
																				boolean var36 = (var7 >> 22 & 1) != 0; // L: 3589
																				if (var36) { // L: 3591
																					int[] var26 = var52.field2420.method6824(); // L: 3592
																					if (var26 != null) { // L: 3593
																						PacketBufferNode var27 = ViewportMouse.getPacketBufferNode(ClientPacket.field3190, packetWriter.isaacCipher); // L: 3594
																						var27.packetBuffer.method9525(var52.field2420.id); // L: 3595
																						var27.packetBuffer.writeShort(var52.field2420.childIndex); // L: 3596
																						var27.packetBuffer.writeInt(var26[0]); // L: 3597
																						var27.packetBuffer.writeInt(var26[1]); // L: 3598
																						var27.packetBuffer.method9677(var52.field2420.method6816()); // L: 3599
																						var27.packetBuffer.method9528(var26[2]); // L: 3600
																						packetWriter.addNode(var27); // L: 3601
																					}
																				}
																			}
																		}
																	} else if (var52.field2420.type == 12) { // L: 3611
																		class347 var45 = var52.field2420.method6806(); // L: 3612
																		if (var45 != null && var45.method6558()) { // L: 3613
																			switch(var52.field2419) { // L: 3614
																			case 0:
																				field737.method4402(var52.field2420); // L: 3616
																				var45.method6722(true); // L: 3617
																				var45.method6545(var52.field2417, var52.field2418, field792.method4466(82), field792.method4466(81)); // L: 3618
																				break; // L: 3619
																			case 1:
																				var45.method6546(var52.field2417, var52.field2418); // L: 3621
																			}
																		}
																	}
																}
															}
														}

														var50 = var48.widget; // L: 3559
														if (var50.childIndex < 0) { // L: 3560
															break;
														}

														var44 = ArchiveLoader.field1070.method6431(var50.parentId); // L: 3561
													} while(var44 == null || var44.children == null || var50.childIndex >= var44.children.length || var50 != var44.children[var50.childIndex]); // L: 3562

													class177.runScriptEvent(var48); // L: 3566
												}
											}

											var50 = var48.widget; // L: 3547
											if (var50.childIndex < 0) { // L: 3548
												break;
											}

											var44 = ArchiveLoader.field1070.method6431(var50.parentId); // L: 3549
										} while(var44 == null || var44.children == null || var50.childIndex >= var44.children.length || var50 != var44.children[var50.childIndex]); // L: 3550

										class177.runScriptEvent(var48); // L: 3554
									}
								}

								var50 = var48.widget; // L: 3535
								if (var50.childIndex < 0) { // L: 3536
									break;
								}

								var44 = ArchiveLoader.field1070.method6431(var50.parentId); // L: 3537
							} while(var44 == null || var44.children == null || var50.childIndex >= var44.children.length || var50 != var44.children[var50.childIndex]); // L: 3538

							class177.runScriptEvent(var48); // L: 3542
						}
					}
				}
			}
		}
	} // L: 3163 3455

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "4"
	)
	public void vmethod6339(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 3861
			if (var1 > -1 && class30.clientPreferences.method2544() > 0 && !playingJingle) { // L: 3862
				PacketBufferNode var3 = ViewportMouse.getPacketBufferNode(ClientPacket.field3195, packetWriter.isaacCipher); // L: 3863
				var3.packetBuffer.writeInt(var1); // L: 3864
				packetWriter.addNode(var3); // L: 3865
			}

		}
	} // L: 3867

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1161058155"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth; // L: 4662
		int var2 = WorldMapArea.canvasHeight; // L: 4663
		if (super.contentWidth < var1) { // L: 4664
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 4665
			var2 = super.contentHeight;
		}

		if (class30.clientPreferences != null) { // L: 4666
			try {
				Client var3 = class193.client; // L: 4668
				Object[] var4 = new Object[]{AbstractUserComparator.getWindowedMode()}; // L: 4669
				JSObject.getWindow(var3).call("resize", var4); // L: 4672
			} catch (Throwable var5) { // L: 4675
			}
		}

	} // L: 4677

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1160675343"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4680
			WorldMapManager.method4881(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4681
			if (field816[var1]) { // L: 4682
				field721[var1] = true;
			}

			field570[var1] = field816[var1]; // L: 4683
			field816[var1] = false; // L: 4684
		}

		field832 = cycle; // L: 4686
		viewportX = -1; // L: 4687
		viewportY = -1; // L: 4688
		if (rootInterface != -1) { // L: 4689
			rootWidgetCount = 0; // L: 4690
			class228.method4456(rootInterface, 0, 0, GameEngine.canvasWidth, WorldMapArea.canvasHeight, 0, 0, -1); // L: 4691
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4693
		if (showMouseCross) { // L: 4694
			if (mouseCrossColor == 1) { // L: 4695
				GrandExchangeOfferOwnWorldComparator.field492[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4696
			}

			if (mouseCrossColor == 2) { // L: 4698
				GrandExchangeOfferOwnWorldComparator.field492[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4699
			}
		}

		if (!isMenuOpen) { // L: 4702
			if (viewportX != -1) { // L: 4703
				class18.method252(viewportX, viewportY);
			}
		} else {
			class169.method3518(); // L: 4705
		}

		if (field755 == 3) { // L: 4706
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4707
				if (field570[var1]) { // L: 4708
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4709
				} else if (field721[var1]) { // L: 4711
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4712
				}
			}
		}

		var1 = class473.Client_plane; // L: 4716
		int var2 = VarpDefinition.localPlayer.x; // L: 4717
		int var3 = VarpDefinition.localPlayer.y; // L: 4718
		int var4 = field604; // L: 4719

		for (ObjectSound var5 = (ObjectSound)ObjectSound.objectSounds.last(); var5 != null; var5 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4721
			if (var5.soundEffectId != -1 || var5.field874 != null) { // L: 4722
				int var6 = 0; // L: 4723
				if (var2 > var5.maxX * 16384) { // L: 4724
					var6 += var2 - var5.maxX * 16384;
				} else if (var2 < var5.x * 128) { // L: 4725
					var6 += var5.x * 128 - var2;
				}

				if (var3 > var5.maxY * 16384) { // L: 4726
					var6 += var3 - var5.maxY * 16384;
				} else if (var3 < var5.y * 16384) { // L: 4727
					var6 += var5.y * 16384 - var3;
				}

				var6 = Math.max(var6 - 64, 0); // L: 4728
				if (var6 < var5.field872 && class30.clientPreferences.method2572() != 0 && var1 == var5.plane) { // L: 4729
					float var7 = var5.field864 < var5.field872 ? Math.min(Math.max((float)(var5.field872 - var6) / (float)(var5.field872 - var5.field864), 0.0F), 1.0F) : 1.0F; // L: 4740
					int var8 = (int)(var7 * (float)class30.clientPreferences.method2572()); // L: 4741
					Object var10000;
					if (var5.stream1 == null) { // L: 4742
						if (var5.soundEffectId >= 0) { // L: 4743
							var10000 = null; // L: 4744
							SoundEffect var9 = SoundEffect.readSoundEffect(class376.field4387, var5.soundEffectId, 0);
							if (var9 != null) { // L: 4745
								RawSound var10 = var9.toRawSound().resample(class73.field919); // L: 4746
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var8); // L: 4747
								var11.setNumLoops(-1); // L: 4748
								SceneTilePaint.pcmStreamMixer.addSubStream(var11); // L: 4749
								var5.stream1 = var11; // L: 4750
							}
						}
					} else {
						var5.stream1.method919(var8); // L: 4754
					}

					if (var5.stream2 == null) { // L: 4755
						if (var5.field874 != null && (var5.field878 -= var4) <= 0) { // L: 4756
							int var13 = (int)(Math.random() * (double)var5.field874.length); // L: 4757
							var10000 = null; // L: 4758
							SoundEffect var14 = SoundEffect.readSoundEffect(class376.field4387, var5.field874[var13], 0);
							if (var14 != null) { // L: 4759
								RawSound var15 = var14.toRawSound().resample(class73.field919); // L: 4760
								RawPcmStream var12 = RawPcmStream.createRawPcmStream(var15, 100, var8); // L: 4761
								var12.setNumLoops(0); // L: 4762
								SceneTilePaint.pcmStreamMixer.addSubStream(var12); // L: 4763
								var5.stream2 = var12; // L: 4764
								var5.field878 = var5.field875 + (int)(Math.random() * (double)(var5.field877 - var5.field875)); // L: 4765
							}
						}
					} else {
						var5.stream2.method919(var8); // L: 4770
						if (!var5.stream2.hasNext()) { // L: 4771
							var5.stream2 = null; // L: 4772
						}
					}
				} else {
					if (var5.stream1 != null) { // L: 4730
						SceneTilePaint.pcmStreamMixer.removeSubStream(var5.stream1); // L: 4731
						var5.stream1 = null; // L: 4732
					}

					if (var5.stream2 != null) { // L: 4734
						SceneTilePaint.pcmStreamMixer.removeSubStream(var5.stream2); // L: 4735
						var5.stream2 = null; // L: 4736
					}
				}
			}
		}

		field604 = 0; // L: 4777
	} // L: 4778

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Lek;IB)Z",
		garbageValue = "63"
	)
	boolean method1670(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6439
			Projectile.friendsChatManager = null; // L: 6440
		} else {
			if (Projectile.friendsChatManager == null) { // L: 6443
				Projectile.friendsChatManager = new FriendsChatManager(FriendLoginUpdate.loginType, class193.client); // L: 6444
			}

			Projectile.friendsChatManager.method8277(var1.packetBuffer, var2); // L: 6446
		}

		field733 = cycleCntr; // L: 6449
		DevicePcmPlayerProvider.FriendsChatManager_inFriendsChat = true; // L: 6450
		var1.serverPacket = null; // L: 6452
		return true; // L: 6453
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)Z",
		garbageValue = "746554953"
	)
	boolean method1234(PacketWriter var1) {
		if (Projectile.friendsChatManager != null) { // L: 6457
			Projectile.friendsChatManager.method8268(var1.packetBuffer); // L: 6458
		}

		field733 = cycleCntr; // L: 6461
		DevicePcmPlayerProvider.FriendsChatManager_inFriendsChat = true; // L: 6462
		var1.serverPacket = null; // L: 6464
		return true; // L: 6465
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)Z",
		garbageValue = "-575176954"
	)
	final boolean method1295(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6470
		PacketBuffer var3 = var1.packetBuffer; // L: 6471
		if (var2 == null) { // L: 6472
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6474
					if (var1.field1431) { // L: 6475
						if (!var2.isAvailable(1)) { // L: 6476
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6477
						var1.field1432 = 0; // L: 6478
						var1.field1431 = false; // L: 6479
					}

					var3.offset = 0; // L: 6481
					if (var3.method9431()) { // L: 6482
						if (!var2.isAvailable(1)) { // L: 6483
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6484
						var1.field1432 = 0; // L: 6485
					}

					var1.field1431 = true; // L: 6487
					ServerPacket[] var4 = NPCComposition.method3704(); // L: 6488
					var5 = var3.readSmartByteShortIsaac(); // L: 6489
					if (var5 < 0 || var5 >= var4.length) { // L: 6490
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6491
					var1.serverPacketLength = var1.serverPacket.length; // L: 6492
				}

				if (var1.serverPacketLength == -1) { // L: 6494
					if (!var2.isAvailable(1)) { // L: 6495
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6496
					var1.serverPacketLength = var3.array[0] & 255; // L: 6497
				}

				if (var1.serverPacketLength == -2) { // L: 6499
					if (!var2.isAvailable(2)) { // L: 6500
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6501
					var3.offset = 0; // L: 6502
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6503
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6505
					return false;
				}

				var3.offset = 0; // L: 6506
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6507
				var1.field1432 = 0; // L: 6508
				timer.method8120(); // L: 6509
				var1.field1424 = var1.field1435; // L: 6510
				var1.field1435 = var1.field1423; // L: 6511
				var1.field1423 = var1.serverPacket; // L: 6512
				int var7;
				int var66;
				if (ServerPacket.field3325 == var1.serverPacket) { // L: 6513
					var66 = var3.readUnsignedByte(); // L: 6514
					var5 = var3.readUnsignedByte(); // L: 6515
					var6 = var3.readUnsignedByte(); // L: 6516
					var7 = var3.readUnsignedByte(); // L: 6517
					field797[var66] = true; // L: 6518
					field798[var66] = var5; // L: 6519
					field799[var66] = var6; // L: 6520
					field800[var66] = var7; // L: 6521
					field754[var66] = 0; // L: 6522
					var1.serverPacket = null; // L: 6523
					return true; // L: 6524
				}

				Widget var68;
				if (ServerPacket.field3361 == var1.serverPacket) { // L: 6526
					var66 = var3.method9529(); // L: 6527
					var68 = ArchiveLoader.field1070.method6431(var66); // L: 6528
					var68.modelType = 3; // L: 6529
					var68.modelId = VarpDefinition.localPlayer.appearance.getChatHeadId(); // L: 6530
					UserComparator5.invalidateWidget(var68); // L: 6531
					var1.serverPacket = null; // L: 6532
					return true; // L: 6533
				}

				int var8;
				byte var9;
				byte var10;
				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var56;
				int var57;
				if (ServerPacket.field3336 == var1.serverPacket) { // L: 6535
					var12 = var3.readUnsignedShort(); // L: 6551
					var14 = var3.method9506() * 4; // L: 6552
					var16 = var3.method9636(); // L: 6553
					var6 = var3.method9523(); // L: 6554
					var66 = var6 >> 16; // L: 6555
					var5 = var6 >> 8 & 255; // L: 6556
					var7 = var66 + (var6 >> 4 & 7); // L: 6557
					var8 = var5 + (var6 & 7); // L: 6558
					var17 = var3.method9579(); // L: 6559
					var18 = var3.readUnsignedByte(); // L: 6560
					var10 = var3.method9509(); // L: 6561
					var11 = var3.method9478(); // L: 6562
					var15 = var3.method9703(); // L: 6563
					var9 = var3.method9510(); // L: 6564
					var13 = var3.readUnsignedByte() * 4; // L: 6565
					var56 = var9 + var7; // L: 6566
					var57 = var10 + var8; // L: 6567
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var12 != 65535) { // L: 6568
						var7 = var7 * 128 + 64; // L: 6569
						var8 = var8 * 128 + 64; // L: 6570
						var56 = var56 * 128 + 64; // L: 6571
						var57 = var57 * 128 + 64; // L: 6572
						var19 = new Projectile(var12, class473.Client_plane, var7, var8, class272.getTileHeight(var7, var8, class473.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14); // L: 6573
						var19.setDestination(var56, var57, class272.getTileHeight(var56, var57, class473.Client_plane) - var14, var15 + cycle); // L: 6574
						projectiles.addFirst(var19); // L: 6575
					}

					var1.serverPacket = null; // L: 6577
					return true; // L: 6578
				}

				if (ServerPacket.field3415 == var1.serverPacket) { // L: 6580
					InterfaceParent.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6581
					class224.FriendSystem_invalidateIgnoreds(); // L: 6582
					field732 = cycleCntr; // L: 6583
					var1.serverPacket = null; // L: 6584
					return true; // L: 6585
				}

				Widget var73;
				if (ServerPacket.field3346 == var1.serverPacket) { // L: 6587
					var66 = var3.method9703(); // L: 6588
					var5 = var3.method9636(); // L: 6589
					var6 = var3.method9529(); // L: 6590
					var7 = var3.method9492(); // L: 6591
					var73 = ArchiveLoader.field1070.method6431(var6); // L: 6592
					if (var66 != var73.modelAngleX || var5 != var73.modelAngleY || var7 != var73.modelZoom) { // L: 6593
						var73.modelAngleX = var66; // L: 6594
						var73.modelAngleY = var5; // L: 6595
						var73.modelZoom = var7; // L: 6596
						UserComparator5.invalidateWidget(var73); // L: 6597
					}

					var1.serverPacket = null; // L: 6599
					return true; // L: 6600
				}

				if (ServerPacket.field3400 == var1.serverPacket) { // L: 6602
					for (var66 = 0; var66 < VarpDefinition.field1855; ++var66) { // L: 6603
						VarpDefinition var82 = class148.VarpDefinition_get(var66); // L: 6604
						if (var82 != null) { // L: 6605
							Varps.Varps_temp[var66] = 0; // L: 6606
							Varps.Varps_main[var66] = 0; // L: 6607
						}
					}

					class67.method1206(); // L: 6610
					field823 += 32; // L: 6611
					var1.serverPacket = null; // L: 6612
					return true; // L: 6613
				}

				if (ServerPacket.field3330 == var1.serverPacket) { // L: 6615
					var66 = var3.readInt(); // L: 6616
					InterfaceParent var81 = (InterfaceParent)interfaceParents.get((long)var66); // L: 6617
					if (var81 != null) { // L: 6618
						SecureRandomFuture.closeInterface(var81, true);
					}

					if (meslayerContinueWidget != null) { // L: 6619
						UserComparator5.invalidateWidget(meslayerContinueWidget); // L: 6620
						meslayerContinueWidget = null; // L: 6621
					}

					var1.serverPacket = null; // L: 6623
					return true; // L: 6624
				}

				if (ServerPacket.field3357 == var1.serverPacket) { // L: 6626
					var6 = var3.method9522(); // L: 6637
					var66 = var6 >> 16; // L: 6638
					var5 = var6 >> 8 & 255; // L: 6639
					var7 = var66 + (var6 >> 4 & 7); // L: 6640
					var8 = var5 + (var6 & 7); // L: 6641
					var56 = var3.method9605(); // L: 6642
					var57 = var56 >> 2; // L: 6643
					var11 = var56 & 3; // L: 6644
					var12 = field602[var57]; // L: 6645
					var13 = var3.method9492(); // L: 6646
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 6647
						class170.method3523(class473.Client_plane, var7, var8, var57, var11, var12, var13); // L: 6648
					}

					var1.serverPacket = null; // L: 6650
					return true; // L: 6651
				}

				String var50;
				if (ServerPacket.field3341 == var1.serverPacket) { // L: 6653
					var50 = var3.readStringCp1252NullTerminated(); // L: 6654
					Object[] var80 = new Object[var50.length() + 1]; // L: 6655

					for (var6 = var50.length() - 1; var6 >= 0; --var6) { // L: 6656
						if (var50.charAt(var6) == 's') { // L: 6657
							var80[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var80[var6 + 1] = new Integer(var3.readInt()); // L: 6658
						}
					}

					var80[0] = new Integer(var3.readInt()); // L: 6660
					ScriptEvent var89 = new ScriptEvent(); // L: 6661
					var89.args = var80; // L: 6662
					class177.runScriptEvent(var89); // L: 6663
					var1.serverPacket = null; // L: 6664
					return true; // L: 6665
				}

				if (ServerPacket.field3414 == var1.serverPacket) { // L: 6667
					class67.method1206(); // L: 6668
					var66 = var3.method9530(); // L: 6669
					var5 = var3.readUnsignedByte(); // L: 6670
					var6 = var3.method9579(); // L: 6671
					experience[var6] = var66; // L: 6672
					currentLevels[var6] = var5; // L: 6673
					levels[var6] = 1; // L: 6674
					field672[var6] = var5; // L: 6675

					for (var7 = 0; var7 < 98; ++var7) { // L: 6676
						if (var66 >= Skills.Skills_experienceTable[var7]) {
							levels[var6] = var7 + 2;
						}
					}

					field727[++field782 - 1 & 31] = var6; // L: 6677
					var1.serverPacket = null; // L: 6678
					return true; // L: 6679
				}

				if (ServerPacket.field3359 == var1.serverPacket) { // L: 6681
					var66 = var3.readUnsignedShort(); // L: 6682
					var5 = var3.readUnsignedByte(); // L: 6683
					var6 = var3.readUnsignedShort(); // L: 6684
					class134.queueSoundEffect(var66, var5, var6); // L: 6685
					var1.serverPacket = null; // L: 6686
					return true; // L: 6687
				}

				if (ServerPacket.field3320 == var1.serverPacket) { // L: 6689
					isCameraLocked = true; // L: 6690
					field728 = false; // L: 6691
					field789 = true; // L: 6692
					WorldMapArea.field2529 = var3.readUnsignedByte() * 16384; // L: 6693
					UserComparator7.field1462 = var3.readUnsignedByte() * 16384; // L: 6694
					var66 = var3.readUnsignedShort(); // L: 6695
					var5 = var3.readUnsignedShort(); // L: 6696
					field614 = var3.readBoolean(); // L: 6697
					var6 = var3.readUnsignedByte(); // L: 6698
					var7 = WorldMapArea.field2529 * 128 + 64; // L: 6699
					var8 = UserComparator7.field1462 * 128 + 64; // L: 6700
					boolean var64 = false; // L: 6701
					boolean var62 = false; // L: 6702
					if (field614) { // L: 6703
						var56 = class18.cameraY; // L: 6704
						var57 = class272.getTileHeight(var7, var8, class473.Client_plane) - var66; // L: 6705
					} else {
						var56 = class272.getTileHeight(FriendsChatMember.cameraX, class317.cameraZ, class473.Client_plane) - class18.cameraY; // L: 6708
						var57 = var66; // L: 6709
					}

					field813 = new class496(FriendsChatMember.cameraX, class317.cameraZ, var56, var7, var8, var57, var5, var6); // L: 6711
					var1.serverPacket = null; // L: 6712
					return true; // L: 6713
				}

				if (ServerPacket.field3399 == var1.serverPacket) { // L: 6715
					rebootTimer = var3.method9636() * 30; // L: 6716
					field738 = cycleCntr; // L: 6717
					var1.serverPacket = null; // L: 6718
					return true; // L: 6719
				}

				if (ServerPacket.field3412 == var1.serverPacket) { // L: 6721
					VarpDefinition.readReflectionCheck(var3, var1.serverPacketLength); // L: 6722
					var1.serverPacket = null; // L: 6723
					return true; // L: 6724
				}

				if (ServerPacket.field3401 == var1.serverPacket) { // L: 6726
					InterfaceParent.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6727
					field732 = cycleCntr; // L: 6728
					var1.serverPacket = null; // L: 6729
					return true; // L: 6730
				}

				Widget var24;
				if (ServerPacket.field3315 == var1.serverPacket) { // L: 6732
					var66 = var3.method9518(); // L: 6733
					var5 = var3.method9530(); // L: 6734
					var6 = var3.method9519(); // L: 6735
					var24 = ArchiveLoader.field1070.method6431(var5); // L: 6736
					if (var6 != var24.rawX || var66 != var24.rawY || var24.xAlignment != 0 || var24.yAlignment != 0) { // L: 6737
						var24.rawX = var6; // L: 6738
						var24.rawY = var66; // L: 6739
						var24.xAlignment = 0; // L: 6740
						var24.yAlignment = 0; // L: 6741
						UserComparator5.invalidateWidget(var24); // L: 6742
						this.alignWidget(var24); // L: 6743
						if (var24.type == 0) { // L: 6744
							class167.revalidateWidgetScroll(ArchiveLoader.field1070.field3633[var5 >> 16], var24, false);
						}
					}

					var1.serverPacket = null; // L: 6746
					return true; // L: 6747
				}

				byte var20;
				long var25;
				long var27;
				long var29;
				String var32;
				boolean var60;
				if (ServerPacket.field3383 == var1.serverPacket) { // L: 6749
					var20 = var3.readByte(); // L: 6750
					var25 = (long)var3.readUnsignedShort(); // L: 6751
					var27 = (long)var3.readMedium(); // L: 6752
					var29 = var27 + (var25 << 32); // L: 6753
					var60 = false; // L: 6754
					ClanChannel var88 = var20 >= 0 ? currentClanChannels[var20] : class316.guestClanChannel; // L: 6755
					if (var88 == null) { // L: 6756
						var60 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6758
							if (field762[var13] == var29) { // L: 6759
								var60 = true; // L: 6760
								break; // L: 6761
							}
						}
					}

					if (!var60) { // L: 6765
						field762[field763] = var29; // L: 6766
						field763 = (field763 + 1) % 100; // L: 6767
						var32 = class495.method8856(var3); // L: 6768
						var14 = var20 >= 0 ? 43 : 46; // L: 6769
						Message.addChatMessage(var14, "", var32, var88.name); // L: 6770
					}

					var1.serverPacket = null; // L: 6772
					return true; // L: 6773
				}

				if (ServerPacket.field3397 == var1.serverPacket) { // L: 6775
					var66 = var3.readUnsignedByte(); // L: 6776
					Canvas.forceDisconnect(var66); // L: 6777
					var1.serverPacket = null; // L: 6778
					return false; // L: 6779
				}

				if (ServerPacket.field3413 == var1.serverPacket) { // L: 6781
					World var54 = new World(); // L: 6782
					var54.host = var3.readStringCp1252NullTerminated(); // L: 6783
					var54.id = var3.readUnsignedShort(); // L: 6784
					var5 = var3.readInt(); // L: 6785
					var54.properties = var5; // L: 6786
					if (var54.isDeadman()) { // L: 6787
						var54.field850 = "beta"; // L: 6788
						WorldMapScaleHandler.field2696 = true; // L: 6789
					} else {
						WorldMapScaleHandler.field2696 = false; // L: 6792
					}

					Interpreter.method2106(45); // L: 6794
					var2.close(); // L: 6795
					var2 = null; // L: 6796
					class246.changeWorld(var54); // L: 6797
					var1.serverPacket = null; // L: 6798
					return false; // L: 6799
				}

				if (ServerPacket.field3417 == var1.serverPacket) { // L: 6801
					class67.method1206(); // L: 6802
					weight = var3.readShort(); // L: 6803
					field738 = cycleCntr; // L: 6804
					var1.serverPacket = null; // L: 6805
					return true; // L: 6806
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 6808
					BuddyRankComparator.loadRegions(false, var1.packetBuffer); // L: 6809
					var1.serverPacket = null; // L: 6810
					return true; // L: 6811
				}

				if (ServerPacket.field3314 == var1.serverPacket) { // L: 6813
					var50 = var3.readStringCp1252NullTerminated(); // L: 6814
					var21 = AbstractFont.escapeBrackets(ClanChannel.method3490(class495.method8856(var3))); // L: 6815
					class209.addGameMessage(6, var50, var21); // L: 6816
					var1.serverPacket = null; // L: 6817
					return true; // L: 6818
				}

				Widget var23;
				if (ServerPacket.field3366 == var1.serverPacket) { // L: 6820
					var66 = var3.readInt(); // L: 6821
					var5 = var3.readUnsignedShort(); // L: 6822
					if (var66 < -70000) { // L: 6823
						var5 += 32768;
					}

					if (var66 >= 0) { // L: 6825
						var23 = ArchiveLoader.field1070.method6431(var66);
					} else {
						var23 = null; // L: 6826
					}

					for (; var3.offset < var1.serverPacketLength; class1.itemContainerSetItem(var5, var7, var8 - 1, var56)) { // L: 6827 6841
						var7 = var3.readUShortSmart(); // L: 6828
						var8 = var3.readUnsignedShort(); // L: 6829
						var56 = 0; // L: 6830
						if (var8 != 0) { // L: 6831
							var56 = var3.readUnsignedByte(); // L: 6832
							if (var56 == 255) { // L: 6833
								var56 = var3.readInt();
							}
						}

						if (var23 != null && var7 >= 0 && var7 < var23.field3856.length) { // L: 6835 6836
							var23.field3856[var7] = var8; // L: 6837
							var23.field3857[var7] = var56; // L: 6838
						}
					}

					if (var23 != null) { // L: 6843
						UserComparator5.invalidateWidget(var23);
					}

					class67.method1206(); // L: 6844
					field646[++field608 - 1 & 31] = var5 & 32767; // L: 6845
					var1.serverPacket = null; // L: 6846
					return true; // L: 6847
				}

				if (ServerPacket.field3305 == var1.serverPacket) { // L: 6849
					var66 = var3.method9703(); // L: 6850
					if (var66 == 65535) { // L: 6851
						var66 = -1;
					}

					rootInterface = var66; // L: 6852
					this.resizeRoot(false); // L: 6853
					TaskHandler.method4199(var66); // L: 6854
					Nameable.method8331(rootInterface); // L: 6855

					for (var5 = 0; var5 < 100; ++var5) { // L: 6856
						field816[var5] = true;
					}

					var1.serverPacket = null; // L: 6857
					return true; // L: 6858
				}

				if (ServerPacket.field3354 == var1.serverPacket) { // L: 6860
					publicChatMode = var3.method9605(); // L: 6861
					tradeChatMode = var3.method9579(); // L: 6862
					var1.serverPacket = null; // L: 6863
					return true; // L: 6864
				}

				if (ServerPacket.field3418 == var1.serverPacket) { // L: 6866
					var66 = var3.method9530(); // L: 6867
					var5 = var3.method9703(); // L: 6868
					if (var5 == 65535) { // L: 6869
						var5 = -1;
					}

					var6 = var3.readInt(); // L: 6870
					var7 = var3.method9703(); // L: 6871
					if (var7 == 65535) { // L: 6872
						var7 = -1;
					}

					for (var8 = var5; var8 <= var7; ++var8) { // L: 6873
						var29 = ((long)var66 << 32) + (long)var8; // L: 6874
						Node var90 = widgetFlags.get(var29); // L: 6875
						if (var90 != null) { // L: 6876
							var90.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var29); // L: 6877
					}

					var1.serverPacket = null; // L: 6879
					return true; // L: 6880
				}

				if (ServerPacket.field3296 == var1.serverPacket) { // L: 6882
					isCameraLocked = true; // L: 6883
					field728 = false; // L: 6884
					field790 = true; // L: 6885
					var66 = class173.method3545(var3.readShort() & 2027); // L: 6886
					var5 = class190.method3768(var3.readShort() & 2027); // L: 6887
					var6 = var3.readUnsignedShort(); // L: 6888
					var7 = var3.readUnsignedByte(); // L: 6889
					field794 = new class497(FriendSystem.cameraPitch, var5, var6, var7); // L: 6890
					field793 = new class497(Script.cameraYaw, var66, var6, var7); // L: 6891
					var1.serverPacket = null; // L: 6892
					return true; // L: 6893
				}

				if (ServerPacket.field3420 == var1.serverPacket) { // L: 6895
					SecureRandomFuture.updateNpcs(true, var3); // L: 6896
					var1.serverPacket = null; // L: 6897
					return true; // L: 6898
				}

				if (ServerPacket.field3396 == var1.serverPacket) { // L: 6900
					var66 = var3.readUnsignedShort(); // L: 6901
					var5 = var3.method9529(); // L: 6902
					Varps.Varps_temp[var66] = var5; // L: 6903
					if (Varps.Varps_main[var66] != var5) { // L: 6904
						Varps.Varps_main[var66] = var5; // L: 6905
					}

					FriendSystem.changeGameOptions(var66); // L: 6907
					field702[++field823 - 1 & 31] = var66; // L: 6908
					var1.serverPacket = null; // L: 6909
					return true; // L: 6910
				}

				if (ServerPacket.field3299 == var1.serverPacket && isCameraLocked) { // L: 6912 6913
					field728 = true; // L: 6914
					field790 = false; // L: 6915
					field789 = false; // L: 6916

					for (var66 = 0; var66 < 5; ++var66) { // L: 6917
						field797[var66] = false; // L: 6918
					}

					var1.serverPacket = null; // L: 6920
					return true; // L: 6921
				}

				if (ServerPacket.field3377 == var1.serverPacket) { // L: 6924
					var66 = var3.readUnsignedShort(); // L: 6925
					var5 = var3.method9585(); // L: 6926
					var23 = ArchiveLoader.field1070.method6431(var5); // L: 6927
					if (var23 != null && var23.type == 0) { // L: 6928
						if (var66 > var23.scrollHeight - var23.height) { // L: 6929
							var66 = var23.scrollHeight - var23.height;
						}

						if (var66 < 0) { // L: 6930
							var66 = 0;
						}

						if (var66 != var23.scrollY) { // L: 6931
							var23.scrollY = var66; // L: 6932
							UserComparator5.invalidateWidget(var23); // L: 6933
						}
					}

					var1.serverPacket = null; // L: 6936
					return true; // L: 6937
				}

				boolean var59;
				if (ServerPacket.field3370 == var1.serverPacket) { // L: 6939
					isCameraLocked = true; // L: 6940
					field728 = false; // L: 6941
					field789 = true; // L: 6942
					WorldMapArea.field2529 = var3.readUnsignedByte() * 16384; // L: 6943
					UserComparator7.field1462 = var3.readUnsignedByte() * 16384; // L: 6944
					var66 = var3.readUnsignedShort(); // L: 6945
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 6946
					var6 = var3.readUnsignedByte() * 128 + 64; // L: 6947
					var7 = var3.readUnsignedShort(); // L: 6948
					field614 = var3.readBoolean(); // L: 6949
					var8 = var3.readUnsignedByte(); // L: 6950
					var56 = WorldMapArea.field2529 * 128 + 64; // L: 6951
					var57 = UserComparator7.field1462 * 128 + 64; // L: 6952
					var60 = false; // L: 6953
					var59 = false; // L: 6954
					if (field614) { // L: 6955
						var11 = class18.cameraY; // L: 6956
						var12 = class272.getTileHeight(var56, var57, class473.Client_plane) - var66; // L: 6957
					} else {
						var11 = class272.getTileHeight(FriendsChatMember.cameraX, class317.cameraZ, class473.Client_plane) - class18.cameraY; // L: 6960
						var12 = var66; // L: 6961
					}

					field813 = new class495(FriendsChatMember.cameraX, class317.cameraZ, var11, var56, var57, var12, var5, var6, var7, var8); // L: 6963
					var1.serverPacket = null; // L: 6964
					return true; // L: 6965
				}

				if (ServerPacket.field3368 == var1.serverPacket) { // L: 6967
					var66 = var3.method9703(); // L: 6968
					var5 = var3.readUnsignedByte(); // L: 6969
					if (var66 == 65535) { // L: 6970
						var66 = -1; // L: 6971
					}

					class485.performPlayerAnimation(VarpDefinition.localPlayer, var66, var5); // L: 6973
					var1.serverPacket = null; // L: 6974
					return true; // L: 6975
				}

				if (ServerPacket.field3318 == var1.serverPacket) { // L: 6977
					var7 = var3.readUnsignedShort(); // L: 6983
					var6 = var3.method9703(); // L: 6984
					var5 = var3.method9703(); // L: 6985
					var8 = var3.readUnsignedShort(); // L: 6986
					var66 = var3.method9636(); // L: 6987
					if (var66 == 65535) { // L: 6988
						var66 = -1; // L: 6989
					}

					ArrayList var91 = new ArrayList(); // L: 6991
					var91.add(var66); // L: 6992
					class136.method3141(var91, var5, var6, var7, var8); // L: 6993
					var1.serverPacket = null; // L: 6994
					return true; // L: 6995
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 6997
					var66 = var3.method9636(); // L: 7003
					Player var76;
					if (var66 == localPlayerIndex) { // L: 7004
						var76 = VarpDefinition.localPlayer; // L: 7005
					} else {
						var76 = players[var66]; // L: 7008
					}

					var7 = var3.readUnsignedByte(); // L: 7010
					var5 = var3.method9636(); // L: 7011
					var6 = var3.method9585(); // L: 7012
					if (var76 != null) { // L: 7013
						var76.method2466(var7, var5, var6 >> 16, var6 & 65535); // L: 7014
					}

					var1.serverPacket = null; // L: 7016
					return true; // L: 7017
				}

				if (ServerPacket.field3386 == var1.serverPacket) { // L: 7019
					field728 = false; // L: 7020
					isCameraLocked = false; // L: 7021
					field789 = false; // L: 7022
					field790 = false; // L: 7023
					VarbitComposition.field2065 = 0; // L: 7024
					class11.field46 = 0; // L: 7025
					ChatChannel.field1045 = 0; // L: 7026
					field614 = false; // L: 7027
					class135.field1618 = 0; // L: 7028
					class18.field86 = 0; // L: 7029
					GameBuild.field3978 = 0; // L: 7030
					class516.field5118 = 0; // L: 7031
					WorldMapArea.field2529 = 0; // L: 7032
					UserComparator7.field1462 = 0; // L: 7033
					WorldMapSectionType.field2609 = 0; // L: 7034
					field813 = null; // L: 7035
					field794 = null; // L: 7036
					field793 = null; // L: 7037

					for (var66 = 0; var66 < 5; ++var66) { // L: 7038
						field797[var66] = false; // L: 7039
					}

					var1.serverPacket = null; // L: 7041
					return true; // L: 7042
				}

				if (ServerPacket.field3313 == var1.serverPacket) { // L: 7044
					HealthBarDefinition.method3657(class311.field3284); // L: 7045
					var1.serverPacket = null; // L: 7046
					return true; // L: 7047
				}

				if (ServerPacket.field3388 == var1.serverPacket) { // L: 7049
					class534.method9716(); // L: 7050
					var20 = var3.readByte(); // L: 7051
					class148 var78 = new class148(var3); // L: 7052
					ClanSettings var87;
					if (var20 >= 0) { // L: 7054
						var87 = currentClanSettings[var20];
					} else {
						var87 = class223.guestClanSettings; // L: 7055
					}

					if (var87 == null) { // L: 7056
						this.method1244(var20); // L: 7057
						var1.serverPacket = null; // L: 7058
						return true; // L: 7059
					}

					if (var78.field1686 > var87.field1754) { // L: 7061
						this.method1244(var20); // L: 7062
						var1.serverPacket = null; // L: 7063
						return true; // L: 7064
					}

					if (var78.field1686 < var87.field1754) { // L: 7066
						var1.serverPacket = null; // L: 7067
						return true; // L: 7068
					}

					var78.method3245(var87); // L: 7070
					var1.serverPacket = null; // L: 7071
					return true; // L: 7072
				}

				boolean var75;
				if (ServerPacket.field3373 == var1.serverPacket) { // L: 7074
					var75 = var3.readUnsignedByte() == 1; // L: 7075
					if (var75) { // L: 7076
						class334.field3609 = SecureRandomCallable.method2320() - var3.readLong(); // L: 7077
						FileSystem.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7078
					} else {
						FileSystem.grandExchangeEvents = null; // L: 7080
					}

					field537 = cycleCntr; // L: 7081
					var1.serverPacket = null; // L: 7082
					return true; // L: 7083
				}

				if (ServerPacket.field3391 == var1.serverPacket) { // L: 7085
					isCameraLocked = true; // L: 7086
					field728 = false; // L: 7087
					field790 = false; // L: 7088
					VarbitComposition.field2065 = var3.readUnsignedByte() * 128; // L: 7089
					class11.field46 = var3.readUnsignedByte() * 128; // L: 7090
					ChatChannel.field1045 = var3.readUnsignedShort(); // L: 7091
					class135.field1618 = var3.readUnsignedByte(); // L: 7092
					class18.field86 = var3.readUnsignedByte(); // L: 7093
					if (class18.field86 >= 100) { // L: 7094
						var66 = VarbitComposition.field2065 * 16384 + 64; // L: 7095
						var5 = class11.field46 * 16384 + 64; // L: 7096
						var6 = class272.getTileHeight(var66, var5, class473.Client_plane) - ChatChannel.field1045; // L: 7097
						var7 = var66 - FriendsChatMember.cameraX; // L: 7098
						var8 = var6 - class18.cameraY; // L: 7099
						var56 = var5 - class317.cameraZ; // L: 7100
						var57 = (int)Math.sqrt((double)(var7 * var7 + var56 * var56)); // L: 7101
						FriendSystem.cameraPitch = (int)(Math.atan2((double)var8, (double)var57) * 325.9490051269531D) & 2047; // L: 7102
						Script.cameraYaw = (int)(Math.atan2((double)var7, (double)var56) * -325.9490051269531D) & 2047; // L: 7103
						if (FriendSystem.cameraPitch < 128) { // L: 7104
							FriendSystem.cameraPitch = 128;
						}

						if (FriendSystem.cameraPitch > 383) { // L: 7105
							FriendSystem.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7107
					return true; // L: 7108
				}

				if (ServerPacket.field3337 == var1.serverPacket) { // L: 7110
					class4.field3 = var3.method9506(); // L: 7111
					JagexCache.field2329 = var3.method9579(); // L: 7112
					field831 = var3.method9605(); // L: 7113

					for (var66 = JagexCache.field2329; var66 < JagexCache.field2329 + 8; ++var66) { // L: 7114
						for (var5 = class4.field3; var5 < class4.field3 + 8; ++var5) { // L: 7115
							if (groundItems[field831][var66][var5] != null) { // L: 7116
								groundItems[field831][var66][var5] = null; // L: 7117
								class73.method2117(field831, var66, var5); // L: 7118
							}
						}
					}

					for (PendingSpawn var53 = (PendingSpawn)pendingSpawns.last(); var53 != null; var53 = (PendingSpawn)pendingSpawns.previous()) { // L: 7122 7123 7125
						if (var53.x >= JagexCache.field2329 && var53.x < JagexCache.field2329 + 8 && var53.y >= class4.field3 && var53.y < class4.field3 + 8 && var53.plane == field831) { // L: 7124
							var53.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7127
					return true; // L: 7128
				}

				if (ServerPacket.field3345 == var1.serverPacket) { // L: 7130
					var66 = var3.readShort(); // L: 7131
					var5 = var3.readInt(); // L: 7132
					var23 = ArchiveLoader.field1070.method6431(var5); // L: 7133
					if (var66 != var23.sequenceId || var66 == -1) { // L: 7134
						var23.sequenceId = var66; // L: 7135
						var23.modelFrame = 0; // L: 7136
						var23.modelFrameCycle = 0; // L: 7137
						UserComparator5.invalidateWidget(var23); // L: 7138
					}

					var1.serverPacket = null; // L: 7140
					return true; // L: 7141
				}

				if (ServerPacket.field3309 == var1.serverPacket) { // L: 7143
					var66 = var3.readInt(); // L: 7144
					var5 = var3.readInt(); // L: 7145
					var6 = SequenceDefinition.getGcDuration(); // L: 7146
					PacketBufferNode var85 = ViewportMouse.getPacketBufferNode(ClientPacket.field3204, packetWriter.isaacCipher); // L: 7148
					var85.packetBuffer.method9677(var66); // L: 7149
					var85.packetBuffer.method9525(var5); // L: 7150
					var85.packetBuffer.method9503(GameEngine.fps); // L: 7151
					var85.packetBuffer.method9505(var6); // L: 7152
					packetWriter.addNode(var85); // L: 7153
					var1.serverPacket = null; // L: 7154
					return true; // L: 7155
				}

				if (ServerPacket.field3352 == var1.serverPacket) { // L: 7157
					var6 = var3.method9605(); // L: 7161
					var5 = var3.method9636(); // L: 7162
					var66 = var3.readUnsignedShort(); // L: 7163
					if (var5 == 65535) { // L: 7164
						var5 = -1; // L: 7165
					}

					NPC var83 = npcs[var66]; // L: 7167
					if (var83 != null) { // L: 7168
						if (var5 == var83.sequence && var5 != -1) { // L: 7169
							var8 = MilliClock.SequenceDefinition_get(var5).field2272; // L: 7170
							if (var8 == 1) { // L: 7171
								var83.sequenceFrame = 0; // L: 7172
								var83.sequenceFrameCycle = 0; // L: 7173
								var83.sequenceDelay = var6; // L: 7174
								var83.field1254 = 0; // L: 7175
							} else if (var8 == 2) { // L: 7177
								var83.field1254 = 0; // L: 7178
							}
						} else if (var5 == -1 || var83.sequence == -1 || MilliClock.SequenceDefinition_get(var5).field2266 >= MilliClock.SequenceDefinition_get(var83.sequence).field2266) { // L: 7181
							var83.sequence = var5; // L: 7182
							var83.sequenceFrame = 0; // L: 7183
							var83.sequenceFrameCycle = 0; // L: 7184
							var83.sequenceDelay = var6; // L: 7185
							var83.field1254 = 0; // L: 7186
							var83.field1280 = var83.pathLength; // L: 7187
						}
					}

					var1.serverPacket = null; // L: 7191
					return true; // L: 7192
				}

				InterfaceParent var79;
				if (ServerPacket.field3353 == var1.serverPacket) { // L: 7194
					var66 = var3.method9529(); // L: 7195
					var5 = var3.readInt(); // L: 7196
					InterfaceParent var86 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7197
					var79 = (InterfaceParent)interfaceParents.get((long)var66); // L: 7198
					if (var79 != null) { // L: 7199
						SecureRandomFuture.closeInterface(var79, var86 == null || var79.group != var86.group);
					}

					if (var86 != null) { // L: 7200
						var86.remove(); // L: 7201
						interfaceParents.put(var86, (long)var66); // L: 7202
					}

					var73 = ArchiveLoader.field1070.method6431(var5); // L: 7204
					if (var73 != null) { // L: 7205
						UserComparator5.invalidateWidget(var73);
					}

					var73 = ArchiveLoader.field1070.method6431(var66); // L: 7206
					if (var73 != null) { // L: 7207
						UserComparator5.invalidateWidget(var73); // L: 7208
						class167.revalidateWidgetScroll(ArchiveLoader.field1070.field3633[var73.id >>> 16], var73, true); // L: 7209
					}

					if (rootInterface != -1) { // L: 7211
						Canvas.method292(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7212
					return true; // L: 7213
				}

				String var84;
				if (ServerPacket.field3307 == var1.serverPacket) { // L: 7215
					byte[] var52 = new byte[var1.serverPacketLength]; // L: 7216
					var3.method9440(var52, 0, var52.length); // L: 7217
					Buffer var77 = new Buffer(var52); // L: 7218
					var84 = var77.readStringCp1252NullTerminated(); // L: 7219
					class137.openURL(var84, true, false); // L: 7220
					var1.serverPacket = null; // L: 7221
					return true; // L: 7222
				}

				if (ServerPacket.field3405 == var1.serverPacket) { // L: 7224
					var20 = var3.method9511(); // L: 7225
					var5 = var3.readUnsignedShort(); // L: 7226
					Varps.Varps_temp[var5] = var20; // L: 7227
					if (Varps.Varps_main[var5] != var20) { // L: 7228
						Varps.Varps_main[var5] = var20; // L: 7229
					}

					FriendSystem.changeGameOptions(var5); // L: 7231
					field702[++field823 - 1 & 31] = var5; // L: 7232
					var1.serverPacket = null; // L: 7233
					return true; // L: 7234
				}

				if (ServerPacket.field3328 == var1.serverPacket) { // L: 7236
					var66 = var3.readInt(); // L: 7237
					var5 = var3.readUnsignedShort(); // L: 7238
					if (var66 < -70000) { // L: 7239
						var5 += 32768;
					}

					if (var66 >= 0) { // L: 7241
						var23 = ArchiveLoader.field1070.method6431(var66);
					} else {
						var23 = null; // L: 7242
					}

					if (var23 != null) { // L: 7243
						for (var7 = 0; var7 < var23.field3856.length; ++var7) { // L: 7244
							var23.field3856[var7] = 0; // L: 7245
							var23.field3857[var7] = 0; // L: 7246
						}
					}

					class272.clearItemContainer(var5); // L: 7249
					var7 = var3.readUnsignedShort(); // L: 7250

					for (var8 = 0; var8 < var7; ++var8) { // L: 7251
						var56 = var3.method9492(); // L: 7252
						var57 = var3.method9605(); // L: 7253
						if (var57 == 255) { // L: 7254
							var57 = var3.method9530();
						}

						if (var23 != null && var8 < var23.field3856.length) { // L: 7255 7256
							var23.field3856[var8] = var56; // L: 7257
							var23.field3857[var8] = var57; // L: 7258
						}

						class1.itemContainerSetItem(var5, var8, var56 - 1, var57); // L: 7261
					}

					if (var23 != null) { // L: 7263
						UserComparator5.invalidateWidget(var23);
					}

					class67.method1206(); // L: 7264
					field646[++field608 - 1 & 31] = var5 & 32767; // L: 7265
					var1.serverPacket = null; // L: 7266
					return true; // L: 7267
				}

				if (ServerPacket.field3355 == var1.serverPacket) { // L: 7269
					class485.method8804(); // L: 7270
					var1.serverPacket = null; // L: 7271
					return false; // L: 7272
				}

				if (ServerPacket.field3421 == var1.serverPacket) { // L: 7274
					isCameraLocked = true; // L: 7275
					field728 = false; // L: 7276
					field790 = true; // L: 7277
					VarbitComposition.field2065 = var3.readUnsignedByte() * 128; // L: 7278
					class11.field46 = var3.readUnsignedByte() * 128; // L: 7279
					ChatChannel.field1045 = var3.readUnsignedShort(); // L: 7280
					var66 = var3.readUnsignedShort(); // L: 7281
					var5 = var3.readUnsignedByte(); // L: 7282
					var6 = VarbitComposition.field2065 * 16384 + 64; // L: 7283
					var7 = class11.field46 * 16384 + 64; // L: 7284
					var8 = class272.getTileHeight(var6, var7, class473.Client_plane) - ChatChannel.field1045; // L: 7285
					var56 = var6 - FriendsChatMember.cameraX; // L: 7286
					var57 = var8 - class18.cameraY; // L: 7287
					var11 = var7 - class317.cameraZ; // L: 7288
					double var92 = Math.sqrt((double)(var11 * var11 + var56 * var56)); // L: 7289
					var14 = class190.method3768((int)(Math.atan2((double)var57, var92) * 325.9490051269531D) & 2047); // L: 7290
					var15 = class173.method3545((int)(Math.atan2((double)var56, (double)var11) * -325.9490051269531D) & 2047); // L: 7291
					field794 = new class497(FriendSystem.cameraPitch, var14, var66, var5); // L: 7292
					field793 = new class497(Script.cameraYaw, var15, var66, var5); // L: 7293
					var1.serverPacket = null; // L: 7294
					return true; // L: 7295
				}

				if (ServerPacket.field3364 == var1.serverPacket) { // L: 7297
					var66 = var3.readInt(); // L: 7298
					var5 = var3.method9585(); // L: 7299
					var23 = ArchiveLoader.field1070.method6431(var5); // L: 7300
					UserComparator8.method2942(var23, var66); // L: 7301
					UserComparator5.invalidateWidget(var23); // L: 7302
					var1.serverPacket = null; // L: 7303
					return true; // L: 7304
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 7306
					field542 = var3.readUnsignedByte(); // L: 7307
					if (field542 == 1) { // L: 7308
						field543 = var3.readUnsignedShort();
					}

					if (field542 >= 2 && field542 <= 6) { // L: 7309
						if (field542 == 2) { // L: 7310
							field548 = 4096; // L: 7311
							field549 = 64; // L: 7312
						}

						if (field542 == 3) { // L: 7314
							field548 = 0; // L: 7315
							field549 = 64; // L: 7316
						}

						if (field542 == 4) { // L: 7318
							field548 = 8192; // L: 7319
							field549 = 64; // L: 7320
						}

						if (field542 == 5) { // L: 7322
							field548 = 4096; // L: 7323
							field549 = 0; // L: 7324
						}

						if (field542 == 6) { // L: 7326
							field548 = 4096; // L: 7327
							field549 = 128; // L: 7328
						}

						field542 = 2; // L: 7330
						field545 = var3.readUnsignedShort(); // L: 7331
						field546 = var3.readUnsignedShort(); // L: 7332
						field547 = var3.readUnsignedByte() * 4; // L: 7333
					}

					if (field542 == 10) { // L: 7335
						field536 = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7336
					return true; // L: 7337
				}

				if (ServerPacket.field3371 == var1.serverPacket) { // L: 7339
					var66 = var3.readInt(); // L: 7340
					var5 = var3.readUnsignedShort(); // L: 7341
					var6 = var3.readUnsignedByte(); // L: 7342
					var79 = (InterfaceParent)interfaceParents.get((long)var66); // L: 7343
					if (var79 != null) { // L: 7344
						SecureRandomFuture.closeInterface(var79, var5 != var79.group);
					}

					class47.method840(var66, var5, var6); // L: 7345
					var1.serverPacket = null; // L: 7346
					return true; // L: 7347
				}

				long var35;
				if (ServerPacket.field3342 == var1.serverPacket) { // L: 7349
					var66 = var3.offset + var1.serverPacketLength; // L: 7350
					var5 = var3.readUnsignedShort(); // L: 7351
					if (var5 == 65535) { // L: 7352
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 7353
					if (var5 != rootInterface) { // L: 7354
						rootInterface = var5; // L: 7355
						this.resizeRoot(false); // L: 7356
						TaskHandler.method4199(rootInterface); // L: 7357
						Nameable.method8331(rootInterface); // L: 7358

						for (var7 = 0; var7 < 100; ++var7) { // L: 7359
							field816[var7] = true;
						}
					}

					InterfaceParent var95;
					for (; var6-- > 0; var95.field1087 = true) { // L: 7361 7371
						var7 = var3.readInt(); // L: 7362
						var8 = var3.readUnsignedShort(); // L: 7363
						var56 = var3.readUnsignedByte(); // L: 7364
						var95 = (InterfaceParent)interfaceParents.get((long)var7); // L: 7365
						if (var95 != null && var8 != var95.group) { // L: 7366
							SecureRandomFuture.closeInterface(var95, true); // L: 7367
							var95 = null; // L: 7368
						}

						if (var95 == null) { // L: 7370
							var95 = class47.method840(var7, var8, var56);
						}
					}

					for (var79 = (InterfaceParent)interfaceParents.first(); var79 != null; var79 = (InterfaceParent)interfaceParents.next()) { // L: 7373
						if (var79.field1087) { // L: 7374
							var79.field1087 = false;
						} else {
							SecureRandomFuture.closeInterface(var79, true); // L: 7376
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7379

					while (var3.offset < var66) { // L: 7380
						var7 = var3.readInt(); // L: 7381
						var8 = var3.readUnsignedShort(); // L: 7382
						var56 = var3.readUnsignedShort(); // L: 7383
						var57 = var3.readInt(); // L: 7384

						for (var11 = var8; var11 <= var56; ++var11) { // L: 7385
							var35 = (long)var11 + ((long)var7 << 32); // L: 7386
							widgetFlags.put(new IntegerNode(var57), var35); // L: 7387
						}
					}

					var1.serverPacket = null; // L: 7390
					return true; // L: 7391
				}

				if (ServerPacket.field3331 == var1.serverPacket) { // L: 7393
					HealthBarDefinition.method3657(class311.field3286); // L: 7394
					var1.serverPacket = null; // L: 7395
					return true; // L: 7396
				}

				if (ServerPacket.field3389 == var1.serverPacket) { // L: 7398
					var3.offset += 28; // L: 7399
					if (var3.checkCrc()) { // L: 7400
						LoginScreenAnimation.method2524(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7401
					return true; // L: 7402
				}

				if (ServerPacket.field3335 == var1.serverPacket) { // L: 7404
					var66 = var3.method9703(); // L: 7405
					if (var66 == 65535) { // L: 7406
						var66 = -1;
					}

					AbstractByteArrayCopier.playSong(var66); // L: 7407
					var1.serverPacket = null; // L: 7408
					return true; // L: 7409
				}

				if (ServerPacket.field3376 == var1.serverPacket) { // L: 7411
					var66 = var3.readUnsignedShort(); // L: 7412
					if (var66 == 65535) { // L: 7413
						var66 = -1;
					}

					var5 = var3.method9522(); // L: 7414
					class7.method39(var66, var5); // L: 7415
					var1.serverPacket = null; // L: 7416
					return true; // L: 7417
				}

				boolean var55;
				if (ServerPacket.field3403 == var1.serverPacket) { // L: 7419
					var66 = var3.readUShortSmart(); // L: 7420
					var55 = var3.readUnsignedByte() == 1; // L: 7421
					var84 = ""; // L: 7422
					boolean var58 = false; // L: 7423
					if (var55) { // L: 7424
						var84 = var3.readStringCp1252NullTerminated(); // L: 7425
						if (InterfaceParent.friendSystem.isIgnored(new Username(var84, FriendLoginUpdate.loginType))) { // L: 7426
							var58 = true;
						}
					}

					String var72 = var3.readStringCp1252NullTerminated(); // L: 7428
					if (!var58) { // L: 7429
						class209.addGameMessage(var66, var84, var72);
					}

					var1.serverPacket = null; // L: 7430
					return true; // L: 7431
				}

				if (ServerPacket.field3381 == var1.serverPacket) { // L: 7433
					class73.field920 = new class473(ApproximateRouteStrategy.field488); // L: 7434
					var1.serverPacket = null; // L: 7435
					return true; // L: 7436
				}

				if (ServerPacket.field3390 == var1.serverPacket) { // L: 7438
					var75 = var3.readBoolean(); // L: 7439
					if (var75) { // L: 7440
						if (MilliClock.field2352 == null) { // L: 7441
							MilliClock.field2352 = new class388();
						}
					} else {
						MilliClock.field2352 = null; // L: 7443
					}

					var1.serverPacket = null; // L: 7444
					return true; // L: 7445
				}

				if (ServerPacket.field3321 == var1.serverPacket) { // L: 7447
					InterfaceParent.friendSystem.method1874(); // L: 7448
					field732 = cycleCntr; // L: 7449
					var1.serverPacket = null; // L: 7450
					return true; // L: 7451
				}

				if (ServerPacket.field3408 == var1.serverPacket) { // L: 7453
					HealthBarDefinition.method3657(class311.field3275); // L: 7454
					var1.serverPacket = null; // L: 7455
					return true; // L: 7456
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7458
					var57 = var3.method9605(); // L: 7467
					var6 = var3.readMedium(); // L: 7468
					var66 = var6 >> 16; // L: 7469
					var5 = var6 >> 8 & 255; // L: 7470
					var7 = var66 + (var6 >> 4 & 7); // L: 7471
					var8 = var5 + (var6 & 7); // L: 7472
					var11 = var3.readUnsignedShort(); // L: 7473
					var56 = var3.method9636(); // L: 7474
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7475
						var7 = var7 * 128 + 64; // L: 7476
						var8 = var8 * 128 + 64; // L: 7477
						GraphicsObject var31 = new GraphicsObject(var56, class473.Client_plane, var7, var8, class272.getTileHeight(var7, var8, class473.Client_plane) - var57, var11, cycle); // L: 7478
						graphicsObjects.addFirst(var31); // L: 7479
					}

					var1.serverPacket = null; // L: 7481
					return true; // L: 7482
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 7484
					class534.method9716(); // L: 7485
					var20 = var3.readByte(); // L: 7486
					if (var1.serverPacketLength == 1) { // L: 7487
						if (var20 >= 0) { // L: 7488
							currentClanSettings[var20] = null;
						} else {
							class223.guestClanSettings = null; // L: 7489
						}

						var1.serverPacket = null; // L: 7490
						return true; // L: 7491
					}

					if (var20 >= 0) { // L: 7493
						currentClanSettings[var20] = new ClanSettings(var3); // L: 7494
					} else {
						class223.guestClanSettings = new ClanSettings(var3); // L: 7497
					}

					var1.serverPacket = null; // L: 7499
					return true; // L: 7500
				}

				NPC var22;
				if (ServerPacket.field3374 == var1.serverPacket) { // L: 7502
					var6 = var3.method9703(); // L: 7508
					var7 = var3.method9506(); // L: 7509
					var66 = var3.method9636(); // L: 7510
					var22 = npcs[var66]; // L: 7511
					var5 = var3.method9530(); // L: 7512
					if (var22 != null) { // L: 7513
						var22.method2466(var7, var6, var5 >> 16, var5 & 65535); // L: 7514
					}

					var1.serverPacket = null; // L: 7516
					return true; // L: 7517
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 7519
					SecureRandomFuture.updateNpcs(false, var3); // L: 7520
					var1.serverPacket = null; // L: 7521
					return true; // L: 7522
				}

				if (ServerPacket.field3316 == var1.serverPacket) { // L: 7524
					isCameraLocked = true; // L: 7525
					field728 = false; // L: 7526
					field789 = false; // L: 7527
					WorldMapArea.field2529 = var3.readUnsignedByte() * 16384; // L: 7528
					UserComparator7.field1462 = var3.readUnsignedByte() * 16384; // L: 7529
					WorldMapSectionType.field2609 = var3.readUnsignedShort(); // L: 7530
					class516.field5118 = var3.readUnsignedByte(); // L: 7531
					GameBuild.field3978 = var3.readUnsignedByte(); // L: 7532
					if (GameBuild.field3978 >= 100) { // L: 7533
						FriendsChatMember.cameraX = WorldMapArea.field2529 * 128 + 64; // L: 7534
						class317.cameraZ = UserComparator7.field1462 * 128 + 64; // L: 7535
						class18.cameraY = class272.getTileHeight(FriendsChatMember.cameraX, class317.cameraZ, class473.Client_plane) - WorldMapSectionType.field2609; // L: 7536
					}

					var1.serverPacket = null; // L: 7538
					return true; // L: 7539
				}

				if (ServerPacket.field3409 == var1.serverPacket) { // L: 7541
					var66 = var3.readUnsignedShort(); // L: 7542
					var5 = var3.method9530(); // L: 7543
					var23 = ArchiveLoader.field1070.method6431(var5); // L: 7544
					if (var23.modelType != 2 || var66 != var23.modelId) { // L: 7545
						var23.modelType = 2; // L: 7546
						var23.modelId = var66; // L: 7547
						UserComparator5.invalidateWidget(var23); // L: 7548
					}

					var1.serverPacket = null; // L: 7550
					return true; // L: 7551
				}

				if (ServerPacket.field3360 == var1.serverPacket) { // L: 7553
					var66 = var3.readUnsignedByte(); // L: 7554
					if (var3.readUnsignedByte() == 0) { // L: 7555
						grandExchangeOffers[var66] = new GrandExchangeOffer(); // L: 7556
						var3.offset += 18; // L: 7557
					} else {
						--var3.offset; // L: 7560
						grandExchangeOffers[var66] = new GrandExchangeOffer(var3, false); // L: 7561
					}

					field736 = cycleCntr; // L: 7563
					var1.serverPacket = null; // L: 7564
					return true; // L: 7565
				}

				if (ServerPacket.field3324 == var1.serverPacket) { // L: 7567
					BuddyRankComparator.loadRegions(true, var1.packetBuffer); // L: 7568
					var1.serverPacket = null; // L: 7569
					return true; // L: 7570
				}

				if (ServerPacket.field3384 == var1.serverPacket) { // L: 7572
					return this.method1670(var1, 1); // L: 7573
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7575
					var5 = var3.readUnsignedShort(); // L: 7580
					var7 = var3.method9492(); // L: 7581
					var6 = var3.method9636(); // L: 7582
					var66 = var3.readUnsignedShort(); // L: 7583
					class75.method2121(var66, var5, var6, var7); // L: 7584
					var1.serverPacket = null; // L: 7585
					return true; // L: 7586
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 7588
					var66 = var3.readInt(); // L: 7589
					if (var66 != field624) { // L: 7590
						field624 = var66; // L: 7591
						class173.method3543(); // L: 7592
					}

					var1.serverPacket = null; // L: 7594
					return true; // L: 7595
				}

				if (ServerPacket.field3378 == var1.serverPacket) { // L: 7597
					return this.method1234(var1); // L: 7598
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 7600
					var66 = var3.readUnsignedShort(); // L: 7603
					var5 = var3.method9492(); // L: 7604
					class169.method3521(var66, var5); // L: 7605
					var1.serverPacket = null; // L: 7606
					return true; // L: 7607
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 7609
					class4.field3 = var3.readUnsignedByte(); // L: 7610
					JagexCache.field2329 = var3.readUnsignedByte(); // L: 7611
					field831 = var3.method9579(); // L: 7612
					var1.serverPacket = null; // L: 7613
					return true; // L: 7614
				}

				if (ServerPacket.field3380 == var1.serverPacket) { // L: 7616
					for (var66 = 0; var66 < Varps.Varps_main.length; ++var66) { // L: 7617
						if (Varps.Varps_main[var66] != Varps.Varps_temp[var66]) { // L: 7618
							Varps.Varps_main[var66] = Varps.Varps_temp[var66]; // L: 7619
							FriendSystem.changeGameOptions(var66); // L: 7620
							field702[++field823 - 1 & 31] = var66; // L: 7621
						}
					}

					var1.serverPacket = null; // L: 7624
					return true; // L: 7625
				}

				if (ServerPacket.field3339 == var1.serverPacket) { // L: 7627
					minimapState = var3.readUnsignedByte(); // L: 7628
					var1.serverPacket = null; // L: 7629
					return true; // L: 7630
				}

				if (ServerPacket.field3416 == var1.serverPacket) { // L: 7632
					var66 = var3.readUnsignedByte(); // L: 7633
					var21 = var3.readStringCp1252NullTerminated(); // L: 7634
					var6 = var3.method9506(); // L: 7635
					if (var6 >= 1 && var6 <= 8) { // L: 7636
						if (var21.equalsIgnoreCase("null")) { // L: 7637
							var21 = null;
						}

						playerMenuActions[var6 - 1] = var21; // L: 7638
						playerOptionsPriorities[var6 - 1] = var66 == 0; // L: 7639
					}

					var1.serverPacket = null; // L: 7641
					return true; // L: 7642
				}

				String var45;
				if (ServerPacket.field3372 == var1.serverPacket) { // L: 7644
					var20 = var3.readByte(); // L: 7645
					var21 = var3.readStringCp1252NullTerminated(); // L: 7646
					long var38 = (long)var3.readUnsignedShort(); // L: 7647
					long var40 = (long)var3.readMedium(); // L: 7648
					PlayerType var94 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var3.readUnsignedByte()); // L: 7649
					long var42 = (var38 << 32) + var40; // L: 7650
					boolean var61 = false; // L: 7651
					ClanChannel var44 = null; // L: 7652
					var44 = var20 >= 0 ? currentClanChannels[var20] : class316.guestClanChannel; // L: 7654
					if (var44 == null) { // L: 7655
						var61 = true; // L: 7656
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var94.isUser && InterfaceParent.friendSystem.isIgnored(new Username(var21, FriendLoginUpdate.loginType))) { // L: 7665 7666
									var61 = true;
								}
								break;
							}

							if (var42 == field762[var15]) { // L: 7660
								var61 = true; // L: 7661
								break; // L: 7662
							}

							++var15; // L: 7659
						}
					}

					if (!var61) { // L: 7669
						field762[field763] = var42; // L: 7670
						field763 = (field763 + 1) % 100; // L: 7671
						var45 = AbstractFont.escapeBrackets(class495.method8856(var3)); // L: 7672
						var16 = var20 >= 0 ? 41 : 44; // L: 7673
						if (var94.modIcon != -1) { // L: 7674
							Message.addChatMessage(var16, class415.method7833(var94.modIcon) + var21, var45, var44.name);
						} else {
							Message.addChatMessage(var16, var21, var45, var44.name); // L: 7675
						}
					}

					var1.serverPacket = null; // L: 7677
					return true; // L: 7678
				}

				if (ServerPacket.field3319 == var1.serverPacket) { // L: 7680
					ChatChannel.updatePlayers(var3, var1.serverPacketLength); // L: 7681
					class479.method8753(); // L: 7682
					var1.serverPacket = null; // L: 7683
					return true; // L: 7684
				}

				if (ServerPacket.field3310 == var1.serverPacket) { // L: 7686
					var66 = var3.readUnsignedByte(); // L: 7687
					var5 = var3.method9530(); // L: 7688
					var23 = ArchiveLoader.field1070.method6431(var5); // L: 7689
					WorldMapElement.method3580(var23, VarpDefinition.localPlayer.appearance.field3665, var66); // L: 7690
					UserComparator5.invalidateWidget(var23); // L: 7691
					var1.serverPacket = null; // L: 7692
					return true; // L: 7693
				}

				if (ServerPacket.field3344 == var1.serverPacket) { // L: 7695
					class73.field920 = null; // L: 7696
					var1.serverPacket = null; // L: 7697
					return true; // L: 7698
				}

				if (ServerPacket.field3317 == var1.serverPacket) { // L: 7700
					HealthBarDefinition.method3657(class311.field3287); // L: 7701
					var1.serverPacket = null; // L: 7702
					return true; // L: 7703
				}

				if (ServerPacket.field3350 == var1.serverPacket) { // L: 7705
					var66 = var3.readUnsignedByte(); // L: 7706
					TextureProvider.method5672(var66); // L: 7707
					var1.serverPacket = null; // L: 7708
					return true; // L: 7709
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 7711
					var66 = var3.readInt(); // L: 7712
					var5 = var3.method9529(); // L: 7713
					var6 = var3.method9492(); // L: 7714
					if (var6 == 65535) { // L: 7715
						var6 = -1;
					}

					var24 = ArchiveLoader.field1070.method6431(var66); // L: 7716
					ItemComposition var69;
					if (!var24.isIf3) { // L: 7717
						if (var6 == -1) { // L: 7718
							var24.modelType = 0; // L: 7719
							var1.serverPacket = null; // L: 7720
							return true; // L: 7721
						}

						var69 = ArchiveDiskActionHandler.ItemComposition_get(var6).getCountObj(var5); // L: 7723
						var24.modelType = 4; // L: 7724
						var24.modelId = var6; // L: 7725
						var24.modelAngleX = var69.xan2d; // L: 7726
						var24.modelAngleY = var69.yan2d; // L: 7727
						var24.modelZoom = var69.zoom2d * 100 / var5; // L: 7728
						UserComparator5.invalidateWidget(var24); // L: 7729
					} else {
						var24.itemId = var6; // L: 7732
						var24.itemQuantity = var5; // L: 7733
						var69 = ArchiveDiskActionHandler.ItemComposition_get(var6).getCountObj(var5); // L: 7734
						var24.modelAngleX = var69.xan2d; // L: 7735
						var24.modelAngleY = var69.yan2d; // L: 7736
						var24.modelAngleZ = var69.zan2d; // L: 7737
						var24.modelOffsetX = var69.offsetX2d; // L: 7738
						var24.modelOffsetY = var69.offsetY2d; // L: 7739
						var24.modelZoom = var69.zoom2d; // L: 7740
						if (var69.isStackable == 1) { // L: 7741
							var24.itemQuantityMode = 1;
						} else {
							var24.itemQuantityMode = 2; // L: 7742
						}

						if (var24.field3781 > 0) { // L: 7743
							var24.modelZoom = var24.modelZoom * 32 / var24.field3781;
						} else if (var24.rawWidth > 0) { // L: 7744
							var24.modelZoom = var24.modelZoom * 32 / var24.rawWidth;
						}

						UserComparator5.invalidateWidget(var24); // L: 7745
					}

					var1.serverPacket = null; // L: 7747
					return true; // L: 7748
				}

				if (ServerPacket.field3349 == var1.serverPacket) { // L: 7750
					var66 = var3.method9703(); // L: 7751
					class131.method3076(var66); // L: 7752
					field646[++field608 - 1 & 31] = var66 & 32767; // L: 7753
					var1.serverPacket = null; // L: 7754
					return true; // L: 7755
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 7757
					var66 = var3.method9530(); // L: 7758
					var5 = var3.method9636(); // L: 7759
					var23 = ArchiveLoader.field1070.method6431(var66); // L: 7760
					if (var23.modelType != 6 || var5 != var23.modelId) { // L: 7761
						var23.modelType = 6; // L: 7762
						var23.modelId = var5; // L: 7763
						UserComparator5.invalidateWidget(var23); // L: 7764
					}

					var1.serverPacket = null; // L: 7766
					return true; // L: 7767
				}

				if (ServerPacket.field3419 == var1.serverPacket) { // L: 7769
					if (class73.field920 == null) { // L: 7770
						class73.field920 = new class473(ApproximateRouteStrategy.field488);
					}

					class542 var51 = ApproximateRouteStrategy.field488.method8725(var3); // L: 7771
					class73.field920.field4873.vmethod9186(var51.field5267, var51.field5268); // L: 7772
					field729[++field730 - 1 & 31] = var51.field5267; // L: 7773
					var1.serverPacket = null; // L: 7774
					return true; // L: 7775
				}

				if (ServerPacket.field3394 == var1.serverPacket) { // L: 7777
					var66 = var3.method9585(); // L: 7778
					var21 = var3.readStringCp1252NullTerminated(); // L: 7779
					var23 = ArchiveLoader.field1070.method6431(var66); // L: 7780
					if (!var21.equals(var23.text)) { // L: 7781
						var23.text = var21; // L: 7782
						UserComparator5.invalidateWidget(var23); // L: 7783
					}

					var1.serverPacket = null; // L: 7785
					return true; // L: 7786
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 7788
					field735 = cycleCntr; // L: 7789
					var20 = var3.readByte(); // L: 7790
					class162 var70 = new class162(var3); // L: 7791
					ClanChannel var74;
					if (var20 >= 0) { // L: 7793
						var74 = currentClanChannels[var20];
					} else {
						var74 = class316.guestClanChannel; // L: 7794
					}

					if (var74 == null) { // L: 7795
						this.method1243(var20); // L: 7796
						var1.serverPacket = null; // L: 7797
						return true; // L: 7798
					}

					if (var70.field1785 > var74.field1808) { // L: 7800
						this.method1243(var20); // L: 7801
						var1.serverPacket = null; // L: 7802
						return true; // L: 7803
					}

					if (var70.field1785 < var74.field1808) { // L: 7805
						var1.serverPacket = null; // L: 7806
						return true; // L: 7807
					}

					var70.method3442(var74); // L: 7809
					var1.serverPacket = null; // L: 7810
					return true; // L: 7811
				}

				if (ServerPacket.field3398 == var1.serverPacket) { // L: 7813
					class334.method6395(var3.readStringCp1252NullTerminated()); // L: 7814
					var1.serverPacket = null; // L: 7815
					return true; // L: 7816
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 7818
					var1.serverPacket = null; // L: 7819
					return true; // L: 7820
				}

				if (ServerPacket.field3351 == var1.serverPacket) { // L: 7822
					var66 = var3.readInt(); // L: 7823
					var5 = var3.method9703(); // L: 7824
					var23 = ArchiveLoader.field1070.method6431(var66); // L: 7825
					if (var23.modelType != 1 || var5 != var23.modelId) { // L: 7826
						var23.modelType = 1; // L: 7827
						var23.modelId = var5; // L: 7828
						UserComparator5.invalidateWidget(var23); // L: 7829
					}

					var1.serverPacket = null; // L: 7831
					return true; // L: 7832
				}

				if (ServerPacket.field3393 == var1.serverPacket) { // L: 7834
					class67.method1206(); // L: 7835
					var66 = var3.method9605(); // L: 7836
					var5 = var3.method9605(); // L: 7837
					var6 = var3.method9579(); // L: 7838
					var7 = var3.readInt(); // L: 7839
					experience[var6] = var7; // L: 7840
					currentLevels[var6] = var5; // L: 7841
					levels[var6] = 1; // L: 7842
					field672[var6] = var66; // L: 7843

					for (var8 = 0; var8 < 98; ++var8) { // L: 7844
						if (var7 >= Skills.Skills_experienceTable[var8]) {
							levels[var6] = var8 + 2;
						}
					}

					field727[++field782 - 1 & 31] = var6; // L: 7845
					var1.serverPacket = null; // L: 7846
					return true; // L: 7847
				}

				if (ServerPacket.field3404 == var1.serverPacket) { // L: 7849
					for (var66 = 0; var66 < players.length; ++var66) { // L: 7850
						if (players[var66] != null) { // L: 7851
							players[var66].sequence = -1;
						}
					}

					for (var66 = 0; var66 < npcs.length; ++var66) { // L: 7853
						if (npcs[var66] != null) { // L: 7854
							npcs[var66].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7856
					return true; // L: 7857
				}

				if (ServerPacket.field3402 == var1.serverPacket) { // L: 7859
					HealthBarDefinition.method3657(class311.field3276); // L: 7860
					var1.serverPacket = null; // L: 7861
					return true; // L: 7862
				}

				if (ServerPacket.field3395 == var1.serverPacket) { // L: 7864
					var66 = var3.readInt(); // L: 7865
					var55 = var3.method9605() == 1; // L: 7866
					var23 = ArchiveLoader.field1070.method6431(var66); // L: 7867
					if (var55 != var23.isHidden) { // L: 7868
						var23.isHidden = var55; // L: 7869
						UserComparator5.invalidateWidget(var23); // L: 7870
					}

					var1.serverPacket = null; // L: 7872
					return true; // L: 7873
				}

				if (ServerPacket.field3356 == var1.serverPacket) { // L: 7875
					class133.privateChatMode = class177.method3562(var3.readUnsignedByte()); // L: 7876
					var1.serverPacket = null; // L: 7877
					return true; // L: 7878
				}

				if (ServerPacket.field3375 == var1.serverPacket) { // L: 7880
					var75 = var3.method9506() == 1; // L: 7881
					var5 = var3.method9585(); // L: 7882
					var23 = ArchiveLoader.field1070.method6431(var5); // L: 7883
					class14.method161(var23, VarpDefinition.localPlayer.appearance, var75); // L: 7884
					UserComparator5.invalidateWidget(var23); // L: 7885
					var1.serverPacket = null; // L: 7886
					return true; // L: 7887
				}

				if (ServerPacket.field3410 == var1.serverPacket) { // L: 7889
					var66 = var3.readInt(); // L: 7890
					var68 = ArchiveLoader.field1070.method6431(var66); // L: 7891

					for (var6 = 0; var6 < var68.field3856.length; ++var6) { // L: 7892
						var68.field3856[var6] = -1; // L: 7893
						var68.field3856[var6] = 0; // L: 7894
					}

					UserComparator5.invalidateWidget(var68); // L: 7896
					var1.serverPacket = null; // L: 7897
					return true; // L: 7898
				}

				if (ServerPacket.field3367 == var1.serverPacket) { // L: 7900
					JagexCache.field2329 = var3.readUnsignedByte(); // L: 7901
					field831 = var3.method9506(); // L: 7902
					class4.field3 = var3.method9605(); // L: 7903

					while (var3.offset < var1.serverPacketLength) { // L: 7904
						var66 = var3.readUnsignedByte(); // L: 7905
						class311 var67 = MilliClock.method4249()[var66]; // L: 7906
						HealthBarDefinition.method3657(var67); // L: 7907
					}

					var1.serverPacket = null; // L: 7909
					return true; // L: 7910
				}

				if (ServerPacket.field3406 == var1.serverPacket) { // L: 7912
					HealthBarDefinition.method3657(class311.field3280); // L: 7913
					var1.serverPacket = null; // L: 7914
					return true; // L: 7915
				}

				if (ServerPacket.field3363 == var1.serverPacket) { // L: 7917
					var50 = var3.readStringCp1252NullTerminated(); // L: 7918
					var25 = (long)var3.readUnsignedShort(); // L: 7919
					var27 = (long)var3.readMedium(); // L: 7920
					PlayerType var34 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var3.readUnsignedByte()); // L: 7921
					long var46 = var27 + (var25 << 32); // L: 7922
					var59 = false; // L: 7923

					for (var13 = 0; var13 < 100; ++var13) { // L: 7924
						if (field762[var13] == var46) { // L: 7925
							var59 = true; // L: 7926
							break; // L: 7927
						}
					}

					if (InterfaceParent.friendSystem.isIgnored(new Username(var50, FriendLoginUpdate.loginType))) { // L: 7930
						var59 = true;
					}

					if (!var59 && field649 == 0) { // L: 7931
						field762[field763] = var46; // L: 7932
						field763 = (field763 + 1) % 100; // L: 7933
						var32 = AbstractFont.escapeBrackets(ClanChannel.method3490(class495.method8856(var3))); // L: 7934
						byte var65;
						if (var34.isPrivileged) { // L: 7936
							var65 = 7;
						} else {
							var65 = 3; // L: 7937
						}

						if (var34.modIcon != -1) { // L: 7938
							class209.addGameMessage(var65, class415.method7833(var34.modIcon) + var50, var32);
						} else {
							class209.addGameMessage(var65, var50, var32); // L: 7939
						}
					}

					var1.serverPacket = null; // L: 7941
					return true; // L: 7942
				}

				if (ServerPacket.field3348 == var1.serverPacket) { // L: 7944
					var66 = var3.method9585(); // L: 7945
					var5 = var3.method9636(); // L: 7946
					var6 = var5 >> 10 & 31; // L: 7947
					var7 = var5 >> 5 & 31; // L: 7948
					var8 = var5 & 31; // L: 7949
					var56 = (var7 << 11) + (var6 << 19) + (var8 << 3); // L: 7950
					Widget var93 = ArchiveLoader.field1070.method6431(var66); // L: 7951
					if (var56 != var93.color) { // L: 7952
						var93.color = var56; // L: 7953
						UserComparator5.invalidateWidget(var93); // L: 7954
					}

					var1.serverPacket = null; // L: 7956
					return true; // L: 7957
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 7959
					short var71 = (short)var3.method9519(); // L: 7960
					var5 = var3.readUnsignedByte(); // L: 7961
					var6 = var3.readInt(); // L: 7962
					var7 = var3.method9703(); // L: 7963
					var22 = npcs[var7]; // L: 7964
					if (var22 != null) { // L: 7965
						var22.method2665(var5, var6, var71); // L: 7966
					}

					var1.serverPacket = null; // L: 7968
					return true; // L: 7969
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 7971
					destinationX = var3.readUnsignedByte(); // L: 7972
					if (destinationX == 255) { // L: 7973
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7974
					if (destinationY == 255) { // L: 7975
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7976
					return true; // L: 7977
				}

				if (ServerPacket.field3347 == var1.serverPacket) { // L: 7979
					var66 = var3.method9529(); // L: 7980
					var5 = var3.method9703(); // L: 7981
					var6 = var3.method9492(); // L: 7982
					var24 = ArchiveLoader.field1070.method6431(var66); // L: 7983
					var24.field3782 = var6 + (var5 << 16); // L: 7984
					var1.serverPacket = null; // L: 7985
					return true; // L: 7986
				}

				if (ServerPacket.field3358 == var1.serverPacket) { // L: 7988
					HealthBarDefinition.method3657(class311.field3278); // L: 7989
					var1.serverPacket = null; // L: 7990
					return true; // L: 7991
				}

				if (ServerPacket.field3407 == var1.serverPacket) { // L: 7993
					var50 = var3.readStringCp1252NullTerminated(); // L: 7994
					var25 = var3.readLong(); // L: 7995
					var27 = (long)var3.readUnsignedShort(); // L: 7996
					var29 = (long)var3.readMedium(); // L: 7997
					PlayerType var33 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var3.readUnsignedByte()); // L: 7998
					var35 = (var27 << 32) + var29; // L: 7999
					boolean var63 = false; // L: 8000

					for (var15 = 0; var15 < 100; ++var15) { // L: 8001
						if (field762[var15] == var35) { // L: 8002
							var63 = true; // L: 8003
							break; // L: 8004
						}
					}

					if (var33.isUser && InterfaceParent.friendSystem.isIgnored(new Username(var50, FriendLoginUpdate.loginType))) { // L: 8007 8008
						var63 = true;
					}

					if (!var63 && field649 == 0) { // L: 8010
						field762[field763] = var35; // L: 8011
						field763 = (field763 + 1) % 100; // L: 8012
						var45 = AbstractFont.escapeBrackets(ClanChannel.method3490(class495.method8856(var3))); // L: 8013
						if (var33.modIcon != -1) { // L: 8014
							Message.addChatMessage(9, class415.method7833(var33.modIcon) + var50, var45, class224.base37DecodeLong(var25));
						} else {
							Message.addChatMessage(9, var50, var45, class224.base37DecodeLong(var25)); // L: 8015
						}
					}

					var1.serverPacket = null; // L: 8017
					return true; // L: 8018
				}

				if (ServerPacket.field3369 == var1.serverPacket) { // L: 8020
					if (rootInterface != -1) { // L: 8021
						Canvas.method292(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 8022
					return true; // L: 8023
				}

				if (ServerPacket.field3362 == var1.serverPacket) { // L: 8025
					HealthBarDefinition.method3657(class311.field3281); // L: 8026
					var1.serverPacket = null; // L: 8027
					return true; // L: 8028
				}

				if (ServerPacket.field3392 == var1.serverPacket) { // L: 8030
					HealthBarDefinition.method3657(class311.field3279); // L: 8031
					var1.serverPacket = null; // L: 8032
					return true; // L: 8033
				}

				if (ServerPacket.field3382 == var1.serverPacket) { // L: 8035
					return this.method1670(var1, 2); // L: 8036
				}

				if (ServerPacket.field3338 == var1.serverPacket) { // L: 8038
					var66 = var3.method9506(); // L: 8039
					var5 = var3.method9506(); // L: 8040
					var6 = var3.method9529(); // L: 8041
					var24 = ArchiveLoader.field1070.method6431(var6); // L: 8042
					class158.method3402(var24, var5, var66); // L: 8043
					UserComparator5.invalidateWidget(var24); // L: 8044
					var1.serverPacket = null; // L: 8045
					return true; // L: 8046
				}

				if (ServerPacket.field3302 == var1.serverPacket) { // L: 8048
					class67.method1206(); // L: 8049
					field704 = var3.readUnsignedShort(); // L: 8050
					field738 = cycleCntr; // L: 8051
					var1.serverPacket = null; // L: 8052
					return true; // L: 8053
				}

				if (ServerPacket.field3333 == var1.serverPacket) { // L: 8055
					isCameraLocked = true; // L: 8056
					field728 = false; // L: 8057
					field790 = true; // L: 8058
					var66 = var3.readShort(); // L: 8059
					var5 = var3.readShort(); // L: 8060
					var6 = class190.method3768(var5 + FriendSystem.cameraPitch & 2027); // L: 8061
					var7 = var66 + Script.cameraYaw; // L: 8062
					var8 = var3.readUnsignedShort(); // L: 8063
					var56 = var3.readUnsignedByte(); // L: 8064
					field794 = new class497(FriendSystem.cameraPitch, var6, var8, var56); // L: 8065
					field793 = new class497(Script.cameraYaw, var7, var8, var56); // L: 8066
					var1.serverPacket = null; // L: 8067
					return true; // L: 8068
				}

				if (ServerPacket.field3365 == var1.serverPacket) { // L: 8070
					var7 = var3.method9636(); // L: 8077
					var6 = var3.method9492(); // L: 8078
					var56 = var3.method9492(); // L: 8079
					var8 = var3.method9492(); // L: 8080
					var5 = var3.method9703(); // L: 8081
					if (var5 == 65535) { // L: 8082
						var5 = -1; // L: 8083
					}

					var66 = var3.readUnsignedShort(); // L: 8085
					if (var66 == 65535) { // L: 8086
						var66 = -1; // L: 8087
					}

					ArrayList var37 = new ArrayList(); // L: 8089
					var37.add(var66); // L: 8090
					var37.add(var5); // L: 8091
					class136.method3141(var37, var6, var7, var8, var56); // L: 8092
					var1.serverPacket = null; // L: 8093
					return true; // L: 8094
				}

				if (ServerPacket.field3387 == var1.serverPacket) { // L: 8096
					HealthBarDefinition.method3657(class311.field3282); // L: 8097
					var1.serverPacket = null; // L: 8098
					return true; // L: 8099
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 8101
					var15 = var3.method9703(); // L: 8117
					var18 = var3.method9492(); // L: 8118
					var10 = var3.method9510(); // L: 8119
					var12 = var3.method9636(); // L: 8120
					var9 = var3.method9510(); // L: 8121
					var6 = var3.method9521(); // L: 8122
					var66 = var6 >> 16; // L: 8123
					var5 = var6 >> 8 & 255; // L: 8124
					var7 = var66 + (var6 >> 4 & 7); // L: 8125
					var8 = var5 + (var6 & 7); // L: 8126
					var17 = var3.readUnsignedByte(); // L: 8127
					var13 = var3.readUnsignedByte() * 4; // L: 8128
					var14 = var3.method9579() * 4; // L: 8129
					var16 = var3.method9703(); // L: 8130
					var11 = var3.method9478(); // L: 8131
					var56 = var9 + var7; // L: 8132
					var57 = var10 + var8; // L: 8133
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var12 != 65535) { // L: 8134
						var7 = var7 * 128 + 64; // L: 8135
						var8 = var8 * 128 + 64; // L: 8136
						var56 = var56 * 128 + 64; // L: 8137
						var57 = var57 * 128 + 64; // L: 8138
						var19 = new Projectile(var12, class473.Client_plane, var7, var8, class272.getTileHeight(var7, var8, class473.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14); // L: 8139
						var19.setDestination(var56, var57, class272.getTileHeight(var56, var57, class473.Client_plane) - var14, var15 + cycle); // L: 8140
						projectiles.addFirst(var19); // L: 8141
					}

					var1.serverPacket = null; // L: 8143
					return true; // L: 8144
				}

				if (ServerPacket.field3340 == var1.serverPacket) { // L: 8146
					HealthBarDefinition.method3657(class311.field3285); // L: 8147
					var1.serverPacket = null; // L: 8148
					return true; // L: 8149
				}

				if (ServerPacket.field3343 == var1.serverPacket) { // L: 8151
					field735 = cycleCntr; // L: 8152
					var20 = var3.readByte(); // L: 8153
					if (var1.serverPacketLength == 1) { // L: 8154
						if (var20 >= 0) { // L: 8155
							currentClanChannels[var20] = null;
						} else {
							class316.guestClanChannel = null; // L: 8156
						}

						var1.serverPacket = null; // L: 8157
						return true; // L: 8158
					}

					if (var20 >= 0) { // L: 8160
						currentClanChannels[var20] = new ClanChannel(var3); // L: 8161
					} else {
						class316.guestClanChannel = new ClanChannel(var3); // L: 8164
					}

					var1.serverPacket = null; // L: 8166
					return true; // L: 8167
				}

				class315.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1435 != null ? var1.field1435.id : -1) + "," + (var1.field1424 != null ? var1.field1424.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 8169
				class485.method8804(); // L: 8170
			} catch (IOException var48) { // L: 8172
				Huffman.method6966(); // L: 8173
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1435 != null ? var1.field1435.id : -1) + "," + (var1.field1424 != null ? var1.field1424.id : -1) + "," + var1.serverPacketLength + "," + (VarpDefinition.localPlayer.pathX[0] + Projectile.baseX * 64) + "," + (VarpDefinition.localPlayer.pathY[0] + GameEngine.baseY * 8) + ","; // L: 8176

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 8177
					var21 = var21 + var3.array[var6] + ",";
				}

				class315.RunException_sendStackTrace(var21, var49); // L: 8178
				class485.method8804(); // L: 8179
			}

			return true; // L: 8181
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "846839081"
	)
	@Export("menu")
	final void menu() {
		class317.method6072(); // L: 9301
		if (clickedWidget == null) { // L: 9302
			int var1 = MouseHandler.MouseHandler_lastButton; // L: 9303
			int var2;
			if (isMenuOpen) { // L: 9304
				int var3;
				if (var1 != 1 && (class524.mouseCam || var1 != 4)) { // L: 9305
					var2 = MouseHandler.MouseHandler_x; // L: 9306
					var3 = MouseHandler.MouseHandler_y; // L: 9307
					if (var2 < class245.menuX - 10 || var2 > class245.menuX + class60.menuWidth + 10 || var3 < Decimator.menuY - 10 || var3 > class167.menuHeight + Decimator.menuY + 10) { // L: 9308
						isMenuOpen = false; // L: 9309
						Language.method7364(class245.menuX, Decimator.menuY, class60.menuWidth, class167.menuHeight); // L: 9310
					}
				}

				if (var1 == 1 || !class524.mouseCam && var1 == 4) { // L: 9313
					var2 = class245.menuX; // L: 9314
					var3 = Decimator.menuY; // L: 9315
					int var4 = class60.menuWidth; // L: 9316
					int var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9317
					int var6 = MouseHandler.MouseHandler_lastPressedY; // L: 9318
					int var7 = -1; // L: 9319

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9320
						int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 9321
						if (var5 > var2 && var5 < var4 + var2 && var6 > var9 - 13 && var6 < var9 + 3) { // L: 9322
							var7 = var8;
						}
					}

					if (var7 != -1) { // L: 9324
						class129.method3067(var7);
					}

					isMenuOpen = false; // L: 9325
					Language.method7364(class245.menuX, Decimator.menuY, class60.menuWidth, class167.menuHeight); // L: 9326
				}
			} else {
				var2 = FontName.method9113(); // L: 9330
				if ((var1 == 1 || !class524.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9331 9332
					var1 = 2; // L: 9333
				}

				if ((var1 == 1 || !class524.mouseCam && var1 == 4) && menuOptionsCount > 0) { // L: 9336
					class129.method3067(var2); // L: 9337
				}

				if (var1 == 2 && menuOptionsCount > 0) { // L: 9339
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9341

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-942182958"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = FontName.method9113(); // L: 9344
		return (field673 && menuOptionsCount > 2 || BufferedSource.method8521(var1)) && !menuShiftClick[var1]; // L: 9345
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "450506472"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class166.fontBold12.stringWidth("Choose Option"); // L: 9350

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 9351
			var5 = class166.fontBold12.stringWidth(SoundSystem.method810(var4)); // L: 9352
			if (var5 > var3) { // L: 9353
				var3 = var5;
			}
		}

		var3 += 8; // L: 9355
		var4 = menuOptionsCount * 15 + 22; // L: 9356
		var5 = var1 - var3 / 2; // L: 9357
		if (var5 + var3 > GameEngine.canvasWidth) { // L: 9358
			var5 = GameEngine.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 9359
			var5 = 0;
		}

		int var6 = var2; // L: 9360
		if (var4 + var2 > WorldMapArea.canvasHeight) { // L: 9361
			var6 = WorldMapArea.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 9362
			var6 = 0;
		}

		class245.menuX = var5; // L: 9363
		Decimator.menuY = var6; // L: 9364
		class60.menuWidth = var3; // L: 9365
		class167.menuHeight = menuOptionsCount * 15 + 22; // L: 9366
		var1 -= viewportOffsetX; // L: 9368
		var2 -= viewportOffsetY; // L: 9369
		Actor.scene.menuOpen(class473.Client_plane, var1, var2, false); // L: 9370
		isMenuOpen = true; // L: 9371
	} // L: 9372

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "90"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		VarpDefinition.method3551(rootInterface, GameEngine.canvasWidth, WorldMapArea.canvasHeight, var1); // L: 11144
	} // L: 11145

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "1004570109"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : ArchiveLoader.field1070.method6431(var1.parentId); // L: 11148
		int var3;
		int var4;
		if (var2 == null) { // L: 11151
			var3 = GameEngine.canvasWidth; // L: 11152
			var4 = WorldMapArea.canvasHeight; // L: 11153
		} else {
			var3 = var2.width; // L: 11156
			var4 = var2.height; // L: 11157
		}

		SecureRandomCallable.alignWidgetSize(var1, var3, var4, false); // L: 11159
		class154.alignWidgetPosition(var1, var3, var4); // L: 11160
	} // L: 11161

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "846162072"
	)
	final void method1559() {
		UserComparator5.invalidateWidget(clickedWidget); // L: 12128
		++WorldMapLabelSize.widgetDragDuration; // L: 12129
		if (field810 && field746) { // L: 12130
			int var1 = MouseHandler.MouseHandler_x; // L: 12139
			int var2 = MouseHandler.MouseHandler_y; // L: 12140
			var1 -= widgetClickX; // L: 12141
			var2 -= widgetClickY; // L: 12142
			if (var1 < field765) { // L: 12143
				var1 = field765;
			}

			if (var1 + clickedWidget.width > field765 + clickedWidgetParent.width) { // L: 12144
				var1 = field765 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field774) { // L: 12145
				var2 = field774;
			}

			if (var2 + clickedWidget.height > field774 + clickedWidgetParent.height) { // L: 12146
				var2 = field774 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field640; // L: 12147
			int var4 = var2 - field720; // L: 12148
			int var5 = clickedWidget.dragZoneSize; // L: 12149
			if (WorldMapLabelSize.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 12150 12151
				isDraggingWidget = true; // L: 12152
			}

			int var6 = var1 - field765 + clickedWidgetParent.scrollX; // L: 12155
			int var7 = var2 - field774 + clickedWidgetParent.scrollY; // L: 12156
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 12157
				var8 = new ScriptEvent(); // L: 12158
				var8.widget = clickedWidget; // L: 12159
				var8.mouseX = var6; // L: 12160
				var8.mouseY = var7; // L: 12161
				var8.args = clickedWidget.onDrag; // L: 12162
				class177.runScriptEvent(var8); // L: 12163
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12165
				if (isDraggingWidget) { // L: 12166
					if (clickedWidget.onDragComplete != null) { // L: 12167
						var8 = new ScriptEvent(); // L: 12168
						var8.widget = clickedWidget; // L: 12169
						var8.mouseX = var6; // L: 12170
						var8.mouseY = var7; // L: 12171
						var8.dragTarget = draggedOnWidget; // L: 12172
						var8.args = clickedWidget.onDragComplete; // L: 12173
						class177.runScriptEvent(var8); // L: 12174
					}

					if (draggedOnWidget != null) { // L: 12176
						Widget var9 = clickedWidget; // L: 12178
						int var11 = class429.getWidgetFlags(var9); // L: 12181
						int var10 = var11 >> 17 & 7; // L: 12183
						int var12 = var10; // L: 12185
						Widget var15;
						if (var10 == 0) { // L: 12186
							var15 = null; // L: 12187
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var15 = var9; // L: 12197
									break;
								}

								var9 = ArchiveLoader.field1070.method6431(var9.parentId); // L: 12191
								if (var9 == null) { // L: 12192
									var15 = null; // L: 12193
									break; // L: 12194
								}

								++var13; // L: 12190
							}
						}

						if (var15 != null) { // L: 12199
							PacketBufferNode var14 = ViewportMouse.getPacketBufferNode(ClientPacket.field3224, packetWriter.isaacCipher); // L: 12201
							var14.packetBuffer.writeIntME(clickedWidget.childIndex); // L: 12202
							var14.packetBuffer.writeIntME(draggedOnWidget.itemId); // L: 12203
							var14.packetBuffer.writeIntME(clickedWidget.itemId); // L: 12204
							var14.packetBuffer.writeInt(clickedWidget.id); // L: 12205
							var14.packetBuffer.method9677(draggedOnWidget.id); // L: 12206
							var14.packetBuffer.writeIntME(draggedOnWidget.childIndex); // L: 12207
							packetWriter.addNode(var14); // L: 12208
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12213
					this.openMenu(widgetClickX + field640, field720 + widgetClickY); // L: 12214
				} else if (menuOptionsCount > 0) { // L: 12216
					class369.method7013(field640 + widgetClickX, widgetClickY + field720); // L: 12217
				}

				clickedWidget = null; // L: 12220
			}

		} else {
			if (WorldMapLabelSize.widgetDragDuration > 1) { // L: 12131
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 12132
					class369.method7013(field640 + widgetClickX, field720 + widgetClickY); // L: 12133
				}

				clickedWidget = null; // L: 12135
			}

		}
	} // L: 12137 12222

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(B)Lvn;",
		garbageValue = "-106"
	)
	@Export("username")
	public Username username() {
		return VarpDefinition.localPlayer != null ? VarpDefinition.localPlayer.username : null; // L: 12901
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-161718870"
	)
	void method1243(int var1) {
		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.field3252, packetWriter.isaacCipher); // L: 13033
		var2.packetBuffer.writeByte(var1); // L: 13034
		packetWriter.addNode(var2); // L: 13035
	} // L: 13036

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "255"
	)
	void method1244(int var1) {
		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.field3271, packetWriter.isaacCipher); // L: 13039
		var2.packetBuffer.writeByte(var1); // L: 13040
		packetWriter.addNode(var2); // L: 13041
	} // L: 13042

	protected void finalize() throws Throwable {
		class321.field3482.remove(this); // L: 906
		super.finalize(); // L: 908
	} // L: 909

	public void setClient(int var1) {
		this.field699 = var1; // L: 931
	} // L: 932

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 947
			this.field572 = var1; // L: 950
		}
	} // L: 948 951

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 956
	}

	public long getAccountHash() {
		return this.accountHash; // L: 961
	}

	@Export("kill0")
	@ObfuscatedName("init")
	public final void kill0() {
		// $FF: Couldn't be decompiled
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 937
			this.field764 = var1; // L: 940
			JagexCache.method4224(10); // L: 941
		}
	} // L: 938 942

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lcy;",
		garbageValue = "673134129"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1761793571"
	)
	static int method1531(int var0, Script var1, boolean var2) {
		return 2; // L: 5329
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lng;IB)I",
		garbageValue = "-9"
	)
	static final int method1763(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11301
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11303
				int var3 = 0; // L: 11304
				int var4 = 0; // L: 11305
				byte var5 = 0; // L: 11306

				while (true) {
					int var6 = var2[var4++]; // L: 11308
					int var7 = 0; // L: 11309
					byte var8 = 0; // L: 11310
					if (var6 == 0) { // L: 11311
						return var3;
					}

					if (var6 == 1) { // L: 11312
						var7 = currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11313
						var7 = levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11314
						var7 = experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11315
						var9 = var2[var4++] << 16; // L: 11316
						var9 += var2[var4++]; // L: 11317
						var10 = ArchiveLoader.field1070.method6431(var9); // L: 11318
						var11 = var2[var4++]; // L: 11319
						if (var11 != -1 && (!ArchiveDiskActionHandler.ItemComposition_get(var11).isMembersOnly || isMembersWorld)) { // L: 11320
							for (var12 = 0; var12 < var10.field3856.length; ++var12) { // L: 11321
								if (var11 + 1 == var10.field3856[var12]) { // L: 11322
									var7 += var10.field3857[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11326
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11327
						var7 = Skills.Skills_experienceTable[levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11328
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11329
						var7 = VarpDefinition.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11330
						for (var9 = 0; var9 < 25; ++var9) { // L: 11331
							if (Skills.Skills_enabled[var9]) { // L: 11332
								var7 += levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11335
						var9 = var2[var4++] << 16; // L: 11336
						var9 += var2[var4++]; // L: 11337
						var10 = ArchiveLoader.field1070.method6431(var9); // L: 11338
						var11 = var2[var4++]; // L: 11339
						if (var11 != -1 && (!ArchiveDiskActionHandler.ItemComposition_get(var11).isMembersOnly || isMembersWorld)) { // L: 11340
							for (var12 = 0; var12 < var10.field3856.length; ++var12) { // L: 11341
								if (var11 + 1 == var10.field3856[var12]) { // L: 11342
									var7 = 999999999; // L: 11343
									break; // L: 11344
								}
							}
						}
					}

					if (var6 == 11) { // L: 11349
						var7 = field704;
					}

					if (var6 == 12) { // L: 11350
						var7 = weight;
					}

					if (var6 == 13) { // L: 11351
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11352
						int var13 = var2[var4++]; // L: 11353
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11354
					}

					if (var6 == 14) { // L: 11356
						var9 = var2[var4++]; // L: 11357
						var7 = class332.getVarbit(var9); // L: 11358
					}

					if (var6 == 15) { // L: 11360
						var8 = 1;
					}

					if (var6 == 16) { // L: 11361
						var8 = 2;
					}

					if (var6 == 17) { // L: 11362
						var8 = 3;
					}

					if (var6 == 18) { // L: 11363
						var7 = Projectile.baseX * 64 + (VarpDefinition.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11364
						var7 = GameEngine.baseY * 8 + (VarpDefinition.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11365
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11366
						if (var5 == 0) { // L: 11367
							var3 += var7;
						}

						if (var5 == 1) { // L: 11368
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11369
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11370
							var3 *= var7;
						}

						var5 = 0; // L: 11371
					} else {
						var5 = var8; // L: 11373
					}
				}
			} catch (Exception var14) { // L: 11376
				return -1; // L: 11377
			}
		} else {
			return -2;
		}
	}
}
