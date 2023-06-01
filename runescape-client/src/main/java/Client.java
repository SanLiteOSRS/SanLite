import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.awt.FontMetrics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class312 {
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		intValue = 498138447
	)
	public static int field776;
	@ObfuscatedName("vj")
	@ObfuscatedGetter(
		intValue = 79078351
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = 431154047
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("un")
	static boolean field732;
	@ObfuscatedName("uz")
	static boolean field572;
	@ObfuscatedName("xe")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static final ApproximateRouteStrategy field781;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	static class466 field746;
	@ObfuscatedName("xd")
	static int[] field554;
	@ObfuscatedName("xj")
	static int[] field783;
	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	static class466 field718;
	@ObfuscatedName("vd")
	static boolean[] field748;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = -1946446337
	)
	static int field737;
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = 871445031
	)
	static int field768;
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("wz")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wq")
	@ObfuscatedGetter(
		intValue = -1204115671
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "[Loj;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static class411 field772;
	@ObfuscatedName("vi")
	static short field753;
	@ObfuscatedName("vb")
	static short field754;
	@ObfuscatedName("vo")
	static int[] field611;
	@ObfuscatedName("vz")
	static short field676;
	@ObfuscatedName("vc")
	static int[] field750;
	@ObfuscatedName("vf")
	static short field760;
	@ObfuscatedName("wy")
	@ObfuscatedGetter(
		intValue = -1081145461
	)
	static int field780;
	@ObfuscatedName("ve")
	static int[] field696;
	@ObfuscatedName("vl")
	static short field758;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -1974991111
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vr")
	static int[] field752;
	@ObfuscatedName("vp")
	static short field757;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = 718176145
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 1036328387
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("uh")
	static boolean field743;
	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static class467 field744;
	@ObfuscatedName("vk")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vg")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wm")
	@ObfuscatedGetter(
		intValue = -761921755
	)
	static int field775;
	@ObfuscatedName("wl")
	static List field777;
	@ObfuscatedName("bq")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("bj")
	static boolean field766;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 629606971
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1908509517
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1534903733
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cd")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cz")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 2015047445
	)
	static int field485;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1943570623
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 347126201
	)
	static int field487;
	@ObfuscatedName("cc")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1375653787
	)
	public static int field657;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -750300005
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dm")
	static boolean field493;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1209053217
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		longValue = -1050285687716085043L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 998825493
	)
	static int field496;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -363517635
	)
	static int field497;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		longValue = 9201598923097477369L
	)
	static long field498;
	@ObfuscatedName("eh")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -812110917
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 833195237
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 968207765
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -234716809
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 2000845837
	)
	static int field504;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 694365471
	)
	static int field684;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 604250012
	)
	static int field506;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 189467871
	)
	static int field507;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1523531968
	)
	static int field508;
	@ObfuscatedName("ey")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("eu")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 900592385
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = 1515989633
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -984249799
	)
	static int field571;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -211705891
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 1436246225
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -1593569413
	)
	static int field518;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -1523793767
	)
	static int field647;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1923101455
	)
	static int field520;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	static class139 field521;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	static class505 field522;
	@ObfuscatedName("hx")
	static final String field681;
	@ObfuscatedName("hw")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hy")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "[Ldy;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = -105719945
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ir")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -239020259
	)
	static int field542;
	@ObfuscatedName("ij")
	static int[] field512;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 1018286255
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("il")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("it")
	static String field644;
	@ObfuscatedName("if")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = 1970079243
	)
	static int field716;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 1234737699
	)
	static int field550;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 2072684519
	)
	static int field624;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1031864865
	)
	static int field552;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -717024393
	)
	static int field553;
	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jp")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jt")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jn")
	static final int[] field717;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -1688230321
	)
	static int field558;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -1038385053
	)
	static int field727;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 2133607707
	)
	static int field640;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -549706311
	)
	static int field561;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = -200372025
	)
	static int field562;
	@ObfuscatedName("kd")
	static boolean field563;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -54872257
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 941758185
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 1110492275
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -995887857
	)
	static int field567;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = 55482233
	)
	static int field483;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -552030827
	)
	static int field569;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -358108223
	)
	static int field606;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1080386653
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1867536781
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 755993873
	)
	static int field573;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -2054307643
	)
	static int field709;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 360999739
	)
	static int field575;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -928324175
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -1040374445
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -1455370183
	)
	static int field578;
	@ObfuscatedName("lq")
	static boolean field579;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -1763271393
	)
	static int field580;
	@ObfuscatedName("ly")
	static boolean field581;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -844572199
	)
	static int field582;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 301511715
	)
	static int field479;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -926003691
	)
	static int field584;
	@ObfuscatedName("lu")
	static int[] field585;
	@ObfuscatedName("lx")
	static int[] field700;
	@ObfuscatedName("lp")
	static int[] field587;
	@ObfuscatedName("lw")
	static int[] field588;
	@ObfuscatedName("lr")
	static int[] field610;
	@ObfuscatedName("lv")
	static int[] field590;
	@ObfuscatedName("li")
	static int[][] field591;
	@ObfuscatedName("ln")
	static int[] field686;
	@ObfuscatedName("ma")
	static String[] field515;
	@ObfuscatedName("mv")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 2049624653
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -1775895515
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -2138204601
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 739395915
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 908236919
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -1431504980
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 1391876165
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mw")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 1054372985
	)
	static int field516;
	@ObfuscatedName("mq")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "[Ldr;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -201984665
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 1045373187
	)
	static int field607;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		longValue = 302392248435825455L
	)
	static long field608;
	@ObfuscatedName("mt")
	static boolean field503;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 935788625
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -1104902175
	)
	static int field671;
	@ObfuscatedName("nz")
	static int[] field612;
	@ObfuscatedName("nr")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ne")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nh")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nd")
	static int[] field634;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 809147779
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "[[[Lot;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("ns")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nj")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nx")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nu")
	static boolean field532;
	@ObfuscatedName("nv")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = -1848172251
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nw")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nq")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("nc")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("oe")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("oj")
	static int[] field632;
	@ObfuscatedName("oo")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("og")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("om")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ok")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("or")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("op")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -62158655
	)
	static int field639;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = -1946893533
	)
	static int field533;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 916240745
	)
	static int field699;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -1353846503
	)
	static int field642;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 315653959
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ov")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -540818987
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 2056273071
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ol")
	static String field543;
	@ObfuscatedName("os")
	static String field649;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -1081868223
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 1057283161
	)
	static int field652;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 1030944071
	)
	static int field653;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = 1816585689
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -951787111
	)
	static int field630;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 1432414561
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = 75644543
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 1862855847
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pd")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -21822217
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 1396968419
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ph")
	static boolean field667;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -1478684179
	)
	static int field668;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 9762411
	)
	static int field670;
	@ObfuscatedName("pz")
	static boolean field749;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 2135280185
	)
	static int field767;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1303685907
	)
	static int field672;
	@ObfuscatedName("qs")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -576421867
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qc")
	static int[] field675;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -1763009347
	)
	static int field539;
	@ObfuscatedName("qt")
	static int[] field677;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = -1500785535
	)
	static int field678;
	@ObfuscatedName("qh")
	static int[] field691;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 751982091
	)
	static int field680;
	@ObfuscatedName("qe")
	static int[] field747;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 1960586717
	)
	static int field682;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -172929875
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = 2059991219
	)
	static int field736;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -1446329125
	)
	static int field685;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 1135487289
	)
	static int field615;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -1324029003
	)
	static int field687;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -1570314943
	)
	static int field735;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 1887132243
	)
	static int field689;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 1835555649
	)
	static int field690;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -1130540787
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	static class518 field692;
	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static NodeDeque field694;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static NodeDeque field695;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static NodeDeque field505;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 1837910793
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = 192059927
	)
	static int field751;
	@ObfuscatedName("rd")
	static boolean[] field693;
	@ObfuscatedName("rc")
	static boolean[] field701;
	@ObfuscatedName("ry")
	static boolean[] field745;
	@ObfuscatedName("rm")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rs")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rh")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 605388309
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		longValue = -3715264512986693925L
	)
	static long field708;
	@ObfuscatedName("rq")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sy")
	static int[] field710;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 193636981
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 350025063
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sc")
	static String field557;
	@ObfuscatedName("sp")
	static long[] field714;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = 1097773755
	)
	static int field715;
	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static class211 field759;
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static class209 field616;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 1542716603
	)
	static int field570;
	@ObfuscatedName("su")
	static int[] field540;
	@ObfuscatedName("sn")
	static int[] field720;
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		longValue = -7371129416625731853L
	)
	static long field721;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "[Lfb;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 102222967
	)
	static int field609;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = 646118681
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("to")
	static int[] field625;
	@ObfuscatedName("tg")
	static int[] field719;
	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "[Ltt;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = -1974720775
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 96453725
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = -127192747
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = 1729824457
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("tm")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1639392681
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ta")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ti")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("te")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tp")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "[Lbz;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uc")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("um")
	static boolean field741;
	@ObfuscatedName("gz")
	String field509;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	class14 field524;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	class18 field756;
	@ObfuscatedName("hh")
	OtlTokenRequester field526;
	@ObfuscatedName("hf")
	Future field527;
	@ObfuscatedName("ha")
	boolean field528;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	class18 field529;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field530;
	@ObfuscatedName("hl")
	Future field531;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	Buffer field724;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	class7 field536;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		longValue = 3380131957365089559L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field766 = true;
		worldId = 1; // L: 162
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false; // L: 169
		field485 = -1; // L: 174
		clientType = -1; // L: 175
		field487 = -1;
		onMobile = false;
		field657 = 214;
		gameState = 0;
		field493 = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field496 = -1;
		field497 = -1; // L: 219
		field498 = -1L; // L: 220
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0; // L: 224
		hintArrowPlayerIndex = 0; // L: 225
		field504 = 0;
		field684 = 0;
		field506 = 0;
		field507 = 0; // L: 229
		field508 = 0; // L: 230
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		renderSelf = false; // L: 234
		titleLoadingStage = 0; // L: 243
		js5ConnectState = 0;
		field571 = 0; // L: 247
		js5Errors = 0; // L: 270
		loginState = 0;
		field518 = 0;
		field647 = 0;
		field520 = 0;
		field521 = class139.field1601;
		field522 = class505.field5070;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 309
			}
		}

		field681 = class299.method5754(var2);
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null; // L: 333
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536]; // L: 339
		field542 = 0; // L: 340
		field512 = new int[250];
		packetWriter = new PacketWriter(); // L: 344
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer(); // L: 348
		fontsMap = new HashMap();
		field716 = 0;
		field550 = 1;
		field624 = 0;
		field552 = 1; // L: 364
		field553 = 0; // L: 365
		collisionMaps = new CollisionMap[4];
		isInInstance = false; // L: 374
		instanceChunkTemplates = new int[4][13][13]; // L: 375
		field717 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field558 = 0; // L: 379
		field727 = 2301979; // L: 391
		field640 = 5063219;
		field561 = 3353893; // L: 393
		field562 = 7759444; // L: 394
		field563 = false; // L: 395
		alternativeScrollbarWidth = 0; // L: 396
		camAngleX = 128;
		camAngleY = 0;
		field567 = 0;
		field483 = 0;
		field569 = 0; // L: 408
		field606 = 0; // L: 409
		oculusOrbState = 0; // L: 410
		camFollowHeight = 50;
		field573 = 0;
		field709 = 0;
		field575 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field578 = 0; // L: 421
		field579 = false; // L: 422
		field580 = 0;
		field581 = false; // L: 424
		field582 = 0; // L: 425
		field479 = 0; // L: 426
		field584 = 50; // L: 427
		field585 = new int[field584]; // L: 428
		field700 = new int[field584]; // L: 429
		field587 = new int[field584]; // L: 430
		field588 = new int[field584]; // L: 431
		field610 = new int[field584]; // L: 432
		field590 = new int[field584]; // L: 433
		field591 = new int[field584][]; // L: 434
		field686 = new int[field584]; // L: 435
		field515 = new String[field584]; // L: 436
		tileLastDrawnActor = new int[104][104]; // L: 437
		viewportDrawCount = 0; // L: 438
		viewportTempX = -1; // L: 439
		viewportTempY = -1; // L: 440
		mouseCrossX = 0; // L: 441
		mouseCrossY = 0; // L: 442
		mouseCrossState = 0; // L: 443
		mouseCrossColor = 0; // L: 444
		showMouseCross = true; // L: 445
		field516 = 0; // L: 446
		showLoadingMessages = true; // L: 448
		players = new Player[2048]; // L: 450
		localPlayerIndex = -1; // L: 452
		field607 = 0; // L: 453
		field608 = -1L; // L: 454
		field503 = true; // L: 456
		drawPlayerNames = 0; // L: 461
		field671 = 0; // L: 462
		field612 = new int[1000]; // L: 463
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 465
		playerMenuActions = new String[8]; // L: 466
		playerOptionsPriorities = new boolean[8]; // L: 467
		field634 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 468
		combatTargetPlayerIndex = -1; // L: 469
		groundItems = new NodeDeque[4][104][104]; // L: 470
		pendingSpawns = new NodeDeque(); // L: 471
		projectiles = new NodeDeque(); // L: 472
		graphicsObjects = new NodeDeque(); // L: 473
		currentLevels = new int[25]; // L: 474
		levels = new int[25]; // L: 475
		experience = new int[25]; // L: 476
		field532 = false; // L: 477
		isMenuOpen = false; // L: 478
		menuOptionsCount = 0; // L: 484
		menuArguments1 = new int[500]; // L: 485
		menuArguments2 = new int[500]; // L: 486
		menuOpcodes = new int[500]; // L: 487
		menuIdentifiers = new int[500]; // L: 488
		field632 = new int[500]; // L: 489
		menuActions = new String[500]; // L: 490
		menuTargets = new String[500]; // L: 491
		menuShiftClick = new boolean[500]; // L: 492
		followerOpsLowPriority = false; // L: 493
		tapToDrop = false; // L: 495
		showMouseOverText = true; // L: 496
		field639 = -1; // L: 497
		field533 = -1; // L: 498
		field699 = 0; // L: 502
		field642 = 50; // L: 503
		isItemSelected = 0; // L: 504
		field644 = null; // L: 508
		isSpellSelected = false; // L: 509
		selectedSpellChildIndex = -1; // L: 511
		selectedSpellItemId = -1; // L: 512
		field543 = null; // L: 514
		field649 = null; // L: 515
		rootInterface = -1; // L: 516
		interfaceParents = new NodeHashTable(8); // L: 517
		field652 = 0; // L: 522
		field653 = -1; // L: 523
		chatEffects = 0; // L: 524
		meslayerContinueWidget = null; // L: 525
		field630 = 0; // L: 526
		weight = 0; // L: 527
		staffModLevel = 0; // L: 528
		followerIndex = -1; // L: 529
		playerMod = false; // L: 530
		viewportWidget = null; // L: 531
		clickedWidget = null; // L: 532
		clickedWidgetParent = null; // L: 533
		widgetClickX = 0; // L: 534
		widgetClickY = 0; // L: 535
		draggedOnWidget = null; // L: 536
		field667 = false; // L: 537
		field668 = -1; // L: 538
		field670 = -1; // L: 539
		field749 = false; // L: 540
		field767 = -1; // L: 541
		field672 = -1; // L: 542
		isDraggingWidget = false; // L: 543
		cycleCntr = 1; // L: 548
		field675 = new int[32]; // L: 551
		field539 = 0; // L: 552
		field677 = new int[32]; // L: 553
		field678 = 0; // L: 554
		field691 = new int[32]; // L: 555
		field680 = 0; // L: 556
		field747 = new int[32]; // L: 557
		field682 = 0; // L: 558
		chatCycle = 0; // L: 559
		field736 = 0; // L: 560
		field685 = 0; // L: 561
		field615 = 0; // L: 562
		field687 = 0; // L: 563
		field735 = 0; // L: 564
		field689 = 0; // L: 565
		field690 = 0; // L: 566
		mouseWheelRotation = 0; // L: 572
		field692 = new class518(); // L: 573
		scriptEvents = new NodeDeque(); // L: 574
		field694 = new NodeDeque(); // L: 575
		field695 = new NodeDeque(); // L: 576
		field505 = new NodeDeque(); // L: 577
		widgetFlags = new NodeHashTable(512); // L: 578
		rootWidgetCount = 0; // L: 580
		field751 = -2; // L: 581
		field693 = new boolean[100]; // L: 582
		field701 = new boolean[100]; // L: 583
		field745 = new boolean[100]; // L: 584
		rootWidgetXs = new int[100]; // L: 585
		rootWidgetYs = new int[100]; // L: 586
		rootWidgetWidths = new int[100]; // L: 587
		rootWidgetHeights = new int[100]; // L: 588
		gameDrawingMode = 0; // L: 589
		field708 = 0L; // L: 590
		isResizable = true; // L: 591
		field710 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 598
		publicChatMode = 0; // L: 599
		tradeChatMode = 0; // L: 601
		field557 = ""; // L: 602
		field714 = new long[100]; // L: 604
		field715 = 0; // L: 605
		field759 = new class211(); // L: 606
		field616 = new class209(); // L: 607
		field570 = 0; // L: 609
		field540 = new int[128]; // L: 610
		field720 = new int[128]; // L: 611
		field721 = -1L; // L: 612
		currentClanSettings = new ClanSettings[4]; // L: 616
		currentClanChannels = new ClanChannel[4]; // L: 618
		field609 = -1; // L: 620
		mapIconCount = 0; // L: 621
		field625 = new int[1000]; // L: 622
		field719 = new int[1000]; // L: 623
		mapIcons = new SpritePixels[1000]; // L: 624
		destinationX = 0; // L: 625
		destinationY = 0; // L: 626
		minimapState = 0; // L: 633
		currentTrackGroupId = -1; // L: 634
		playingJingle = false; // L: 635
		soundEffectCount = 0; // L: 641
		soundEffectIds = new int[50]; // L: 642
		queuedSoundEffectLoops = new int[50]; // L: 643
		queuedSoundEffectDelays = new int[50]; // L: 644
		soundLocations = new int[50]; // L: 645
		soundEffects = new SoundEffect[50]; // L: 646
		isCameraLocked = false; // L: 648
		field741 = false; // L: 654
		field572 = false; // L: 655
		field743 = false; // L: 656
		field744 = null; // L: 662
		field718 = null; // L: 663
		field746 = null; // L: 664
		field732 = false; // L: 665
		field748 = new boolean[5]; // L: 673
		field611 = new int[5]; // L: 674
		field750 = new int[5]; // L: 675
		field696 = new int[5]; // L: 676
		field752 = new int[5]; // L: 677
		field753 = 256; // L: 678
		field754 = 205; // L: 679
		zoomHeight = 256; // L: 680
		zoomWidth = 320; // L: 681
		field757 = 1; // L: 682
		field758 = 32767; // L: 683
		field676 = 1; // L: 684
		field760 = 32767; // L: 685
		viewportOffsetX = 0; // L: 686
		viewportOffsetY = 0; // L: 687
		viewportWidth = 0; // L: 688
		viewportHeight = 0; // L: 689
		viewportZoom = 0; // L: 690
		playerAppearance = new PlayerComposition(); // L: 692
		field737 = -1; // L: 693
		field768 = -1; // L: 694
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 696
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 698
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 701
		field772 = new class411(8, class409.field4561); // L: 703
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 704
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 705
		field775 = -1; // L: 708
		field776 = -1; // L: 714
		field777 = new ArrayList(); // L: 715
		archiveLoaders = new ArrayList(10); // L: 716
		archiveLoadersDone = 0; // L: 717
		field780 = 0; // L: 718
		field781 = new ApproximateRouteStrategy(); // L: 727
		field554 = new int[50]; // L: 728
		field783 = new int[50]; // L: 729
	}

	public Client() {
		this.field528 = false;
		this.accountHash = -1L;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-22061017"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field708 = Canvas.method310() + 500L; // L: 4547
		this.resizeJS(); // L: 4548
		if (rootInterface != -1) { // L: 4549
			this.resizeRoot(true);
		}

	} // L: 4550

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-617153741"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 1079
		int[] var2 = new int[]{1000, 100, 500}; // L: 1080
		if (var1 != null && var2 != null) { // L: 1082
			ChatChannel.ByteArrayPool_alternativeSizes = var1; // L: 1095
			class306.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 1096
			class134.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 1097

			for (int var3 = 0; var3 < ChatChannel.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 1098
				class134.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 1099
				ByteArrayPool.field4506.add(var1[var3]); // L: 1100
			}

			Collections.sort(ByteArrayPool.field4506); // L: 1102
		} else {
			ChatChannel.ByteArrayPool_alternativeSizes = null; // L: 1083
			class306.ByteArrayPool_altSizeArrayCounts = null; // L: 1084
			class134.ByteArrayPool_arrays = null; // L: 1085
			ByteArrayPool.field4506.clear(); // L: 1087
			ByteArrayPool.field4506.add(100); // L: 1088
			ByteArrayPool.field4506.add(5000); // L: 1089
			ByteArrayPool.field4506.add(10000); // L: 1090
			ByteArrayPool.field4506.add(30000); // L: 1091
		}

		WorldMapArea.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1104
		ChatChannel.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1105
		class92.currentPort = WorldMapArea.worldPort; // L: 1106
		class1.field3 = class328.field3588; // L: 1107
		class130.field1531 = class328.field3590; // L: 1108
		PlayerComposition.field3546 = class328.field3587; // L: 1109
		PlayerComposition.field3550 = class328.field3586; // L: 1110
		PendingSpawn.urlRequester = new class112(this.field528, 214); // L: 1111
		this.setUpKeyboard(); // L: 1112
		this.method482(); // L: 1113
		UserComparator8.mouseWheel = this.mouseWheel(); // L: 1114
		this.method481(field616, 0); // L: 1115
		this.method481(field759, 1); // L: 1116
		class104.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1117
		AccessFile var4 = null; // L: 1120
		ClientPreferences var5 = new ClientPreferences(); // L: 1121

		try {
			var4 = WorldMapData_1.getPreferencesFile("", class332.field3772.name, false); // L: 1123
			byte[] var6 = new byte[(int)var4.length()]; // L: 1124

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) { // L: 1125 1126 1129
				var8 = var4.read(var6, var7, var6.length - var7); // L: 1127
				if (var8 == -1) { // L: 1128
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6)); // L: 1131
		} catch (Exception var11) { // L: 1133
		}

		try {
			if (var4 != null) { // L: 1135
				var4.close(); // L: 1136
			}
		} catch (Exception var10) { // L: 1139
		}

		WorldMapManager.clientPreferences = var5; // L: 1142
		this.setUpClipboard(); // L: 1143
		WorldMapLabelSize.method5041(this, NetCache.field4297); // L: 1144
		class157.setWindowedMode(WorldMapManager.clientPreferences.method2469()); // L: 1145
		ReflectionCheck.friendSystem = new FriendSystem(class31.loginType); // L: 1146
		this.field524 = new class14("tokenRequest", 1, 1); // L: 1147
		class153.method3187(this); // L: 1148
		Decimator.method1093(); // L: 1149
	} // L: 1150

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1218006873"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1154
		this.doCycleJs5(); // L: 1155
		class141.method3089(); // L: 1156
		Player.method2318(); // L: 1157
		class85.playPcmPlayers(); // L: 1158
		field759.method4084(); // L: 1159
		this.method488(); // L: 1160
		AbstractWorldMapData.method5470(); // L: 1161
		if (UserComparator8.mouseWheel != null) { // L: 1162
			int var1 = UserComparator8.mouseWheel.useRotation(); // L: 1163
			mouseWheelRotation = var1; // L: 1164
		}

		if (gameState == 0) { // L: 1166
			ItemLayer.load(); // L: 1167
			class90.method2273(); // L: 1168
		} else if (gameState == 5) { // L: 1170
			BufferedFile.method8773(this, GrandExchangeOfferOwnWorldComparator.fontPlain11, class302.fontPlain12); // L: 1171
			ItemLayer.load(); // L: 1172
			class90.method2273(); // L: 1173
		} else if (gameState != 10 && gameState != 11) { // L: 1175
			if (gameState == 20) { // L: 1176
				BufferedFile.method8773(this, GrandExchangeOfferOwnWorldComparator.fontPlain11, class302.fontPlain12); // L: 1177
				this.doCycleLoggedOut(); // L: 1178
			} else if (gameState == 50) { // L: 1180
				BufferedFile.method8773(this, GrandExchangeOfferOwnWorldComparator.fontPlain11, class302.fontPlain12); // L: 1181
				this.doCycleLoggedOut(); // L: 1182
			} else if (gameState == 25) { // L: 1184
				WorldMapLabel.method5494();
			}
		} else {
			BufferedFile.method8773(this, GrandExchangeOfferOwnWorldComparator.fontPlain11, class302.fontPlain12);
		}

		if (gameState == 30) { // L: 1185
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1186
			this.doCycleLoggedOut();
		}

	} // L: 1187

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-549944769"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label172: {
			try {
				if (class304.musicPlayerStatus == 2) { // L: 1194
					if (HealthBarUpdate.musicTrack == null) { // L: 1195
						HealthBarUpdate.musicTrack = MusicTrack.readTrack(HealthBar.musicTrackArchive, class7.musicTrackGroupId, class438.musicTrackFileId); // L: 1196
						if (HealthBarUpdate.musicTrack == null) { // L: 1197
							var2 = false; // L: 1198
							break label172;
						}
					}

					if (UserComparator4.soundCache == null) { // L: 1202
						UserComparator4.soundCache = new SoundCache(class304.soundEffectsArchive, class304.musicSamplesArchive);
					}

					if (class304.midiPcmStream.method5825(HealthBarUpdate.musicTrack, class304.musicPatchesArchive, UserComparator4.soundCache)) { // L: 1203
						class304.midiPcmStream.method5829(); // L: 1204
						class304.midiPcmStream.setPcmStreamVolume(class178.musicTrackVolume); // L: 1205
						class304.midiPcmStream.setMusicTrack(HealthBarUpdate.musicTrack, class404.musicTrackBoolean); // L: 1206
						WorldMapScaleHandler.method5604(class304.midiPcmStream.field3422); // L: 1207
						class304.field3391 = class7.musicTrackGroupId; // L: 1208
						class304.field3394 = class438.musicTrackFileId; // L: 1209
						class304.musicPlayerStatus = 0; // L: 1210
						HealthBarUpdate.musicTrack = null; // L: 1211
						UserComparator4.soundCache = null; // L: 1212
						HealthBar.musicTrackArchive = null; // L: 1213
						var2 = true; // L: 1214
						break label172;
					}
				}
			} catch (Exception var6) { // L: 1219
				var6.printStackTrace(); // L: 1220
				class304.midiPcmStream.clear(); // L: 1221
				class304.musicPlayerStatus = 0; // L: 1222
				HealthBarUpdate.musicTrack = null; // L: 1223
				UserComparator4.soundCache = null; // L: 1224
				HealthBar.musicTrackArchive = null; // L: 1225
			}

			var2 = false; // L: 1227
		}

		if (var2 && playingJingle && class139.pcmPlayer0 != null) { // L: 1230 1231
			class139.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field708 && Canvas.method310() > field708) { // L: 1233 1234
			class157.setWindowedMode(DecorativeObject.getWindowedMode()); // L: 1235
		}

		int var4;
		if (var1) { // L: 1238
			for (var4 = 0; var4 < 100; ++var4) { // L: 1239
				field693[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1241
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1242
			GrandExchangeOfferWorldComparator.drawTitle(class126.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, class302.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1243
			if (gameState == 20) { // L: 1244
				GrandExchangeOfferWorldComparator.drawTitle(class126.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, class302.fontPlain12);
			} else if (gameState == 50) { // L: 1245
				GrandExchangeOfferWorldComparator.drawTitle(class126.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, class302.fontPlain12);
			} else if (gameState == 25) { // L: 1246
				if (field553 == 1) { // L: 1247
					if (field716 > field550) { // L: 1248
						field550 = field716;
					}

					var4 = (field550 * 50 - field716 * 50) / field550; // L: 1249
					AbstractWorldMapIcon.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1250
				} else if (field553 == 2) { // L: 1252
					if (field624 > field552) { // L: 1253
						field552 = field624;
					}

					var4 = (field552 * 50 - field624 * 50) / field552 + 50; // L: 1254
					AbstractWorldMapIcon.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1255
				} else {
					AbstractWorldMapIcon.drawLoadingMessage("Loading - please wait.", false); // L: 1257
				}
			} else if (gameState == 30) { // L: 1259
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1260
				AbstractWorldMapIcon.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1261
				AbstractWorldMapIcon.drawLoadingMessage("Please wait...", false);
			}
		} else {
			GrandExchangeOfferWorldComparator.drawTitle(class126.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, class302.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1262
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1263
				if (field701[var4]) { // L: 1264
					class139.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1265
					field701[var4] = false; // L: 1266
				}
			}
		} else if (gameState > 0) { // L: 1270
			class139.rasterProvider.drawFull(0, 0); // L: 1271

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1272
				field701[var4] = false;
			}
		}

	} // L: 1274

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-556802626"
	)
	@Export("kill0")
	protected final void kill0() {
		if (Players.varcs.hasUnwrittenChanges()) { // L: 1277
			Players.varcs.write();
		}

		if (AttackOption.mouseRecorder != null) { // L: 1278
			AttackOption.mouseRecorder.isRunning = false;
		}

		AttackOption.mouseRecorder = null; // L: 1279
		packetWriter.close(); // L: 1280
		if (MouseHandler.KeyHandler_instance != null) { // L: 1282
			synchronized(MouseHandler.KeyHandler_instance) { // L: 1283
				MouseHandler.KeyHandler_instance = null; // L: 1284
			} // L: 1285
		}

		UserComparator8.mouseWheel = null; // L: 1288
		if (class139.pcmPlayer0 != null) { // L: 1289
			class139.pcmPlayer0.shutdown();
		}

		if (Language.pcmPlayer1 != null) { // L: 1290
			Language.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1292
			NetCache.NetCache_socket.close();
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1295
			if (ArchiveDiskActionHandler.field4237 != 0) { // L: 1296
				ArchiveDiskActionHandler.field4237 = 1; // L: 1297

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1299
				} catch (InterruptedException var4) { // L: 1301
				}
			}
		}

		if (PendingSpawn.urlRequester != null) { // L: 1305
			PendingSpawn.urlRequester.close(); // L: 1306
			PendingSpawn.urlRequester = null; // L: 1307
		}

		class131.method3019(); // L: 1309
		this.field524.method173(); // L: 1310
	} // L: 1311

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1476065581"
	)
	protected final void vmethod1213() {
	} // L: 736

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "115"
	)
	boolean method1215() {
		return class147.field1648 != null && !class147.field1648.trim().isEmpty() && class4.field6 != null && !class4.field6.trim().isEmpty(); // L: 1021
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-547465232"
	)
	boolean method1216() {
		return HealthBarDefinition.field1970 != null && !HealthBarDefinition.field1970.trim().isEmpty() && class481.field4945 != null && !class481.field4945.trim().isEmpty(); // L: 1025
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-10"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field526 != null; // L: 1029
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1348562177"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 1033
		var2.put("grant_type", "refresh_token"); // L: 1034
		var2.put("scope", "gamesso.token.create"); // L: 1035
		var2.put("refresh_token", var1); // L: 1036
		URL var3 = new URL(class193.field2002 + "shield/oauth/token" + (new class451(var2)).method8320()); // L: 1037
		class407 var4 = new class407(); // L: 1038
		var4.method7654(field681); // L: 1039
		var4.method7623("Host", (new URL(class193.field2002)).getHost()); // L: 1040
		var4.method7630(class448.field4727); // L: 1041
		class9 var5 = class9.field30; // L: 1042
		RefreshAccessTokenRequester var6 = this.field530; // L: 1043
		if (var6 != null) { // L: 1044
			this.field531 = var6.request(var5.method79(), var3, var4.method7622(), ""); // L: 1045
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field528); // L: 1048
			this.field529 = this.field524.method170(var7); // L: 1049
		}
	} // L: 1046 1050

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "670405930"
	)
	void method1398(String var1) throws IOException {
		URL var2 = new URL(class193.field2002 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 1053
		class407 var3 = new class407(); // L: 1054
		var3.method7627(var1); // L: 1055
		class9 var4 = class9.field28; // L: 1056
		OtlTokenRequester var5 = this.field526; // L: 1057
		if (var5 != null) { // L: 1058
			this.field527 = var5.request(var4.method79(), var2, var3.method7622(), ""); // L: 1059
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field528); // L: 1062
			this.field756 = this.field524.method170(var6); // L: 1063
		}
	} // L: 1060 1064

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-47"
	)
	void method1220(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class193.field2002 + "/game-session/v1/tokens"); // L: 1067
		class10 var4 = new class10(var3, class9.field30, this.field528); // L: 1068
		var4.method84().method7627(var1); // L: 1069
		var4.method84().method7630(class448.field4727); // L: 1070
		JSONObject var5 = new JSONObject(); // L: 1071
		var5.put("accountId", var2); // L: 1072
		var4.method85(new class450(var5)); // L: 1073
		this.field756 = this.field524.method170(var4); // L: 1074
	} // L: 1075

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1843044091"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1363
			long var2 = Canvas.method310(); // L: 1366
			int var4 = (int)(var2 - NetCache.field4276); // L: 1367
			NetCache.field4276 = var2; // L: 1368
			if (var4 > 200) { // L: 1369
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1370
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1371
				var1 = true; // L: 1372
			} else if (NetCache.NetCache_socket == null) { // L: 1375
				var1 = false; // L: 1376
			} else {
				try {
					label240: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1380
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1381
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1382
							var6 = new Buffer(4); // L: 1383
							var6.writeByte(1); // L: 1384
							var6.writeMedium((int)var5.key); // L: 1385
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1386
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1387
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1388
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1389
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1391
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1392
							var6 = new Buffer(4); // L: 1393
							var6.writeByte(0); // L: 1394
							var6.writeMedium((int)var5.key); // L: 1395
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1396
							var5.removeDual(); // L: 1397
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1398
							--NetCache.NetCache_pendingWritesCount; // L: 1399
							++NetCache.NetCache_pendingResponsesCount; // L: 1400
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1402
							int var18 = NetCache.NetCache_socket.available(); // L: 1403
							if (var18 < 0) { // L: 1404
								throw new IOException();
							}

							if (var18 == 0) { // L: 1405
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1406
							byte var7 = 0; // L: 1407
							if (class178.NetCache_currentResponse == null) { // L: 1408
								var7 = 8;
							} else if (NetCache.field4288 == 0) { // L: 1409
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							byte[] var10000;
							int var10001;
							Buffer var24;
							if (var7 > 0) { // L: 1410
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1411
								if (var8 > var18) { // L: 1412
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1413
								if (NetCache.field4290 != 0) { // L: 1414
									for (var9 = 0; var9 < var8; ++var9) { // L: 1415
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var9;
										var10000[var10001] ^= NetCache.field4290;
									}
								}

								var24 = NetCache.NetCache_responseHeaderBuffer; // L: 1417
								var24.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1418
									break;
								}

								if (class178.NetCache_currentResponse == null) { // L: 1419
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1420
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1421
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1422
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1423
									int var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1424
									long var13 = (long)(var10 + (var9 << 16)); // L: 1425
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1426
									NetCache.field4293 = true; // L: 1427
									if (var15 == null) { // L: 1428
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1429
										NetCache.field4293 = false; // L: 1430
									}

									if (var15 == null) { // L: 1432
										throw new IOException(); // L: 1433
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1435
									class178.NetCache_currentResponse = var15; // L: 1436
									class280.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + class178.NetCache_currentResponse.padding); // L: 1437
									class280.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1438
									class280.NetCache_responseArchiveBuffer.writeIntME(var12); // L: 1439
									NetCache.field4288 = 8; // L: 1440
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1441
								} else if (NetCache.field4288 == 0) { // L: 1444
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1445
										NetCache.field4288 = 1; // L: 1446
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1447
									} else {
										class178.NetCache_currentResponse = null; // L: 1451
									}
								}
							} else {
								var8 = class280.NetCache_responseArchiveBuffer.array.length - class178.NetCache_currentResponse.padding; // L: 1457
								var9 = 512 - NetCache.field4288; // L: 1458
								if (var9 > var8 - class280.NetCache_responseArchiveBuffer.offset) { // L: 1459
									var9 = var8 - class280.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1460
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class280.NetCache_responseArchiveBuffer.array, class280.NetCache_responseArchiveBuffer.offset, var9); // L: 1461
								if (NetCache.field4290 != 0) { // L: 1462
									for (var10 = 0; var10 < var9; ++var10) { // L: 1463
										var10000 = class280.NetCache_responseArchiveBuffer.array;
										var10001 = var10 + class280.NetCache_responseArchiveBuffer.offset;
										var10000[var10001] ^= NetCache.field4290;
									}
								}

								var24 = class280.NetCache_responseArchiveBuffer; // L: 1465
								var24.offset += var9;
								NetCache.field4288 += var9; // L: 1466
								if (var8 == class280.NetCache_responseArchiveBuffer.offset) { // L: 1467
									if (16711935L == class178.NetCache_currentResponse.key) { // L: 1468
										Huffman.field3767 = class280.NetCache_responseArchiveBuffer; // L: 1469

										for (var10 = 0; var10 < 256; ++var10) { // L: 1470
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1471
											if (var19 != null) { // L: 1472
												World.method1826(var19, var10); // L: 1473
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1478
										NetCache.NetCache_crc.update(class280.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1479
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1480
										if (var10 != class178.NetCache_currentResponse.crc) { // L: 1481
											try {
												NetCache.NetCache_socket.close(); // L: 1483
											} catch (Exception var22) { // L: 1485
											}

											++NetCache.NetCache_crcMismatches; // L: 1486
											NetCache.NetCache_socket = null; // L: 1487
											NetCache.field4290 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1488
											var1 = false; // L: 1489
											break label240;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1492
										NetCache.NetCache_ioExceptions = 0; // L: 1493
										class178.NetCache_currentResponse.archive.write((int)(class178.NetCache_currentResponse.key & 65535L), class280.NetCache_responseArchiveBuffer.array, 16711680L == (class178.NetCache_currentResponse.key & 16711680L), NetCache.field4293); // L: 1494
									}

									class178.NetCache_currentResponse.remove(); // L: 1496
									if (NetCache.field4293) { // L: 1497
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1498
									}

									NetCache.field4288 = 0; // L: 1499
									class178.NetCache_currentResponse = null; // L: 1500
									class280.NetCache_responseArchiveBuffer = null; // L: 1501
								} else {
									if (NetCache.field4288 != 512) { // L: 1503
										break;
									}

									NetCache.field4288 = 0;
								}
							}
						}

						var1 = true; // L: 1507
					}
				} catch (IOException var23) {
					try {
						NetCache.NetCache_socket.close(); // L: 1511
					} catch (Exception var21) { // L: 1513
					}

					++NetCache.NetCache_ioExceptions; // L: 1514
					NetCache.NetCache_socket = null; // L: 1515
					var1 = false; // L: 1516
				}
			}

			if (!var1) { // L: 1520
				this.doCycleJs5Connect();
			}

		}
	} // L: 1521

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1295377717"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1524
			this.error("js5crc"); // L: 1525
			class47.method867(1000); // L: 1526
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1529
				if (gameState <= 5) { // L: 1530
					this.error("js5io"); // L: 1531
					class47.method867(1000); // L: 1532
					return; // L: 1533
				}

				field571 = 3000; // L: 1536
				NetCache.NetCache_ioExceptions = 3; // L: 1537
			}

			if (--field571 + 1 <= 0) { // L: 1540
				try {
					if (js5ConnectState == 0) { // L: 1542
						class30.js5SocketTask = GameEngine.taskHandler.newSocketTask(WorldMapData_1.worldHost, class92.currentPort); // L: 1543
						++js5ConnectState; // L: 1544
					}

					if (js5ConnectState == 1) { // L: 1546
						if (class30.js5SocketTask.status == 2) { // L: 1547
							this.js5Error(-1); // L: 1548
							return; // L: 1549
						}

						if (class30.js5SocketTask.status == 1) { // L: 1551
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1553
						class280.js5Socket = class368.method6922((Socket)class30.js5SocketTask.result, 40000, 5000); // L: 1554
						Buffer var1 = new Buffer(5); // L: 1555
						var1.writeByte(15); // L: 1556
						var1.writeIntME(214); // L: 1557
						class280.js5Socket.write(var1.array, 0, 5); // L: 1558
						++js5ConnectState; // L: 1559
						ItemLayer.field2406 = Canvas.method310(); // L: 1560
					}

					if (js5ConnectState == 3) { // L: 1562
						if (class280.js5Socket.available() > 0) { // L: 1563
							int var5 = class280.js5Socket.readUnsignedByte(); // L: 1564
							if (var5 != 0) { // L: 1565
								this.js5Error(var5); // L: 1566
								return; // L: 1567
							}

							++js5ConnectState; // L: 1569
						} else if (Canvas.method310() - ItemLayer.field2406 > 30000L) { // L: 1572
							this.js5Error(-2); // L: 1573
							return; // L: 1574
						}
					}

					if (js5ConnectState == 4) { // L: 1578
						AbstractSocket var10 = class280.js5Socket; // L: 1579
						boolean var2 = gameState > 20; // L: 1580
						if (NetCache.NetCache_socket != null) { // L: 1582
							try {
								NetCache.NetCache_socket.close(); // L: 1584
							} catch (Exception var8) { // L: 1586
							}

							NetCache.NetCache_socket = null; // L: 1587
						}

						NetCache.NetCache_socket = var10; // L: 1589
						class299.method5759(var2); // L: 1590
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1591
						class178.NetCache_currentResponse = null; // L: 1592
						class280.NetCache_responseArchiveBuffer = null; // L: 1593
						NetCache.field4288 = 0; // L: 1594

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1596
							if (var3 == null) { // L: 1597
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1603
									if (var3 == null) { // L: 1604
										if (NetCache.field4290 != 0) { // L: 1610
											try {
												Buffer var11 = new Buffer(4); // L: 1612
												var11.writeByte(4); // L: 1613
												var11.writeByte(NetCache.field4290); // L: 1614
												var11.writeShort(0); // L: 1615
												NetCache.NetCache_socket.write(var11.array, 0, 4); // L: 1616
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close(); // L: 1620
												} catch (Exception var6) { // L: 1622
												}

												++NetCache.NetCache_ioExceptions; // L: 1623
												NetCache.NetCache_socket = null; // L: 1624
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1627
										NetCache.field4276 = Canvas.method310(); // L: 1628
										class30.js5SocketTask = null; // L: 1630
										class280.js5Socket = null; // L: 1631
										js5ConnectState = 0; // L: 1632
										js5Errors = 0; // L: 1633
										return; // L: 1639
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1605
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1606
									++NetCache.NetCache_pendingWritesCount; // L: 1607
									--NetCache.NetCache_pendingResponsesCount; // L: 1608
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1598
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1599
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1600
						}
					}
				} catch (IOException var9) { // L: 1636
					this.js5Error(-3); // L: 1637
				}

			}
		}
	} // L: 1527

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1089333548"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class30.js5SocketTask = null; // L: 1642
		class280.js5Socket = null; // L: 1643
		js5ConnectState = 0; // L: 1644
		if (WorldMapArea.worldPort == class92.currentPort) { // L: 1645
			class92.currentPort = ChatChannel.js5Port;
		} else {
			class92.currentPort = WorldMapArea.worldPort; // L: 1646
		}

		++js5Errors; // L: 1647
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1648
			if (gameState <= 5) { // L: 1649
				this.error("js5connect_full"); // L: 1650
				class47.method867(1000); // L: 1651
			} else {
				field571 = 3000; // L: 1653
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1655
			this.error("js5connect_outofdate"); // L: 1656
			class47.method867(1000); // L: 1657
		} else if (js5Errors >= 4) { // L: 1659
			if (gameState <= 5) { // L: 1660
				this.error("js5connect"); // L: 1661
				class47.method867(1000); // L: 1662
			} else {
				field571 = 3000; // L: 1664
			}
		}

	} // L: 1666

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket(); // L: 2111
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2112

		try {
			if (loginState == 0) { // L: 2114
				if (Skeleton.secureRandom == null && (secureRandomFuture.isDone() || field518 > 250)) { // L: 2115
					Skeleton.secureRandom = secureRandomFuture.get(); // L: 2116
					secureRandomFuture.shutdown(); // L: 2117
					secureRandomFuture = null; // L: 2118
				}

				if (Skeleton.secureRandom != null) { // L: 2120
					if (var1 != null) { // L: 2121
						var1.close(); // L: 2122
						var1 = null; // L: 2123
					}

					class139.socketTask = null; // L: 2125
					hadNetworkError = false; // L: 2126
					field518 = 0; // L: 2127
					if (field522.method9253()) { // L: 2128
						if (this.method1215()) { // L: 2129
							try {
								this.requestOtlToken(class4.field6); // L: 2131
								class484.method8782(21); // L: 2132
							} catch (Throwable var27) { // L: 2134
								LoginPacket.RunException_sendStackTrace((String)null, var27); // L: 2135
								RouteStrategy.getLoginError(65); // L: 2136
								return; // L: 2137
							}
						} else {
							if (!this.method1216()) { // L: 2140
								RouteStrategy.getLoginError(65); // L: 2152
								return; // L: 2153
							}

							try {
								this.method1220(HealthBarDefinition.field1970, class481.field4945); // L: 2142
								class484.method8782(20); // L: 2143
							} catch (Exception var26) { // L: 2145
								LoginPacket.RunException_sendStackTrace((String)null, var26); // L: 2146
								RouteStrategy.getLoginError(65); // L: 2147
								return; // L: 2148
							}
						}
					} else {
						class484.method8782(1); // L: 2157
					}
				}
			}

			class20 var30;
			if (loginState == 21) { // L: 2161
				if (this.field531 != null) { // L: 2162
					if (!this.field531.isDone()) { // L: 2163
						return; // L: 2164
					}

					if (this.field531.isCancelled()) { // L: 2166
						RouteStrategy.getLoginError(65); // L: 2167
						this.field531 = null; // L: 2168
						return; // L: 2169
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field531.get(); // L: 2172
						if (!var3.isSuccess()) { // L: 2173
							RouteStrategy.getLoginError(65); // L: 2174
							this.field531 = null; // L: 2175
							return; // L: 2176
						}

						class147.field1648 = var3.getAccessToken(); // L: 2178
						class4.field6 = var3.getRefreshToken(); // L: 2179
						this.field531 = null; // L: 2180
					} catch (Exception var25) { // L: 2182
						LoginPacket.RunException_sendStackTrace((String)null, var25); // L: 2183
						RouteStrategy.getLoginError(65); // L: 2184
						this.field531 = null; // L: 2185
						return; // L: 2186
					}
				} else {
					if (this.field529 == null) { // L: 2189
						RouteStrategy.getLoginError(65); // L: 2219
						return; // L: 2220
					}

					if (!this.field529.method253()) { // L: 2190
						return; // L: 2191
					}

					if (this.field529.method255()) { // L: 2193
						LoginPacket.RunException_sendStackTrace(this.field529.method263(), (Throwable)null); // L: 2194
						RouteStrategy.getLoginError(65); // L: 2195
						this.field529 = null; // L: 2196
						return; // L: 2197
					}

					var30 = this.field529.method256(); // L: 2199
					if (var30.method275() != 200) { // L: 2200
						RouteStrategy.getLoginError(65); // L: 2201
						this.field529 = null; // L: 2202
						return; // L: 2203
					}

					field518 = 0; // L: 2205
					class450 var4 = new class450(var30.method273()); // L: 2206

					try {
						class147.field1648 = var4.method8304().getString("access_token"); // L: 2208
						class4.field6 = var4.method8304().getString("refresh_token"); // L: 2209
					} catch (Exception var24) { // L: 2211
						LoginPacket.RunException_sendStackTrace("Error parsing tokens", var24); // L: 2212
						RouteStrategy.getLoginError(65); // L: 2213
						this.field529 = null; // L: 2214
						return; // L: 2215
					}
				}

				this.method1398(class147.field1648); // L: 2222
				class484.method8782(20); // L: 2223
			}

			if (loginState == 20) { // L: 2225
				if (this.field527 != null) { // L: 2226
					if (!this.field527.isDone()) { // L: 2227
						return; // L: 2228
					}

					if (this.field527.isCancelled()) { // L: 2230
						RouteStrategy.getLoginError(65); // L: 2231
						this.field527 = null; // L: 2232
						return; // L: 2233
					}

					try {
						OtlTokenResponse var31 = (OtlTokenResponse)this.field527.get(); // L: 2236
						if (!var31.isSuccess()) { // L: 2237
							RouteStrategy.getLoginError(65); // L: 2238
							this.field527 = null; // L: 2239
							return; // L: 2240
						}

						this.field509 = var31.getToken(); // L: 2242
						this.field527 = null; // L: 2243
					} catch (Exception var23) { // L: 2245
						LoginPacket.RunException_sendStackTrace((String)null, var23); // L: 2246
						RouteStrategy.getLoginError(65); // L: 2247
						this.field527 = null; // L: 2248
						return; // L: 2249
					}
				} else {
					if (this.field756 == null) { // L: 2252
						RouteStrategy.getLoginError(65); // L: 2288
						return; // L: 2289
					}

					if (!this.field756.method253()) { // L: 2253
						return; // L: 2254
					}

					if (this.field756.method255()) { // L: 2256
						LoginPacket.RunException_sendStackTrace(this.field756.method263(), (Throwable)null); // L: 2257
						RouteStrategy.getLoginError(65); // L: 2258
						this.field756 = null; // L: 2259
						return; // L: 2260
					}

					var30 = this.field756.method256(); // L: 2262
					if (var30.method275() != 200) { // L: 2263
						LoginPacket.RunException_sendStackTrace("Response code: " + var30.method275() + "Response body: " + var30.method273(), (Throwable)null); // L: 2264
						RouteStrategy.getLoginError(65); // L: 2265
						this.field756 = null; // L: 2266
						return; // L: 2267
					}

					List var32 = (List)var30.method276().get("Content-Type"); // L: 2269
					if (var32 != null && var32.contains(class448.field4727.method8291())) { // L: 2270
						try {
							JSONObject var5 = new JSONObject(var30.method273()); // L: 2272
							this.field509 = var5.getString("token"); // L: 2273
						} catch (JSONException var22) { // L: 2275
							LoginPacket.RunException_sendStackTrace((String)null, var22); // L: 2276
							RouteStrategy.getLoginError(65); // L: 2277
							this.field756 = null; // L: 2278
							return; // L: 2279
						}
					} else {
						this.field509 = var30.method273(); // L: 2283
					}

					this.field756 = null; // L: 2285
				}

				field518 = 0; // L: 2291
				class484.method8782(1); // L: 2292
			}

			if (loginState == 1) { // L: 2294
				if (class139.socketTask == null) { // L: 2295
					class139.socketTask = GameEngine.taskHandler.newSocketTask(WorldMapData_1.worldHost, class92.currentPort); // L: 2296
				}

				if (class139.socketTask.status == 2) { // L: 2298
					throw new IOException();
				}

				if (class139.socketTask.status == 1) { // L: 2299
					var1 = class368.method6922((Socket)class139.socketTask.result, 40000, 5000); // L: 2300
					packetWriter.setSocket(var1); // L: 2301
					class139.socketTask = null; // L: 2302
					class484.method8782(2); // L: 2303
				}
			}

			PacketBufferNode var34;
			if (loginState == 2) { // L: 2306
				packetWriter.clearBuffer(); // L: 2307
				var34 = class137.method3066(); // L: 2310
				var34.clientPacket = null; // L: 2311
				var34.clientPacketLength = 0; // L: 2312
				var34.packetBuffer = new PacketBuffer(5000); // L: 2313
				var34.packetBuffer.writeByte(LoginPacket.field3345.id); // L: 2317
				packetWriter.addNode(var34); // L: 2318
				packetWriter.flush(); // L: 2319
				var2.offset = 0; // L: 2320
				class484.method8782(3); // L: 2321
			}

			int var15;
			if (loginState == 3) { // L: 2323
				if (class139.pcmPlayer0 != null) { // L: 2324
					class139.pcmPlayer0.method796();
				}

				if (Language.pcmPlayer1 != null) { // L: 2325
					Language.pcmPlayer1.method796();
				}

				if (var1.isAvailable(1)) { // L: 2326
					var15 = var1.readUnsignedByte(); // L: 2327
					if (class139.pcmPlayer0 != null) { // L: 2328
						class139.pcmPlayer0.method796();
					}

					if (Language.pcmPlayer1 != null) { // L: 2329
						Language.pcmPlayer1.method796();
					}

					if (var15 != 0) { // L: 2330
						RouteStrategy.getLoginError(var15); // L: 2331
						return; // L: 2332
					}

					var2.offset = 0; // L: 2334
					class484.method8782(4); // L: 2335
				}
			}

			if (loginState == 4) { // L: 2338
				if (var2.offset < 8) { // L: 2339
					var15 = var1.available(); // L: 2340
					if (var15 > 8 - var2.offset) { // L: 2341
						var15 = 8 - var2.offset;
					}

					if (var15 > 0) { // L: 2342
						var1.read(var2.array, var2.offset, var15); // L: 2343
						var2.offset += var15; // L: 2344
					}
				}

				if (var2.offset == 8) { // L: 2347
					var2.offset = 0; // L: 2348
					PcmPlayer.field274 = var2.readLong(); // L: 2349
					class484.method8782(5); // L: 2350
				}
			}

			if (loginState == 5) { // L: 2353
				packetWriter.packetBuffer.offset = 0; // L: 2354
				packetWriter.clearBuffer(); // L: 2355
				PacketBuffer var33 = new PacketBuffer(500); // L: 2356
				int[] var36 = new int[]{Skeleton.secureRandom.nextInt(), Skeleton.secureRandom.nextInt(), Skeleton.secureRandom.nextInt(), Skeleton.secureRandom.nextInt()}; // L: 2357 2358 2359 2360 2361
				var33.offset = 0; // L: 2362
				var33.writeByte(1); // L: 2363
				var33.writeIntME(var36[0]); // L: 2364
				var33.writeIntME(var36[1]); // L: 2365
				var33.writeIntME(var36[2]); // L: 2366
				var33.writeIntME(var36[3]); // L: 2367
				var33.writeLong(PcmPlayer.field274); // L: 2368
				if (gameState == 40) { // L: 2369
					var33.writeIntME(class230.field2614[0]); // L: 2370
					var33.writeIntME(class230.field2614[1]); // L: 2371
					var33.writeIntME(class230.field2614[2]); // L: 2372
					var33.writeIntME(class230.field2614[3]); // L: 2373
				} else {
					if (gameState == 50) { // L: 2376
						var33.writeByte(class139.field1607.rsOrdinal()); // L: 2377
						var33.writeIntME(ClientPreferences.field1262); // L: 2378
					} else {
						var33.writeByte(field521.rsOrdinal()); // L: 2381
						switch(field521.field1604) { // L: 2382
						case 0:
						case 4:
							var33.writeMedium(AbstractWorldMapData.field2999); // L: 2386
							++var33.offset; // L: 2387
							break; // L: 2388
						case 1:
							var33.offset += 4; // L: 2392
							break; // L: 2393
						case 2:
							var33.writeIntME(WorldMapManager.clientPreferences.method2453(Login.Login_username)); // L: 2397
						case 3:
						}
					}

					if (field522.method9253()) { // L: 2402
						var33.writeByte(class505.field5074.rsOrdinal()); // L: 2403
						var33.writeStringCp1252NullTerminated(this.field509); // L: 2404
					} else {
						var33.writeByte(class505.field5070.rsOrdinal()); // L: 2407
						var33.writeStringCp1252NullTerminated(Login.Login_password); // L: 2408
					}
				}

				var33.encryptRsa(class74.field879, class74.field877); // L: 2411
				class230.field2614 = var36; // L: 2412
				PacketBufferNode var6 = class137.method3066(); // L: 2415
				var6.clientPacket = null; // L: 2416
				var6.clientPacketLength = 0; // L: 2417
				var6.packetBuffer = new PacketBuffer(5000); // L: 2418
				var6.packetBuffer.offset = 0; // L: 2422
				if (gameState == 40) { // L: 2423
					var6.packetBuffer.writeByte(LoginPacket.field3347.id); // L: 2424
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3346.id); // L: 2427
				}

				var6.packetBuffer.writeShort(0); // L: 2429
				int var7 = var6.packetBuffer.offset; // L: 2430
				var6.packetBuffer.writeIntME(214); // L: 2431
				var6.packetBuffer.writeIntME(1); // L: 2432
				var6.packetBuffer.writeByte(clientType); // L: 2433
				var6.packetBuffer.writeByte(field487); // L: 2434
				byte var8 = 0; // L: 2435
				var6.packetBuffer.writeByte(var8); // L: 2436
				var6.packetBuffer.writeBytes(var33.array, 0, var33.offset); // L: 2437
				int var9 = var6.packetBuffer.offset; // L: 2438
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2439
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2440
				var6.packetBuffer.writeShort(class10.canvasWidth); // L: 2441
				var6.packetBuffer.writeShort(class11.canvasHeight); // L: 2442
				PacketBuffer var10 = var6.packetBuffer; // L: 2443
				int var13;
				if (randomDatData != null) { // L: 2445
					var10.writeBytes(randomDatData, 0, randomDatData.length); // L: 2446
				} else {
					byte[] var12 = new byte[24]; // L: 2451

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 2453
						JagexCache.JagexCache_randomDat.readFully(var12); // L: 2454

						for (var13 = 0; var13 < 24 && var12[var13] == 0; ++var13) { // L: 2455 2456 2457
						}

						if (var13 >= 24) {
							throw new IOException(); // L: 2459
						}
					} catch (Exception var28) {
						for (int var14 = 0; var14 < 24; ++var14) { // L: 2462
							var12[var14] = -1;
						}
					}

					var10.writeBytes(var12, 0, var12.length); // L: 2467
				}

				var6.packetBuffer.writeStringCp1252NullTerminated(class406.field4553); // L: 2469
				var6.packetBuffer.writeIntME(ClanChannelMember.field1637); // L: 2470
				if (field657 > 213) { // L: 2471
					var6.packetBuffer.writeByte(0); // L: 2472
				}

				Buffer var11 = new Buffer(KitDefinition.platformInfo.size()); // L: 2474
				KitDefinition.platformInfo.write(var11); // L: 2475
				var6.packetBuffer.writeBytes(var11.array, 0, var11.array.length); // L: 2476
				var6.packetBuffer.writeByte(clientType); // L: 2477
				var6.packetBuffer.writeIntME(0); // L: 2478
				var6.packetBuffer.writeIntME(class177.archive17.hash); // L: 2479
				var6.packetBuffer.method9016(GameBuild.archive8.hash); // L: 2480
				var6.packetBuffer.method9133(0); // L: 2481
				var6.packetBuffer.writeIntME(class10.field45.hash); // L: 2482
				var6.packetBuffer.method9088(GroundObject.archive20.hash); // L: 2483
				var6.packetBuffer.writeIntME(class336.archive15.hash); // L: 2484
				var6.packetBuffer.writeIntME(WorldMapDecoration.archive10.hash); // L: 2485
				var6.packetBuffer.method9016(PlatformInfo.archive7.hash); // L: 2486
				var6.packetBuffer.method9133(class138.field1593.hash); // L: 2487
				var6.packetBuffer.method9016(Varps.archive18.hash); // L: 2488
				var6.packetBuffer.writeIntME(class53.archive2.hash); // L: 2489
				var6.packetBuffer.writeIntME(PcmPlayer.archive5.hash); // L: 2490
				var6.packetBuffer.method9088(class127.archive13.hash); // L: 2491
				var6.packetBuffer.method9016(ClientPacket.field3202.hash); // L: 2492
				var6.packetBuffer.writeIntME(class33.archive6.hash); // L: 2493
				var6.packetBuffer.method9016(FriendsList.archive12.hash); // L: 2494
				var6.packetBuffer.method9088(class89.archive11.hash); // L: 2495
				var6.packetBuffer.writeIntME(archive14.hash); // L: 2496
				var6.packetBuffer.method9016(UserComparator8.archive19.hash); // L: 2497
				var6.packetBuffer.method9133(PacketWriter.archive4.hash); // L: 2498
				var6.packetBuffer.method9016(ModelData0.archive9.hash); // L: 2499
				var6.packetBuffer.xteaEncrypt(var36, var9, var6.packetBuffer.offset); // L: 2500
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7); // L: 2501
				packetWriter.addNode(var6); // L: 2502
				packetWriter.flush(); // L: 2503
				packetWriter.isaacCipher = new IsaacCipher(var36); // L: 2504
				int[] var42 = new int[4]; // L: 2505

				for (var13 = 0; var13 < 4; ++var13) { // L: 2506
					var42[var13] = var36[var13] + 50;
				}

				var2.newIsaacCipher(var42); // L: 2507
				class484.method8782(6); // L: 2508
			}

			int var17;
			if (loginState == 6 && var1.available() > 0) { // L: 2510 2511
				var15 = var1.readUnsignedByte(); // L: 2512
				if (var15 == 61) { // L: 2513
					var17 = var1.available(); // L: 2514
					class306.field3401 = var17 == 1 && var1.readUnsignedByte() == 1; // L: 2515
					class484.method8782(5); // L: 2516
				}

				if (var15 == 21 && gameState == 20) { // L: 2518
					class484.method8782(12); // L: 2519
				} else if (var15 == 2) { // L: 2521
					class484.method8782(14); // L: 2522
				} else if (var15 == 15 && gameState == 40) { // L: 2524
					packetWriter.serverPacketLength = -1; // L: 2525
					class484.method8782(19); // L: 2526
				} else if (var15 == 64) { // L: 2528
					class484.method8782(10); // L: 2529
				} else if (var15 == 23 && field647 < 1) { // L: 2531
					++field647; // L: 2532
					class484.method8782(0); // L: 2533
				} else if (var15 == 29) { // L: 2535
					class484.method8782(17); // L: 2536
				} else {
					if (var15 != 69) { // L: 2538
						RouteStrategy.getLoginError(var15); // L: 2542
						return; // L: 2543
					}

					class484.method8782(7); // L: 2539
				}
			}

			if (loginState == 7 && var1.available() >= 2) { // L: 2547 2548
				var1.read(var2.array, 0, 2); // L: 2549
				var2.offset = 0; // L: 2550
				class137.field1585 = var2.readUnsignedShort(); // L: 2551
				class484.method8782(8); // L: 2552
			}

			if (loginState == 8 && var1.available() >= class137.field1585) { // L: 2555 2556
				var2.offset = 0; // L: 2557
				var1.read(var2.array, var2.offset, class137.field1585); // L: 2558
				class6 var35 = WorldMapDecoration.method5486()[var2.readUnsignedByte()]; // L: 2559

				try {
					class3 var38 = class143.method3109(var35); // L: 2561
					this.field536 = new class7(var2, var38); // L: 2562
					class484.method8782(9); // L: 2563
				} catch (Exception var21) { // L: 2565
					RouteStrategy.getLoginError(22); // L: 2566
					return; // L: 2567
				}
			}

			if (loginState == 9 && this.field536.method49()) { // L: 2571 2572
				this.field724 = this.field536.method51(); // L: 2573
				this.field536.method50(); // L: 2574
				this.field536 = null; // L: 2575
				if (this.field724 == null) { // L: 2576
					RouteStrategy.getLoginError(22); // L: 2577
					return; // L: 2578
				}

				packetWriter.clearBuffer(); // L: 2580
				var34 = class137.method3066(); // L: 2583
				var34.clientPacket = null; // L: 2584
				var34.clientPacketLength = 0; // L: 2585
				var34.packetBuffer = new PacketBuffer(5000); // L: 2586
				var34.packetBuffer.writeByte(LoginPacket.field3343.id); // L: 2590
				var34.packetBuffer.writeShort(this.field724.offset); // L: 2591
				var34.packetBuffer.method8959(this.field724); // L: 2592
				packetWriter.addNode(var34); // L: 2593
				packetWriter.flush(); // L: 2594
				this.field724 = null; // L: 2595
				class484.method8782(6); // L: 2596
			}

			if (loginState == 10 && var1.available() > 0) { // L: 2599 2600
				SecureRandomCallable.field1012 = var1.readUnsignedByte(); // L: 2601
				class484.method8782(11); // L: 2602
			}

			if (loginState == 11 && var1.available() >= SecureRandomCallable.field1012) { // L: 2605 2606
				var1.read(var2.array, 0, SecureRandomCallable.field1012); // L: 2607
				var2.offset = 0; // L: 2608
				class484.method8782(6); // L: 2609
			}

			if (loginState == 12 && var1.available() > 0) { // L: 2612 2613
				field520 = (var1.readUnsignedByte() + 3) * 60; // L: 2614
				class484.method8782(13); // L: 2615
			}

			if (loginState == 13) { // L: 2618
				field518 = 0; // L: 2619
				UrlRequest.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field520 / 60 + " seconds."); // L: 2620
				if (--field520 <= 0) { // L: 2621
					class484.method8782(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) { // L: 2624 2625
					class150.field1680 = var1.readUnsignedByte(); // L: 2626
					class484.method8782(15); // L: 2627
				}

				if (loginState == 15 && var1.available() >= class150.field1680) { // L: 2630 2631
					boolean var43 = var1.readUnsignedByte() == 1; // L: 2632
					var1.read(var2.array, 0, 4); // L: 2633
					var2.offset = 0; // L: 2634
					boolean var44 = false; // L: 2635
					if (var43) { // L: 2636
						var17 = var2.readByteIsaac() << 24; // L: 2637
						var17 |= var2.readByteIsaac() << 16; // L: 2638
						var17 |= var2.readByteIsaac() << 8; // L: 2639
						var17 |= var2.readByteIsaac(); // L: 2640
						WorldMapManager.clientPreferences.method2451(Login.Login_username, var17); // L: 2641
					}

					if (Login_isUsernameRemembered) { // L: 2643
						WorldMapManager.clientPreferences.method2445(Login.Login_username); // L: 2644
					} else {
						WorldMapManager.clientPreferences.method2445((String)null); // L: 2647
					}

					class302.savePreferences(); // L: 2649
					staffModLevel = var1.readUnsignedByte(); // L: 2650
					playerMod = var1.readUnsignedByte() == 1; // L: 2651
					localPlayerIndex = var1.readUnsignedByte(); // L: 2652
					localPlayerIndex <<= 8; // L: 2653
					localPlayerIndex += var1.readUnsignedByte(); // L: 2654
					field607 = var1.readUnsignedByte(); // L: 2655
					var1.read(var2.array, 0, 8); // L: 2656
					var2.offset = 0; // L: 2657
					this.accountHash = var2.readLong(); // L: 2658
					var1.read(var2.array, 0, 8); // L: 2659
					var2.offset = 0; // L: 2660
					field608 = var2.readLong(); // L: 2661
					if (field657 >= 214) { // L: 2662
						var1.read(var2.array, 0, 8); // L: 2663
						var2.offset = 0; // L: 2664
						var2.readLong(); // L: 2665
					}

					var1.read(var2.array, 0, 1); // L: 2667
					var2.offset = 0; // L: 2668
					ServerPacket[] var39 = MouseRecorder.method2254(); // L: 2669
					int var18 = var2.readSmartByteShortIsaac(); // L: 2670
					if (var18 < 0 || var18 >= var39.length) { // L: 2671
						throw new IOException(var18 + " " + var2.offset);
					}

					packetWriter.serverPacket = var39[var18]; // L: 2672
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2673
					var1.read(var2.array, 0, 2); // L: 2674
					var2.offset = 0; // L: 2675
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2676

					try {
						Client var19 = class439.client; // L: 2678
						JSObject.getWindow(var19).call("zap", (Object[])null); // L: 2681
					} catch (Throwable var20) { // L: 2684
					}

					class484.method8782(16); // L: 2685
				}

				if (loginState == 16) { // L: 2688
					if (var1.available() >= packetWriter.serverPacketLength) { // L: 2689
						var2.offset = 0; // L: 2690
						var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2691
						timer.method7588(); // L: 2692
						ByteArrayPool.method7583(); // L: 2693
						class101.updatePlayer(var2); // L: 2694
						VertexNormal.field2776 = -1; // L: 2695
						PcmPlayer.loadRegions(false, var2); // L: 2696
						packetWriter.serverPacket = null; // L: 2697
					}

				} else {
					if (loginState == 17 && var1.available() >= 2) { // L: 2701 2702
						var2.offset = 0; // L: 2703
						var1.read(var2.array, 0, 2); // L: 2704
						var2.offset = 0; // L: 2705
						WorldMapID.field3031 = var2.readUnsignedShort(); // L: 2706
						class484.method8782(18); // L: 2707
					}

					if (loginState == 18 && var1.available() >= WorldMapID.field3031) { // L: 2710 2711
						var2.offset = 0; // L: 2712
						var1.read(var2.array, 0, WorldMapID.field3031); // L: 2713
						var2.offset = 0; // L: 2714
						String var37 = var2.readStringCp1252NullTerminated(); // L: 2715
						String var41 = var2.readStringCp1252NullTerminated(); // L: 2716
						String var40 = var2.readStringCp1252NullTerminated(); // L: 2717
						UrlRequest.setLoginResponseString(var37, var41, var40); // L: 2718
						class47.method867(10); // L: 2719
						if (field522.method9253()) { // L: 2720
							class14.method171(9); // L: 2721
						}
					}

					if (loginState == 19) { // L: 2725
						if (packetWriter.serverPacketLength == -1) { // L: 2726
							if (var1.available() < 2) { // L: 2727
								return;
							}

							var1.read(var2.array, 0, 2); // L: 2728
							var2.offset = 0; // L: 2729
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2730
						}

						if (var1.available() >= packetWriter.serverPacketLength) { // L: 2732
							var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2733
							var2.offset = 0; // L: 2734
							var15 = packetWriter.serverPacketLength; // L: 2735
							timer.method7590(); // L: 2736
							class27.method411(); // L: 2737
							class101.updatePlayer(var2); // L: 2738
							if (var15 != var2.offset) { // L: 2739
								throw new RuntimeException(); // L: 2740
							}
						}
					} else {
						++field518; // L: 2744
						if (field518 > 2000) { // L: 2745
							if (field647 < 1) { // L: 2746
								if (WorldMapArea.worldPort == class92.currentPort) { // L: 2747
									class92.currentPort = ChatChannel.js5Port;
								} else {
									class92.currentPort = WorldMapArea.worldPort; // L: 2748
								}

								++field647; // L: 2749
								class484.method8782(0); // L: 2750
							} else {
								RouteStrategy.getLoginError(-3); // L: 2753
							}
						}
					}
				}
			}
		} catch (IOException var29) { // L: 2757
			if (field647 < 1) { // L: 2758
				if (WorldMapArea.worldPort == class92.currentPort) { // L: 2759
					class92.currentPort = ChatChannel.js5Port;
				} else {
					class92.currentPort = WorldMapArea.worldPort; // L: 2760
				}

				++field647; // L: 2761
				class484.method8782(0); // L: 2762
			} else {
				RouteStrategy.getLoginError(-2); // L: 2765
			}
		}
	} // L: 2622 2699 2742 2751 2754 2763 2766 2768

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1804741112"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3149
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3150
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3151
			hadNetworkError = false; // L: 3152
			class492.method8853(); // L: 3153
		} else {
			if (!isMenuOpen) { // L: 3156
				ViewportMouse.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1236(packetWriter); ++var1) { // L: 3157 3158
			}

			if (gameState == 30) { // L: 3160
				int var2;
				PacketBufferNode var14;
				while (NPC.method2611()) { // L: 3161
					var14 = class251.getPacketBufferNode(ClientPacket.field3173, packetWriter.isaacCipher); // L: 3162
					var14.packetBuffer.writeByte(0); // L: 3163
					var2 = var14.packetBuffer.offset; // L: 3164
					Tiles.performReflectionCheck(var14.packetBuffer); // L: 3165
					var14.packetBuffer.method9158(var14.packetBuffer.offset - var2); // L: 3166
					packetWriter.addNode(var14); // L: 3167
				}

				if (timer.field4514) { // L: 3169
					var14 = class251.getPacketBufferNode(ClientPacket.field3152, packetWriter.isaacCipher); // L: 3171
					var14.packetBuffer.writeByte(0); // L: 3172
					var2 = var14.packetBuffer.offset; // L: 3173
					timer.write(var14.packetBuffer); // L: 3174
					var14.packetBuffer.method9158(var14.packetBuffer.offset - var2); // L: 3175
					packetWriter.addNode(var14); // L: 3176
					timer.method7589(); // L: 3177
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				PacketBuffer var10000;
				synchronized(AttackOption.mouseRecorder.lock) { // L: 3180
					if (!field766) { // L: 3181
						AttackOption.mouseRecorder.index = 0; // L: 3267
					} else if (MouseHandler.MouseHandler_lastButton != 0 || AttackOption.mouseRecorder.index >= 40) { // L: 3182
						PacketBufferNode var15 = null; // L: 3184
						var3 = 0; // L: 3185
						var4 = 0; // L: 3186
						var5 = 0; // L: 3187
						var6 = 0; // L: 3188

						for (var7 = 0; var7 < AttackOption.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3189 3190
							var4 = var7; // L: 3191
							var8 = AttackOption.mouseRecorder.ys[var7]; // L: 3192
							if (var8 < -1) { // L: 3193
								var8 = -1;
							} else if (var8 > 65534) { // L: 3194
								var8 = 65534;
							}

							var9 = AttackOption.mouseRecorder.xs[var7]; // L: 3195
							if (var9 < -1) { // L: 3196
								var9 = -1;
							} else if (var9 > 65534) { // L: 3197
								var9 = 65534;
							}

							if (var9 != field496 || var8 != field497) { // L: 3198
								if (var15 == null) { // L: 3201
									var15 = class251.getPacketBufferNode(ClientPacket.field3170, packetWriter.isaacCipher); // L: 3202
									var15.packetBuffer.writeByte(0); // L: 3203
									var3 = var15.packetBuffer.offset; // L: 3204
									var10000 = var15.packetBuffer; // L: 3205
									var10000.offset += 2;
									var5 = 0; // L: 3206
									var6 = 0; // L: 3207
								}

								int var12;
								if (field498 != -1L) { // L: 3212
									var10 = var9 - field496; // L: 3213
									var11 = var8 - field497; // L: 3214
									var12 = (int)((AttackOption.mouseRecorder.millis[var7] - field498) / 20L); // L: 3215
									var5 = (int)((long)var5 + (AttackOption.mouseRecorder.millis[var7] - field498) % 20L); // L: 3216
								} else {
									var10 = var9; // L: 3219
									var11 = var8; // L: 3220
									var12 = Integer.MAX_VALUE; // L: 3221
								}

								field496 = var9; // L: 3223
								field497 = var8; // L: 3224
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3225
									var10 += 32; // L: 3226
									var11 += 32; // L: 3227
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3228
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3230
									var10 += 128; // L: 3231
									var11 += 128; // L: 3232
									var15.packetBuffer.writeByte(var12 + 128); // L: 3233
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3234
								} else if (var12 < 32) { // L: 3236
									var15.packetBuffer.writeByte(var12 + 192); // L: 3237
									if (var9 != -1 && var8 != -1) { // L: 3238
										var15.packetBuffer.writeIntME(var9 | var8 << 16); // L: 3239
									} else {
										var15.packetBuffer.writeIntME(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3242
									if (var9 != -1 && var8 != -1) { // L: 3243
										var15.packetBuffer.writeIntME(var9 | var8 << 16); // L: 3244
									} else {
										var15.packetBuffer.writeIntME(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3246
								field498 = AttackOption.mouseRecorder.millis[var7]; // L: 3247
							}
						}

						if (var15 != null) { // L: 3249
							var15.packetBuffer.method9158(var15.packetBuffer.offset - var3); // L: 3250
							var7 = var15.packetBuffer.offset; // L: 3251
							var15.packetBuffer.offset = var3; // L: 3252
							var15.packetBuffer.writeByte(var5 / var6); // L: 3253
							var15.packetBuffer.writeByte(var5 % var6); // L: 3254
							var15.packetBuffer.offset = var7; // L: 3255
							packetWriter.addNode(var15); // L: 3256
						}

						if (var4 >= AttackOption.mouseRecorder.index) { // L: 3258
							AttackOption.mouseRecorder.index = 0;
						} else {
							MouseRecorder var42 = AttackOption.mouseRecorder; // L: 3260
							var42.index -= var4;
							System.arraycopy(AttackOption.mouseRecorder.xs, var4, AttackOption.mouseRecorder.xs, 0, AttackOption.mouseRecorder.index); // L: 3261
							System.arraycopy(AttackOption.mouseRecorder.ys, var4, AttackOption.mouseRecorder.ys, 0, AttackOption.mouseRecorder.index); // L: 3262
							System.arraycopy(AttackOption.mouseRecorder.millis, var4, AttackOption.mouseRecorder.millis, 0, AttackOption.mouseRecorder.index); // L: 3263
						}
					}
				}

				if (MouseHandler.MouseHandler_lastButton == 1 || !mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3269
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 3270
					if (var16 > 32767L) { // L: 3271
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 3272
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3273
					if (var3 < 0) { // L: 3274
						var3 = 0;
					} else if (var3 > class11.canvasHeight) { // L: 3275
						var3 = class11.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3276
					if (var4 < 0) { // L: 3277
						var4 = 0;
					} else if (var4 > class10.canvasWidth) { // L: 3278
						var4 = class10.canvasWidth;
					}

					var5 = (int)var16; // L: 3279
					PacketBufferNode var18 = class251.getPacketBufferNode(ClientPacket.field3123, packetWriter.isaacCipher); // L: 3280
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3281
					var18.packetBuffer.writeShort(var4); // L: 3282
					var18.packetBuffer.writeShort(var3); // L: 3283
					packetWriter.addNode(var18); // L: 3284
				}

				if (field759.field2333 > 0) { // L: 3286
					var14 = class251.getPacketBufferNode(ClientPacket.field3181, packetWriter.isaacCipher); // L: 3287
					var14.packetBuffer.writeShort(0); // L: 3288
					var2 = var14.packetBuffer.offset; // L: 3289
					long var19 = Canvas.method310(); // L: 3290

					for (var5 = 0; var5 < field759.field2333; ++var5) { // L: 3291
						long var21 = var19 - field721; // L: 3292
						if (var21 > 16777215L) { // L: 3293
							var21 = 16777215L;
						}

						field721 = var19; // L: 3294
						var14.packetBuffer.method8994(field759.field2323[var5]); // L: 3295
						var14.packetBuffer.method9010((int)var21); // L: 3296
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3298
					packetWriter.addNode(var14); // L: 3299
				}

				if (field580 > 0) { // L: 3301
					--field580;
				}

				if (field759.method4087(96) || field759.method4087(97) || field759.method4087(98) || field759.method4087(99)) { // L: 3302
					field581 = true; // L: 3303
				}

				if (field581 && field580 <= 0) { // L: 3305
					field580 = 20; // L: 3306
					field581 = false; // L: 3307
					var14 = class251.getPacketBufferNode(ClientPacket.field3118, packetWriter.isaacCipher); // L: 3309
					var14.packetBuffer.method9004(camAngleX); // L: 3310
					var14.packetBuffer.method9139(camAngleY); // L: 3311
					packetWriter.addNode(var14); // L: 3312
				}

				if (class148.hasFocus && !hadFocus) { // L: 3314
					hadFocus = true; // L: 3315
					var14 = class251.getPacketBufferNode(ClientPacket.field3116, packetWriter.isaacCipher); // L: 3317
					var14.packetBuffer.writeByte(1); // L: 3318
					packetWriter.addNode(var14); // L: 3319
				}

				if (!class148.hasFocus && hadFocus) { // L: 3321
					hadFocus = false; // L: 3322
					var14 = class251.getPacketBufferNode(ClientPacket.field3116, packetWriter.isaacCipher); // L: 3324
					var14.packetBuffer.writeByte(0); // L: 3325
					packetWriter.addNode(var14); // L: 3326
				}

				if (ScriptEvent.worldMap != null) { // L: 3329
					ScriptEvent.worldMap.method8462();
				}

				class47.method869(); // L: 3330
				AttackOption.method2639(); // L: 3331
				if (field609 != NetFileRequest.Client_plane) { // L: 3333
					field609 = NetFileRequest.Client_plane; // L: 3334
					Varcs.method2719(NetFileRequest.Client_plane); // L: 3335
				}

				if (gameState == 30) { // L: 3338
					class90.method2272(); // L: 3339

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3341
						var10002 = queuedSoundEffectDelays[var1]--; // L: 3342
						if (queuedSoundEffectDelays[var1] >= -10) { // L: 3343
							SoundEffect var33 = soundEffects[var1]; // L: 3355
							if (var33 == null) { // L: 3356
								var10000 = null; // L: 3357
								var33 = SoundEffect.readSoundEffect(PacketWriter.archive4, soundEffectIds[var1], 0);
								if (var33 == null) { // L: 3358
									continue;
								}

								int[] var43 = queuedSoundEffectDelays; // L: 3359
								var43[var1] += var33.calculateDelay();
								soundEffects[var1] = var33; // L: 3360
							}

							if (queuedSoundEffectDelays[var1] < 0) { // L: 3366
								if (soundLocations[var1] != 0) { // L: 3368
									var4 = (soundLocations[var1] & 255) * 128; // L: 3369
									var5 = soundLocations[var1] >> 16 & 255; // L: 3370
									var6 = var5 * 128 + 64 - HitSplatDefinition.localPlayer.x; // L: 3371
									if (var6 < 0) { // L: 3372
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255; // L: 3373
									var8 = var7 * 128 + 64 - HitSplatDefinition.localPlayer.y; // L: 3374
									if (var8 < 0) { // L: 3375
										var8 = -var8;
									}

									var9 = var6 + var8 - 128; // L: 3376
									if (var9 > var4) { // L: 3377
										queuedSoundEffectDelays[var1] = -100; // L: 3378
										continue; // L: 3379
									}

									if (var9 < 0) { // L: 3381
										var9 = 0;
									}

									var3 = (var4 - var9) * WorldMapManager.clientPreferences.method2444() / var4; // L: 3382
								} else {
									var3 = WorldMapManager.clientPreferences.method2442(); // L: 3384
								}

								if (var3 > 0) { // L: 3385
									RawSound var23 = var33.toRawSound().resample(class19.decimator); // L: 3386
									RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3); // L: 3387
									var24.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3388
									ClanChannelMember.pcmStreamMixer.addSubStream(var24); // L: 3389
								}

								queuedSoundEffectDelays[var1] = -100; // L: 3391
							}
						} else {
							--soundEffectCount; // L: 3344

							for (var2 = var1; var2 < soundEffectCount; ++var2) { // L: 3345
								soundEffectIds[var2] = soundEffectIds[var2 + 1]; // L: 3346
								soundEffects[var2] = soundEffects[var2 + 1]; // L: 3347
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1]; // L: 3348
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1]; // L: 3349
								soundLocations[var2] = soundLocations[var2 + 1]; // L: 3350
							}

							--var1; // L: 3352
						}
					}

					if (playingJingle && !class107.method2681()) { // L: 3394
						if (WorldMapManager.clientPreferences.method2440() != 0 && currentTrackGroupId != -1) { // L: 3395
							Archive var30 = class33.archive6; // L: 3396
							var2 = currentTrackGroupId; // L: 3397
							var3 = WorldMapManager.clientPreferences.method2440(); // L: 3398
							class304.musicPlayerStatus = 1; // L: 3400
							HealthBar.musicTrackArchive = var30; // L: 3401
							class7.musicTrackGroupId = var2; // L: 3402
							class438.musicTrackFileId = 0; // L: 3403
							class178.musicTrackVolume = var3; // L: 3404
							class404.musicTrackBoolean = false; // L: 3405
							class128.pcmSampleLength = 10000; // L: 3406
						}

						playingJingle = false; // L: 3409
					}

					++packetWriter.field1390; // L: 3412
					if (packetWriter.field1390 > 750) { // L: 3413
						class492.method8853(); // L: 3414
					} else {
						class155.method3259(); // L: 3417
						NetCache.method6822(); // L: 3418
						int[] var31 = Players.Players_indices; // L: 3420

						for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 3421
							Player var25 = players[var31[var2]]; // L: 3422
							if (var25 != null && var25.field1163 > 0) { // L: 3423
								--var25.field1163; // L: 3424
								if (var25.field1163 == 0) { // L: 3425
									var25.field1160 = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) { // L: 3428
							var3 = npcIndices[var2]; // L: 3429
							NPC var35 = npcs[var3]; // L: 3430
							if (var35 != null && var35.field1163 > 0) { // L: 3431
								--var35.field1163; // L: 3432
								if (var35.field1163 == 0) { // L: 3433
									var35.field1160 = null;
								}
							}
						}

						++field558; // L: 3437
						if (mouseCrossColor != 0) { // L: 3438
							mouseCrossState = mouseCrossState * 400 + 400; // L: 3439
							if (mouseCrossState * 20 >= 400) { // L: 3440
								mouseCrossColor = 0;
							}
						}

						Widget var32 = class216.mousedOverWidgetIf1; // L: 3442
						Widget var34 = WorldMapSectionType.field2979; // L: 3443
						class216.mousedOverWidgetIf1 = null; // L: 3444
						WorldMapSectionType.field2979 = null; // L: 3445
						draggedOnWidget = null; // L: 3446
						field749 = false; // L: 3447
						field667 = false; // L: 3448
						field570 = 0; // L: 3449

						while (field759.method4085() && field570 < 128) { // L: 3450
							if (staffModLevel >= 2 && field759.method4087(82) && field759.field2334 == 66) { // L: 3451
								String var38 = class294.method5728(); // L: 3452
								class439.client.method477(var38); // L: 3453
							} else if (oculusOrbState != 1 || field759.field2321 <= 0) { // L: 3456
								field720[field570] = field759.field2334; // L: 3459
								field540[field570] = field759.field2321; // L: 3460
								++field570; // L: 3461
							}
						}

						if (DevicePcmPlayerProvider.method300() && field759.method4087(82) && field759.method4087(81) && mouseWheelRotation != 0) { // L: 3463
							var3 = HitSplatDefinition.localPlayer.plane - mouseWheelRotation; // L: 3464
							if (var3 < 0) { // L: 3465
								var3 = 0;
							} else if (var3 > 3) { // L: 3466
								var3 = 3;
							}

							if (var3 != HitSplatDefinition.localPlayer.plane) { // L: 3467
								Decimator.method1104(HitSplatDefinition.localPlayer.pathX[0] + class147.baseX * 64, HitSplatDefinition.localPlayer.pathY[0] + ModeWhere.baseY * 64, var3, false); // L: 3468
							}

							mouseWheelRotation = 0; // L: 3470
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3472
							field616.method4052(); // L: 3473
						}

						if (rootInterface != -1) { // L: 3475
							Varcs.updateRootInterface(rootInterface, 0, 0, class10.canvasWidth, class11.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3476

						while (true) {
							Widget var36;
							Widget var37;
							ScriptEvent var40;
							do {
								var40 = (ScriptEvent)field694.removeLast(); // L: 3478
								if (var40 == null) { // L: 3479
									while (true) {
										do {
											var40 = (ScriptEvent)field695.removeLast(); // L: 3490
											if (var40 == null) { // L: 3491
												while (true) {
													do {
														var40 = (ScriptEvent)scriptEvents.removeLast(); // L: 3502
														if (var40 == null) { // L: 3503
															while (true) {
																class210 var41 = (class210)field505.removeLast(); // L: 3514
																if (var41 == null) { // L: 3515
																	this.menu(); // L: 3518
																	WorldMapManager.method5323(); // L: 3519
																	if (clickedWidget != null) { // L: 3520
																		this.method1242();
																	}

																	if (Scene.shouldSendWalk()) { // L: 3521
																		var3 = Scene.Scene_selectedX; // L: 3522
																		var4 = Scene.Scene_selectedY; // L: 3523
																		PacketBufferNode var39 = class251.getPacketBufferNode(ClientPacket.field3141, packetWriter.isaacCipher); // L: 3525
																		var39.packetBuffer.writeByte(5); // L: 3526
																		var39.packetBuffer.method8994(field759.method4087(82) ? (field759.method4087(81) ? 2 : 1) : 0); // L: 3527
																		var39.packetBuffer.writeShort(class147.baseX * 64 + var3); // L: 3528
																		var39.packetBuffer.method9004(ModeWhere.baseY * 64 + var4); // L: 3529
																		packetWriter.addNode(var39); // L: 3530
																		Scene.method4516(); // L: 3531
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3532
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3533
																		mouseCrossColor = 1; // L: 3534
																		mouseCrossState = 0; // L: 3535
																		destinationX = var3; // L: 3536
																		destinationY = var4; // L: 3537
																	}

																	if (var32 != class216.mousedOverWidgetIf1) { // L: 3539
																		if (var32 != null) { // L: 3540
																			HorizontalAlignment.invalidateWidget(var32);
																		}

																		if (class216.mousedOverWidgetIf1 != null) { // L: 3541
																			HorizontalAlignment.invalidateWidget(class216.mousedOverWidgetIf1);
																		}
																	}

																	if (var34 != WorldMapSectionType.field2979 && field699 == field642) { // L: 3543
																		if (var34 != null) { // L: 3544
																			HorizontalAlignment.invalidateWidget(var34);
																		}

																		if (WorldMapSectionType.field2979 != null) { // L: 3545
																			HorizontalAlignment.invalidateWidget(WorldMapSectionType.field2979);
																		}
																	}

																	if (WorldMapSectionType.field2979 != null) { // L: 3547
																		if (field699 < field642) { // L: 3548
																			++field699; // L: 3549
																			if (field699 == field642) { // L: 3550
																				HorizontalAlignment.invalidateWidget(WorldMapSectionType.field2979);
																			}
																		}
																	} else if (field699 > 0) { // L: 3553
																		--field699;
																	}

																	ScriptFrame.method1164(); // L: 3554
																	if (field732) { // L: 3555
																		LoginScreenAnimation.method2420(class167.field1798, PacketWriter.field1398, class27.field119); // L: 3556
																		class126.method2953(class19.field78, HitSplatDefinition.field2128); // L: 3557
																		if (class167.field1798 == class19.cameraX && DynamicObject.cameraY == PacketWriter.field1398 && class27.field119 == BuddyRankComparator.cameraZ && ObjectComposition.cameraPitch == class19.field78 && HitSplatDefinition.field2128 == Coord.cameraYaw) { // L: 3558
																			field732 = false; // L: 3559
																			isCameraLocked = false; // L: 3560
																			field741 = false; // L: 3561
																			field572 = false; // L: 3562
																			class328.field3585 = 0; // L: 3563
																			Varcs.field1371 = 0; // L: 3564
																			Canvas.field101 = 0; // L: 3565
																			class141.field1619 = 0; // L: 3566
																			class280.field3075 = 0; // L: 3567
																			UserComparator6.field1453 = 0; // L: 3568
																			class60.field418 = 0; // L: 3569
																			class101.field1296 = 0; // L: 3570
																			class440.field4711 = 0; // L: 3571
																			class9.field37 = 0; // L: 3572
																			field744 = null; // L: 3573
																			field746 = null; // L: 3574
																			field718 = null; // L: 3575
																		}
																	} else if (isCameraLocked) { // L: 3578
																		if (!field741) { // L: 3579
																			var3 = class101.field1296 * 16384 + 64; // L: 3580
																			var4 = class440.field4711 * 16384 + 64; // L: 3581
																			var5 = class208.getTileHeight(var3, var4, NetFileRequest.Client_plane) - class9.field37; // L: 3582
																			LoginScreenAnimation.method2420(var3, var5, var4); // L: 3583
																		} else if (field744 != null) { // L: 3585
																			class19.cameraX = field744.vmethod8410(); // L: 3586
																			BuddyRankComparator.cameraZ = field744.vmethod8411(); // L: 3587
																			if (field743) { // L: 3588
																				DynamicObject.cameraY = field744.vmethod8412(); // L: 3589
																			} else {
																				DynamicObject.cameraY = class208.getTileHeight(class19.cameraX, BuddyRankComparator.cameraZ, NetFileRequest.Client_plane) - field744.vmethod8412(); // L: 3592
																			}

																			field744.method8420(); // L: 3594
																		}

																		if (!field572) { // L: 3596
																			var3 = class328.field3585 * 16384 + 64; // L: 3597
																			var4 = Varcs.field1371 * 16384 + 64; // L: 3598
																			var5 = class208.getTileHeight(var3, var4, NetFileRequest.Client_plane) - Canvas.field101; // L: 3599
																			var6 = var3 - class19.cameraX; // L: 3600
																			var7 = var5 - DynamicObject.cameraY; // L: 3601
																			var8 = var4 - BuddyRankComparator.cameraZ; // L: 3602
																			var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8)); // L: 3603
																			var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047; // L: 3604
																			var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047; // L: 3605
																			class126.method2953(var10, var11); // L: 3606
																		} else {
																			if (field746 != null) { // L: 3609
																				ObjectComposition.cameraPitch = field746.method8408(); // L: 3610
																				ObjectComposition.cameraPitch = Math.min(Math.max(ObjectComposition.cameraPitch, 128), 383); // L: 3611
																				field746.method8420(); // L: 3612
																			}

																			if (field718 != null) { // L: 3614
																				Coord.cameraYaw = field718.method8408() & 2047; // L: 3615
																				field718.method8420(); // L: 3616
																			}
																		}
																	}

																	for (var3 = 0; var3 < 5; ++var3) { // L: 3620
																		var10002 = field752[var3]++;
																	}

																	Players.varcs.tryWrite(); // L: 3621
																	var3 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3624
																	var5 = GameEngine.field205.method343(); // L: 3629
																	PacketBufferNode var26;
																	if (var3 > 15000 && var5 > 15000) { // L: 3632
																		logoutTimer = 250; // L: 3633
																		class6.method37(14500); // L: 3634
																		var26 = class251.getPacketBufferNode(ClientPacket.field3182, packetWriter.isaacCipher); // L: 3636
																		packetWriter.addNode(var26); // L: 3637
																	}

																	ReflectionCheck.friendSystem.processFriendUpdates(); // L: 3639

																	for (var7 = 0; var7 < field777.size(); ++var7) { // L: 3641
																		var9 = (Integer)field777.get(var7); // L: 3643
																		class137 var27 = class142.method3102(var9); // L: 3645
																		if (var27 == null) { // L: 3646
																			var8 = 2; // L: 3647
																		} else {
																			var8 = var27.method3068() ? 0 : 1; // L: 3650
																		}

																		if (var8 != 2) { // L: 3652
																			field777.remove(var7); // L: 3653
																			--var7; // L: 3654
																		}
																	}

																	++packetWriter.pendingWrites; // L: 3658
																	if (packetWriter.pendingWrites > 50) { // L: 3659
																		var26 = class251.getPacketBufferNode(ClientPacket.field3153, packetWriter.isaacCipher); // L: 3661
																		packetWriter.addNode(var26); // L: 3662
																	}

																	try {
																		packetWriter.flush(); // L: 3665
																	} catch (IOException var28) { // L: 3667
																		class492.method8853(); // L: 3668
																	}

																	return; // L: 3670
																}

																class398.method7569(var41); // L: 3516
															}
														}

														var36 = var40.widget; // L: 3504
														if (var36.childIndex < 0) { // L: 3505
															break;
														}

														var37 = ArchiveDiskActionHandler.getWidget(var36.parentId); // L: 3506
													} while(var37 == null || var37.children == null || var36.childIndex >= var37.children.length || var36 != var37.children[var36.childIndex]); // L: 3507

													class260.runScriptEvent(var40); // L: 3511
												}
											}

											var36 = var40.widget; // L: 3492
											if (var36.childIndex < 0) { // L: 3493
												break;
											}

											var37 = ArchiveDiskActionHandler.getWidget(var36.parentId); // L: 3494
										} while(var37 == null || var37.children == null || var36.childIndex >= var37.children.length || var36 != var37.children[var36.childIndex]); // L: 3495

										class260.runScriptEvent(var40); // L: 3499
									}
								}

								var36 = var40.widget; // L: 3480
								if (var36.childIndex < 0) { // L: 3481
									break;
								}

								var37 = ArchiveDiskActionHandler.getWidget(var36.parentId); // L: 3482
							} while(var37 == null || var37.children == null || var36.childIndex >= var37.children.length || var36 != var37.children[var36.childIndex]); // L: 3483

							class260.runScriptEvent(var40); // L: 3487
						}
					}
				}
			}
		}
	} // L: 3154 3415

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1759714411"
	)
	public void vmethod6013(int var1, int var2) {
		if (var1 > -1 && WorldMapManager.clientPreferences.method2440() > 0 && !playingJingle) { // L: 3761
			PacketBufferNode var3 = class251.getPacketBufferNode(ClientPacket.field3199, packetWriter.isaacCipher); // L: 3762
			var3.packetBuffer.writeIntME(var1); // L: 3763
			packetWriter.addNode(var3); // L: 3764
		}

	} // L: 3766

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class10.canvasWidth; // L: 4553
		int var2 = class11.canvasHeight; // L: 4554
		if (super.contentWidth < var1) { // L: 4555
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 4556
			var2 = super.contentHeight;
		}

		if (WorldMapManager.clientPreferences != null) { // L: 4557
			try {
				Client var3 = class439.client; // L: 4559
				Object[] var4 = new Object[]{DecorativeObject.getWindowedMode()}; // L: 4560
				JSObject.getWindow(var3).call("resize", var4); // L: 4563
			} catch (Throwable var5) { // L: 4566
			}
		}

	} // L: 4568

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "531404512"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4571
			var1 = rootInterface; // L: 4572
			if (WorldMapAreaData.loadInterface(var1)) { // L: 4574
				DynamicObject.drawModelComponents(UserComparator6.Widget_interfaceComponents[var1], -1); // L: 4575
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4578
			if (field693[var1]) { // L: 4579
				field701[var1] = true;
			}

			field745[var1] = field693[var1]; // L: 4580
			field693[var1] = false; // L: 4581
		}

		field751 = cycle; // L: 4583
		field639 = -1; // L: 4584
		field533 = -1; // L: 4585
		if (rootInterface != -1) { // L: 4586
			rootWidgetCount = 0; // L: 4587
			MouseHandler.drawWidgets(rootInterface, 0, 0, class10.canvasWidth, class11.canvasHeight, 0, 0, -1); // L: 4588
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4590
		if (showMouseCross) { // L: 4591
			if (mouseCrossColor == 1) { // L: 4592
				Friend.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4593
			}

			if (mouseCrossColor == 2) { // L: 4595
				Friend.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4596
			}
		}

		if (!isMenuOpen) { // L: 4599
			if (field639 != -1) { // L: 4600
				var1 = field639; // L: 4601
				int var2 = field533; // L: 4602
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4604 4605
					int var3 = FontName.method8640(); // L: 4606
					String var4;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4608
						var4 = "Use" + " " + field644 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4609
						var4 = field543 + " " + field649 + " " + "->";
					} else {
						var4 = WorldMapIcon_0.method5398(var3); // L: 4610
					}

					if (menuOptionsCount > 2) { // L: 4611
						var4 = var4 + class396.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class126.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4612
				}
			}
		} else {
			class89.method2264(); // L: 4616
		}

		if (gameDrawingMode == 3) { // L: 4617
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4618
				if (field745[var1]) { // L: 4619
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4620
				} else if (field701[var1]) { // L: 4622
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4623
				}
			}
		}

		PlayerType.method6659(NetFileRequest.Client_plane, HitSplatDefinition.localPlayer.x, HitSplatDefinition.localPlayer.y, field558); // L: 4627
		field558 = 0; // L: 4628
	} // L: 4629

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Leh;II)Z",
		garbageValue = "-527195458"
	)
	boolean method1234(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6315
			BZip2State.friendsChatManager = null; // L: 6316
		} else {
			if (BZip2State.friendsChatManager == null) { // L: 6319
				BZip2State.friendsChatManager = new FriendsChatManager(class31.loginType, class439.client); // L: 6320
			}

			BZip2State.friendsChatManager.method7765(var1.packetBuffer, var2); // L: 6322
		}

		AbstractArchive.method6807(); // L: 6324
		var1.serverPacket = null; // L: 6325
		return true; // L: 6326
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)Z",
		garbageValue = "-1090185068"
	)
	boolean method1235(PacketWriter var1) {
		if (BZip2State.friendsChatManager != null) { // L: 6330
			BZip2State.friendsChatManager.method7746(var1.packetBuffer); // L: 6331
		}

		AbstractArchive.method6807(); // L: 6333
		var1.serverPacket = null; // L: 6334
		return true; // L: 6335
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)Z",
		garbageValue = "-1917283617"
	)
	final boolean method1236(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6340
		PacketBuffer var3 = var1.packetBuffer; // L: 6341
		if (var2 == null) { // L: 6342
			return false;
		} else {
			int var6;
			String var22;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6344
					if (var1.field1389) { // L: 6345
						if (!var2.isAvailable(1)) { // L: 6346
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6347
						var1.field1390 = 0; // L: 6348
						var1.field1389 = false; // L: 6349
					}

					var3.offset = 0; // L: 6351
					if (var3.method8918()) { // L: 6352
						if (!var2.isAvailable(1)) { // L: 6353
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6354
						var1.field1390 = 0; // L: 6355
					}

					var1.field1389 = true; // L: 6357
					ServerPacket[] var4 = MouseRecorder.method2254(); // L: 6358
					var5 = var3.readSmartByteShortIsaac(); // L: 6359
					if (var5 < 0 || var5 >= var4.length) { // L: 6360
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6361
					var1.serverPacketLength = var1.serverPacket.length; // L: 6362
				}

				if (var1.serverPacketLength == -1) { // L: 6364
					if (!var2.isAvailable(1)) { // L: 6365
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6366
					var1.serverPacketLength = var3.array[0] & 255; // L: 6367
				}

				if (var1.serverPacketLength == -2) { // L: 6369
					if (!var2.isAvailable(2)) { // L: 6370
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6371
					var3.offset = 0; // L: 6372
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6373
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6375
					return false;
				}

				var3.offset = 0; // L: 6376
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6377
				var1.field1390 = 0; // L: 6378
				timer.method7592(); // L: 6379
				var1.field1394 = var1.field1381; // L: 6380
				var1.field1381 = var1.field1392; // L: 6381
				var1.field1392 = var1.serverPacket; // L: 6382
				int var7;
				int var20;
				if (ServerPacket.field3266 == var1.serverPacket) { // L: 6383
					isCameraLocked = true; // L: 6384
					field732 = false; // L: 6385
					field572 = true; // L: 6386
					var20 = class405.method7613(var3.readShort() & 2027); // L: 6387
					var5 = DefaultsGroup.method8056(var3.readShort() & 2027); // L: 6388
					var6 = var3.readUnsignedShort(); // L: 6389
					var7 = var3.readUnsignedByte(); // L: 6390
					field746 = new class466(ObjectComposition.cameraPitch, var5, var6, var7); // L: 6391
					field718 = new class466(Coord.cameraYaw, var20, var6, var7); // L: 6392
					var1.serverPacket = null; // L: 6393
					return true; // L: 6394
				}

				int var8;
				int var9;
				if (ServerPacket.field3222 == var1.serverPacket) { // L: 6396
					isCameraLocked = true; // L: 6397
					field732 = false; // L: 6398
					field572 = true; // L: 6399
					var20 = var3.readShort(); // L: 6400
					var5 = var3.readShort(); // L: 6401
					var6 = DefaultsGroup.method8056(var5 + ObjectComposition.cameraPitch & 2027); // L: 6402
					var7 = var20 + Coord.cameraYaw; // L: 6403
					var8 = var3.readUnsignedShort(); // L: 6404
					var9 = var3.readUnsignedByte(); // L: 6405
					field746 = new class466(ObjectComposition.cameraPitch, var6, var8, var9); // L: 6406
					field718 = new class466(Coord.cameraYaw, var7, var8, var9); // L: 6407
					var1.serverPacket = null; // L: 6408
					return true; // L: 6409
				}

				if (ServerPacket.field3270 == var1.serverPacket) { // L: 6411
					ItemLayer.method4225(); // L: 6412
					field630 = var3.readUnsignedShort(); // L: 6413
					field690 = cycleCntr; // L: 6414
					var1.serverPacket = null; // L: 6415
					return true; // L: 6416
				}

				Widget var21;
				if (ServerPacket.field3333 == var1.serverPacket) { // L: 6418
					var20 = var3.method9018(); // L: 6419
					var5 = var3.method9007(); // L: 6420
					var21 = ArchiveDiskActionHandler.getWidget(var20); // L: 6421
					if (var21.modelType != 6 || var5 != var21.modelId) { // L: 6422
						var21.modelType = 6; // L: 6423
						var21.modelId = var5; // L: 6424
						HorizontalAlignment.invalidateWidget(var21); // L: 6425
					}

					var1.serverPacket = null; // L: 6427
					return true; // L: 6428
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 6430
					var20 = var3.method8998(); // L: 6431
					var22 = var3.readStringCp1252NullTerminated(); // L: 6432
					var6 = var3.readUnsignedByte(); // L: 6433
					if (var6 >= 1 && var6 <= 8) { // L: 6434
						if (var22.equalsIgnoreCase("null")) { // L: 6435
							var22 = null;
						}

						playerMenuActions[var6 - 1] = var22; // L: 6436
						playerOptionsPriorities[var6 - 1] = var20 == 0; // L: 6437
					}

					var1.serverPacket = null; // L: 6439
					return true; // L: 6440
				}

				if (ServerPacket.field3235 == var1.serverPacket) { // L: 6442
					class213.updateNpcs(false, var3); // L: 6443
					var1.serverPacket = null; // L: 6444
					return true; // L: 6445
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 6447
					ClanChannel.method3322(class294.field3209); // L: 6448
					var1.serverPacket = null; // L: 6449
					return true; // L: 6450
				}

				String var51;
				if (ServerPacket.field3274 == var1.serverPacket) { // L: 6452
					var51 = var3.readStringCp1252NullTerminated(); // L: 6453
					Object[] var83 = new Object[var51.length() + 1]; // L: 6454

					for (var6 = var51.length() - 1; var6 >= 0; --var6) { // L: 6455
						if (var51.charAt(var6) == 's') { // L: 6456
							var83[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var83[var6 + 1] = new Integer(var3.readInt()); // L: 6457
						}
					}

					var83[0] = new Integer(var3.readInt()); // L: 6459
					ScriptEvent var90 = new ScriptEvent(); // L: 6460
					var90.args = var83; // L: 6461
					class260.runScriptEvent(var90); // L: 6462
					var1.serverPacket = null; // L: 6463
					return true; // L: 6464
				}

				if (ServerPacket.field3240 == var1.serverPacket && isCameraLocked) { // L: 6466 6467
					field732 = true; // L: 6468
					field572 = false; // L: 6469
					field741 = false; // L: 6470

					for (var20 = 0; var20 < 5; ++var20) { // L: 6471
						field748[var20] = false; // L: 6472
					}

					var1.serverPacket = null; // L: 6474
					return true; // L: 6475
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 6478
					class105.logOut(); // L: 6479
					var1.serverPacket = null; // L: 6480
					return false; // L: 6481
				}

				if (ServerPacket.field3310 == var1.serverPacket) { // L: 6483
					ClanChannel.method3322(class294.field3213); // L: 6484
					var1.serverPacket = null; // L: 6485
					return true; // L: 6486
				}

				if (ServerPacket.field3292 == var1.serverPacket) { // L: 6488
					PcmPlayer.loadRegions(false, var1.packetBuffer); // L: 6489
					var1.serverPacket = null; // L: 6490
					return true; // L: 6491
				}

				int var11;
				int var24;
				long var60;
				InterfaceParent var74;
				if (ServerPacket.field3230 == var1.serverPacket) { // L: 6493
					var20 = var3.offset + var1.serverPacketLength; // L: 6494
					var5 = var3.readUnsignedShort(); // L: 6495
					if (var5 == 65535) { // L: 6496
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 6497
					if (var5 != rootInterface) { // L: 6498
						rootInterface = var5; // L: 6499
						this.resizeRoot(false); // L: 6500
						class383.Widget_resetModelFrames(rootInterface); // L: 6501
						class330.runWidgetOnLoadListener(rootInterface); // L: 6502

						for (var7 = 0; var7 < 100; ++var7) { // L: 6503
							field693[var7] = true;
						}
					}

					InterfaceParent var57;
					for (; var6-- > 0; var57.field1039 = true) { // L: 6505 6515
						var7 = var3.readInt(); // L: 6506
						var8 = var3.readUnsignedShort(); // L: 6507
						var9 = var3.readUnsignedByte(); // L: 6508
						var57 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6509
						if (var57 != null && var8 != var57.group) { // L: 6510
							class10.closeInterface(var57, true); // L: 6511
							var57 = null; // L: 6512
						}

						if (var57 == null) { // L: 6514
							var57 = class178.method3490(var7, var8, var9);
						}
					}

					for (var74 = (InterfaceParent)interfaceParents.first(); var74 != null; var74 = (InterfaceParent)interfaceParents.next()) { // L: 6517
						if (var74.field1039) { // L: 6518
							var74.field1039 = false;
						} else {
							class10.closeInterface(var74, true); // L: 6520
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6523

					while (var3.offset < var20) { // L: 6524
						var7 = var3.readInt(); // L: 6525
						var8 = var3.readUnsignedShort(); // L: 6526
						var9 = var3.readUnsignedShort(); // L: 6527
						var24 = var3.readInt(); // L: 6528

						for (var11 = var8; var11 <= var9; ++var11) { // L: 6529
							var60 = (long)var11 + ((long)var7 << 32); // L: 6530
							widgetFlags.put(new IntegerNode(var24), var60); // L: 6531
						}
					}

					var1.serverPacket = null; // L: 6534
					return true; // L: 6535
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 6537
					var20 = var3.method9005(); // L: 6538
					var5 = var3.method9018(); // L: 6539
					var21 = ArchiveDiskActionHandler.getWidget(var5); // L: 6540
					if (var21.modelType != 1 || var20 != var21.modelId) { // L: 6541
						var21.modelType = 1; // L: 6542
						var21.modelId = var20; // L: 6543
						HorizontalAlignment.invalidateWidget(var21); // L: 6544
					}

					var1.serverPacket = null; // L: 6546
					return true; // L: 6547
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 6549
					var20 = var3.method9050(); // L: 6550
					var5 = var3.method8967(); // L: 6551
					var21 = ArchiveDiskActionHandler.getWidget(var5); // L: 6552
					KeyHandler.method414(var21, HitSplatDefinition.localPlayer.appearance.field3543, var20); // L: 6553
					HorizontalAlignment.invalidateWidget(var21); // L: 6554
					var1.serverPacket = null; // L: 6555
					return true; // L: 6556
				}

				if (ServerPacket.field3325 == var1.serverPacket) { // L: 6558
					var20 = var3.readInt(); // L: 6559
					var5 = var3.readInt(); // L: 6560
					var6 = ViewportMouse.getGcDuration(); // L: 6561
					PacketBufferNode var80 = class251.getPacketBufferNode(ClientPacket.field3169, packetWriter.isaacCipher); // L: 6563
					var80.packetBuffer.method8995(GameEngine.fps); // L: 6564
					var80.packetBuffer.method8995(var6); // L: 6565
					var80.packetBuffer.method9016(var20); // L: 6566
					var80.packetBuffer.method9088(var5); // L: 6567
					packetWriter.addNode(var80); // L: 6568
					var1.serverPacket = null; // L: 6569
					return true; // L: 6570
				}

				if (ServerPacket.field3315 == var1.serverPacket) { // L: 6572
					var7 = var3.readUnsignedByte(); // L: 6578
					var6 = var3.method9018(); // L: 6579
					var20 = var3.method9006(); // L: 6580
					Player var88;
					if (var20 == localPlayerIndex) { // L: 6581
						var88 = HitSplatDefinition.localPlayer; // L: 6582
					} else {
						var88 = players[var20]; // L: 6585
					}

					var5 = var3.method9007(); // L: 6587
					if (var88 != null) { // L: 6588
						var88.method2358(var7, var5, var6 >> 16, var6 & 65535); // L: 6589
					}

					var1.serverPacket = null; // L: 6591
					return true; // L: 6592
				}

				if (ServerPacket.field3340 == var1.serverPacket) { // L: 6594
					PcmPlayer.loadRegions(true, var1.packetBuffer); // L: 6595
					var1.serverPacket = null; // L: 6596
					return true; // L: 6597
				}

				if (ServerPacket.field3247 == var1.serverPacket) { // L: 6599
					class237.readReflectionCheck(var3, var1.serverPacketLength); // L: 6600
					var1.serverPacket = null; // L: 6601
					return true; // L: 6602
				}

				Widget var23;
				if (ServerPacket.field3275 == var1.serverPacket) { // L: 6604
					var20 = var3.method9020(); // L: 6605
					var5 = var3.readUnsignedShort(); // L: 6606
					if (var5 == 65535) { // L: 6607
						var5 = -1;
					}

					var6 = var3.method9020(); // L: 6608
					var23 = ArchiveDiskActionHandler.getWidget(var20); // L: 6609
					ItemComposition var86;
					if (!var23.isIf3) { // L: 6610
						if (var5 == -1) { // L: 6611
							var23.modelType = 0; // L: 6612
							var1.serverPacket = null; // L: 6613
							return true; // L: 6614
						}

						var86 = class230.ItemComposition_get(var5); // L: 6616
						var23.modelType = 4; // L: 6617
						var23.modelId = var5; // L: 6618
						var23.modelAngleX = var86.xan2d; // L: 6619
						var23.modelAngleY = var86.yan2d; // L: 6620
						var23.modelZoom = var86.zoom2d * 100 / var6; // L: 6621
						HorizontalAlignment.invalidateWidget(var23); // L: 6622
					} else {
						var23.itemId = var5; // L: 6625
						var23.itemQuantity = var6; // L: 6626
						var86 = class230.ItemComposition_get(var5); // L: 6627
						var23.modelAngleX = var86.xan2d; // L: 6628
						var23.modelAngleY = var86.yan2d; // L: 6629
						var23.modelAngleZ = var86.zan2d; // L: 6630
						var23.modelOffsetX = var86.offsetX2d; // L: 6631
						var23.modelOffsetY = var86.offsetY2d; // L: 6632
						var23.modelZoom = var86.zoom2d; // L: 6633
						if (var86.isStackable == 1) { // L: 6634
							var23.itemQuantityMode = 1;
						} else {
							var23.itemQuantityMode = 2; // L: 6635
						}

						if (var23.field3664 > 0) { // L: 6636
							var23.modelZoom = var23.modelZoom * 32 / var23.field3664;
						} else if (var23.rawWidth > 0) { // L: 6637
							var23.modelZoom = var23.modelZoom * 32 / var23.rawWidth;
						}

						HorizontalAlignment.invalidateWidget(var23); // L: 6638
					}

					var1.serverPacket = null; // L: 6640
					return true; // L: 6641
				}

				boolean var91;
				if (ServerPacket.field3296 == var1.serverPacket) { // L: 6643
					var91 = var3.readBoolean(); // L: 6644
					if (var91) { // L: 6645
						if (HitSplatDefinition.field2141 == null) { // L: 6646
							HitSplatDefinition.field2141 = new class367();
						}
					} else {
						HitSplatDefinition.field2141 = null; // L: 6648
					}

					var1.serverPacket = null; // L: 6649
					return true; // L: 6650
				}

				byte var70;
				if (ServerPacket.field3229 == var1.serverPacket) { // L: 6652
					JagexCache.method3476(); // L: 6653
					var70 = var3.readByte(); // L: 6654
					class146 var82 = new class146(var3); // L: 6655
					ClanSettings var89;
					if (var70 >= 0) { // L: 6657
						var89 = currentClanSettings[var70];
					} else {
						var89 = InterfaceParent.guestClanSettings; // L: 6658
					}

					var82.method3124(var89); // L: 6659
					var1.serverPacket = null; // L: 6660
					return true; // L: 6661
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 6663
					class300.field3364 = null; // L: 6664
					var1.serverPacket = null; // L: 6665
					return true; // L: 6666
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 6668
					ClanChannel.method3322(class294.field3211); // L: 6669
					var1.serverPacket = null; // L: 6670
					return true; // L: 6671
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 6673
					ReflectionCheck.friendSystem.method1830(); // L: 6674
					field736 = cycleCntr; // L: 6675
					var1.serverPacket = null; // L: 6676
					return true; // L: 6677
				}

				GameObject var14;
				int var15;
				int var16;
				String var32;
				if (ServerPacket.field3287 == var1.serverPacket) { // L: 6679
					var70 = var3.readByte(); // L: 6680
					var22 = var3.readStringCp1252NullTerminated(); // L: 6681
					long var26 = (long)var3.readUnsignedShort(); // L: 6682
					long var28 = (long)var3.readMedium(); // L: 6683
					PlayerType var56 = (PlayerType)class217.findEnumerated(class31.PlayerType_values(), var3.readUnsignedByte()); // L: 6684
					long var30 = var28 + (var26 << 32); // L: 6685
					boolean var65 = false; // L: 6686
					var14 = null; // L: 6687
					ClanChannel var67 = var70 >= 0 ? currentClanChannels[var70] : UserComparator4.guestClanChannel; // L: 6689
					if (var67 == null) { // L: 6690
						var65 = true; // L: 6691
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var56.isUser && ReflectionCheck.friendSystem.isIgnored(new Username(var22, class31.loginType))) { // L: 6700 6701
									var65 = true;
								}
								break;
							}

							if (var30 == field714[var15]) { // L: 6695
								var65 = true; // L: 6696
								break; // L: 6697
							}

							++var15; // L: 6694
						}
					}

					if (!var65) { // L: 6704
						field714[field715] = var30; // L: 6705
						field715 = (field715 + 1) % 100; // L: 6706
						var32 = AbstractFont.escapeBrackets(SecureRandomFuture.method2113(var3)); // L: 6707
						var16 = var70 >= 0 ? 41 : 44; // L: 6708
						if (var56.modIcon != -1) { // L: 6709
							Decimator.addChatMessage(var16, ViewportMouse.method4904(var56.modIcon) + var22, var32, var67.name);
						} else {
							Decimator.addChatMessage(var16, var22, var32, var67.name); // L: 6710
						}
					}

					var1.serverPacket = null; // L: 6712
					return true; // L: 6713
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 6715
					ReflectionCheck.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6716
					field736 = cycleCntr; // L: 6717
					var1.serverPacket = null; // L: 6718
					return true; // L: 6719
				}

				if (ServerPacket.field3328 == var1.serverPacket) { // L: 6721
					class124.field1461 = var3.readUnsignedByte(); // L: 6722
					InvDefinition.field1908 = var3.readUnsignedByte(); // L: 6723

					for (var20 = InvDefinition.field1908; var20 < InvDefinition.field1908 + 8; ++var20) { // L: 6724
						for (var5 = class124.field1461; var5 < class124.field1461 + 8; ++var5) { // L: 6725
							if (groundItems[NetFileRequest.Client_plane][var20][var5] != null) { // L: 6726
								groundItems[NetFileRequest.Client_plane][var20][var5] = null; // L: 6727
								class14.updateItemPile(var20, var5); // L: 6728
							}
						}
					}

					for (PendingSpawn var53 = (PendingSpawn)pendingSpawns.last(); var53 != null; var53 = (PendingSpawn)pendingSpawns.previous()) { // L: 6732 6733 6735
						if (var53.x >= InvDefinition.field1908 && var53.x < InvDefinition.field1908 + 8 && var53.y >= class124.field1461 && var53.y < class124.field1461 + 8 && var53.plane == NetFileRequest.Client_plane) { // L: 6734
							var53.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6737
					return true; // L: 6738
				}

				if (ServerPacket.field3283 == var1.serverPacket) { // L: 6740
					minimapState = var3.readUnsignedByte(); // L: 6741
					var1.serverPacket = null; // L: 6742
					return true; // L: 6743
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 6745
					return this.method1234(var1, 1); // L: 6746
				}

				if (ServerPacket.field3307 == var1.serverPacket) { // L: 6748
					var20 = var3.readUnsignedByte(); // L: 6749
					if (var3.readUnsignedByte() == 0) { // L: 6750
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6751
						var3.offset += 18; // L: 6752
					} else {
						--var3.offset; // L: 6755
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6756
					}

					field735 = cycleCntr; // L: 6758
					var1.serverPacket = null; // L: 6759
					return true; // L: 6760
				}

				if (ServerPacket.field3256 == var1.serverPacket) { // L: 6762
					return this.method1235(var1); // L: 6763
				}

				int var13;
				long var33;
				long var35;
				String var41;
				boolean var92;
				if (ServerPacket.field3246 == var1.serverPacket) { // L: 6765
					var51 = var3.readStringCp1252NullTerminated(); // L: 6766
					var33 = (long)var3.readUnsignedShort(); // L: 6767
					var35 = (long)var3.readMedium(); // L: 6768
					PlayerType var37 = (PlayerType)class217.findEnumerated(class31.PlayerType_values(), var3.readUnsignedByte()); // L: 6769
					long var38 = var35 + (var33 << 32); // L: 6770
					var92 = false; // L: 6771

					for (var13 = 0; var13 < 100; ++var13) { // L: 6772
						if (field714[var13] == var38) { // L: 6773
							var92 = true; // L: 6774
							break; // L: 6775
						}
					}

					if (ReflectionCheck.friendSystem.isIgnored(new Username(var51, class31.loginType))) { // L: 6778
						var92 = true;
					}

					if (!var92 && field516 == 0) { // L: 6779
						field714[field715] = var38; // L: 6780
						field715 = (field715 + 1) % 100; // L: 6781
						var41 = AbstractFont.escapeBrackets(class251.method5039(SecureRandomFuture.method2113(var3))); // L: 6782
						byte var95;
						if (var37.isPrivileged) { // L: 6784
							var95 = 7;
						} else {
							var95 = 3; // L: 6785
						}

						if (var37.modIcon != -1) { // L: 6786
							HealthBarUpdate.addGameMessage(var95, ViewportMouse.method4904(var37.modIcon) + var51, var41);
						} else {
							HealthBarUpdate.addGameMessage(var95, var51, var41); // L: 6787
						}
					}

					var1.serverPacket = null; // L: 6789
					return true; // L: 6790
				}

				if (ServerPacket.field3269 == var1.serverPacket) { // L: 6792
					class300.field3364 = new class442(ViewportMouse.Ignored_cached); // L: 6793
					var1.serverPacket = null; // L: 6794
					return true; // L: 6795
				}

				Widget var81;
				if (ServerPacket.field3272 == var1.serverPacket) { // L: 6797
					var20 = var3.method9007(); // L: 6798
					var5 = var3.method9007(); // L: 6799
					var6 = var3.method9018(); // L: 6800
					var7 = var3.method9005(); // L: 6801
					var81 = ArchiveDiskActionHandler.getWidget(var6); // L: 6802
					if (var20 != var81.modelAngleX || var5 != var81.modelAngleY || var7 != var81.modelZoom) { // L: 6803
						var81.modelAngleX = var20; // L: 6804
						var81.modelAngleY = var5; // L: 6805
						var81.modelZoom = var7; // L: 6806
						HorizontalAlignment.invalidateWidget(var81); // L: 6807
					}

					var1.serverPacket = null; // L: 6809
					return true; // L: 6810
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 6812
					var3.offset += 28; // L: 6813
					if (var3.checkCrc()) { // L: 6814
						class60.method1146(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6815
					return true; // L: 6816
				}

				if (ServerPacket.field3259 == var1.serverPacket) { // L: 6818
					class112.updatePlayers(var3, var1.serverPacketLength); // L: 6819
					class130.method3006(); // L: 6820
					var1.serverPacket = null; // L: 6821
					return true; // L: 6822
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 6824
					var20 = var3.readInt(); // L: 6825
					var5 = var3.method9006(); // L: 6826
					Varps.Varps_temp[var5] = var20; // L: 6827
					if (Varps.Varps_main[var5] != var20) { // L: 6828
						Varps.Varps_main[var5] = var20; // L: 6829
					}

					class1.changeGameOptions(var5); // L: 6831
					field675[++field539 - 1 & 31] = var5; // L: 6832
					var1.serverPacket = null; // L: 6833
					return true; // L: 6834
				}

				if (ServerPacket.field3226 == var1.serverPacket) { // L: 6836
					rebootTimer = var3.method9006() * 30; // L: 6837
					field690 = cycleCntr; // L: 6838
					var1.serverPacket = null; // L: 6839
					return true; // L: 6840
				}

				if (ServerPacket.field3317 == var1.serverPacket) { // L: 6842
					var20 = var3.readUnsignedByte(); // L: 6843
					var5 = var3.readUnsignedByte(); // L: 6844
					var6 = var3.readUnsignedByte(); // L: 6845
					var7 = var3.readUnsignedByte(); // L: 6846
					field748[var20] = true; // L: 6847
					field611[var20] = var5; // L: 6848
					field750[var20] = var6; // L: 6849
					field696[var20] = var7; // L: 6850
					field752[var20] = 0; // L: 6851
					var1.serverPacket = null; // L: 6852
					return true; // L: 6853
				}

				if (ServerPacket.field3320 == var1.serverPacket) { // L: 6855
					var20 = var3.method9008(); // L: 6856
					var5 = var3.readInt(); // L: 6857
					var21 = ArchiveDiskActionHandler.getWidget(var5); // L: 6858
					if (var20 != var21.sequenceId || var20 == -1) { // L: 6859
						var21.sequenceId = var20; // L: 6860
						var21.modelFrame = 0; // L: 6861
						var21.modelFrameCycle = 0; // L: 6862
						HorizontalAlignment.invalidateWidget(var21); // L: 6863
					}

					var1.serverPacket = null; // L: 6865
					return true; // L: 6866
				}

				if (ServerPacket.field3286 == var1.serverPacket) { // L: 6868
					var9 = var3.readUnsignedShort(); // L: 6877
					var11 = var3.method9007(); // L: 6878
					var6 = var3.method9011(); // L: 6879
					var20 = var6 >> 16; // L: 6880
					var5 = var6 >> 8 & 255; // L: 6881
					var7 = var20 + (var6 >> 4 & 7); // L: 6882
					var8 = var5 + (var6 & 7); // L: 6883
					var24 = var3.method8998(); // L: 6884
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 6885
						var7 = var7 * 128 + 64; // L: 6886
						var8 = var8 * 128 + 64; // L: 6887
						GraphicsObject var94 = new GraphicsObject(var9, NetFileRequest.Client_plane, var7, var8, class208.getTileHeight(var7, var8, NetFileRequest.Client_plane) - var24, var11, cycle); // L: 6888
						graphicsObjects.addFirst(var94); // L: 6889
					}

					var1.serverPacket = null; // L: 6891
					return true; // L: 6892
				}

				if (ServerPacket.field3324 == var1.serverPacket) { // L: 6894
					var20 = var3.method9005(); // L: 6895
					class11.method104(var20); // L: 6896
					field677[++field678 - 1 & 31] = var20 & 32767; // L: 6897
					var1.serverPacket = null; // L: 6898
					return true; // L: 6899
				}

				NPC var84;
				if (ServerPacket.field3231 == var1.serverPacket) { // L: 6901
					var20 = var3.method9007(); // L: 6902
					var5 = var3.method9050(); // L: 6903
					short var61 = (short)var3.method9008(); // L: 6904
					var7 = var3.readInt(); // L: 6905
					var84 = npcs[var20]; // L: 6906
					if (var84 != null) { // L: 6907
						var84.method2553(var5, var7, var61); // L: 6908
					}

					var1.serverPacket = null; // L: 6910
					return true; // L: 6911
				}

				String var73;
				if (ServerPacket.field3280 == var1.serverPacket) { // L: 6913
					byte[] var52 = new byte[var1.serverPacketLength]; // L: 6914
					var3.method8916(var52, 0, var52.length); // L: 6915
					Buffer var79 = new Buffer(var52); // L: 6916
					var73 = var79.readStringCp1252NullTerminated(); // L: 6917
					class125.openURL(var73, true, false); // L: 6918
					var1.serverPacket = null; // L: 6919
					return true; // L: 6920
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 6922
					destinationX = var3.readUnsignedByte(); // L: 6923
					if (destinationX == 255) { // L: 6924
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6925
					if (destinationY == 255) { // L: 6926
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6927
					return true; // L: 6928
				}

				Widget var72;
				if (ServerPacket.field3335 == var1.serverPacket) { // L: 6930
					var20 = var3.method9018(); // L: 6931
					var72 = ArchiveDiskActionHandler.getWidget(var20); // L: 6932

					for (var6 = 0; var6 < var72.itemIds.length; ++var6) { // L: 6933
						var72.itemIds[var6] = -1; // L: 6934
						var72.itemIds[var6] = 0; // L: 6935
					}

					HorizontalAlignment.invalidateWidget(var72); // L: 6937
					var1.serverPacket = null; // L: 6938
					return true; // L: 6939
				}

				if (ServerPacket.field3253 == var1.serverPacket) { // L: 6941
					if (rootInterface != -1) { // L: 6942
						SpotAnimationDefinition.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6943
					return true; // L: 6944
				}

				if (ServerPacket.field3262 == var1.serverPacket) { // L: 6946
					var20 = var3.method9018(); // L: 6947
					var5 = var3.readUnsignedByte(); // L: 6948
					var6 = var3.method9026(); // L: 6949
					var23 = ArchiveDiskActionHandler.getWidget(var20); // L: 6950
					class17.method250(var23, var5, var6); // L: 6951
					HorizontalAlignment.invalidateWidget(var23); // L: 6952
					var1.serverPacket = null; // L: 6953
					return true; // L: 6954
				}

				if (ServerPacket.field3318 == var1.serverPacket) { // L: 6956
					ItemLayer.method4225(); // L: 6957
					weight = var3.readShort(); // L: 6958
					field690 = cycleCntr; // L: 6959
					var1.serverPacket = null; // L: 6960
					return true; // L: 6961
				}

				if (ServerPacket.field3244 == var1.serverPacket) { // L: 6963
					var20 = var3.method9006(); // L: 6964
					var5 = var3.method8967(); // L: 6965
					var21 = ArchiveDiskActionHandler.getWidget(var5); // L: 6966
					if (var21.modelType != 2 || var20 != var21.modelId) { // L: 6967
						var21.modelType = 2; // L: 6968
						var21.modelId = var20; // L: 6969
						HorizontalAlignment.invalidateWidget(var21); // L: 6970
					}

					var1.serverPacket = null; // L: 6972
					return true; // L: 6973
				}

				if (ServerPacket.field3330 == var1.serverPacket) { // L: 6975
					isCameraLocked = true; // L: 6976
					field732 = false; // L: 6977
					field741 = true; // L: 6978
					class101.field1296 = var3.readUnsignedByte() * 128; // L: 6979
					class440.field4711 = var3.readUnsignedByte() * 128; // L: 6980
					var20 = var3.readUnsignedShort(); // L: 6981
					var5 = var3.readUnsignedShort(); // L: 6982
					field743 = var3.readBoolean(); // L: 6983
					var6 = var3.readUnsignedByte(); // L: 6984
					var7 = class101.field1296 * 16384 + 64; // L: 6985
					var8 = class440.field4711 * 16384 + 64; // L: 6986
					boolean var63 = false; // L: 6987
					boolean var87 = false; // L: 6988
					if (field743) { // L: 6989
						var9 = DynamicObject.cameraY; // L: 6990
						var24 = class208.getTileHeight(var7, var8, NetFileRequest.Client_plane) - var20; // L: 6991
					} else {
						var9 = class208.getTileHeight(class19.cameraX, BuddyRankComparator.cameraZ, NetFileRequest.Client_plane) - DynamicObject.cameraY; // L: 6994
						var24 = var20; // L: 6995
					}

					field744 = new class465(class19.cameraX, BuddyRankComparator.cameraZ, var9, var7, var8, var24, var5, var6); // L: 6997
					var1.serverPacket = null; // L: 6998
					return true; // L: 6999
				}

				if (ServerPacket.field3313 == var1.serverPacket) { // L: 7001
					var20 = var3.readUnsignedShort(); // L: 7002
					var5 = var3.readUnsignedByte(); // L: 7003
					var6 = var3.readUnsignedShort(); // L: 7004
					Decimator.queueSoundEffect(var20, var5, var6); // L: 7005
					var1.serverPacket = null; // L: 7006
					return true; // L: 7007
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 7009
					var20 = var3.readUnsignedShort(); // L: 7010
					if (var20 == 65535) { // L: 7011
						var20 = -1;
					}

					rootInterface = var20; // L: 7012
					this.resizeRoot(false); // L: 7013
					class383.Widget_resetModelFrames(var20); // L: 7014
					class330.runWidgetOnLoadListener(rootInterface); // L: 7015

					for (var5 = 0; var5 < 100; ++var5) { // L: 7016
						field693[var5] = true;
					}

					var1.serverPacket = null; // L: 7017
					return true; // L: 7018
				}

				if (ServerPacket.field3309 == var1.serverPacket) { // L: 7020
					isCameraLocked = true; // L: 7021
					field732 = false; // L: 7022
					field741 = false; // L: 7023
					class101.field1296 = var3.readUnsignedByte() * 128; // L: 7024
					class440.field4711 = var3.readUnsignedByte() * 128; // L: 7025
					class9.field37 = var3.readUnsignedShort(); // L: 7026
					class60.field418 = var3.readUnsignedByte(); // L: 7027
					UserComparator6.field1453 = var3.readUnsignedByte(); // L: 7028
					if (UserComparator6.field1453 >= 100) { // L: 7029
						class19.cameraX = class101.field1296 * 16384 + 64; // L: 7030
						BuddyRankComparator.cameraZ = class440.field4711 * 16384 + 64; // L: 7031
						DynamicObject.cameraY = class208.getTileHeight(class19.cameraX, BuddyRankComparator.cameraZ, NetFileRequest.Client_plane) - class9.field37; // L: 7032
					}

					var1.serverPacket = null; // L: 7034
					return true; // L: 7035
				}

				int var42;
				long var44;
				boolean var59;
				if (ServerPacket.field3337 == var1.serverPacket) { // L: 7037
					var70 = var3.readByte(); // L: 7038
					var33 = (long)var3.readUnsignedShort(); // L: 7039
					var35 = (long)var3.readMedium(); // L: 7040
					var44 = (var33 << 32) + var35; // L: 7041
					var59 = false; // L: 7042
					ClanChannel var43 = var70 >= 0 ? currentClanChannels[var70] : UserComparator4.guestClanChannel; // L: 7043
					if (var43 == null) { // L: 7044
						var59 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 7046
							if (var44 == field714[var13]) { // L: 7047
								var59 = true; // L: 7048
								break; // L: 7049
							}
						}
					}

					if (!var59) { // L: 7053
						field714[field715] = var44; // L: 7054
						field715 = (field715 + 1) % 100; // L: 7055
						var41 = SecureRandomFuture.method2113(var3); // L: 7056
						var42 = var70 >= 0 ? 43 : 46; // L: 7057
						Decimator.addChatMessage(var42, "", var41, var43.name); // L: 7058
					}

					var1.serverPacket = null; // L: 7060
					return true; // L: 7061
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 7063
					ClanChannel.method3322(class294.field3205); // L: 7064
					var1.serverPacket = null; // L: 7065
					return true; // L: 7066
				}

				if (ServerPacket.field3232 == var1.serverPacket) { // L: 7068
					class124.field1461 = var3.method8998(); // L: 7069
					InvDefinition.field1908 = var3.method9050(); // L: 7070

					while (var3.offset < var1.serverPacketLength) { // L: 7071
						var20 = var3.readUnsignedByte(); // L: 7072
						class294 var76 = class105.method2656()[var20]; // L: 7073
						ClanChannel.method3322(var76); // L: 7074
					}

					var1.serverPacket = null; // L: 7076
					return true; // L: 7077
				}

				if (ServerPacket.field3319 == var1.serverPacket) { // L: 7079
					var20 = var3.method9018(); // L: 7080
					var5 = var3.readUnsignedShort(); // L: 7081
					var21 = ArchiveDiskActionHandler.getWidget(var20); // L: 7082
					if (var21 != null && var21.type == 0) { // L: 7083
						if (var5 > var21.scrollHeight - var21.height) { // L: 7084
							var5 = var21.scrollHeight - var21.height;
						}

						if (var5 < 0) { // L: 7085
							var5 = 0;
						}

						if (var5 != var21.scrollY) { // L: 7086
							var21.scrollY = var5; // L: 7087
							HorizontalAlignment.invalidateWidget(var21); // L: 7088
						}
					}

					var1.serverPacket = null; // L: 7091
					return true; // L: 7092
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 7094
					ClanChannel.method3322(class294.field3204); // L: 7095
					var1.serverPacket = null; // L: 7096
					return true; // L: 7097
				}

				if (ServerPacket.field3225 == var1.serverPacket) { // L: 7099
					var20 = var3.readUnsignedShort(); // L: 7100
					var5 = var3.method8967(); // L: 7101
					var6 = var20 >> 10 & 31; // L: 7102
					var7 = var20 >> 5 & 31; // L: 7103
					var8 = var20 & 31; // L: 7104
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3); // L: 7105
					Widget var10 = ArchiveDiskActionHandler.getWidget(var5); // L: 7106
					if (var9 != var10.color) { // L: 7107
						var10.color = var9; // L: 7108
						HorizontalAlignment.invalidateWidget(var10); // L: 7109
					}

					var1.serverPacket = null; // L: 7111
					return true; // L: 7112
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 7114
					ReflectionCheck.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7115
					PlatformInfo.FriendSystem_invalidateIgnoreds(); // L: 7116
					field736 = cycleCntr; // L: 7117
					var1.serverPacket = null; // L: 7118
					return true; // L: 7119
				}

				int var40;
				if (ServerPacket.field3227 == var1.serverPacket) { // L: 7121
					isCameraLocked = true; // L: 7122
					field732 = false; // L: 7123
					field741 = true; // L: 7124
					class101.field1296 = var3.readUnsignedByte() * 128; // L: 7125
					class440.field4711 = var3.readUnsignedByte() * 128; // L: 7126
					var20 = var3.readUnsignedShort(); // L: 7127
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 7128
					var6 = var3.readUnsignedByte() * 128 + 64; // L: 7129
					var7 = var3.readUnsignedShort(); // L: 7130
					field743 = var3.readBoolean(); // L: 7131
					var8 = var3.readUnsignedByte(); // L: 7132
					var9 = class101.field1296 * 16384 + 64; // L: 7133
					var24 = class440.field4711 * 16384 + 64; // L: 7134
					var59 = false; // L: 7135
					var92 = false; // L: 7136
					if (field743) { // L: 7137
						var11 = DynamicObject.cameraY; // L: 7138
						var40 = class208.getTileHeight(var9, var24, NetFileRequest.Client_plane) - var20; // L: 7139
					} else {
						var11 = class208.getTileHeight(class19.cameraX, BuddyRankComparator.cameraZ, NetFileRequest.Client_plane) - DynamicObject.cameraY; // L: 7142
						var40 = var20; // L: 7143
					}

					field744 = new class464(class19.cameraX, BuddyRankComparator.cameraZ, var11, var9, var24, var40, var5, var6, var7, var8); // L: 7145
					var1.serverPacket = null; // L: 7146
					return true; // L: 7147
				}

				if (ServerPacket.field3243 == var1.serverPacket) { // L: 7149
					var7 = var3.method8998(); // L: 7155
					var5 = var3.readInt(); // L: 7156
					var20 = var3.method9006(); // L: 7157
					var84 = npcs[var20]; // L: 7158
					var6 = var3.method9007(); // L: 7159
					if (var84 != null) { // L: 7160
						var84.method2358(var7, var6, var5 >> 16, var5 & 65535); // L: 7161
					}

					var1.serverPacket = null; // L: 7163
					return true; // L: 7164
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 7166
					var20 = var3.readInt(); // L: 7167
					InterfaceParent var75 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7168
					if (var75 != null) { // L: 7169
						class10.closeInterface(var75, true);
					}

					if (meslayerContinueWidget != null) { // L: 7170
						HorizontalAlignment.invalidateWidget(meslayerContinueWidget); // L: 7171
						meslayerContinueWidget = null; // L: 7172
					}

					var1.serverPacket = null; // L: 7174
					return true; // L: 7175
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 7177
					var91 = var3.method9050() == 1; // L: 7178
					var5 = var3.readInt(); // L: 7179
					var21 = ArchiveDiskActionHandler.getWidget(var5); // L: 7180
					class14.method168(var21, HitSplatDefinition.localPlayer.appearance, var91); // L: 7181
					HorizontalAlignment.invalidateWidget(var21); // L: 7182
					var1.serverPacket = null; // L: 7183
					return true; // L: 7184
				}

				if (ServerPacket.field3241 == var1.serverPacket) { // L: 7186
					var5 = var3.method9005(); // L: 7190
					var20 = var3.method9005(); // L: 7191
					var6 = var3.method8998(); // L: 7192
					if (var5 == 65535) { // L: 7193
						var5 = -1; // L: 7194
					}

					NPC var77 = npcs[var20]; // L: 7196
					if (var77 != null) { // L: 7197
						if (var5 == var77.sequence && var5 != -1) { // L: 7198
							var8 = class149.SequenceDefinition_get(var5).field2277; // L: 7199
							if (var8 == 1) { // L: 7200
								var77.sequenceFrame = 0; // L: 7201
								var77.sequenceFrameCycle = 0; // L: 7202
								var77.sequenceDelay = var6; // L: 7203
								var77.field1188 = 0; // L: 7204
							} else if (var8 == 2) { // L: 7206
								var77.field1188 = 0; // L: 7207
							}
						} else if (var5 == -1 || var77.sequence == -1 || class149.SequenceDefinition_get(var5).field2285 >= class149.SequenceDefinition_get(var77.sequence).field2285) { // L: 7210
							var77.sequence = var5; // L: 7211
							var77.sequenceFrame = 0; // L: 7212
							var77.sequenceFrameCycle = 0; // L: 7213
							var77.sequenceDelay = var6; // L: 7214
							var77.field1188 = 0; // L: 7215
							var77.field1214 = var77.pathLength; // L: 7216
						}
					}

					var1.serverPacket = null; // L: 7220
					return true; // L: 7221
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 7223
					var20 = var3.readInt(); // L: 7224
					var5 = var3.readUnsignedShort(); // L: 7225
					if (var20 < -70000) { // L: 7226
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7228
						var21 = ArchiveDiskActionHandler.getWidget(var20);
					} else {
						var21 = null; // L: 7229
					}

					for (; var3.offset < var1.serverPacketLength; ApproximateRouteStrategy.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 7230 7244
						var7 = var3.readUShortSmart(); // L: 7231
						var8 = var3.readUnsignedShort(); // L: 7232
						var9 = 0; // L: 7233
						if (var8 != 0) { // L: 7234
							var9 = var3.readUnsignedByte(); // L: 7235
							if (var9 == 255) { // L: 7236
								var9 = var3.readInt();
							}
						}

						if (var21 != null && var7 >= 0 && var7 < var21.itemIds.length) { // L: 7238 7239
							var21.itemIds[var7] = var8; // L: 7240
							var21.field3740[var7] = var9; // L: 7241
						}
					}

					if (var21 != null) { // L: 7246
						HorizontalAlignment.invalidateWidget(var21);
					}

					ItemLayer.method4225(); // L: 7247
					field677[++field678 - 1 & 31] = var5 & 32767; // L: 7248
					var1.serverPacket = null; // L: 7249
					return true; // L: 7250
				}

				if (ServerPacket.field3314 == var1.serverPacket) { // L: 7252
					return this.method1234(var1, 2); // L: 7253
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7255
					var91 = var3.readUnsignedByte() == 1; // L: 7256
					if (var91) { // L: 7257
						VarcInt.field1940 = Canvas.method310() - var3.readLong(); // L: 7258
						GraphicsObject.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7259
					} else {
						GraphicsObject.grandExchangeEvents = null; // L: 7261
					}

					field689 = cycleCntr; // L: 7262
					var1.serverPacket = null; // L: 7263
					return true; // L: 7264
				}

				if (ServerPacket.field3245 == var1.serverPacket) { // L: 7266
					var20 = var3.readUnsignedByte(); // L: 7267
					class6.forceDisconnect(var20); // L: 7268
					var1.serverPacket = null; // L: 7269
					return false; // L: 7270
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 7272
					ClanChannel.method3322(class294.field3206); // L: 7273
					var1.serverPacket = null; // L: 7274
					return true; // L: 7275
				}

				if (ServerPacket.field3321 == var1.serverPacket) { // L: 7277
					var20 = var3.method9006(); // L: 7278
					if (var20 == 65535) { // L: 7279
						var20 = -1;
					}

					MusicPatchPcmStream.playSong(var20); // L: 7280
					var1.serverPacket = null; // L: 7281
					return true; // L: 7282
				}

				if (ServerPacket.field3238 == var1.serverPacket) { // L: 7284
					var20 = var3.readUnsignedShort(); // L: 7285
					if (var20 == 65535) { // L: 7286
						var20 = -1;
					}

					var5 = var3.readMedium(); // L: 7287
					class143.method3111(var20, var5); // L: 7288
					var1.serverPacket = null; // L: 7289
					return true; // L: 7290
				}

				if (ServerPacket.field3293 == var1.serverPacket) { // L: 7292
					var51 = var3.readStringCp1252NullTerminated(); // L: 7293
					var5 = var3.method8967(); // L: 7294
					var21 = ArchiveDiskActionHandler.getWidget(var5); // L: 7295
					if (!var51.equals(var21.text)) { // L: 7296
						var21.text = var51; // L: 7297
						HorizontalAlignment.invalidateWidget(var21); // L: 7298
					}

					var1.serverPacket = null; // L: 7300
					return true; // L: 7301
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 7303
					var20 = var3.method8967(); // L: 7304
					var5 = var3.method9018(); // L: 7305
					InterfaceParent var78 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7306
					var74 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7307
					if (var74 != null) { // L: 7308
						class10.closeInterface(var74, var78 == null || var74.group != var78.group);
					}

					if (var78 != null) { // L: 7309
						var78.remove(); // L: 7310
						interfaceParents.put(var78, (long)var5); // L: 7311
					}

					var81 = ArchiveDiskActionHandler.getWidget(var20); // L: 7313
					if (var81 != null) { // L: 7314
						HorizontalAlignment.invalidateWidget(var81);
					}

					var81 = ArchiveDiskActionHandler.getWidget(var5); // L: 7315
					if (var81 != null) { // L: 7316
						HorizontalAlignment.invalidateWidget(var81); // L: 7317
						class166.revalidateWidgetScroll(UserComparator6.Widget_interfaceComponents[var81.id >>> 16], var81, true); // L: 7318
					}

					if (rootInterface != -1) { // L: 7320
						SpotAnimationDefinition.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7321
					return true; // L: 7322
				}

				if (ServerPacket.field3252 == var1.serverPacket) { // L: 7324
					var51 = var3.readStringCp1252NullTerminated(); // L: 7325
					var33 = var3.readLong(); // L: 7326
					var35 = (long)var3.readUnsignedShort(); // L: 7327
					var44 = (long)var3.readMedium(); // L: 7328
					PlayerType var96 = (PlayerType)class217.findEnumerated(class31.PlayerType_values(), var3.readUnsignedByte()); // L: 7329
					var60 = (var35 << 32) + var44; // L: 7330
					boolean var93 = false; // L: 7331

					for (var15 = 0; var15 < 100; ++var15) { // L: 7332
						if (field714[var15] == var60) { // L: 7333
							var93 = true; // L: 7334
							break; // L: 7335
						}
					}

					if (var96.isUser && ReflectionCheck.friendSystem.isIgnored(new Username(var51, class31.loginType))) { // L: 7338 7339
						var93 = true;
					}

					if (!var93 && field516 == 0) { // L: 7341
						field714[field715] = var60; // L: 7342
						field715 = (field715 + 1) % 100; // L: 7343
						var32 = AbstractFont.escapeBrackets(class251.method5039(SecureRandomFuture.method2113(var3))); // L: 7344
						if (var96.modIcon != -1) { // L: 7345
							Decimator.addChatMessage(9, ViewportMouse.method4904(var96.modIcon) + var51, var32, Frames.base37DecodeLong(var33));
						} else {
							Decimator.addChatMessage(9, var51, var32, Frames.base37DecodeLong(var33)); // L: 7346
						}
					}

					var1.serverPacket = null; // L: 7348
					return true; // L: 7349
				}

				if (ServerPacket.field3224 == var1.serverPacket) { // L: 7351
					field687 = cycleCntr; // L: 7352
					var70 = var3.readByte(); // L: 7353
					if (var1.serverPacketLength == 1) { // L: 7354
						if (var70 >= 0) { // L: 7355
							currentClanChannels[var70] = null;
						} else {
							UserComparator4.guestClanChannel = null; // L: 7356
						}

						var1.serverPacket = null; // L: 7357
						return true; // L: 7358
					}

					if (var70 >= 0) { // L: 7360
						currentClanChannels[var70] = new ClanChannel(var3); // L: 7361
					} else {
						UserComparator4.guestClanChannel = new ClanChannel(var3); // L: 7364
					}

					var1.serverPacket = null; // L: 7366
					return true; // L: 7367
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 7369
					ClanChannel.method3322(class294.field3208); // L: 7370
					var1.serverPacket = null; // L: 7371
					return true; // L: 7372
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 7374
					var20 = var3.readUnsignedShort(); // L: 7375
					var5 = var3.readUnsignedByte(); // L: 7376
					var6 = var3.method8967(); // L: 7377
					var74 = (InterfaceParent)interfaceParents.get((long)var6); // L: 7378
					if (var74 != null) { // L: 7379
						class10.closeInterface(var74, var20 != var74.group);
					}

					class178.method3490(var6, var20, var5); // L: 7380
					var1.serverPacket = null; // L: 7381
					return true; // L: 7382
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 7384
					field732 = false; // L: 7385
					isCameraLocked = false; // L: 7386
					field741 = false; // L: 7387
					field572 = false; // L: 7388
					class328.field3585 = 0; // L: 7389
					Varcs.field1371 = 0; // L: 7390
					Canvas.field101 = 0; // L: 7391
					field743 = false; // L: 7392
					class141.field1619 = 0; // L: 7393
					class280.field3075 = 0; // L: 7394
					UserComparator6.field1453 = 0; // L: 7395
					class60.field418 = 0; // L: 7396
					class101.field1296 = 0; // L: 7397
					class440.field4711 = 0; // L: 7398
					class9.field37 = 0; // L: 7399
					field744 = null; // L: 7400
					field746 = null; // L: 7401
					field718 = null; // L: 7402

					for (var20 = 0; var20 < 5; ++var20) { // L: 7403
						field748[var20] = false; // L: 7404
					}

					var1.serverPacket = null; // L: 7406
					return true; // L: 7407
				}

				if (ServerPacket.field3299 == var1.serverPacket) { // L: 7409
					ClanChannel.method3322(class294.field3207); // L: 7410
					var1.serverPacket = null; // L: 7411
					return true; // L: 7412
				}

				if (ServerPacket.field3290 == var1.serverPacket) { // L: 7414
					tradeChatMode = var3.readUnsignedByte(); // L: 7415
					publicChatMode = var3.readUnsignedByte(); // L: 7416
					var1.serverPacket = null; // L: 7417
					return true; // L: 7418
				}

				if (ServerPacket.field3336 == var1.serverPacket) { // L: 7420
					int var18 = var3.readUnsignedByte(); // L: 7436
					var40 = var3.method9006(); // L: 7437
					var15 = var3.method9007(); // L: 7438
					int var17 = var3.method8998(); // L: 7439
					byte var58 = var3.method9090(); // L: 7440
					var6 = var3.method9012(); // L: 7441
					var20 = var6 >> 16; // L: 7442
					var5 = var6 >> 8 & 255; // L: 7443
					var7 = var20 + (var6 >> 4 & 7); // L: 7444
					var8 = var5 + (var6 & 7); // L: 7445
					byte var85 = var3.method8965(); // L: 7446
					var11 = var3.method9013(); // L: 7447
					var16 = var3.method9007(); // L: 7448
					var13 = var3.method8998() * 4; // L: 7449
					var42 = var3.method9050() * 4; // L: 7450
					var9 = var58 + var7; // L: 7451
					var24 = var85 + var8; // L: 7452
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var24 >= 0 && var9 < 104 && var24 < 104 && var40 != 65535) { // L: 7453
						var7 = var7 * 128 + 64; // L: 7454
						var8 = var8 * 128 + 64; // L: 7455
						var9 = var9 * 128 + 64; // L: 7456
						var24 = var24 * 128 + 64; // L: 7457
						Projectile var19 = new Projectile(var40, NetFileRequest.Client_plane, var7, var8, class208.getTileHeight(var7, var8, NetFileRequest.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var42); // L: 7458
						var19.setDestination(var9, var24, class208.getTileHeight(var9, var24, NetFileRequest.Client_plane) - var42, var15 + cycle); // L: 7459
						projectiles.addFirst(var19); // L: 7460
					}

					var1.serverPacket = null; // L: 7462
					return true; // L: 7463
				}

				if (ServerPacket.field3223 == var1.serverPacket) { // L: 7465
					var51 = var3.readStringCp1252NullTerminated(); // L: 7466
					var22 = AbstractFont.escapeBrackets(class251.method5039(SecureRandomFuture.method2113(var3))); // L: 7467
					HealthBarUpdate.addGameMessage(6, var51, var22); // L: 7468
					var1.serverPacket = null; // L: 7469
					return true; // L: 7470
				}

				if (ServerPacket.field3233 == var1.serverPacket) { // L: 7472
					class30.method434(var3.readStringCp1252NullTerminated()); // L: 7473
					var1.serverPacket = null; // L: 7474
					return true; // L: 7475
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 7477
					JagexCache.method3476(); // L: 7478
					var70 = var3.readByte(); // L: 7479
					if (var1.serverPacketLength == 1) { // L: 7480
						if (var70 >= 0) { // L: 7481
							currentClanSettings[var70] = null;
						} else {
							InterfaceParent.guestClanSettings = null; // L: 7482
						}

						var1.serverPacket = null; // L: 7483
						return true; // L: 7484
					}

					if (var70 >= 0) { // L: 7486
						currentClanSettings[var70] = new ClanSettings(var3); // L: 7487
					} else {
						InterfaceParent.guestClanSettings = new ClanSettings(var3); // L: 7490
					}

					var1.serverPacket = null; // L: 7492
					return true; // L: 7493
				}

				if (ServerPacket.field3331 == var1.serverPacket) { // L: 7495
					var20 = var3.method8967(); // L: 7496
					var72 = ArchiveDiskActionHandler.getWidget(var20); // L: 7497
					var72.modelType = 3; // L: 7498
					var72.modelId = HitSplatDefinition.localPlayer.appearance.getChatHeadId(); // L: 7499
					HorizontalAlignment.invalidateWidget(var72); // L: 7500
					var1.serverPacket = null; // L: 7501
					return true; // L: 7502
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 7504
					for (var20 = 0; var20 < players.length; ++var20) { // L: 7505
						if (players[var20] != null) { // L: 7506
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 7508
						if (npcs[var20] != null) { // L: 7509
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7511
					return true; // L: 7512
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 7514
					var20 = var3.method8967(); // L: 7515
					var5 = var3.method9020(); // L: 7516
					var21 = ArchiveDiskActionHandler.getWidget(var20); // L: 7517
					class323.method6096(var21, var5); // L: 7518
					HorizontalAlignment.invalidateWidget(var21); // L: 7519
					var1.serverPacket = null; // L: 7520
					return true; // L: 7521
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 7523
					var20 = var3.readInt(); // L: 7524
					if (var20 != field578) { // L: 7525
						field578 = var20; // L: 7526
						VarpDefinition.method3551(); // L: 7527
					}

					var1.serverPacket = null; // L: 7529
					return true; // L: 7530
				}

				if (ServerPacket.field3248 == var1.serverPacket) { // L: 7532
					var70 = var3.method8965(); // L: 7533
					var5 = var3.method9007(); // L: 7534
					Varps.Varps_temp[var5] = var70; // L: 7535
					if (Varps.Varps_main[var5] != var70) { // L: 7536
						Varps.Varps_main[var5] = var70; // L: 7537
					}

					class1.changeGameOptions(var5); // L: 7539
					field675[++field539 - 1 & 31] = var5; // L: 7540
					var1.serverPacket = null; // L: 7541
					return true; // L: 7542
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 7544
					var20 = var3.method9006(); // L: 7545
					if (var20 == 65535) { // L: 7546
						var20 = -1;
					}

					var5 = var3.readInt(); // L: 7547
					var6 = var3.method9018(); // L: 7548
					var7 = var3.readUnsignedShort(); // L: 7549
					if (var7 == 65535) { // L: 7550
						var7 = -1;
					}

					for (var8 = var7; var8 <= var20; ++var8) { // L: 7551
						var44 = ((long)var6 << 32) + (long)var8; // L: 7552
						Node var46 = widgetFlags.get(var44); // L: 7553
						if (var46 != null) { // L: 7554
							var46.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var44); // L: 7555
					}

					var1.serverPacket = null; // L: 7557
					return true; // L: 7558
				}

				if (ServerPacket.field3289 == var1.serverPacket) { // L: 7560
					var20 = var3.readUnsignedShort(); // L: 7561
					var5 = var3.method9005(); // L: 7562
					var6 = var3.method9020(); // L: 7563
					var23 = ArchiveDiskActionHandler.getWidget(var6); // L: 7564
					var23.field3665 = var20 + (var5 << 16); // L: 7565
					var1.serverPacket = null; // L: 7566
					return true; // L: 7567
				}

				boolean var54;
				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7569
					var20 = var3.readUShortSmart(); // L: 7570
					var54 = var3.readUnsignedByte() == 1; // L: 7571
					var73 = ""; // L: 7572
					boolean var55 = false; // L: 7573
					if (var54) { // L: 7574
						var73 = var3.readStringCp1252NullTerminated(); // L: 7575
						if (ReflectionCheck.friendSystem.isIgnored(new Username(var73, class31.loginType))) { // L: 7576
							var55 = true;
						}
					}

					String var25 = var3.readStringCp1252NullTerminated(); // L: 7578
					if (!var55) { // L: 7579
						HealthBarUpdate.addGameMessage(var20, var73, var25);
					}

					var1.serverPacket = null; // L: 7580
					return true; // L: 7581
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 7583
					var1.serverPacket = null; // L: 7584
					return true; // L: 7585
				}

				if (ServerPacket.field3242 == var1.serverPacket) { // L: 7587
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 7588
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) { // L: 7589
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 7590
							class1.changeGameOptions(var20); // L: 7591
							field675[++field539 - 1 & 31] = var20; // L: 7592
						}
					}

					var1.serverPacket = null; // L: 7595
					return true; // L: 7596
				}

				if (ServerPacket.field3228 == var1.serverPacket) { // L: 7598
					isCameraLocked = true; // L: 7599
					field732 = false; // L: 7600
					field572 = true; // L: 7601
					class328.field3585 = var3.readUnsignedByte() * 128; // L: 7602
					Varcs.field1371 = var3.readUnsignedByte() * 128; // L: 7603
					Canvas.field101 = var3.readUnsignedShort(); // L: 7604
					var20 = var3.readUnsignedShort(); // L: 7605
					var5 = var3.readUnsignedByte(); // L: 7606
					var6 = class328.field3585 * 16384 + 64; // L: 7607
					var7 = Varcs.field1371 * 16384 + 64; // L: 7608
					var8 = class208.getTileHeight(var6, var7, NetFileRequest.Client_plane) - Canvas.field101; // L: 7609
					var9 = var6 - class19.cameraX; // L: 7610
					var24 = var8 - DynamicObject.cameraY; // L: 7611
					var11 = var7 - BuddyRankComparator.cameraZ; // L: 7612
					double var12 = Math.sqrt((double)(var11 * var11 + var9 * var9)); // L: 7613
					var42 = DefaultsGroup.method8056((int)(Math.atan2((double)var24, var12) * 325.9490051269531D) & 2047); // L: 7614
					var15 = class405.method7613((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047); // L: 7615
					field746 = new class466(ObjectComposition.cameraPitch, var42, var20, var5); // L: 7616
					field718 = new class466(Coord.cameraYaw, var15, var20, var5); // L: 7617
					var1.serverPacket = null; // L: 7618
					return true; // L: 7619
				}

				if (ServerPacket.field3339 == var1.serverPacket) { // L: 7621
					var20 = var3.method9006(); // L: 7622
					var5 = var3.method9050(); // L: 7623
					if (var20 == 65535) { // L: 7624
						var20 = -1; // L: 7625
					}

					NameableContainer.performPlayerAnimation(HitSplatDefinition.localPlayer, var20, var5); // L: 7627
					var1.serverPacket = null; // L: 7628
					return true; // L: 7629
				}

				if (ServerPacket.field3338 == var1.serverPacket) { // L: 7631
					field687 = cycleCntr; // L: 7632
					var70 = var3.readByte(); // L: 7633
					class160 var71 = new class160(var3); // L: 7634
					ClanChannel var68;
					if (var70 >= 0) { // L: 7636
						var68 = currentClanChannels[var70];
					} else {
						var68 = UserComparator4.guestClanChannel; // L: 7637
					}

					var71.method3296(var68); // L: 7638
					var1.serverPacket = null; // L: 7639
					return true; // L: 7640
				}

				if (ServerPacket.field3265 == var1.serverPacket) { // L: 7642
					WorldMapLabelSize.privateChatMode = class406.method7619(var3.readUnsignedByte()); // L: 7643
					var1.serverPacket = null; // L: 7644
					return true; // L: 7645
				}

				if (ServerPacket.field3302 == var1.serverPacket) { // L: 7647
					var20 = var3.readInt(); // L: 7648
					var5 = var3.readUnsignedShort(); // L: 7649
					if (var20 < -70000) { // L: 7650
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7652
						var21 = ArchiveDiskActionHandler.getWidget(var20);
					} else {
						var21 = null; // L: 7653
					}

					if (var21 != null) { // L: 7654
						for (var7 = 0; var7 < var21.itemIds.length; ++var7) { // L: 7655
							var21.itemIds[var7] = 0; // L: 7656
							var21.field3740[var7] = 0; // L: 7657
						}
					}

					class330.clearItemContainer(var5); // L: 7660
					var7 = var3.readUnsignedShort(); // L: 7661

					for (var8 = 0; var8 < var7; ++var8) { // L: 7662
						var9 = var3.method8998(); // L: 7663
						if (var9 == 255) { // L: 7664
							var9 = var3.readInt();
						}

						var24 = var3.method9007(); // L: 7665
						if (var21 != null && var8 < var21.itemIds.length) { // L: 7666 7667
							var21.itemIds[var8] = var24; // L: 7668
							var21.field3740[var8] = var9; // L: 7669
						}

						ApproximateRouteStrategy.itemContainerSetItem(var5, var8, var24 - 1, var9); // L: 7672
					}

					if (var21 != null) { // L: 7674
						HorizontalAlignment.invalidateWidget(var21);
					}

					ItemLayer.method4225(); // L: 7675
					field677[++field678 - 1 & 31] = var5 & 32767; // L: 7676
					var1.serverPacket = null; // L: 7677
					return true; // L: 7678
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 7680
					hintArrowType = var3.readUnsignedByte(); // L: 7681
					if (hintArrowType == 1) { // L: 7682
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7683
						if (hintArrowType == 2) { // L: 7684
							field507 = 64; // L: 7685
							field508 = 4096; // L: 7686
						}

						if (hintArrowType == 3) { // L: 7688
							field507 = 0; // L: 7689
							field508 = 4096; // L: 7690
						}

						if (hintArrowType == 4) { // L: 7692
							field507 = 128; // L: 7693
							field508 = 4096; // L: 7694
						}

						if (hintArrowType == 5) { // L: 7696
							field507 = 64; // L: 7697
							field508 = 0; // L: 7698
						}

						if (hintArrowType == 6) { // L: 7700
							field507 = 64; // L: 7701
							field508 = 8192; // L: 7702
						}

						hintArrowType = 2; // L: 7704
						field504 = var3.readUnsignedShort(); // L: 7705
						field684 = var3.readUnsignedShort(); // L: 7706
						field506 = var3.readUnsignedByte() * 4; // L: 7707
					}

					if (hintArrowType == 10) { // L: 7709
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7710
					return true; // L: 7711
				}

				if (ServerPacket.field3285 == var1.serverPacket) { // L: 7713
					for (var20 = 0; var20 < class516.field5128; ++var20) { // L: 7714
						VarpDefinition var69 = class132.VarpDefinition_get(var20); // L: 7715
						if (var69 != null) { // L: 7716
							Varps.Varps_temp[var20] = 0; // L: 7717
							Varps.Varps_main[var20] = 0; // L: 7718
						}
					}

					ItemLayer.method4225(); // L: 7721
					field539 += 32; // L: 7722
					var1.serverPacket = null; // L: 7723
					return true; // L: 7724
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 7726
					var20 = var3.readUnsignedByte(); // L: 7727
					class138.method3075(var20); // L: 7728
					var1.serverPacket = null; // L: 7729
					return true; // L: 7730
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 7732
					InvDefinition.field1908 = var3.method8998(); // L: 7733
					class124.field1461 = var3.method9026(); // L: 7734
					var1.serverPacket = null; // L: 7735
					return true; // L: 7736
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 7738
					var20 = var3.method9009(); // L: 7739
					var5 = var3.method9018(); // L: 7740
					var6 = var3.readShort(); // L: 7741
					var23 = ArchiveDiskActionHandler.getWidget(var5); // L: 7742
					if (var20 != var23.rawX || var6 != var23.rawY || var23.xAlignment != 0 || var23.yAlignment != 0) { // L: 7743
						var23.rawX = var20; // L: 7744
						var23.rawY = var6; // L: 7745
						var23.xAlignment = 0; // L: 7746
						var23.yAlignment = 0; // L: 7747
						HorizontalAlignment.invalidateWidget(var23); // L: 7748
						this.alignWidget(var23); // L: 7749
						if (var23.type == 0) { // L: 7750
							class166.revalidateWidgetScroll(UserComparator6.Widget_interfaceComponents[var5 >> 16], var23, false);
						}
					}

					var1.serverPacket = null; // L: 7752
					return true; // L: 7753
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 7755
					ClanChannel.method3322(class294.field3212); // L: 7756
					var1.serverPacket = null; // L: 7757
					return true; // L: 7758
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 7760
					class213.updateNpcs(true, var3); // L: 7761
					var1.serverPacket = null; // L: 7762
					return true; // L: 7763
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 7765
					if (class300.field3364 == null) { // L: 7766
						class300.field3364 = new class442(ViewportMouse.Ignored_cached);
					}

					class509 var50 = ViewportMouse.Ignored_cached.method8262(var3); // L: 7767
					class300.field3364.field4721.vmethod8708(var50.field5081, var50.field5080); // L: 7768
					field747[++field682 - 1 & 31] = var50.field5081; // L: 7769
					var1.serverPacket = null; // L: 7770
					return true; // L: 7771
				}

				if (ServerPacket.field3277 == var1.serverPacket) { // L: 7773
					var20 = var3.readInt(); // L: 7774
					var54 = var3.method9026() == 1; // L: 7775
					var21 = ArchiveDiskActionHandler.getWidget(var20); // L: 7776
					if (var54 != var21.isHidden) { // L: 7777
						var21.isHidden = var54; // L: 7778
						HorizontalAlignment.invalidateWidget(var21); // L: 7779
					}

					var1.serverPacket = null; // L: 7781
					return true; // L: 7782
				}

				if (ServerPacket.field3316 == var1.serverPacket) { // L: 7784
					ClanChannel.method3322(class294.field3203); // L: 7785
					var1.serverPacket = null; // L: 7786
					return true; // L: 7787
				}

				if (ServerPacket.field3305 == var1.serverPacket) { // L: 7789
					isCameraLocked = true; // L: 7790
					field732 = false; // L: 7791
					field572 = false; // L: 7792
					class328.field3585 = var3.readUnsignedByte() * 128; // L: 7793
					Varcs.field1371 = var3.readUnsignedByte() * 128; // L: 7794
					Canvas.field101 = var3.readUnsignedShort(); // L: 7795
					class141.field1619 = var3.readUnsignedByte(); // L: 7796
					class280.field3075 = var3.readUnsignedByte(); // L: 7797
					if (class280.field3075 >= 100) { // L: 7798
						var20 = class328.field3585 * 16384 + 64; // L: 7799
						var5 = Varcs.field1371 * 16384 + 64; // L: 7800
						var6 = class208.getTileHeight(var20, var5, NetFileRequest.Client_plane) - Canvas.field101; // L: 7801
						var7 = var20 - class19.cameraX; // L: 7802
						var8 = var6 - DynamicObject.cameraY; // L: 7803
						var9 = var5 - BuddyRankComparator.cameraZ; // L: 7804
						var24 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7)); // L: 7805
						ObjectComposition.cameraPitch = (int)(Math.atan2((double)var8, (double)var24) * 325.9490051269531D) & 2047; // L: 7806
						Coord.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 7807
						if (ObjectComposition.cameraPitch < 128) { // L: 7808
							ObjectComposition.cameraPitch = 128;
						}

						if (ObjectComposition.cameraPitch > 383) { // L: 7809
							ObjectComposition.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7811
					return true; // L: 7812
				}

				if (ServerPacket.field3273 == var1.serverPacket) { // L: 7814
					var9 = var3.readUnsignedByte(); // L: 7825
					var24 = var9 >> 2; // L: 7826
					var11 = var9 & 3; // L: 7827
					var40 = field717[var24]; // L: 7828
					var13 = var3.method9005(); // L: 7829
					var6 = var3.method9011(); // L: 7830
					var20 = var6 >> 16; // L: 7831
					var5 = var6 >> 8 & 255; // L: 7832
					var7 = var20 + (var6 >> 4 & 7); // L: 7833
					var8 = var5 + (var6 & 7); // L: 7834
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 7835
						if (var40 == 0) { // L: 7836
							WallObject var66 = UserComparator4.scene.method4540(NetFileRequest.Client_plane, var7, var8); // L: 7837
							if (var66 != null) { // L: 7838
								var15 = class299.Entity_unpackID(var66.tag); // L: 7839
								if (var24 == 2) { // L: 7840
									var66.renderable1 = new DynamicObject(var15, 2, var11 + 4, NetFileRequest.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 7841
									var66.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, NetFileRequest.Client_plane, var7, var8, var13, false, var66.renderable2); // L: 7842
								} else {
									var66.renderable1 = new DynamicObject(var15, var24, var11, NetFileRequest.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 7844
								}
							}
						} else if (var40 == 1) { // L: 7847
							DecorativeObject var64 = UserComparator4.scene.method4603(NetFileRequest.Client_plane, var7, var8); // L: 7848
							if (var64 != null) { // L: 7849
								var15 = class299.Entity_unpackID(var64.tag); // L: 7850
								if (var24 != 4 && var24 != 5) { // L: 7851
									if (var24 == 6) { // L: 7854
										var64.renderable1 = new DynamicObject(var15, 4, var11 + 4, NetFileRequest.Client_plane, var7, var8, var13, false, var64.renderable1); // L: 7855
									} else if (var24 == 7) { // L: 7857
										var64.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, NetFileRequest.Client_plane, var7, var8, var13, false, var64.renderable1); // L: 7858
									} else if (var24 == 8) { // L: 7860
										var64.renderable1 = new DynamicObject(var15, 4, var11 + 4, NetFileRequest.Client_plane, var7, var8, var13, false, var64.renderable1); // L: 7861
										var64.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, NetFileRequest.Client_plane, var7, var8, var13, false, var64.renderable2); // L: 7862
									}
								} else {
									var64.renderable1 = new DynamicObject(var15, 4, var11, NetFileRequest.Client_plane, var7, var8, var13, false, var64.renderable1); // L: 7852
								}
							}
						} else if (var40 == 2) { // L: 7866
							var14 = UserComparator4.scene.getGameObject(NetFileRequest.Client_plane, var7, var8); // L: 7867
							if (var24 == 11) { // L: 7868
								var24 = 10; // L: 7869
							}

							if (var14 != null) { // L: 7871
								var14.renderable = new DynamicObject(class299.Entity_unpackID(var14.tag), var24, var11, NetFileRequest.Client_plane, var7, var8, var13, false, var14.renderable); // L: 7872
							}
						} else if (var40 == 3) { // L: 7875
							GroundObject var62 = UserComparator4.scene.getGroundObject(NetFileRequest.Client_plane, var7, var8); // L: 7876
							if (var62 != null) { // L: 7877
								var62.renderable = new DynamicObject(class299.Entity_unpackID(var62.tag), 22, var11, NetFileRequest.Client_plane, var7, var8, var13, false, var62.renderable); // L: 7878
							}
						}
					}

					var1.serverPacket = null; // L: 7882
					return true; // L: 7883
				}

				if (ServerPacket.field3258 == var1.serverPacket) { // L: 7885
					ClanChannel.method3322(class294.field3210); // L: 7886
					var1.serverPacket = null; // L: 7887
					return true; // L: 7888
				}

				if (ServerPacket.field3255 == var1.serverPacket) { // L: 7890
					ItemLayer.method4225(); // L: 7891
					var20 = var3.method9050(); // L: 7892
					var5 = var3.method9018(); // L: 7893
					var6 = var3.method9026(); // L: 7894
					experience[var20] = var5; // L: 7895
					currentLevels[var20] = var6; // L: 7896
					levels[var20] = 1; // L: 7897

					for (var7 = 0; var7 < 98; ++var7) { // L: 7898
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var20] = var7 + 2;
						}
					}

					field691[++field680 - 1 & 31] = var20; // L: 7899
					var1.serverPacket = null; // L: 7900
					return true; // L: 7901
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 7903
					World var49 = new World(); // L: 7904
					var49.host = var3.readStringCp1252NullTerminated(); // L: 7905
					var49.id = var3.readUnsignedShort(); // L: 7906
					var5 = var3.readInt(); // L: 7907
					var49.properties = var5; // L: 7908
					class47.method867(45); // L: 7909
					var2.close(); // L: 7910
					var2 = null; // L: 7911
					class14.changeWorld(var49); // L: 7912
					var1.serverPacket = null; // L: 7913
					return false; // L: 7914
				}

				LoginPacket.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1381 != null ? var1.field1381.id : -1) + "," + (var1.field1394 != null ? var1.field1394.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7916
				class105.logOut(); // L: 7917
			} catch (IOException var47) { // L: 7919
				class492.method8853(); // L: 7920
			} catch (Exception var48) {
				var22 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1381 != null ? var1.field1381.id : -1) + "," + (var1.field1394 != null ? var1.field1394.id : -1) + "," + var1.serverPacketLength + "," + (HitSplatDefinition.localPlayer.pathX[0] + class147.baseX * 64) + "," + (HitSplatDefinition.localPlayer.pathY[0] + ModeWhere.baseY * 64) + ","; // L: 7923

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7924
					var22 = var22 + var3.array[var6] + ",";
				}

				LoginPacket.RunException_sendStackTrace(var22, var48); // L: 7925
				class105.logOut(); // L: 7926
			}

			return true; // L: 7928
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1841847223"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 8940

		int var2;
		int var5;
		while (!var1) { // L: 8941
			var1 = true; // L: 8942

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 8943
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 8944
					String var10 = menuTargets[var2]; // L: 8945
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 8946
					menuTargets[var2 + 1] = var10; // L: 8947
					String var11 = menuActions[var2]; // L: 8948
					menuActions[var2] = menuActions[var2 + 1]; // L: 8949
					menuActions[var2 + 1] = var11; // L: 8950
					var5 = menuOpcodes[var2]; // L: 8951
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 8952
					menuOpcodes[var2 + 1] = var5; // L: 8953
					var5 = menuArguments1[var2]; // L: 8954
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 8955
					menuArguments1[var2 + 1] = var5; // L: 8956
					var5 = menuArguments2[var2]; // L: 8957
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 8958
					menuArguments2[var2 + 1] = var5; // L: 8959
					var5 = menuIdentifiers[var2]; // L: 8960
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 8961
					menuIdentifiers[var2 + 1] = var5; // L: 8962
					var5 = field632[var2]; // L: 8963
					field632[var2] = field632[var2 + 1]; // L: 8964
					field632[var2 + 1] = var5; // L: 8965
					boolean var6 = menuShiftClick[var2]; // L: 8966
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 8967
					menuShiftClick[var2 + 1] = var6; // L: 8968
					var1 = false; // L: 8969
				}
			}
		}

		if (clickedWidget == null) { // L: 8974
			int var12 = MouseHandler.MouseHandler_lastButton; // L: 8975
			if (isMenuOpen) { // L: 8976
				int var3;
				if (var12 != 1 && (mouseCam || var12 != 4)) { // L: 8977
					var2 = MouseHandler.MouseHandler_x; // L: 8978
					var3 = MouseHandler.MouseHandler_y; // L: 8979
					if (var2 < class218.menuX - 10 || var2 > Actor.menuWidth + class218.menuX + 10 || var3 < UrlRequester.menuY - 10 || var3 > SceneTilePaint.menuHeight + UrlRequester.menuY + 10) { // L: 8980
						isMenuOpen = false; // L: 8981
						class11.method108(class218.menuX, UrlRequester.menuY, Actor.menuWidth, SceneTilePaint.menuHeight); // L: 8982
					}
				}

				if (var12 == 1 || !mouseCam && var12 == 4) { // L: 8985
					var2 = class218.menuX; // L: 8986
					var3 = UrlRequester.menuY; // L: 8987
					int var4 = Actor.menuWidth; // L: 8988
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8989
					int var13 = MouseHandler.MouseHandler_lastPressedY; // L: 8990
					int var7 = -1; // L: 8991

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 8992
						int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 8993
						if (var5 > var2 && var5 < var4 + var2 && var13 > var9 - 13 && var13 < var9 + 3) { // L: 8994
							var7 = var8;
						}
					}

					if (var7 != -1) { // L: 8996
						UserComparator7.method2853(var7);
					}

					isMenuOpen = false; // L: 8997
					class11.method108(class218.menuX, UrlRequester.menuY, Actor.menuWidth, SceneTilePaint.menuHeight); // L: 8998
				}
			} else {
				var2 = FontName.method8640(); // L: 9002
				if ((var12 == 1 || !mouseCam && var12 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9003 9004
					var12 = 2; // L: 9005
				}

				if ((var12 == 1 || !mouseCam && var12 == 4) && menuOptionsCount > 0) { // L: 9008
					UserComparator7.method2853(var2); // L: 9009
				}

				if (var12 == 2 && menuOptionsCount > 0) { // L: 9011
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9013

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "741754347"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = FontName.method8640(); // L: 9016
		return (field532 && menuOptionsCount > 2 || class309.method5996(var1)) && !menuShiftClick[var1]; // L: 9017
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class126.fontBold12.stringWidth("Choose Option"); // L: 9022

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 9023
			var5 = class126.fontBold12.stringWidth(WorldMapIcon_0.method5398(var4)); // L: 9024
			if (var5 > var3) { // L: 9025
				var3 = var5;
			}
		}

		var3 += 8; // L: 9027
		var4 = menuOptionsCount * 15 + 22; // L: 9028
		var5 = var1 - var3 / 2; // L: 9029
		if (var5 + var3 > class10.canvasWidth) { // L: 9030
			var5 = class10.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 9031
			var5 = 0;
		}

		int var6 = var2; // L: 9032
		if (var4 + var2 > class11.canvasHeight) { // L: 9033
			var6 = class11.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 9034
			var6 = 0;
		}

		class218.menuX = var5; // L: 9035
		UrlRequester.menuY = var6; // L: 9036
		Actor.menuWidth = var3; // L: 9037
		SceneTilePaint.menuHeight = menuOptionsCount * 15 + 22; // L: 9038
		var1 -= viewportOffsetX; // L: 9040
		var2 -= viewportOffsetY; // L: 9041
		UserComparator4.scene.menuOpen(NetFileRequest.Client_plane, var1, var2, false); // L: 9042
		isMenuOpen = true; // L: 9043
	} // L: 9044

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-120347882"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10789
		int var3 = class10.canvasWidth; // L: 10790
		int var4 = class11.canvasHeight; // L: 10791
		if (WorldMapAreaData.loadInterface(var2)) { // L: 10793
			UserComparator6.resizeInterface(UserComparator6.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10794
		}

	} // L: 10796

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lmo;B)V",
		garbageValue = "57"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : ArchiveDiskActionHandler.getWidget(var1.parentId); // L: 10799
		int var3;
		int var4;
		if (var2 == null) { // L: 10802
			var3 = class10.canvasWidth; // L: 10803
			var4 = class11.canvasHeight; // L: 10804
		} else {
			var3 = var2.width; // L: 10807
			var4 = var2.height; // L: 10808
		}

		class30.alignWidgetSize(var1, var3, var4, false); // L: 10810
		LoginScreenAnimation.alignWidgetPosition(var1, var3, var4); // L: 10811
	} // L: 10812

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "404702388"
	)
	final void method1242() {
		HorizontalAlignment.invalidateWidget(clickedWidget); // L: 11778
		++class302.widgetDragDuration; // L: 11779
		if (field749 && field667) { // L: 11780
			int var1 = MouseHandler.MouseHandler_x; // L: 11789
			int var2 = MouseHandler.MouseHandler_y; // L: 11790
			var1 -= widgetClickX; // L: 11791
			var2 -= widgetClickY; // L: 11792
			if (var1 < field668) { // L: 11793
				var1 = field668;
			}

			if (var1 + clickedWidget.width > field668 + clickedWidgetParent.width) { // L: 11794
				var1 = field668 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field670) { // L: 11795
				var2 = field670;
			}

			if (var2 + clickedWidget.height > field670 + clickedWidgetParent.height) { // L: 11796
				var2 = field670 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field767; // L: 11797
			int var4 = var2 - field672; // L: 11798
			int var5 = clickedWidget.dragZoneSize; // L: 11799
			if (class302.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11800 11801
				isDraggingWidget = true; // L: 11802
			}

			int var6 = var1 - field668 + clickedWidgetParent.scrollX; // L: 11805
			int var7 = var2 - field670 + clickedWidgetParent.scrollY; // L: 11806
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11807
				var8 = new ScriptEvent(); // L: 11808
				var8.widget = clickedWidget; // L: 11809
				var8.mouseX = var6; // L: 11810
				var8.mouseY = var7; // L: 11811
				var8.args = clickedWidget.onDrag; // L: 11812
				class260.runScriptEvent(var8); // L: 11813
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11815
				if (isDraggingWidget) { // L: 11816
					if (clickedWidget.onDragComplete != null) { // L: 11817
						var8 = new ScriptEvent(); // L: 11818
						var8.widget = clickedWidget; // L: 11819
						var8.mouseX = var6; // L: 11820
						var8.mouseY = var7; // L: 11821
						var8.dragTarget = draggedOnWidget; // L: 11822
						var8.args = clickedWidget.onDragComplete; // L: 11823
						class260.runScriptEvent(var8); // L: 11824
					}

					if (draggedOnWidget != null) { // L: 11826
						Widget var9 = clickedWidget; // L: 11828
						int var10 = class454.method8347(class209.getWidgetFlags(var9)); // L: 11830
						Widget var13;
						if (var10 == 0) { // L: 11831
							var13 = null; // L: 11832
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9; // L: 11842
									break;
								}

								var9 = ArchiveDiskActionHandler.getWidget(var9.parentId); // L: 11836
								if (var9 == null) { // L: 11837
									var13 = null; // L: 11838
									break; // L: 11839
								}

								++var11; // L: 11835
							}
						}

						if (var13 != null) { // L: 11844
							PacketBufferNode var12 = class251.getPacketBufferNode(ClientPacket.field3129, packetWriter.isaacCipher); // L: 11846
							var12.packetBuffer.method9139(clickedWidget.itemId); // L: 11847
							var12.packetBuffer.method9139(draggedOnWidget.childIndex); // L: 11848
							var12.packetBuffer.writeIntME(draggedOnWidget.id); // L: 11849
							var12.packetBuffer.method9016(clickedWidget.id); // L: 11850
							var12.packetBuffer.method9004(clickedWidget.childIndex); // L: 11851
							var12.packetBuffer.method9002(draggedOnWidget.itemId); // L: 11852
							packetWriter.addNode(var12); // L: 11853
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11858
					this.openMenu(field767 + widgetClickX, field672 + widgetClickY); // L: 11859
				} else if (menuOptionsCount > 0) { // L: 11861
					class30.method430(widgetClickX + field767, widgetClickY + field672); // L: 11862
				}

				clickedWidget = null; // L: 11865
			}

		} else {
			if (class302.widgetDragDuration > 1) { // L: 11781
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11782
					class30.method430(field767 + widgetClickX, widgetClickY + field672); // L: 11783
				}

				clickedWidget = null; // L: 11785
			}

		}
	} // L: 11787 11867

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(B)Luy;",
		garbageValue = "-8"
	)
	@Export("username")
	public Username username() {
		return HitSplatDefinition.localPlayer != null ? HitSplatDefinition.localPlayer.username : null; // L: 12560
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 742
				int var4;
				int var11;
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 743
					String var2 = this.getParameter(Integer.toString(var1)); // L: 744
					if (var2 != null) { // L: 745
						switch(var1) { // L: 746
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 812
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 813
							}
							break;
						case 4:
							if (clientType == -1) { // L: 835
								clientType = Integer.parseInt(var2); // L: 836
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 791
							break; // L: 792
						case 6:
							class124.clientLanguage = Language.method6931(Integer.parseInt(var2)); // L: 847
							break; // L: 848
						case 7:
							var4 = Integer.parseInt(var2); // L: 755
							GameBuild[] var5 = new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.WIP, GameBuild.RC}; // L: 760
							GameBuild[] var6 = var5; // L: 762
							int var7 = 0;

							GameBuild var24;
							while (true) {
								if (var7 >= var6.length) {
									var24 = null; // L: 773
									break;
								}

								GameBuild var8 = var6[var7]; // L: 764
								if (var4 == var8.buildId) { // L: 766
									var24 = var8; // L: 767
									break; // L: 768
								}

								++var7; // L: 763
							}

							FontName.field4894 = var24; // L: 775
							break; // L: 776
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 780
							}
							break;
						case 9:
							class406.field4553 = var2; // L: 786
							break; // L: 787
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.oldscape, StudioGame.game4, StudioGame.game3, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5}; // L: 803
							class332.field3772 = (StudioGame)class217.findEnumerated(var3, Integer.parseInt(var2)); // L: 805
							if (StudioGame.oldscape == class332.field3772) { // L: 806
								class31.loginType = LoginType.oldscape;
							} else {
								class31.loginType = LoginType.field4937; // L: 807
							}
							break;
						case 11:
							class193.field2002 = var2; // L: 842
							break; // L: 843
						case 12:
							worldId = Integer.parseInt(var2); // L: 857
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 22:
						case 23:
						case 24:
						default:
							break;
						case 14:
							ClanChannelMember.field1637 = Integer.parseInt(var2); // L: 818
							break; // L: 819
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 749
							break; // L: 750
						case 17:
							class27.field127 = var2; // L: 796
							break; // L: 797
						case 21:
							field485 = Integer.parseInt(var2); // L: 852
							break; // L: 853
						case 25:
							var11 = var2.indexOf("."); // L: 823
							if (var11 == -1) { // L: 824
								field657 = Integer.parseInt(var2); // L: 825
							} else {
								field657 = Integer.parseInt(var2.substring(0, var11)); // L: 828
								Integer.parseInt(var2.substring(var11 + 1)); // L: 829
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 864
				isLowDetail = false; // L: 865
				WorldMapData_1.worldHost = this.getCodeBase().getHost(); // L: 867
				String var12 = FontName.field4894.name; // L: 868
				byte var13 = 0; // L: 869

				try {
					class74.idxCount = 22; // L: 872
					UserComparator6.cacheGamebuild = var13; // L: 873

					try {
						JagexCache.operatingSystemName = System.getProperty("os.name"); // L: 875
					} catch (Exception var21) { // L: 877
						JagexCache.operatingSystemName = "Unknown"; // L: 878
					}

					VarbitComposition.formattedOperatingSystemName = JagexCache.operatingSystemName.toLowerCase(); // L: 880

					try {
						class133.userHomeDirectory = System.getProperty("user.home"); // L: 882
						if (class133.userHomeDirectory != null) { // L: 883
							class133.userHomeDirectory = class133.userHomeDirectory + "/";
						}
					} catch (Exception var20) { // L: 885
					}

					try {
						if (VarbitComposition.formattedOperatingSystemName.startsWith("win")) { // L: 887
							if (class133.userHomeDirectory == null) { // L: 888
								class133.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (class133.userHomeDirectory == null) { // L: 891
							class133.userHomeDirectory = System.getenv("HOME");
						}

						if (class133.userHomeDirectory != null) { // L: 893
							class133.userHomeDirectory = class133.userHomeDirectory + "/";
						}
					} catch (Exception var19) { // L: 895
					}

					if (class133.userHomeDirectory == null) { // L: 896
						class133.userHomeDirectory = "~/";
					}

					class166.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class133.userHomeDirectory, "/tmp/", ""}; // L: 897
					class501.cacheSubPaths = new String[]{".jagex_cache_" + UserComparator6.cacheGamebuild, ".file_store_" + UserComparator6.cacheGamebuild}; // L: 898

					label167:
					for (var11 = 0; var11 < 4; ++var11) { // L: 899
						class135.cacheDir = UserComparator7.method2856("oldschool", var12, var11); // L: 900
						if (!class135.cacheDir.exists()) { // L: 901
							class135.cacheDir.mkdirs();
						}

						File[] var14 = class135.cacheDir.listFiles(); // L: 902
						if (var14 == null) { // L: 903
							break;
						}

						File[] var27 = var14; // L: 905
						int var15 = 0;

						while (true) {
							if (var15 >= var27.length) {
								break label167;
							}

							File var16 = var27[var15]; // L: 907

							boolean var17;
							try {
								RandomAccessFile var9 = new RandomAccessFile(var16, "rw"); // L: 912
								int var10 = var9.read(); // L: 913
								var9.seek(0L); // L: 914
								var9.write(var10); // L: 915
								var9.seek(0L); // L: 916
								var9.close(); // L: 917
								var17 = true; // L: 919
							} catch (Exception var18) { // L: 921
								var17 = false; // L: 922
							}

							if (!var17) { // L: 925
								break;
							}

							++var15; // L: 906
						}
					}

					File var25 = class135.cacheDir; // L: 932
					FileSystem.FileSystem_cacheDir = var25; // L: 934
					if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 935
						throw new RuntimeException("");
					}

					FileSystem.FileSystem_hasPermissions = true; // L: 936
					class166.method3342(); // L: 938
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(VarpDefinition.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 939
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(VarpDefinition.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 940
					JagexCache.JagexCache_idxFiles = new BufferedFile[class74.idxCount]; // L: 941

					for (var4 = 0; var4 < class74.idxCount; ++var4) { // L: 942
						JagexCache.JagexCache_idxFiles[var4] = new BufferedFile(new AccessFile(VarpDefinition.getFile("main_file_cache.idx" + var4), "rw", 1048576L), 6000, 0); // L: 943
					}
				} catch (Exception var22) { // L: 947
					LoginPacket.RunException_sendStackTrace((String)null, var22); // L: 948
				}

				class439.client = this; // L: 950
				class324.clientType = clientType; // L: 951
				class147.field1648 = System.getenv("JX_ACCESS_TOKEN"); // L: 953
				class4.field6 = System.getenv("JX_REFRESH_TOKEN"); // L: 954
				HealthBarDefinition.field1970 = System.getenv("JX_SESSION_ID"); // L: 955
				class481.field4945 = System.getenv("JX_CHARACTER_ID"); // L: 956
				String var26 = System.getenv("JX_DISPLAY_NAME"); // L: 957
				String var28;
				if (var26 != null && !var26.isEmpty() && var26.charAt(0) != '#') { // L: 961
					var28 = var26; // L: 965
				} else {
					var28 = ""; // L: 962
				}

				Login.field913 = var28; // L: 967
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 970
					this.field528 = true; // L: 971
				}

				if (field487 == -1) { // L: 973
					if (!this.method1215() && !this.method1216()) { // L: 974
						field487 = 0; // L: 978
					} else {
						field487 = 5; // L: 975
					}
				}

				this.startThread(765, 503, 214, 1); // L: 981
			}
		} catch (RuntimeException var23) {
			throw class367.newRunException(var23, "client.init(" + ')');
		}
	} // L: 982

	protected void finalize() throws Throwable {
		SoundCache.method862(this); // L: 986
		super.finalize(); // L: 987
	} // L: 988

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 993
			this.field526 = var1; // L: 996
			class14.method171(10); // L: 997
		}
	} // L: 994 998

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 1003
			this.field530 = var1; // L: 1006
		}
	} // L: 1004 1007

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 1012
	}

	public long getAccountHash() {
		return this.accountHash; // L: 1017
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Ldk;III)V",
		garbageValue = "-1139989932"
	)
	static void method1688(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 124
		class336.Interpreter_intStackSize = 0; // L: 125
		class156.Interpreter_stringStackSize = 0; // L: 126
		int var5 = -1; // L: 127
		int[] var6 = var1.opcodes; // L: 128
		int[] var7 = var1.intOperands; // L: 129
		byte var8 = -1; // L: 130
		Interpreter.Interpreter_frameDepth = 0; // L: 131
		Interpreter.field835 = false; // L: 132
		boolean var9 = false; // L: 133
		int var10 = 0; // L: 134
		boolean var29 = false;

		label937: {
			label938: {
				try {
					int var13;
					try {
						var29 = true; // L: 136
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount]; // L: 137
						int var11 = 0; // L: 138
						class396.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 139
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) { // L: 140
							if (var4[var13] instanceof Integer) { // L: 141
								var14 = (Integer)var4[var13]; // L: 142
								if (var14 == -2147483647) { // L: 143
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) { // L: 144
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) { // L: 145
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) { // L: 146
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) { // L: 147
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) { // L: 148
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) { // L: 149
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) { // L: 150
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) { // L: 151
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14; // L: 152
							} else if (var4[var13] instanceof String) { // L: 154
								var20 = (String)var4[var13]; // L: 155
								if (var20.equals("event_opbase")) { // L: 156
									var20 = var0.targetName;
								}

								class396.Interpreter_stringLocals[var12++] = var20; // L: 157
							}
						}

						Interpreter.field845 = var0.field1052; // L: 161

						while (true) {
							++var10; // L: 163
							if (var10 > var2) { // L: 164
								throw new RuntimeException();
							}

							++var5; // L: 165
							int var32 = var6[var5];
							if (var32 >= 100) { // L: 166
								boolean var34;
								if (var1.intOperands[var5] == 1) { // L: 384
									var34 = true;
								} else {
									var34 = false; // L: 385
								}

								var14 = FileSystem.method3485(var32, var1, var34); // L: 386
								switch(var14) { // L: 387
								case 0:
									var29 = false;
									break label937;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 392
								}
							} else if (var32 == 0) { // L: 167
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7[var5]; // L: 168
							} else if (var32 == 1) { // L: 171
								var13 = var7[var5]; // L: 172
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 173
							} else if (var32 == 2) { // L: 176
								var13 = var7[var5]; // L: 177
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 178
								class1.changeGameOptions(var13); // L: 179
							} else if (var32 == 3) { // L: 182
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 183
							} else if (var32 == 6) { // L: 186
								var5 += var7[var5]; // L: 187
							} else if (var32 == 7) { // L: 190
								class336.Interpreter_intStackSize -= 2; // L: 191
								if (Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]) { // L: 192
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 195
								class336.Interpreter_intStackSize -= 2; // L: 196
								if (Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]) { // L: 197
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 200
								class336.Interpreter_intStackSize -= 2; // L: 201
								if (Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]) { // L: 202
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 205
								class336.Interpreter_intStackSize -= 2; // L: 206
								if (Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]) { // L: 207
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 210
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 212
								var1 = var39.script; // L: 213
								var6 = var1.opcodes; // L: 214
								var7 = var1.intOperands; // L: 215
								var5 = var39.pc; // L: 216
								Interpreter.Interpreter_intLocals = var39.intLocals; // L: 217
								class396.Interpreter_stringLocals = var39.stringLocals; // L: 218
							} else if (var32 == 25) { // L: 221
								var13 = var7[var5]; // L: 222
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class327.getVarbit(var13); // L: 223
							} else if (var32 == 27) { // L: 226
								var13 = var7[var5]; // L: 227
								Occluder.method4694(var13, Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 228
							} else if (var32 == 31) { // L: 231
								class336.Interpreter_intStackSize -= 2; // L: 232
								if (Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]) { // L: 233
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 236
								class336.Interpreter_intStackSize -= 2; // L: 237
								if (Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]) { // L: 238
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 241
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]]; // L: 242
							} else if (var32 == 34) { // L: 245
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 246
							} else if (var32 == 35) { // L: 249
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = class396.Interpreter_stringLocals[var7[var5]]; // L: 250
							} else if (var32 == 36) { // L: 253
								class396.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 254
							} else if (var32 == 37) { // L: 257
								var13 = var7[var5]; // L: 258
								class156.Interpreter_stringStackSize -= var13; // L: 259
								var20 = UserComparator8.method2845(Interpreter.Interpreter_stringStack, class156.Interpreter_stringStackSize, var13); // L: 260
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var20; // L: 261
							} else if (var32 == 38) { // L: 264
								--class336.Interpreter_intStackSize; // L: 265
							} else if (var32 == 39) { // L: 268
								--class156.Interpreter_stringStackSize; // L: 269
							} else {
								int var17;
								if (var32 != 40) { // L: 272
									if (var32 == 42) { // L: 295
										Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Players.varcs.getInt(var7[var5]); // L: 296
									} else if (var32 == 43) { // L: 299
										Players.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 300
									} else if (var32 == 44) { // L: 303
										var13 = var7[var5] >> 16; // L: 304
										var14 = var7[var5] & 65535; // L: 305
										int var23 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 306
										if (var23 < 0 || var23 > 5000) { // L: 307
											throw new RuntimeException(); // L: 308
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 310
										byte var24 = -1; // L: 311
										if (var14 == 105) { // L: 312
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) { // L: 313
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) { // L: 316
										var13 = var7[var5]; // L: 317
										var14 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 318
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 319
											throw new RuntimeException(); // L: 320
										}

										Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 322
									} else if (var32 == 46) { // L: 325
										var13 = var7[var5]; // L: 326
										class336.Interpreter_intStackSize -= 2; // L: 327
										var14 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 328
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 329
											throw new RuntimeException(); // L: 330
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 332
									} else {
										String var21;
										if (var32 == 47) { // L: 335
											var21 = Players.varcs.getStringOld(var7[var5]); // L: 336
											if (var21 == null) { // L: 337
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var21; // L: 338
										} else if (var32 == 48) { // L: 341
											Players.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]); // L: 342
										} else if (var32 == 49) { // L: 345
											var21 = Players.varcs.getString(var7[var5]); // L: 346
											Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var21; // L: 347
										} else if (var32 == 50) { // L: 350
											Players.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]); // L: 351
										} else if (var32 == 60) { // L: 354
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 355
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 356
											if (var36 != null) { // L: 357
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 360
												var38 = class409.field4563.getTitleGroupValue(var7[var5]); // L: 361
												if (var38 == null) { // L: 362
													Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 363
												} else {
													Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var38; // L: 366
												}
											} else {
												if (var32 != 76) { // L: 370
													throw new IllegalStateException(); // L: 380
												}

												var38 = class300.field3364.method8255(var7[var5]); // L: 371
												if (var38 == null) { // L: 372
													Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 373
												} else {
													Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var38; // L: 376
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 273
									Script var35 = class193.getScript(var13); // L: 274
									int[] var15 = new int[var35.localIntCount]; // L: 275
									String[] var16 = new String[var35.localStringCount]; // L: 276

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 277
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (class336.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 278
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class156.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									class336.Interpreter_intStackSize -= var35.intArgumentCount; // L: 279
									class156.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 280
									ScriptFrame var22 = new ScriptFrame(); // L: 281
									var22.script = var1; // L: 282
									var22.pc = var5; // L: 283
									var22.intLocals = Interpreter.Interpreter_intLocals; // L: 284
									var22.stringLocals = class396.Interpreter_stringLocals; // L: 285
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 286
									var1 = var35; // L: 287
									var6 = var35.opcodes; // L: 288
									var7 = var35.intOperands; // L: 289
									var5 = -1; // L: 290
									Interpreter.Interpreter_intLocals = var15; // L: 291
									class396.Interpreter_stringLocals = var16; // L: 292
								}
							}
						}
					} catch (Exception var30) { // L: 400
						var9 = true; // L: 401
						StringBuilder var26 = new StringBuilder(30); // L: 403
						var26.append("").append(var1.key).append(" "); // L: 404

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 405
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8); // L: 406
						LoginPacket.RunException_sendStackTrace(var26.toString(), var30); // L: 407
						var29 = false;
						break label938;
					}
				} finally {
					if (var29) {
						while (Interpreter.field844.size() > 0) {
							class101 var19 = (class101)Interpreter.field844.remove(0); // L: 412
							class90.widgetDefaultMenuAction(var19.method2621(), var19.method2622(), var19.method2635(), var19.method2623(), "");
						}

						if (Interpreter.field835) { // L: 415
							Interpreter.field835 = false; // L: 416
							class30.method432(); // L: 417
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							LoginPacket.RunException_sendStackTrace("Warning: Script " + var1.field958 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field844.size() > 0) {
					class101 var40 = (class101)Interpreter.field844.remove(0);
					class90.widgetDefaultMenuAction(var40.method2621(), var40.method2622(), var40.method2635(), var40.method2623(), "");
				}

				if (Interpreter.field835) {
					Interpreter.field835 = false;
					class30.method432();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					LoginPacket.RunException_sendStackTrace("Warning: Script " + var1.field958 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return; // L: 211
			}

			while (Interpreter.field844.size() > 0) { // L: 411
				class101 var25 = (class101)Interpreter.field844.remove(0);
				class90.widgetDefaultMenuAction(var25.method2621(), var25.method2622(), var25.method2635(), var25.method2623(), "");
			}

			if (Interpreter.field835) {
				Interpreter.field835 = false;
				class30.method432();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				LoginPacket.RunException_sendStackTrace("Warning: Script " + var1.field958 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 423
		}

		while (Interpreter.field844.size() > 0) {
			class101 var33 = (class101)Interpreter.field844.remove(0);
			class90.widgetDefaultMenuAction(var33.method2621(), var33.method2622(), var33.method2635(), var33.method2623(), ""); // L: 413
		}

		if (Interpreter.field835) {
			Interpreter.field835 = false;
			class30.method432();
		}

		if (!var9 && var3 > 0 && var10 >= var3) { // L: 419
			LoginPacket.RunException_sendStackTrace("Warning: Script " + var1.field958 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 420
		}

	} // L: 389
}
